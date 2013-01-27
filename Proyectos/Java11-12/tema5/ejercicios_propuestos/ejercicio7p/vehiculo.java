package ejercicio7p;

public class vehiculo {
	private int peso;
	public final void setPeso(int p){
		peso = p;
	}
	//public abstract int getValorActual();
	
	/*1º Si puede tener descendencia, porque tiene el atributo abstract, las
	 * clases con este atributo están hechas para ser heredadas*/
	/**2º No, el método setPeso no puede ser sobreescrito porque tiene
	 * el atributo final y ningún método con este atributo puede modificarse
	 * si no es en la clase padre*/
}