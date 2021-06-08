package com.acme.z4h3.internal.configuration;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(
	id = "com.acme.z4h3.internal.configuration.Z4H3Configuration",
	localization = "content/Language", name = "z4h3-configuration-name"
)
public interface Z4H3Configuration {

	@Meta.AD(
		description = "this-list-is-manually-populated", name = "colors",
		optionLabels = {"Color1", "Color2", "Color3"},
		optionValues = {"Color1", "Color2", "Color3"}, required = false
	)
	public String colors();

	@Meta.AD(
		description = "this-list-is-provider-populated",
		name = "provider-populated-colors",
    required = false
	)
	public String providerPopulatedColor();

}