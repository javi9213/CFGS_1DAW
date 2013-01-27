package Ejercicio2;

public class principaloco {

	public static void main(String[] args) {
		NumeroLoco numloco5 = new NumeroLoco(12345);
		NumeroLoco numloco4 = new NumeroLoco(1234);
		NumeroLoco numloco3 = new NumeroLoco(123);
		NumeroLoco numloco0 = new NumeroLoco();
		
		System.out.println(numloco5.locura());
		System.out.println(numloco4.locura());
		System.out.println(numloco3.locura());
		System.out.println(numloco0.locura());
		
	}
}