<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details Of employee</title>
<style>
	table,tr,th,td
	{
		border:2px solid black;
		padding:10px;
	}

</style>
</head>
<body bgcolor="pink">
<center>
	<h1>Employee Details</h1>
	<table>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Phone Number</th>	
			<th>Age</th>
			<th>Organization</th>
			<th>Salary</th>		
		</tr>
		
		<tr>
			<td>${empInfo.name}</td>
			<td>${empInfo.email}</td>
			<td>${empInfo.phone }</td>
			<td>${empInfo.age }</td>
			<td>${empInfo.organization}</td>
			<td>${empInfo.salary }</td>
		
		</tr>
	</table>
	</center>
</body>
</html>