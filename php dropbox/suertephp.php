
<html 
<head>

<title>variables</title>
</head>

<body>

	<?php
// el numero de la suerte 
	function Luckynumber()
	{

		$numeroLucky=0;
		while($numero!=0)
		{
		   $numeroLucky+= num%10;
		   $numero=numero/10;
		   return;


		}
	
	}
	global $numero=45815;
	global $numeroLucky;
	Luckynumber();

	?>
</body>
</html>

