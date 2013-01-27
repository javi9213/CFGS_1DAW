public class CPersona{
	
	//Atributos nombre, edad y numero de telefono del contacto
	private String nombre;
	private long numtelf;
	private int edad;
	
	//Constructor vacio
	public CPersona(){
		nombre="";
		numtelf=0;
		edad=0;
	}
	
	//Constructor con parametros
	public CPersona(String nom, int edad, long numtelf){
		this.nombre=nom;
		this.numtelf=numtelf;
		this.edad=edad;
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getNumtelf() {
		return numtelf;
	}

	public void setNumtelf(int numtelf) {
		this.numtelf = numtelf;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Metodo toString() para mostrar las personas
	public String toString(){
		String cadena="";
		cadena += getNombre()+" "+getEdad()+" "+getNumtelf();
		return cadena;
	}
}