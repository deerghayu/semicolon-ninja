<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
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
	<h3>Reviews</h3>
	
	<c:forEach var="review" items="${movie.reviews}">
		<li>
			<span>Rating: <c:out value="${review.rating }"/> </span><br>
			<span>Comment: ${review.comment }</span>
		</li>
	</c:forEach>
	<a href="<spring:url value="/review/add/${movie.id}"/>">Add a review</a>
</body>
</html>