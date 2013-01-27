import java.util.Scanner;


public class aplicacion {
	
	/*Metodo que devuelve un array con
	 *el numero de filas y columnas insertadas
	 *por el usuario a traves de la consola*/
	public int[] introducirfyc() {
		
		int num[]= new int [4];
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Introduzca la fila de la primera persona: ");
		num[0] = lector.nextInt();
		System.out.print("Introduzca la columna de la primera persona: ");
		num[1] = lector.nextInt();
		System.out.print("Introduzca la fila de la segunda persona: ");
		num[2] = lector.nextInt();
		System.out.print("Introduzca la columna de la segunda persona: ");
		num[3] = lector.nextInt();
		System.out.println();
		
		return num;
	}
	
	/*Metodo que devuelve un array con
	 *los nombres de las personas leido
	 *de consola que ha sido previamente
	 *insertado por el usuario*/
	public String[] introducirnoms() {
		
		String nombre[] = new String [6];
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Introduzca primera persona: ");
		nombre[0]=lector.next();
		System.out.print("Introduzca segunda persona: ");
		nombre[1]=lector.next();
		System.out.print("Introduzca tercera persona: ");
		nombre[2]=lector.next();
		System.out.print("Introduzca cuarta persona: ");
		nombre[3]=lector.next();
		System.out.print("Introduzca quinta persona: ");
		nombre[4]=lector.next();
		System.out.print("Introduzca sexta persona: ");
		nombre[5]=lector.next();
		System.out.println();
		
		return nombre;
	}
	
	public static void main(String[] args) {
		
		int intentos = 0;
		
		//Instancio las dos clases que tengo
		juego jugar = new juego();
		aplicacion aplicar = new aplicacion();
		
		//Relleno el array y muestro el array incognita
		jugar.rellenar(aplicar.introducirnoms());
		jugar.mostrarincog();
		
		/*En este bucle hago que repita el metodo 
		 *introducirfys() hasta que acierte todas
		 *las parejas y si has acertado o no te
		 *mostrara un mensaje por consola y si
		 *has acertado te dira el numero de intentos
		 *que has utilizado para descubrir todas las
		 *parejas*/
		while(!jugar.comprobar(aplicar.introducirfyc())){
			aplicar.introducirfyc();
			intentos++;
			
			if(jugar.comprobar(aplicar.introducirfyc())==false){
				System.out.print("NO HAS ACERTADO VUELVE A INTENTARLO");
			}else{
				System.out.print("HAS ACERTADO. TU NUMERO DE INTENTOS ES: "+intentos);
			}
		}
	}
}