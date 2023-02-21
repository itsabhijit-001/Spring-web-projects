<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp Page</title>
</head>
<body bgcolor="blue">
<center>
<h1>Add Employee Details</h1>
<table>
	<form:form action="details" modelAttribute="empInfo">
	
<tr>
<th>
		Name:</th>
		<th> <form:input path="name" required="true"/></th></tr>
		<br>
		<tr>
		<th>Email: </th><th><form:input path="email"/></th></tr>
		<tr>
		<th>Organization:</th>
		<th> <form:input path="organization"/></th>
		<th>
		
		<form:errors path="organization" cssClass="error"/></th>
		</tr>
		<tr>
		<th>
		Age: </th><th><form:input path="age" /></th>
		</tr>
		<tr>
		<th>
		Salary:</th><th><form:input path="salary" /></th></tr>
		<tr><th>
		Contact:</th><th><form:input path="phone" /></th>
		</tr>
		<tr>
		<th>
		<input type="Submit" value="Submit"></th></tr>
	</form:form>
	</table>
	</center>
</body>
</html>