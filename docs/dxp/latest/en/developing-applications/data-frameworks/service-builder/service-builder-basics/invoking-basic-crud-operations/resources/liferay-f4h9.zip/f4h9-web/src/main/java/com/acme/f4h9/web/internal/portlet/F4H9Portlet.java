package com.acme.f4h9.web.internal.portlet;

import com.acme.f4h9.model.Todo;
import com.acme.f4h9.service.TodoLocalService;

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
		"javax.portlet.display-name=F4H9 Portlet",
		"javax.portlet.init-param.view-template=/view.jsp"
	},
	service = Portlet.class
)
public class F4H9Portlet extends MVCPortlet {

	public void addTodo(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws PortalException {

		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");

		_todoLocalService.addTodo(name, description);
	}

	public void deleteTodo(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws PortalException {

		long todoId = ParamUtil.getLong(actionRequest, "todoId");

		_todoLocalService.deleteTodo(todoId);
	}

	@Override
	public void render(RenderRequest request, RenderResponse response)
		throws IOException, PortletException {

		request.setAttribute("todoLocalService", _todoLocalService);

		super.render(request, response);
	}

	public void updateTodo(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws PortalException {

		long todoId = ParamUtil.getLong(actionRequest, "todoId");

		Todo todo = _todoLocalService.getTodo(todoId);

		todo.setName(ParamUtil.getString(actionRequest, "name"));
		todo.setDescription(ParamUtil.getString(actionRequest, "description"));

		_todoLocalService.updateTodo(todo);
	}

	@Reference
	private TodoLocalService _todoLocalService;

}