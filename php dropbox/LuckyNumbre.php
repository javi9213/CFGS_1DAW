<?php
// el numero de la suerte 


	function Luckynumber(){
		global $numero;
		$numeroLucky=0;
		while($numero!=0){
		   $numeroLucky+= $numero%10;
		   $numero/=10;

		}
		echo "<br>El numero de la suerte es $numeroLucky";
		
		return;

	
	}
	
	$numero=2890;
	Luckynumber();

?>

