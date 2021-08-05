<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>

<%@ page import="com.acme.p1z2.web.internal.configuration.P1Z2WebPortletInstanceConfiguration" %>

<%@ page import="com.liferay.petra.string.StringPool" %><%@
page import="com.liferay.portal.kernel.util.Constants" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
String configurationSource = StringPool.BLANK;
P1Z2WebPortletInstanceConfiguration p1z2WebPortletInstanceConfiguration = (P1Z2WebPortletInstanceConfiguration)renderRequest.getAttribute(P1Z2WebPortletInstanceConfiguration.class.getName());

if (p1z2WebPortletInstanceConfiguration != null) {
	configurationSource = portletPreferences.getValue("configurationSource", p1z2WebPortletInstanceConfiguration.configurationSource());
}
%>

<liferay-portlet:actionURL portletConfiguration="<%= true %>" var="configurationActionURL" />

<liferay-portlet:renderURL portletConfiguration="<%= true %>" var="configurationRenderURL" />

<aui:form action="<%= configurationActionURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
	<aui:input name="redirect" type="hidden" value="<%= configurationRenderURL %>" />

	<aui:fieldset>
		<aui:select label="portlet-preference" name="configurationSource" value="<%= configurationSource %>">
			<aui:option label="portlet-preference-1" value="portlet-preference-1" />
			<aui:option label="portlet-preference-2" value="portlet-preference-2" />
		</aui:select>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>