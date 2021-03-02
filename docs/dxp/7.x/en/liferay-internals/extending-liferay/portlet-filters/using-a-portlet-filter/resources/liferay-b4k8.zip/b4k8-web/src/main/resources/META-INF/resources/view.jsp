<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ page import="com.acme.b4k8.web.internal.constants.B4K8WebKeys" %>

<portlet:defineObjects />

<portlet:actionURL name="loadPersons" var="loadPersonsURL">
</portlet:actionURL>

<h1>B4K8 Portlet</h1>

<ul>
	<c:if test="<%= renderRequest.getAttribute(B4K8WebKeys.PERSONS) != null %>">
		<h4>Here are the team persons!</h4>

		<c:forEach items="<%= renderRequest.getAttribute(B4K8WebKeys.PERSONS) %>" var="person">
			<li>
				<div>
					<p><c:out value="${person.name}" /></p>
					<p><c:out value="${person.emailAddress}" /></p>
				</div>
			</li>
		</c:forEach>
	</c:if>
</ul>

<a href="<%= loadPersonsURL %>">Load Persons</a>