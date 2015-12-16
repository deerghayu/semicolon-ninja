<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a movie</title>
</head>
<body>

	<h3>Add a Member</h3>
	<form:form modelAttribute="member" method="POST" action="members/add"
		enctype="multipart/form-data">
		<p>
			<form:errors path="*" cssStyle="color:red"/>
		</p>
		<table>
			<tr>
				<td><form:label path="firstName">First Name</form:label></td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name</form:label></td>
				<td><form:input path="lastName" /></td>
			</tr>
			
			<tr>
				<td><form:label path="role">Role</form:label></td>
				<td><form:select path="role" items="${roles}"/></td>
			</tr>
			<%-- <tr>
			        <td><form:label path="releaseDate">id</form:label></td>
			        <td><form:input path="releaseDate" /></td>
			    </tr> --%>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>