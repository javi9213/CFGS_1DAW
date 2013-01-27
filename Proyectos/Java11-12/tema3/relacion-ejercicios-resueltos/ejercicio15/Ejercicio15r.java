package ejercicio15;


public class Ejercicio15r
{
	public static void main(String[] args)
	{
		int numcolumnas = 1;
		Quiniela q1 = new Quiniela();
		
		do
		{
			System.out.print("Introduzca el numero de columnas de la quiniela: ");
			numcolumnas = Leerr.datoInt();
		}while (numcolumnas < 1);
		
		q1.setNumColumnas(numcolumnas);
		q1.setPesos(50.0, 30.0, 20.0);
		q1.mostrarQuiniela();
	}

}
