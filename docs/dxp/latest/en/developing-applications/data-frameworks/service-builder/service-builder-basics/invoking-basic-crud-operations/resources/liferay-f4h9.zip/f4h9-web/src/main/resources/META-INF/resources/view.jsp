<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<%@ page import="com.acme.f4h9.model.Todo" %><%@
page import="com.acme.f4h9.service.TodoLocalService" %>

<%@ page import="java.util.List" %>

<portlet:defineObjects />

<h4>F4H9 Portlet</h4>

<portlet:actionURL name="addTodo" var="addTodoURL" />
<portlet:actionURL name="deleteTodo" var="deleteTodoURL" />

<portlet:renderURL var="editTodoURL">
	<portlet:param name="mvcPath" value="/edit_todo.jsp" />
</portlet:renderURL>

<hr />

<%
TodoLocalService todoLocalService = (TodoLocalService)request.getAttribute("todoLocalService");

List<Todo> todoList = todoLocalService.getTodos(-1, -1);
%>

<h5>Todos</h5>
<c:choose>
	<c:when test="<%= (todoList != null) && (todoLocalService.getTodosCount() > 0) %>">
		<table>
			<tbody>
				<c:forEach items="<%= todoList %>" var="todo">
					<tr>
						<td>${todo.todoId}, ${todo.name}, ${todo.description} </td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:when>
	<c:otherwise>
		<em>None</em>
	</c:otherwise>
</c:choose>

<hr />

<h5>Add Todo</h5>
<aui:form action="<%= addTodoURL %>">
	<aui:input label="Name" name="name" type="text" value="" />
	<aui:input label="Description" name="description" type="text" value="" />

	<aui:button type="submit" value="submit" />
</aui:form>

<hr />

<h5>Delete Todo</h5>
<aui:form action="<%= deleteTodoURL %>">
	<aui:input label="ID" name="todoId" type="text" />

	<aui:button type="submit" value="submit" />
</aui:form>

<hr />

<h5>Update Todo</h5>
<aui:form action="<%= editTodoURL %>">
	<aui:input label="ID" name="todoId" type="text" />

	<aui:button type="submit" value="submit" />
</aui:form>