package com.acme.p1z2.web.internal.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

@ExtendedObjectClassDefinition(
	category = "p1z2",
	scope = ExtendedObjectClassDefinition.Scope.PORTLET_INSTANCE
)
@Meta.OCD(
	id = "com.acme.p1z2.web.internal.configuration.P1Z2WebPortletInstanceConfiguration",
	localization = "content/Language",
	name = "p1z2-web-portlet-instance-configuration-name"
)
public interface P1Z2WebPortletInstanceConfiguration {

	@Meta.AD(
		deflt = "Configuration Framework 1", name = "configuration-source",
		optionLabels = {
			"Configuration Framework 1", "Configuration Framework 2"
		},
		optionValues = {
			"Configuration Framework 1", "Configuration Framework 2"
		},
		required = false
	)
	public String configurationSource();

}