<html>
<head>
	<title>Login-Formulario</title>
<body>
	<? 
	$correcto=1;
	while ($correcto==1) {

	echo '<form name="frm_login" method="POST" action=login.php>
		<table>
			<tr>
				<td>Nombre</td>
				<td><input name="txtNombre" type="text"/></td>
			</tr>
			<tr>
				<td>Clave</td>
				<td><input name="txtClave" type="password"/></td>
			</tr>
			<tr>
				
 				<td colspan="2"><input value="Enviar" type="submit"/></td>
				
			</tr>
		</table>
	</form>';
	<? 
	if ($_POST["txtNombre"]=="alumno" && $_POST["txtClave"]=="alumno"){
		header ("location=inicio.php");
		$correcto=0;
	}
	else {
		echo "Has introducido valores incorrectos";
	}
	 ?>
</body>
</head>
</html>
