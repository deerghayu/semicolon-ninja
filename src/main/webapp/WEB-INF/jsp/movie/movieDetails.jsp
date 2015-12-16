<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring]"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie Details</title>
</head>
<body>
	<h3>Movie ${movie.name }</h3>
	
	<p>${movie.description } <img alt="banner" src="<spring:url value="/resources/images/${movie.imagePath}"/>"/> </p>
	
	<p>${movie.director.firstName }</p>
	<p>${movie.producer.lastName }</p>
</body>
</html>