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

package com.acme.t2p5.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;T2P5_Todo&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Todo
 * @generated
 */
public class TodoTable extends BaseTable<TodoTable> {

	public static final TodoTable INSTANCE = new TodoTable();

	public final Column<TodoTable, Long> todoId = createColumn(
		"todoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<TodoTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TodoTable, String> description = createColumn(
		"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private TodoTable() {
		super("T2P5_Todo", TodoTable::new);
	}

}