/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.acme.h6d2.uad.exporter;

import com.acme.h6d2.model.H6D2Entry;
import com.acme.h6d2.service.H6D2EntryLocalService;
import com.acme.h6d2.uad.constants.H6D2UADConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.user.associated.data.exporter.DynamicQueryUADExporter;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the h6d2 entry UAD exporter.
 *
 * <p>
 * This implementation exists only as a container for the default methods
 * generated by ServiceBuilder. All custom service methods should be put in
 * {@link H6D2EntryUADExporter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BaseH6D2EntryUADExporter
	extends DynamicQueryUADExporter<H6D2Entry> {

	@Override
	public Class<H6D2Entry> getTypeClass() {
		return H6D2Entry.class;
	}

	@Override
	protected ActionableDynamicQuery doGetActionableDynamicQuery() {
		return h6d2EntryLocalService.getActionableDynamicQuery();
	}

	@Override
	protected String[] doGetUserIdFieldNames() {
		return H6D2UADConstants.USER_ID_FIELD_NAMES_H6D2_ENTRY;
	}

	@Override
	protected String toXmlString(H6D2Entry h6d2Entry) {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.acme.h6d2.model.H6D2Entry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>h6d2EntryId</column-name><column-value><![CDATA[");
		sb.append(h6d2Entry.getH6d2EntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(h6d2Entry.getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(h6d2Entry.getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(h6d2Entry.getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	@Reference
	protected H6D2EntryLocalService h6d2EntryLocalService;

}