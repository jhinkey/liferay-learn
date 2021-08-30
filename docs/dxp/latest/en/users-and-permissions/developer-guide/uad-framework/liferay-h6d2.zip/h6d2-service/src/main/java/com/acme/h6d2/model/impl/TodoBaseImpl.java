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

package com.acme.h6d2.model.impl;

import com.acme.h6d2.model.Todo;
import com.acme.h6d2.service.TodoLocalServiceUtil;

/**
 * The extended model base implementation for the Todo service. Represents a row in the &quot;H6D2_Todo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TodoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TodoImpl
 * @see Todo
 * @generated
 */
public abstract class TodoBaseImpl extends TodoModelImpl implements Todo {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a todo model instance should use the <code>Todo</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			TodoLocalServiceUtil.addTodo(this);
		}
		else {
			TodoLocalServiceUtil.updateTodo(this);
		}
	}

}