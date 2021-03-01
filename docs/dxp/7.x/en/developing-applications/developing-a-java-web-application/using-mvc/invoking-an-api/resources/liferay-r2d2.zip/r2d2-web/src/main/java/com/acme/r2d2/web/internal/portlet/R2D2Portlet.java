package com.acme.r2d2.web.internal.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

@Component(
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"javax.portlet.display-name=R2D2 Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp"
	},
	service = Portlet.class
)
public class R2D2Portlet extends MVCPortlet {

	@Override
	public void processAction(
		ActionRequest actionRequest, ActionResponse actionResponse) {

		if (_log.isWarnEnabled()) {
			_log.warn("Invoke #processAction1(ActionRequest, ActionResponse)");

			//TODO Optionally print any parameters
			String able = ParamUtil.getString(actionRequest, "able");
			String baker = ParamUtil.getString(actionRequest, "baker");
			_log.warn("able " + able);
			_log.warn("baker " + baker);
		}

		//TODO invoke the API here
	}

	private static final Log _log = LogFactoryUtil.getLog(R2D2Portlet.class);

}