<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@page isELIgnored="false" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Files Uploaded Result</title>
</head>
<body>
<h3> ${ msg } </h3>
<img alt="profile image" src="<c:url value="/resources/image/${ filename }"></c:url>"/>
<!-- filename taken from controller class whrer we specified -->
</body>
</html>