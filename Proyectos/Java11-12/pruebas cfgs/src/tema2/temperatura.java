package tema2;
class temperatura {
	public static double celsiusToFarenheit(double temp){
		return(1.8)*temp+32;
	}
	public static double farenheitToCelsius(double temp){
		return(temp-32)/1.8;
	}
	public static void main(String[] args){
	System.out.println("0 grados Celsius son "+celsiusToFarenheit(0)+" Grados Farenheit");
	System.out.println("15 grados Celsius son "+celsiusToFarenheit(15)+" Grados Farenheit");
	System.out.println("20 grados Celsius son "+celsiusToFarenheit(20)+" Grados Farenheit");
	System.out.println("0 grados Farenheit son "+farenheitToCelsius(0)+" Grados Celsius");
	System.out.println("15 grados Farenheit son "+farenheitToCelsius(45)+" Grados Celsius");
	System.out.println("20 grados Farenheit son "+farenheitToCelsius(70)+" Grados Celsius");
	}
}