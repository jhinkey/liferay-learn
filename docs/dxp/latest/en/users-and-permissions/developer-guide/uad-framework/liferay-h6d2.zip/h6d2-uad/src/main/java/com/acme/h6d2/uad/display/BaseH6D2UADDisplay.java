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

package com.acme.h6d2.uad.display;

import com.acme.h6d2.model.H6D2;
import com.acme.h6d2.service.H6D2LocalService;
import com.acme.h6d2.uad.constants.H6D2UADConstants;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.user.associated.data.display.BaseModelUADDisplay;

import java.io.Serializable;

import java.util.List;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the H6D2 UAD display.
 *
 * <p>
 * This implementation exists only as a container for the default methods
 * generated by ServiceBuilder. All custom methods should be put in
 * {@link H6D2UADDisplay}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BaseH6D2UADDisplay extends BaseModelUADDisplay<H6D2> {

	@Override
	public H6D2 get(Serializable primaryKey) throws PortalException {
		return h6d2LocalService.getH6D2(Long.valueOf(primaryKey.toString()));
	}

	@Override
	public String[] getDisplayFieldNames() {
		return new String[] {"todo"};
	}

	@Override
	public Class<H6D2> getTypeClass() {
		return H6D2.class;
	}

	@Override
	protected long doCount(DynamicQuery dynamicQuery) {
		return h6d2LocalService.dynamicQueryCount(dynamicQuery);
	}

	@Override
	protected DynamicQuery doGetDynamicQuery() {
		return h6d2LocalService.dynamicQuery();
	}

	@Override
	protected List<H6D2> doGetRange(
		DynamicQuery dynamicQuery, int start, int end) {

		return h6d2LocalService.dynamicQuery(dynamicQuery, start, end);
	}

	@Override
	protected String[] doGetUserIdFieldNames() {
		return H6D2UADConstants.USER_ID_FIELD_NAMES_H6D2;
	}

	@Reference
	protected H6D2LocalService h6d2LocalService;

}