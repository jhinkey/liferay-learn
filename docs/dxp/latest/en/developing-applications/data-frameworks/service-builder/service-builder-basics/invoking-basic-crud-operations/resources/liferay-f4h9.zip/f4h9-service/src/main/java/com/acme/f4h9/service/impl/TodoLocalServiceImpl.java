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

package com.acme.f4h9.service.impl;

import com.acme.f4h9.service.base.TodoLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.acme.f4h9.model.Todo",
	service = AopService.class
)
public class TodoLocalServiceImpl extends TodoLocalServiceBaseImpl {

	public Todo addTodo(String name, String description)
		throws PortalException {

		Todo todo = createTodo(counterLocalService.increment());

		todo.setName(name);
		todo.setDescription(description);

		return addTodo(todo);
	}

}