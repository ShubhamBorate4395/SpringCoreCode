<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page isELIgnored="false" %> <!--this is for jsp expression enabling DTD code  --> 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- jstl library for getting collection data -->
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h1>This is a Help Page</h1>
<h1>Called by Home controller</h1>

<%
		/* String name=(String)request.getAttribute("name");
		Integer rollNo = (Integer) request.getAttribute("rollNo");
		LocalDateTime date=(LocalDateTime)request.getAttribute("date"); */
		

%>

<h4>
Name is: <%-- <%=name %> --%>      ${name}            <br> <!--Here we are using jsp expression language it is short technique of getting value  -->
Roll No:<%--  <%=rollNo %> --%>    ${rollNo }           <br>
Date And Time is: <%-- <%=date %> --%> ${ date }
</h4>

<h4>Marks Obtained:</h4>        <!-- jstl code structure for getting collection data -->
<c:forEach var="item" items="${marks}">
	<%-- <h2> ${item} </h2> 1st Way of print data --%>
	<h2> <c:out value=" ${item} "></c:out></h2>  <!-- 2nd way of print data -->
	
</c:forEach>



<h2>/help</h2>
</body>
</html>