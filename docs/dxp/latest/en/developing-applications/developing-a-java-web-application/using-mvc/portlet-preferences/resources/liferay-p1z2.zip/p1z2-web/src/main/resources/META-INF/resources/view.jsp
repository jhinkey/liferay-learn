<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.acme.p1z2.web.internal.configuration.P1Z2WebConfiguration" %>

<portlet:defineObjects />

<%
P1Z2WebConfiguration p1z2WebConfiguration = (P1Z2WebConfiguration)request.getAttribute(P1Z2WebConfiguration.class.getName());
String preference = (String)portletPreferences.getValue("color", "");

if (preference.equals("")) {
	preference = p1z2WebConfiguration.color();
}
else {
	preference = (String)portletPreferences.getValue("color", "");
}
%>

Color: <%= preference %>