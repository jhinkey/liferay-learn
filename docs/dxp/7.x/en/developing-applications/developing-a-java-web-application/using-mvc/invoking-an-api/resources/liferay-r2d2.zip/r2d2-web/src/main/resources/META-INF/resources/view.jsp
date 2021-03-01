<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:actionURL name="processAction" var="processActionURL" />

<h1>R2D2 Portlet</h1>

<aui:form action="<%= processActionURL %>" method="post" name="fm">
	<aui:fieldset>
		<aui:input name="able" />
		<aui:input name="baker" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" value="Submit" />
	</aui:button-row>
</aui:form>