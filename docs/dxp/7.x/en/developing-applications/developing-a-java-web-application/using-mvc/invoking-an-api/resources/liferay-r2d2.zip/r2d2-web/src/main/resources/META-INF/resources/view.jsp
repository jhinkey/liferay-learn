<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:actionURL name="processAction" var="processActionURL" />

<h1>R2D2 Portlet</h1>

<form action="<%= processActionURL %>" method="post">
	<p>
		Able
		<br />

		<input name="able" type="text" />

		<br />
		Baker
		<br />

		<input name="baker" type="text" />
	</p>

	<p>
		<input type="submit" value="Submit" />
	</p>
</form>