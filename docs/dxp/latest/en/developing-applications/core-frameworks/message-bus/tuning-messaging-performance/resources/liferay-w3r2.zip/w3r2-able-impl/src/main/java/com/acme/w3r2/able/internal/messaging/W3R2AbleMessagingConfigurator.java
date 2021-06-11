package com.acme.w3r2.able.internal.messaging;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Destination;
import com.liferay.portal.kernel.messaging.DestinationConfiguration;
import com.liferay.portal.kernel.messaging.DestinationFactory;
import com.liferay.portal.kernel.util.MapUtil;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component
public class W3R2AbleMessagingConfigurator {

	@Activate
	private void _activate(BundleContext bundleContext) {
		DestinationConfiguration destinationConfiguration =
			DestinationConfiguration.createParallelDestinationConfiguration(
				"acme/w3r2_able");

		// destinationConfiguration.setMaximumQueueSize(maximumQueueSize);
		// destinationConfiguration.setWorkersCoreSize(workersCoreSize);
		// destinationConfiguration.setWorkersMaxSize(workersMaxSize);

		Destination destination = _destinationFactory.createDestination(
			destinationConfiguration);

		_serviceRegistration = bundleContext.registerService(
			Destination.class, destination,
			MapUtil.singletonDictionary(
				"destination.name", destination.getName()));

		if (_log.isInfoEnabled()) {
			StringBundler sb = new StringBundler(8);

			sb.append("Destination ");
			sb.append(destination.getName());
			sb.append(", max queue size ");
			sb.append(destinationConfiguration.getMaximumQueueSize());
			sb.append(", worker core size ");
			sb.append(destinationConfiguration.getWorkersCoreSize());
			sb.append(", worker max size ");
			sb.append(destinationConfiguration.getWorkersMaxSize());

			_log.info(sb.toString());
		}
	}

	@Deactivate
	private void _deactivate() {
		if (_serviceRegistration != null) {
			_serviceRegistration.unregister();
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		W3R2AbleMessagingConfigurator.class);

	@Reference
	private DestinationFactory _destinationFactory;

	private ServiceRegistration<Destination> _serviceRegistration;

}