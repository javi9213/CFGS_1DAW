package ejercicio7;

public class principal {
	public static void main (String[]args){
		int elec1=0;
		int elec2=0;
		do{
		
		do{
		System.out.println("1. Conversion de decimal a binario.");
		System.out.println("2. Conversion de binario a decimal.");
		System.out.println("3. Sumar dos numeros binarios.");
		System.out.println("4. Multiplicar dos numeros binarios.");
		elec1=Leer.datoInt();
		}while(elec1<1||elec1>4);
		
		//variables de recogida de datos.
		long num;
		long num2;
		
		switch(elec1){
		case 1:
			System.out.println("Introduzca el numero: ");
			num=Leer.datoLong();
			System.out.println("Su numero en binario es: "+binario.decAbin(num));
			break;	
		case 2:
			System.out.println("Introduzca el numero: ");
			num=Leer.datoLong();
			System.out.println("Su numero en binario es: "+binario.binAdec(num));
			break;	
		case 3:
			System.out.println("Introduzca el 1º numero binario a sumar es: ");
			num=Leer.datoLong();
			System.out.println("Introduzca el 2º numero binario a sumar es: ");
			num2=Leer.datoLong();	
			num=binario.binAdec(num)+binario.binAdec(num2);	
			System.out.println("El resultado es "+binario.decAbin(num));		
			break;		
		case 4:
			System.out.println("Introduzca el 1º numero binario a multiplicar es: ");
			num=Leer.datoLong();
			System.out.println("Introduzca el 2º numero binario a multiplicar es: ");
			num2=Leer.datoLong();
			num=binario.binAdec(num)*binario.binAdec(num2);	
			System.out.println("El resultado es "+binario.decAbin(num));
			break;
		}
		
		System.out.println("¿Desea seguir operando?");
		System.out.println("Pulse 1, para SI.");
		System.out.println("Pulse cualquier tecla para NO.");
		
		elec2=Leer.datoInt();
		
		}while(elec2==1);
		
		System.out.println("Fin de programa.");
	}
}