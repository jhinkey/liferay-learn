package com.acme.k4m1.baker.internal;

import com.acme.k4m1.able.constants.AbleDestinationNames;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;

import org.osgi.service.component.annotations.Component;

@Component(
	property = "destination.name=" + AbleDestinationNames.K4M1_COMPONENT_ACTIVATION,
	service = MessageListener.class
)
public class ComponentActivationMessageListener implements MessageListener {

	@Override
	public void receive(Message message) {
		if (_log.isInfoEnabled()) {
			_log.info(
				"Received message payload " + (String)message.getPayload() +
					" at destination " + message.getDestinationName());
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ComponentActivationMessageListener.class);

}