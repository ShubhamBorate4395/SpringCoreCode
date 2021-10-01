<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>www.userinfo.com</title>
</head>
<body>
<h2 class="text-center"> ${Header} </h2>
		<p class="text-center"> ${desc} </p>
		<hr>
<h2 style="color: green"> ${msg} </h2>
<h4>
User email is ${ user.email }  <br>
User name is ${ user.userName }		<br>
User password is ${ user.userPassword }  try to secure it.
</h4>

</body>
</html>