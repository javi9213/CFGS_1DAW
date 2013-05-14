<html 
<head>

<title>variables</title>
</head>

<body>

	<?php

		function variables()
	   	{
	    	static $contador;
	   	global $var;
	    	$local=1;
	    
	    	$contador++;
	   	$var++;
	    	$local++;

	    	echo "contador: $contador <br>";
	    	echo "var: $var <br>";
	    	echo "local: $local <br>";
		return;
		}

	    $contador=4;
	    $var=8;
	    $local=3;
	    variables();

	    $contador++;
	    $var++;
	    $local++;
	    variables();

	?>
</body>
</html>
