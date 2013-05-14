<html>
<head>
<title>
<p>prueba de formulario</p>
</title>
</head>

<body>
	<form namme="frmDatos" method ="POST" action="form.php">
		Edad <input type="text" name="txtEdad" value="" >
		<input type="submit" value="Dale!">
	</form>

	<?php
		if (isset ($_POST ["txtEdad"])){
			$edad=$_POST["txtEdad"];
			echo"<br>Tu edad es $edad"
		}
	?>
</body>
</html>
