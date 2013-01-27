package ejercicio10;

public class mainTest {
	
	//metodo que ofrece el menu
	public static int menu(){
		int opc;
		
		System.out.printf("\nElige el formato en que quieres convertir el número\n");
		System.out.printf("\n1.Binario.\n2.Octal.\n3.Hexadecimal.\n");
		opc=Leer.datoInt();
		
		return opc;
	}

	public static void main(String [] args){
		int numD;
		int opcion;
		boolean salir=false;
		String numConvert="";
		
		//crear el objeto de la clase conversor
		conversor c1=new conversor();
	
		while(!salir){
			
			//entrada del dato
			System.out.printf("\nIntoduzca el número decimal \n");
			numD=Leer.datoInt();
			
			//contol de la entrada
			while(numD<0){
				System.out.printf("\nSe ha introducido un número invalido \n");
				System.out.printf("\nIntoduzca el número decimal \n");
				numD=Leer.datoInt();
			}
			
			//menu
			opcion=menu();
			
			while(opcion<0 || opcion>3){
				System.out.printf("\nSe ha intoducido una opción invalida\n");
				opcion=menu();
			}
			
			//llamamos al metodo para almacenar el número y la opción
			c1.setDatos(numD, opcion);
			numConvert=c1.Conversor();
			
			System.out.printf("\nEl número cambiado es %s", numConvert);
			
			//salir o no
			System.out.printf("\n1.Salir\n2.Seguir\n");
			opcion=Leer.datoInt();
			if(opcion==1)salir=true;
		}
	}
}