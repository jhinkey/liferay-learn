package com.acme.b4k8.web.internal.portlet;

import com.acme.b4k8.constants.B4K8PortletKeys;
import com.acme.b4k8.model.Person;
import com.acme.b4k8.web.internal.constants.B4K8WebKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.util.Arrays;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

@Component(
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"javax.portlet.display-name=B4K8 Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + B4K8PortletKeys.B4K8
	},
	service = Portlet.class
)
public class B4K8Portlet extends MVCPortlet {

	public void loadMembers(
		ActionRequest actionRequest, ActionResponse actionResponse) {

		actionRequest.setAttribute(B4K8WebKeys.MEMBERS, _persons);
	}

	private final List<Person> _persons = Arrays.asList(
		new Person("sievert.shayne@example.org", "Sievert Shayne"),
		new Person("vida.jonas@example.net", "Vida Jonas"),
		new Person("nikola.septima@example.com", "Nikola Septima"),
		new Person("ericka.merav@example.dev", "Ericka Merav"),
		new Person("kennet.brandr@example.com", "Kennet Brandr"));

}