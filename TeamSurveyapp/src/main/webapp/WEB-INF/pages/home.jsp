<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style><%@include file="/WEB-INF/pages/style.css"%></style>
<title>Home</title>
</head>
<body>
	<H1>Home Page</H1>
	<table class="table">
  <thead class="thead-light">
    <tr>      
      <th scope="col">EID</th>
      <th scope="col">FNAME</th>
      <th scope="col">LNAME</th>
      <th scope="col">GENDER</th>
      <th scope="col">DEPARTMENT</th>
     
    </tr>
  </thead>
  <tbody>
  <c:forEach var="employee" items="${elist}">
  <tr>
  <td><c:out value="${employee.employeeId}"></c:out></td>
  <td><c:out value="${employee.firstName}"></c:out></td>
  <td><c:out value="${employee.lastName}"></c:out></td>
  <td><c:out value="${employee.gender}"></c:out></td>
  <td><c:out value="${employee.department}"></c:out></td>
	
  </tr>
  </c:forEach>
  </tbody>
  </table>
</body>
</html>