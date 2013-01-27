public class rebajas {
	public static double descubrePorcentaje(double original, double actual){
		return (original-actual)*100/original;
	}
	public static void main(String []args){
		System.out.println(descubrePorcentaje(100,79));
		System.out.println(descubrePorcentaje(100,50));
	}
}