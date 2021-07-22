<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.acme.p1z2.web.internal.configuration.P1Z2WebPortletInstanceConfiguration" %>

<%
P1Z2WebPortletInstanceConfiguration p1z2WebPortletInstanceConfiguration = (P1Z2WebPortletInstanceConfiguration)request.getAttribute(P1Z2WebPortletInstanceConfiguration.class.getName());
%>

<h1><liferay-ui:message key="p1z2-portlet-welcome" /></h1>
<p>
	<liferay-ui:message key="configuration-source" />: <liferay-ui:message key="<%= p1z2WebPortletInstanceConfiguration.configurationSource() %>" />
</p>