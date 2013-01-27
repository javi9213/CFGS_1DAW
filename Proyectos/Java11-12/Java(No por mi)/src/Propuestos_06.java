public class Propuestos_06{											// Area de circunsferencia

	final static double PI=3.1416;
	public static void main(String[] args) {

		double radio=5.2;
		double area;
		
		//area=(radio*radio)*PI;
		area=PI*Math.pow(radio,2);
		System.out.println("El area es: "+area);
	}
}