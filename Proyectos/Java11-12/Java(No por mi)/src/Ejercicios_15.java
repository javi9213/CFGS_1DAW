public class Ejercicios_15 {

	/*Investiga y explica si las expresiones siguientes son correctas en Java. Explica también donde podías 
	 * utilizar la variable num o res, en cada caso.
	 * {
	 * long num = 12;
	 * 		{
	 * 			long res = 96;
	 * 		}
	 * }
	 * 
	 * {
	 * int num = 12;
	 * 		{
	 * 			int num = 96;
	 * 		}
	 * }*/
	public static void main(String[] args) {
		/* En la primera opcion tiene un valor num con valor 12, y al entrar en la funcion le da a res el valor de 96
		 * No esta la variable rest, declarada. PETA
		 * En la segunda opcion tiene un valor num con valor 12, y luego lo sobreescribe cambiandole el valor a 96.
		 * Tampoco funciona porque no realiza nada.*/
		
		/*long rest;
		long num=12;
		{
			long rest=96;
		}
		System.out.println("NUM: "+num+"RES: "+rest);*/
		
		/*int num=12;
		{
			int num=96;
		}
		System.out.println("NUM: "+num);*/
	}
}