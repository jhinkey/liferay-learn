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

package com.acme.f4h9.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class TodoSoap implements Serializable {

	public static TodoSoap toSoapModel(Todo model) {
		TodoSoap soapModel = new TodoSoap();

		soapModel.setTodoId(model.getTodoId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static TodoSoap[] toSoapModels(Todo[] models) {
		TodoSoap[] soapModels = new TodoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TodoSoap[][] toSoapModels(Todo[][] models) {
		TodoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TodoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TodoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TodoSoap[] toSoapModels(List<Todo> models) {
		List<TodoSoap> soapModels = new ArrayList<TodoSoap>(models.size());

		for (Todo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TodoSoap[soapModels.size()]);
	}

	public TodoSoap() {
	}

	public long getPrimaryKey() {
		return _todoId;
	}

	public void setPrimaryKey(long pk) {
		setTodoId(pk);
	}

	public long getTodoId() {
		return _todoId;
	}

	public void setTodoId(long todoId) {
		_todoId = todoId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _todoId;
	private String _name;
	private String _description;

}