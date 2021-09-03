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

package com.acme.w9b7.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Entry service. Represents a row in the &quot;W9B7_Entry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.acme.w9b7.model.impl.EntryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.acme.w9b7.model.impl.EntryImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Entry
 * @generated
 */
@ProviderType
public interface EntryModel extends BaseModel<Entry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a entry model instance should use the {@link Entry} interface instead.
	 */

	/**
	 * Returns the primary key of this entry.
	 *
	 * @return the primary key of this entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this entry.
	 *
	 * @param primaryKey the primary key of this entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the entry ID of this entry.
	 *
	 * @return the entry ID of this entry
	 */
	public long getEntryId();

	/**
	 * Sets the entry ID of this entry.
	 *
	 * @param entryId the entry ID of this entry
	 */
	public void setEntryId(long entryId);

	/**
	 * Returns the description of this entry.
	 *
	 * @return the description of this entry
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this entry.
	 *
	 * @param description the description of this entry
	 */
	public void setDescription(String description);

	/**
	 * Returns the name of this entry.
	 *
	 * @return the name of this entry
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this entry.
	 *
	 * @param name the name of this entry
	 */
	public void setName(String name);

}