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
		deflt = "configuration-framework-1", name = "configuration-source",
		optionLabels = {
			"configuration-framework-1", "configuration-framework-2"
		},
		optionValues = {
			"configuration-framework-1", "configuration-framework-2"
		},
		required = false
	)
	public String configurationSource();

}