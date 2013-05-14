<?php

include ("carga.php");
$idmovil=$_GET["id"];
?>

<html>
<head>
<title>
<title>
</head>

<body>

<table border="1">
	<tr>
		<td>Fabricante</td>
		<td><?  echo $movil[$idmovil]["fabricante"]; ?></td>
	</tr>
	<tr>
		<td>Modelo</td>
		<td><?  echo $movil[$idmovil]["modelo"]; ?></td>
	</tr>
	<tr>
		<td>Precio</td><br>
		<td><?  echo $movil[$idmovil]["precio"]; ?></td>
	</tr>
	<tr>
		<td>Anio</td><br>
		<td><?  echo $movil[$idmovil]["anio"]; ?></td>
	</tr>
	<tr>
		<td colsspan="2"> Imagen</td><br>
		<td><img src="<?  echo $movil[$idmovil]['imagen']; ?>" width="25" heigt="25"></td>
	</tr>
	
</table>

</body>
</html>
