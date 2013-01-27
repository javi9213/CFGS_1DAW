package ejercicio4;

public class aplicacion4 {

	public static void main(String[] args) {
		System.out.print("Introduzca el primer coeficiente:");
		int a=Leerr.datoInt();
		System.out.print("Introduzca el segundo coeficiente:");
		int b=Leerr.datoInt();
		System.out.print("Introduzca el tercer coeficiente:");
		int c=Leerr.datoInt();
		System.out.print("Introduzca x para la resolución de la ecuación:");
		int x=Leerr.datoInt();
		ejercicio4 ecuacion=new ejercicio4();
		ecuacion.x5(x,a,b,c);
	}
}