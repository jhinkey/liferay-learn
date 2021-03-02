package com.acme.b4k8.web.internal.portlet;

import com.acme.b4k8.constants.B4K8PortletKeys;
import com.acme.b4k8.model.Member;
import com.acme.b4k8.web.internal.constants.B4K8WebKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

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

	@Override
	public void render(
		RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException {

		List<Member> members = (List<Member>)renderRequest.getAttribute(B4K8WebKeys.MEMBERS);

		if (members == null) {
			System.out.println("B4K8Portlet.render members is null");
			renderRequest.setAttribute(B4K8WebKeys.MEMBERS, _members);
		}
		else {
			System.out.println("B4K8Portlet.render members is NOT null");
		}

		super.render(renderRequest, renderResponse);

		System.out.println("B4K8Portlet.super.render");
	}

	private final List<Member> _members = Arrays.asList(
		new Member("ericka.merav@example.dev", "Ericka Merav"),
		new Member("kennet.brandr@example.com", "Kennet Brandr"),
		new Member("nikola.septima@example.com", "Nikola Septima"),
		new Member("sievert.shayne@example.org", "Sievert Shayne"),
		new Member("vida.jonas@example.net", "Vida Jonas"));

}