<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<h1>View 2</h1>

<portlet:renderURL var="view1URL">
	<portlet:param name="mvcRenderCommandName" value="/a4p1/view_1" />
</portlet:renderURL>

<a href="<%= view1URL %>">Go to View 1</a>