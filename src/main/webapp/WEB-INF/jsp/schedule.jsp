<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Schedule</title>
</head>
<body>
<h2>Schedule</h2>
	<table >
					<thead>
						<tr>
							<td>№</td>
							<td>Name</td>
							<td>Duration</td>
							<td>Start time</td>
							<td>Seats reserved</td>
						</tr>
					</thead>
	
					<c:set var="k" value="0"/>
					<c:forEach var="item" items="${menuItems}">
						<c:set var="k" value="${k+1}"/> 
						<tr>
							<td><c:out value="${k}"/></td>
							<td>Name</td>
							<td>Duration</td>
							<td>Start</td>
							<td>Seats</td>
						</tr>
					</c:forEach>
				</table>
</body>
</html>