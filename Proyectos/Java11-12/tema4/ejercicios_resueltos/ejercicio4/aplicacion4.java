package ejercicio4;

public class aplicacion4 {

	public static void main(String[] args){
		
		System.out.print("Introduzca numero para realizar la pirámide:");
		int numfilas = Leer.datoInt();
		if(numfilas<=0){
			System.out.println("Error el numero introducido negativo o cero");
		}else{
			for(int i=1;i<(numfilas+1);i++){
				for(int e=0;e<(numfilas-i);e++)
					System.out.print(" ");
				for(int j=1;j<(2*numfilas+1);j++){
					int dato=ejercicio4.elemento(i,j);
					if(dato>0)
						System.out.print(dato+", ");
				}
				System.out.println();
			}
		}
	}
}