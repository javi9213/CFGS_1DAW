<html>
<head>
	<title>ejercicio</title>
</head>
<body>
<?php

function Ej5($a, $b, $c, $d, $e)
	{
	$numPar=func_num_args();
	$par=func_get_args();
	for ($i=0; $i<$numPar; $i++ )
	{
		$num=$i+1;
		echo "El argumento $num recibido $par[$i] <br>";
	}
	return;
}
Ej5(8,10,18,28,46);
?>

</body>
</html>
