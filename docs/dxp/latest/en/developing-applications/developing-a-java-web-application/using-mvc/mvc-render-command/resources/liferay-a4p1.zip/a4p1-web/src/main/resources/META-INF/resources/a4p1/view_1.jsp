<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<h1>View 1</h1>

<portlet:renderURL var="view2URL">
	<portlet:param name="mvcRenderCommandName" value="/a4p1/view_2" />
</portlet:renderURL>

<a href="<%= view2URL %>">Go to View 2</a>