<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>

</head>
<body>
<div
align=left>
<h1><align=center>User login</h1>

</div>
<form action="Loginservlet" method="post">
<table>
<tr>
<td>Enter name:</td><td><input type="text" name="txtname"></td></tr>
<td>Enter password:</td><td><input type="password" name="txtpwd"></td></tr>
<tr><td><input type="submit" name="txsubmit"></td>
<td><input type="reset" name="txtrest"></td></tr>
</table>

</form>
</body>
</html>