package ejercicios;
public class Fruta{
	private String nombre;
	
	public Fruta(String nuevoNombre){
		nombre = nuevoNombre;
	}
	
	public void escribeCaracteristicas(){
		System.out.println("No hay características definidas");
	}
	
	public void escribeNombre(){
		System.out.println(nombre);
	}
	
	public void cambiaNombre(String nuevoNombre){
		nombre = nuevoNombre;
	}
}