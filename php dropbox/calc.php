<html>
<head>
<title>
<p>prueba de formulario</p>
</title>
</head>

<body>
	<form namme="calc" method ="POST" action="calc.php">
		Numero1 <br> <input type="int" name="num1" value="" >
		<br>
		+
		<br>
		Numero2 <br> <input type="int" name="num2" value="" >
		<br>
		
		<input type="submit" value="Suma">
	

	<?php
		
		$num1=$_POST["num1"];
		$num2=$_POST["num2"];
		$suma=$num1+$num2;
		
	?>
		<br>Resultado<br> <input type="int" name="num3" value="<? echo $suma ?>" >
	</form>

</body>
</html>
