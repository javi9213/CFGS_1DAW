<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>

<body>




<?php

// Formar un array con los registros del procesador.

$procesador = array("r0" => 000,
"r1" => 0000,
"r2" => 0000,
"r3" => 0000,
"r4" => 0000,
"r5" => 0000,
"r6" => 0000,
"r7" => 0000,
"r8" => 0000,
"r9" => 0000,
"rA" => 0000,
"rB" => 0000,
"rC" => 0000,
"rD" => 0000,
"rE" => 0000,
"rF" => 0000, );

echo $procesador["r4"];


function LD($r,$op2)
{
	
$procesador[$r] = $op2; // Donde $op tiene que ser la caja de texto que corresponda a ese registro.

	
}





function IN ($r, $PE){
		$aux = $r;//Guardo el registro para no perderlo
		$r = $PE;//Meto en el registro lo que metamos en el puerto de entrada
		return $r;//Devolvemos $r
	}
	




function OUT($r, $PS){
		$PS = $r;
		return $PS;
	}
	
	/*echo IN(4, 6);
	echo OUT(2);*/
	//Prueba de las funciones IN y OUT
	


function ADDS($a, $b){
		$r = $a + $b;
		return $r;
	}
	



function SUBS($a, $b){
	$r = $a - $b;
	return $r;
	
	}
	


function NAND($a, $b){
	$abin = $a;
	$bbin = $b;
	$nand = $abin & $bbin;
	$result = !$nand;
	return $result;
	}
	
	echo NAND(13,2);
	
function descomposicion($d){
		$d1 = substr($d,0,1);
		$num = toBinario($d1);
		$d2 = substr($d,1,1);
		$num1 = toBinario($d2);
		$d3 = substr($d,2,1);
		$num2 = toBinario($d3);
		$d4 = substr($d,3,1);
		$num3 = toBinario($d4);
		$numt = "$num $num1 $num2 $num3";
		return $numt;
	}
	
	
	
function toBinario($n){
		if ($n=='1'){
			$n='0001';
		}
		if ($n=='2'){
			$n='0010';
		}
		if ($n=='3'){
			$n='0011';
		}
		if ($n=='4'){
			$n='0100';
		}
		if ($n=='5'){
			$n='0101';
		}
		if ($n=='6'){
			$n='0110';
		}
		if ($n=='7'){
			$n='0111';
		}
		if ($n=='8'){
			$n='1000';
		}
		if ($n=='A'){
			$n='1001';
		}
		if ($n=='A'){
			$n='1010';
		}
		if ($n=='A'){
			$n='1010';
		}
		else if ($n=='B'){
			$n = '1011';
		}
		else if ($n=='C'){
			$n = '1100';
		}
		else if ($n=='D'){
			$n = '1101';
		}
		else if ($n=='E'){
			$n = '1110';
		}
		else if ($n=='F'){
			$n = '1111';
		}

		return $n;
	}
	
function LLI($rx, $v){
$rx1=substr ($rx, 0, 4);
$rx=$rx1.$v;
return $rx;
}




function LHI ($rx, $v){
$rx=$v."0000";
return $rx;
}	


echo LLI ('12345678', '1A2B'); 
echo "<br>";
echo LHI ('12345678', '1A2B');


function B ($rD,$cnd){
	if($flag['R'] == 0){
		$CP = $rD;
		return $CP;
	}else if($flag['Z'] == 1){
		$CP = $rD;
		return $CP;
	}else if($flag['S'] == 2){
		$CP = $rD;
		return $CP;
	}else if($flag['C'] == 3){
		$CP = $rD;
		return $CP;
	}else if($flag['V'] == 4){
		$CP = $rD;
		return $CP;
	}
}

function CALL($rx,$cnd){
	
}







?>
</body>
</html>