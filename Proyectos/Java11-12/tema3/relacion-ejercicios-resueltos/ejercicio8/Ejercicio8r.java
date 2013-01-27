package ejercicio8;

public class Ejercicio8r
{
	
	public static void main(String[] args)
	{
		int num = 0;
		
		do{
			System.out.print("Introduce la altura de la pirámide: ");
			num = Leerr.datoInt();
		}while (num <= 0);
		
		PiramideEquilibrada piramide = new PiramideEquilibrada(num);
		piramide.dibujar();
	}
}
