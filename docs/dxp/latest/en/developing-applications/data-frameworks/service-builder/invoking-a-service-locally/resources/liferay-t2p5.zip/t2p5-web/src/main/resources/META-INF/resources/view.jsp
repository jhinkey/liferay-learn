<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.acme.t2p5.model.Todo" %><%@
page import="com.acme.t2p5.service.TodoLocalService" %>

<%@ page import="java.util.List" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<h4>T2P5 Portlet</h4>

<portlet:actionURL name="addTodo" var="addTodoURL" />

<p>
	<h5>New Todo</h5>
	<aui:form action="<%= addTodoURL %>">
		<aui:input name="name" type="text" />
		<aui:input name="description" type="text" />

		<aui:button type="submit" value="submit" />
	</aui:form>
</p>

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
						<td>${todo.name }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:when>
	<c:otherwise>
		<em>None</em>
	</c:otherwise>
</c:choose>