

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<ul class="nav">
<li><img src="<spring:url value="/resources/images/logo.jpg"/>"/></li>
<li><a href="<spring:url value="#"/>">Home</a></li>
<li><a href="<spring:url value="#"/>">Popular</a></li>
<li class= "right"><a href="<spring:url value="/addUser"/>">Register</a></li>
<li class= "right"><a href="<spring:url value="/login"/>">Login</a></li>
</ul>