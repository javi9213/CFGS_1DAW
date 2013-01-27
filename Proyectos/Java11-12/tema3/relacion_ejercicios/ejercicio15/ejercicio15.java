package ejercicio15;

public class ejercicio15 {

	public void columnas (int filas, int columnas){
		int lot,f,c;
		for (f=0;f<filas;f++){
			for (c=0;c<columnas;c++){
				if ((c>0 && c<filas-1) && (f>0 && f<filas-1)){
					lot=(int) (1+Math.random()*10);
					if((lot>=1)&&(lot<=5)){
						System.out.print("1");
					}
					if((lot>=6)&&(lot<=8)){
						System.out.print("x");
					}
					if((lot==9)||(lot==10)){
						System.out.print("2");
					}
				}else{
					lot=(int) (1+Math.random()*10);
					if((lot>=1)&&(lot<=5)){
						System.out.print("1");
					}
					if((lot>=6)&&(lot<=8)){
						System.out.print("x");
					}
					if((lot==9)||(lot==10)){
						System.out.print("2");
					}
				}
			}
			System.out.println();
		}
	}
	
	public void menu(){
		System.out.println("La Quiniela");
		System.out.println("***********");
		System.out.println("Opción 1: Jugar");
		System.out.println("Opción 2: Salir");
		System.out.print("Introduzca opción deseada:");
	}
}