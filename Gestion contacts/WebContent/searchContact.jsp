<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recherche d'un contact</title>
</head>
<body>
<form method="post" action="SearchContactServlet">
	<table>
	<tr>
		<td><i>Prenom: <input type="text" name="prenom" size="25"/></i></td>
	</tr>
	<tr>
		<td><i>Nom: <input type="text" name="nom" size="25"/></i></td>
	</tr>
	<tr>
		<td><i>Mail: <input type="text" name="mail" size="25"/></i></td>
	</tr>
	<tr>
		<td><input class="button" type="submit" value="search"/></td>
	</tr>
	</table>
</form>
</body>
</html>