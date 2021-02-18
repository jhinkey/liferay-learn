<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ page import="com.acme.b4k8.web.internal.portlet.B4K8Portlet" %>

<portlet:defineObjects />

<h1>C8M3 Portlet</h1>

<ul class="list-group show-quick-actions-on-hover">

	<c:if test="<%= renderRequest.getAttribute(B4K8Portlet.MEMBERLIST_ATTRIBUTE) != null %>">
		<h4>Team Members</h4>

		<c:forEach items="<%= renderRequest.getAttribute(B4K8Portlet.MEMBERLIST_ATTRIBUTE) %>" var="user">
			<li class="list-group-item list-group-item-flex">
				<div class="autofit-col autofit-col-expand">
					<p class="list-group-title text-truncate"><c:out value="${user.name}" /></p>
					<p class="list-group-subtitle text-truncate"><c:out value="${user.email}" /></p>
				</div>
			</li>
		</c:forEach>
	</c:if>
</ul>


<portlet:actionURL name="loadUsers" var="loadURL">
</portlet:actionURL>

<a href="<%= loadURL %>">Load Members</a>