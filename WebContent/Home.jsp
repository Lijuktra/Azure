<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> My first JSP   </title>
	</head>	
	<body>		
		<form action="HelloServlet">
<table>
	<tr>
		<td colspan="2">Login to the Tomcat-Demo application for KPn team</td>
	</tr>
	<tr>
		<td>Name:</td>
		<td><input type="text" name="j_username" /></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type="password" name="j_password"/ ></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="Go" /></td>
	</tr>
</table>
</form>		
	</body>	
</html>