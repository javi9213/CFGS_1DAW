package ejercicios;
public class Naranja extends Fruta{
	private String origen;
	
	public Naranja(){
		// Como ya se sabe que es una Naranja, se inicializa el valor del nombre.
		super("Naranja");
	}
	
	public void escribeCaracteristicas(){
		System.out.println("Origen: " + origen);
	}
	
	public void cambiaOrigen(String nuevoOrigen){
		origen = nuevoOrigen;
	}
}