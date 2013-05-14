<?php

include ("carga.php");
?>


<html>
<head>
<title>
<title>
</head>

<body>

<table border="1">
	<tr>
		<th>Fabricante</th>
		<th>Modelo</th>
		<th>Precio</th>
		<th>Anio</th>
	</tr>
	<?php
			for ($i=0; $i<sizeof($movil); $i++){
				echo "<tr>
				 <td> " .$movil[$i]["fabricante"] ."</td>
				 <td> <a href=\"detallemovil.php?id=".$i."\">" .$movil[$i]["modelo"]."</a></td>
				 <td>" .$movil[$i]["precio"]."</td>
				 <td>" .$movil[$i]["anio"]."</td>
				</tr>";
			}
		?>
		
	
</table>

</body>
</html>
