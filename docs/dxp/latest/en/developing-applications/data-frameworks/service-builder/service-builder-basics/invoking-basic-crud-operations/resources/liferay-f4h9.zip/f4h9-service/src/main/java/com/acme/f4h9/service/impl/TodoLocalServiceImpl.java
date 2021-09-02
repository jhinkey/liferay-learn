package com.acme.f4h9.service.impl;

import com.acme.f4h9.model.Todo;
import com.acme.f4h9.service.base.TodoLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;

import org.osgi.service.component.annotations.Component;

@Component(
	property = "model.class.name=com.acme.f4h9.model.Todo",
	service = AopService.class
)
public class TodoLocalServiceImpl extends TodoLocalServiceBaseImpl {

	public Todo addTodo(String name, String description)
		throws PortalException {

		Todo todo = createTodo(counterLocalService.increment());

		todo.setName(name);
		todo.setDescription(description);

		return addTodo(todo);
	}

}