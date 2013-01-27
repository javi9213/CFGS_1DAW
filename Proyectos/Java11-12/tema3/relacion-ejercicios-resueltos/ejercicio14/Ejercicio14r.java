package ejercicio14;


public class Ejercicio14r
{
	public static void main(String[] args)
	{
		int fin = 0, numtiradas = 0;
		
		EstadisticaDados estadisticas = new EstadisticaDados();
		
		do
		{
			do
			{
				System.out.print("Introduce el numero de tiradas: ");
				numtiradas = Leerr.datoInt();
			}while (numtiradas < 1);
			
			estadisticas.indicarNumeroTiradas(numtiradas);
			estadisticas.calcularEstadistica();
			
			System.out.print("\n\nEscriba 0 si desea reiniciar el juego: ");
			fin = Leerr.datoInt();
			
		}while (fin == 0);
	}
}
