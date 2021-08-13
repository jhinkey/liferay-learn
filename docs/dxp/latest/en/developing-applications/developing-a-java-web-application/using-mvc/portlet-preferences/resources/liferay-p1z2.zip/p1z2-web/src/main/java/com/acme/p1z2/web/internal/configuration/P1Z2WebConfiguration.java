package com.acme.p1z2.web.internal.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

@ExtendedObjectClassDefinition(
	category = "p1z2",
	scope = ExtendedObjectClassDefinition.Scope.PORTLET_INSTANCE
)
@Meta.OCD(
	id = "com.acme.p1z2.web.internal.configuration.P1Z2WebConfiguration",
	name = "P1Z2 Portlet"
)
public interface P1Z2WebConfiguration {

	@Meta.AD(
		deflt = "green", name = "color",
		optionLabels = {"Green", "Orange", "Purple"},
		optionValues = {"green", "orange", "purple"}, required = false
	)
	public String color();

}