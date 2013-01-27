package ejercicio2r;

public class CEcuacion extends CTermino{

	private CTermino polinomio, polinomio1, polinomio2;
	
	public CEcuacion(int coefi, int expo) {
		super(coefi, expo);
	}
	
	public void ecuacion(){
		polinomio2 = new CTermino(9,3);
		polinomio1 = new CTermino(7,2);
		polinomio = new CTermino(5,1);
	}
	
	public void mostrarecuacion(){
		System.out.println(""+polinomio2+polinomio1+polinomio);
	}
}