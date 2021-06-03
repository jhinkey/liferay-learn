package com.acme.x6n5.baker.osgi.commands;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusException;
import com.liferay.portal.kernel.messaging.sender.SynchronousMessageSender;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	property = {
		"osgi.command.function=sendMessage", "osgi.command.scope=x6n5.baker"
	},
	service = Object.class
)
public class X6N5BakerOSGiCommands {

	public void sendMessage(String payload) {
		try {
			Message message = new Message();

			message.setPayload(payload);

			message.setResponseDestinationName("acme/x6n5_baker");

			Object response = _directSynchronousMessageSender.send(
				"acme/x6n5_able", message);

			if (_log.isInfoEnabled()) {
				_log.info(
					"SynchronousMessageSender#send(String, Message) returned " +
						response);
			}
		}
		catch (MessageBusException messageBusException) {
			messageBusException.printStackTrace();
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		X6N5BakerOSGiCommands.class);

	@Reference(target = "(mode=DIRECT)")
	private SynchronousMessageSender _directSynchronousMessageSender;

}