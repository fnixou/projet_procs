<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">

function statutCheck() {
    if (document.getElementById('entrepriseCheck').checked) {
        document.getElementById('siret').style.display = 'block';
    }
    else document.getElementById('siret').style.display = 'none';

}

document.addEventListener('DOMContentLoaded', function() {
   statutCheck();
}, false);


</script>

<form method="post" action="AddContactServlet">
	<table>
	<tr>	
	    <input type="radio" name="statut" onclick="javascript:statutCheck();" value="contact" id="contactCheck"> Contact
		<input type="radio" name="statut" onclick="javascript:statutCheck();" value="entreprise" id="entrepriseCheck"> Entreprise	
	</tr>
	<tr>
		<td><i>Prenom : <input type="text" name="prenom" size="25"/></i>
	</tr>
	<tr>
		<td><i>Nom : <input type="text" name="nom" size="25"/></i>
	</tr>
	<tr>
		<td><i>Mail : <input type="text" name="mail" size="25"/></i>
	</tr>
	<tr id="siret" style="display:none">
		<td><i>Siret : <input type="text" name="siret" size="25"></i></td>
	</tr>
	<tr>
	 	<td><h3>ADRESSE</h3></td>
	</tr>
	<tr>
		<td><i>Rue : <input type="text" name="street" size="25"/></i>
		<td><i>Ville : <input type="text" name="city" size="25"/></i>
		<td><i>Code Postal : <input type="text" name="zip" size="25"/></i>
		<td><i>Pays : <input type="text" name="country" size="25"/></i>
	</tr>
	<tr>
		<td><h3>TELEPHONE(S)</h3></td>
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
		<td><h3>GROUPE(S)</h3></td>
	</tr>
	<tr>
		<td> Famille <input type="checkbox" name="choixFamille" value="choixFamille"/></td>
	</tr>
	<tr>
		<td> Collegues <input type="checkbox" name="choixCollegues" value="choixCollegue"/></td>
	</tr>
	<tr>
		<td> Amis <input type="checkbox" name="choixAmis" value="choixAmis"/></td>
	</tr>
	<tr>
		<td><i>Ajouter un groupe : <input type="text" name="nouveauGroupe" size="25"/></i>
	</tr>
	<tr>
		<td><input class="button" type="submit" value="submit"/>
			<input class="button" type="reset" value="reset"/></td>
	</tr>
	</table>
</form>	
</body>
</html>