<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<body>
	<form:form commandName="newUser" action="addUser" method="POST">

		<fieldset>
			<legend>Sign Up</legend>

			<label for="firstName">First Name: </label>
			<form:input id="firstName" path="firstName" />
			<div style="text-align: center;">
				<form:errors path="firstName" cssStyle="color:red;" />
			</div>

			<p>
				<label for="lastName">Last Name: </label>
				<form:input id="lastName" path="lastName" />
			<div style="text-align: center;">
				<form:errors path="lastName" cssStyle="color : red;" />
			</div>
			</p>
			<p>
				<label for="email">Email: </label>
				<form:input id="email" path="email" />
			<div style="text-align: center;">
				<form:errors path="email" cssStyle="color : red;" />
			</div>
			</p>
			<p>
				<label for="username">User Name: </label>
				<form:input id="username" path="username" />
			<div style="text-align: center;">
				<form:errors path="username" cssStyle="color : red;" />
			</div>
			</p>
			<p>
				<label for="password">Password: </label>
				<form:password id="password" path="password" />
			<div style="text-align: center;">
				<form:errors path="password" cssStyle="color : red;" />
			</div>
			<form:hidden path="role" />
			<form:hidden path="enabled" />
			</p>
			<input type="reset"> <input type="submit" value="Sign Up">
		</fieldset>
	</form:form>
</body>
</html>