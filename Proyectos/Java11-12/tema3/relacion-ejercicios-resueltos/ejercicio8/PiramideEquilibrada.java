package ejercicio8;


public class PiramideEquilibrada
{

	private int altura;
	
	public PiramideEquilibrada(int alt)
	{
		if (alt > 1)
			altura = alt;
		else
			altura = 1;
	}
	
	public void dibujar()
	{
		int blancos;
		int caracter;
		int fila = 1;
		
		while (fila <= altura)
		{
			blancos = 0;
			caracter = 0;
			
			while (blancos < (altura-fila))
			{
				System.out.print(" ");
				blancos++;
			}
			
			while (caracter < fila)
			{
				System.out.print("* ");
				caracter++;
			}
			
			System.out.println();
			fila++;
		}
	}
}
