public class Ejercicio2_Examen {

	public static int valor = 2;
	
	public static void metodo1(int valor)
	{
		valor *= 2;
	}
	
	public static int metodo2()
	{
		return (3 * valor);
	}
	
	public static void metodo3(int multiplicador)
	{
		valor *= multiplicador;
	}
	
	public static void main(String[] args) {
		metodo1(valor);
		metodo2();
		System.out.println(valor);
		metodo3(metodo2());
		System.out.println(valor);
	}
}
