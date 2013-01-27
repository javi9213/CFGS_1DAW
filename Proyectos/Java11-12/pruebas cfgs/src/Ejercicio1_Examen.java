public class Ejercicio1_Examen {

	public static void main(String[] args)
	{
		// Declaración de variables
		final int MESES_EN_UN_AÑO = 12;
		float cuantiaPrestamo = 0.0f, interesAnual = 0.0f, interesMensual = 0.0f;
		int duracionPrestamo = 1;
		double pagoMensual = 0.0, pagoTotal = 0.0;
		int numeroPagos = 0;
		
		// Parte ejecutiva del programa
		System.out.println("Este programa calbula el pago mensual y " +
				"total de un prestamo");
		
		// Entrada de datos
		cuantiaPrestamo = 100000;
		interesAnual = 3.5f;
		duracionPrestamo = 15;
		
		// Cálculo del prestamo
		interesMensual = interesAnual / 100.0f / MESES_EN_UN_AÑO;
		numeroPagos = duracionPrestamo * MESES_EN_UN_AÑO;
		pagoMensual = (cuantiaPrestamo * interesMensual) / (1 - Math.pow(1+interesMensual,-numeroPagos));
		pagoTotal = pagoMensual * numeroPagos;
		
		// Salida de datos
		System.out.println("\n Cuantia del prestamo: " + cuantiaPrestamo + " euros");
		System.out.println(" Interes anual: " + interesAnual + "%");
		System.out.println(" Duración del prestamo (años): " + duracionPrestamo);
		System.out.println(" Pago mensual: " + pagoMensual + " euros");
		System.out.println(" Cantidad total a pagar: " + pagoTotal + " euros");
	}
}
