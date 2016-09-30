<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="AddContactServlet">
	<table>
	<tr>
		<td><i>Prenom : <input type="text" name="prenom" size="25"/></i>
	</tr>
	<tr>
		<td><i>Nom : <input type="text" name="nom" size="25"/></i>
	</tr>
	<tr>
		<td><i>Telephone : <input type="text" name="tel" size="25"/></i>
	</tr>
	<tr>
		<td><i>Mail : <input type="text" name="mail" size="25"/></i>
	</tr>
	<tr>
		<td><input class="button" type="submit" value="submit"/>
	</tr>
	</table>
</form>	
</body>
</html>