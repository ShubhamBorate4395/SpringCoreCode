<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<h1>Name is  ${ student.name } </h1>
			<h1>Id is  ${ student.id } </h1>
			<h1>Date is  ${ student.dob } </h1>
			<h1>Courses is  ${ student.courses } </h1>
			<h1>Gender is  ${ student.gender } </h1>
			<h1>Type of Student is ${ student.type } </h1>
			<hr>
			<h1>Address</h1>
			<h2>State is ${ student.address.state }</h2>
			<h2>City is ${ student.address.city }</h2>
</body>
</html>