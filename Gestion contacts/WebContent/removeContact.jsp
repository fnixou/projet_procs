<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Suppression d'un contact</title>
</head>
<body>
<form method="post" action="RemoveContactServlet">
	<table>
	<tr>
		<td><i>Mail du contact a supprimer: <input type="text" name="mail" size="25"/></i></td>
	</tr>
	<tr>
		<td><input class="button" type="submit" value="remove"/></td>
	</tr>
	</table>
</form>
</body>
</html>