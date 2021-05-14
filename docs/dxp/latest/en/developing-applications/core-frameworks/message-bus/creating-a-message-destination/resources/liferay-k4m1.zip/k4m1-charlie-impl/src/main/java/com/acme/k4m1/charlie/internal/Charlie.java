package com.acme.k4m1.charlie.internal;

import com.acme.k4m1.able.constants.AbleDestinationNames;

import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBus;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class Charlie {

	@Activate
	protected void activate(BundleContext bundleContext) {
		Message message = new Message();

		message.put("component", Charlie.class.getName());

		_messageBus.sendMessage(
			AbleDestinationNames.K4M1_COMPONENT_ACTIVATION, message);
	}

	@Reference
	private MessageBus _messageBus;

}