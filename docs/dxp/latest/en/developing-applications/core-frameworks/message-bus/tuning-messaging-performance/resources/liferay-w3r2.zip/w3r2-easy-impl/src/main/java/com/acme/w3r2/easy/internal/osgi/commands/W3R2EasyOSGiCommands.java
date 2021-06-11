package com.acme.w3r2.easy.internal.osgi.commands;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Destination;
import com.liferay.portal.kernel.messaging.DestinationStatistics;
import com.liferay.portal.kernel.messaging.MessageBus;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	property = {
		"osgi.command.function=listDestinationStats", "osgi.command.scope=w3r2"
	},
	service = W3R2EasyOSGiCommands.class
)
public class W3R2EasyOSGiCommands {

	public void listDestinationStats(String destinationName) {
		if (_log.isInfoEnabled()) {
			Destination destination = _messageBus.getDestination(
				destinationName);

			if (destination == null) {
				_log.info("Destination not found " + destinationName);

				return;
			}

			DestinationStatistics destinationStatistics =
				destination.getDestinationStatistics();

			StringBundler sb = new StringBundler(18);

			sb.append("Destination ");
			sb.append(destinationName);
			sb.append(", message listener count ");
			sb.append(destination.getMessageListenerCount());
			sb.append(", active thread count ");
			sb.append(destinationStatistics.getActiveThreadCount());
			sb.append(", current thread count ");
			sb.append(destinationStatistics.getCurrentThreadCount());
			sb.append(", largest thread count ");
			sb.append(destinationStatistics.getLargestThreadCount());
			sb.append(", max thread pool size ");
			sb.append(destinationStatistics.getMaxThreadPoolSize());
			sb.append(", min thread pool size ");
			sb.append(destinationStatistics.getMinThreadPoolSize());
			sb.append(", pending message count ");
			sb.append(destinationStatistics.getPendingMessageCount());
			sb.append(", sent message count ");
			sb.append(destinationStatistics.getSentMessageCount());

			_log.info(sb.toString());
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		W3R2EasyOSGiCommands.class);

	@Reference
	private MessageBus _messageBus;

}