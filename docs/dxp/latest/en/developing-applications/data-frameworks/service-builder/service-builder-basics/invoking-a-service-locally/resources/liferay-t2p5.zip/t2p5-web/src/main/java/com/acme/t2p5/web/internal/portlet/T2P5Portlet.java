package com.acme.t2p5.web.internal.portlet;

import com.acme.t2p5.service.TodoLocalService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"javax.portlet.display-name=T2P5 Portlet",
		"javax.portlet.init-param.view-template=/view.jsp"
	},
	service = Portlet.class
)
public class T2P5Portlet extends MVCPortlet {

	public void addTodo(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws PortalException {

		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");

		_todoLocalService.addTodo(name, description);
	}

	@Override
	public void render(RenderRequest request, RenderResponse response)
		throws IOException, PortletException {

		request.setAttribute("todoLocalService", _todoLocalService);

		super.render(request, response);
	}

	@Reference
	private TodoLocalService _todoLocalService;

}