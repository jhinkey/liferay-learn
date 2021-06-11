package com.acme.w3r2.baker.internal;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBus;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	property = {"osgi.command.function=sendMessage", "osgi.command.scope=w3r2"},
	service = W3R2BakerOSGiCommands.class
)
public class W3R2BakerOSGiCommands {

	public void sendMessage(String payload) {
		Message message = new Message();

		message.setPayload(payload);

		_messageBus.sendMessage("acme/w3r2_able", message);

		if (_log.isInfoEnabled()) {
			_log.info("Sent message payload " + payload);
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		W3R2BakerOSGiCommands.class);

	@Reference
	private MessageBus _messageBus;

}