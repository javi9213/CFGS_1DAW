package ejercicio12;

import java.io.IOException;

public class testmrusa {

	public static void main(String[] args) throws IOException {
		
		long numero1 = 0,numero2 = 0;
		boolean condicion=true;
		
		while(condicion){
			System.out.print("introduce el primer número(ENTERO) a multiplicar : ");
			numero1=Leer.datoLong();
			
			System.out.print("introduce el segundo número(ENTERO) a multiplicar : ");
			numero2=Leer.datoLong();
			
			if ((numero1== Long.MIN_VALUE)||(numero1== Long.MIN_VALUE))
				{
				System.out.println("tienes los dedos muy gordos, intentalo de nuevo\n\npulsa ENTER para continuar");
				System.in.skip(System.in.available());
				}else{
				condicion=false;
				}
			}		
		Mrusa m=new Mrusa(numero1,numero2);
		System.out.print(numero1+" X "+numero2+" = "+m.multiplicar());
	}
}