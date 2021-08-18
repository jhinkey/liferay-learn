package com.acme.y7g4.service.impl;

import com.acme.y7g4.model.Foo;
import com.acme.y7g4.service.base.FooLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;

import org.osgi.service.component.annotations.Component;

@Component(
	property = "model.class.name=com.acme.y7g4.model.Foo",
	service = AopService.class
)
public class FooLocalServiceImpl extends FooLocalServiceBaseImpl {

	public Foo addFoo(String name, String description) throws PortalException {
		long fooId = counterLocalService.increment();

		Foo foo = fooPersistence.create(fooId);

		foo.setName(name);
		foo.setDescription(description);

		return fooPersistence.update(foo);
	}

}