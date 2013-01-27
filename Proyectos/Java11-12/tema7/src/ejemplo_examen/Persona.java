package ejemplo_examen;

public class Persona{

	private String nombre;
	private int edad;

	public Persona(String nom, int ed)
	{
		this.nombre = nom;
		this.edad = ed;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int getEdad(){
		return edad;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}

	public String toString()
	{
		String cadena = "";
		cadena += "Nombre: " + this.getNombre() + "\n";
		cadena += "Edad: " + this.getEdad() + "\n";
		
		return cadena;
	}
}