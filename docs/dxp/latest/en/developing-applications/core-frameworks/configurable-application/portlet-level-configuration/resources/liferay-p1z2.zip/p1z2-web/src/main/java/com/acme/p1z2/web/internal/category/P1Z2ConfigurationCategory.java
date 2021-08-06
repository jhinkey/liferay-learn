package com.acme.p1z2.web.internal.category;

import com.liferay.configuration.admin.category.ConfigurationCategory;

import org.osgi.service.component.annotations.Component;

@Component(service = ConfigurationCategory.class)
public class P1Z2ConfigurationCategory
	implements ConfigurationCategory {

	@Override
	public String getCategoryKey() {
		return "p1z2";
	}

	@Override
	public String getCategorySection() {
		return "other";
	}

}