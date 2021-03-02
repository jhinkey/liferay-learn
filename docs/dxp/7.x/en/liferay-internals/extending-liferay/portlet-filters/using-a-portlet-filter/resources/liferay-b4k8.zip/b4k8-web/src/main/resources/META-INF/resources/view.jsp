<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ page import="com.acme.b4k8.web.internal.constants.B4K8WebKeys" %>

<portlet:defineObjects />

<ul>
	<c:if test="<%= renderRequest.getAttribute(B4K8WebKeys.MEMBERS) != null %>">
		<c:forEach items="<%= renderRequest.getAttribute(B4K8WebKeys.MEMBERS) %>" var="member">
			<li>
				<div>
					<p>
						<c:out value="${member.emailAddress}" />
					</p>

					<p>
						<c:out value="${member.name}" />
					</p>
				</div>
			</li>
		</c:forEach>
	</c:if>
</ul>