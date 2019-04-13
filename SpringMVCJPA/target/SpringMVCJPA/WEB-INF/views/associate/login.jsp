 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
   <%--  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  --%>
<style>
  div.errorMsg { color:red; font-weight: bold; font-size: 14px; }
</style>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<style>
body {
   background-color: powderblue;
  }
table {
   width: auto;
   margin-left: auto;
   margin-right: auto;
}
</style>
<body>
<br>
	<form action="homeLogin" method="GET">
	<table>
		<tr><td><b>Please enter UserID: </b></td><td><input type="text" name="uname"/></td></tr>
		<tr><td><b>Please enter Password: </b></td><td><input type="password" name="pwd"/></td></tr>
		<tr><td></td><td><input type="submit" value="submit" ></td></tr>
		<tr><td><div class="errorMsg">${errorMsg}</div></td></tr>
	</table>
		</form>
		<br>
		
</body>

</html>