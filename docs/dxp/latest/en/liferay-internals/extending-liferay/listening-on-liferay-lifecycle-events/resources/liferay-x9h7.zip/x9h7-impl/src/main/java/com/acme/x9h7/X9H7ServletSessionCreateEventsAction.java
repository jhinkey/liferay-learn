package com.acme.x9h7;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.security.audit.event.generators.constants.EventTypes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true, property = "key=servlet.session.create.events",
        service = LifecycleAction.class
)
public class X9H7ServletSessionCreateEventsAction extends Action {

    @Override
    public void run(
                    HttpServletRequest httpServletRequest,
                    HttpServletResponse httpServletResponse)
            throws ActionException {

            try {
                if (_log.isInfoEnabled()) {
                    _log.info("Invoking #run(HttpServletRequest, HttpServletResponse)");
                }
            }
            catch (Exception exception) {
                    throw new ActionException(exception);
            }
    }

	private static final Log _log = LogFactoryUtil.getLog(X9H7ServletSessionCreateEventsAction.class);

}
