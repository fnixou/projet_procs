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
		<td><i>Mail : <input type="text" name="mail" size="25"/></i>
	</tr>
	<tr>
	 	<td><h3>ADRESSE</h3></td>
	</tr>
	<tr>
		<td><i>Rue : <input type="text" name="rue" size="25"/></i>
		<td><i>Ville : <input type="text" name="ville" size="25"/></i>
		<td><i>Code Postal : <input type="text" name="zip" size="25"/></i>
		<td><i>Pays : <input type="text" name="pays" size="25"/></i>
	</tr>
	<tr>
		<td><h3>TELEPHONE</h3></td>
	</tr>
	<tr>
		<td><i>Mobile : <input type="text" name="mobile" size="25"/></i>
	</tr>
	<tr>
		<td><i>Maison : <input type="text" name="maison" size="25"/></i>
	</tr>
	<tr>
		<td><i>Bureau : <input type="text" name="bureau" size="25"/></i>
	</tr>
	<tr>
		<td><i>Selectionner un groupe : <select name="groupes">
		<i><option>Famille</option></i>
		<i><option>Collegues</option></i>
		<i><option>Amis</option></i>
		</select>
	</tr>
	<tr>
		<td><i>Ajouter un groupe : <input type="text" name="nouveauGroupe" size="25"/></i>
	</tr>
	<tr>
		<td><input class="button" type="submit" value="submit"/>
	</tr>
	</table>
</form>	
</body>
</html>