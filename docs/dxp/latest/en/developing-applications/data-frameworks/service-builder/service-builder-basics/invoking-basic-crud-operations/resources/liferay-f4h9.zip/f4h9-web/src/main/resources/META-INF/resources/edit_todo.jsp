<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<%@ page import="com.acme.f4h9.model.Todo" %><%@
page import="com.acme.f4h9.service.TodoLocalService" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<portlet:defineObjects />

<%
TodoLocalService todoLocalService = (TodoLocalService)request.getAttribute("todoLocalService");

long todoId = ParamUtil.getLong(request, "todoId");

Todo todo = todoLocalService.getTodo(todoId);
%>

<portlet:actionURL name="updateTodo" var="updateTodoURL">
	<portlet:param name="todoId" value="<%= Long.toString(todoId) %>" />
</portlet:actionURL>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp" />
</portlet:renderURL>

<h4>Edit Todo</h4>

<aui:form action="<%= updateTodoURL %>">
	<aui:input disabled="true" label="ID" name="todoId" type="text" value="<%= todoId %>" />
	<aui:input label="Name" name="name" type="text" value="<%= todo.getName() %>" />
	<aui:input label="Description" name="description" type="text" value="<%= todo.getDescription() %>" />

	<aui:button type="submit" value="submit" />
	<aui:button onClick="<%= viewURL.toString() %>" type="cancel"></aui:button>
</aui:form>