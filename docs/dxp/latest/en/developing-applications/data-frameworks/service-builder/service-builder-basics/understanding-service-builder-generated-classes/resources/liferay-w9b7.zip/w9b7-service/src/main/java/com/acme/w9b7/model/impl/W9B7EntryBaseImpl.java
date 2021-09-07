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

package com.acme.w9b7.model.impl;

import com.acme.w9b7.model.W9B7Entry;
import com.acme.w9b7.service.W9B7EntryLocalServiceUtil;

/**
 * The extended model base implementation for the W9B7Entry service. Represents a row in the &quot;W9B7_W9B7Entry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link W9B7EntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see W9B7EntryImpl
 * @see W9B7Entry
 * @generated
 */
public abstract class W9B7EntryBaseImpl
	extends W9B7EntryModelImpl implements W9B7Entry {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a w9b7 entry model instance should use the <code>W9B7Entry</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			W9B7EntryLocalServiceUtil.addW9B7Entry(this);
		}
		else {
			W9B7EntryLocalServiceUtil.updateW9B7Entry(this);
		}
	}

}