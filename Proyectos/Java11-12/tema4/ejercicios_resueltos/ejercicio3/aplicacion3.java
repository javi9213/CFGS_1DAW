package ejercicio3;

public class aplicacion3 {

	public static void main(String[] args) {
		int numfilas;
		
		System.out.print("Introduzca numero para hacer la pirámide:");
		numfilas=Leer.datoInt();
		
		if(numfilas<4){
			System.out.println("Error el numero no puede ser negativo o menor de 3");
		}else{
			for(int i=1;i<(numfilas-1);i++){
				for(int e=0;e<(numfilas-i);e++)
					System.out.print(" ");
				for(int j=1;j<(numfilas+1);j++){
					int dato=ejercicio3.elemento(i,j);
					if(dato>0)
						System.out.print(dato+" ");
				}
				System.out.println();
			}
		}
	}
}