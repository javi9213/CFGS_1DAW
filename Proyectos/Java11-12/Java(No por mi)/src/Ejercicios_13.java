public class Ejercicios_13 {
	/* El precio final de un producto para un comprador es la suma total del costo del producto, un porcentaje
	 *  de beneficios que obtiene el vendedor y el I.V.A. Diseñar un algoritmo para obtener el precio final de 
	 *  un producto sabiendo su costo, el porcentaje de beneficios y el I.V.A. aplicable. Obtener el resultado 
	 *  redondeando a los múltiplos de cinco céntimos.
	 */
	static double IVA=0.18;
	public static void main(String[] args) {

		double precio_final;
		double costo=6869;
		double beneficios=2;
		int temp;
		int decimal;
		
		precio_final=costo+beneficios*IVA;
		precio_final = 6869.38;
		System.out.println("Precio final: "+precio_final);
				
		temp = (int)(precio_final*100)+1;
		System.out.println("Precio final: "+temp);
		/*System.out.println("Precio temp: "+temp);
		decimal=(int) (((precio_final-temp)*100))+1;
		System.out.println("Temp dec: "+decimal);*/
		temp = (((int)(temp/5+0.5))*5);
		precio_final = (double)temp / 100.00;
		System.out.println(precio_final);
	}
}