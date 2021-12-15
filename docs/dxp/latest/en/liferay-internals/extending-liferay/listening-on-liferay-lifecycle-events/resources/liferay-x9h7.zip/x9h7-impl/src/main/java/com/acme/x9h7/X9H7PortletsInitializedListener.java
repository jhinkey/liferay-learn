package com.acme.x9h7;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    service = X9H7PortletsInitializedListener.class)
public class X9H7PortletsInitializedListener {

	@Activate
	public void doSomething() {
		if (_log.isInfoEnabled()) {
			_log.info("Invoking #doSomething()");
		}
	}

    @Reference(target = ModuleServiceLifecycle.PORTLETS_INITIALIZED)
    private ModuleServiceLifecycle _portletsInitialized;

	private static final Log _log = LogFactoryUtil.getLog(X9H7PortletsInitializedListener.class);

}