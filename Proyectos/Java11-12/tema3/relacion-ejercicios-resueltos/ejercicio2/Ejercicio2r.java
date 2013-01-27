package ejercicio2;

public class Ejercicio2r
{
	public static void main(String args[])
	{
		String nombre;
		final int ANYO = 2030;
		int nacimiento;
		int edad;
    
		
		System.out.print("Introduce el nombre: ");
		nombre=Leerr.dato();
		System.out.print("Introduzca el año de nacimiento: ");
		nacimiento=Leerr.datoInt();
		edad = ANYO-nacimiento;
		System.out.println("Hola " + nombre + " en el año 2030 tendrás "+ edad +" años.");
	}
}
