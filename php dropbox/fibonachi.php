<html>
<head>
	<title>Fibonachi</title>
</head>
<body>
<?php

function Rellenararray($num){
	

	$valFib[0]=1;
	$valFib[1]=1;		

	for ($i=2; $i<$num; $i++ )
	{
	
		$valFib[$i]=$valFib[$i-2]+$valFib[$i-1];
	
		
		echo " La posicio$i es $valFib[$i] <br>";
	}
	return ;
}




Rellenararray(13);

?>

</body>
</html>
