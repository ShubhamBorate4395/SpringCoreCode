<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is a Home Page</h1>
	<h1>Called by home controller</h1>
	<h2>/home</h2>
	<%
		String name = (String) request.getAttribute("name");
		Integer id = (Integer) request.getAttribute("id");

		List<String> friendsList = (List<String>) request.getAttribute("friendsList");
	%>
	<h2>
		Name is
		<%=name%></h2>
	<h2>
		Id is
		<%=id%></h2>

	<h3>Friends Name is:</h3>
	<%
		for (String list : friendsList) 
		{
	%>
	<h3>    <%=list%></h3>
	<%
		}
	%>


</body>
</html>