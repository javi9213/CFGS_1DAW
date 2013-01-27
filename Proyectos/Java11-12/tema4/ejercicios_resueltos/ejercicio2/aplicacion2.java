package ejercicio2;

public class aplicacion2 {

	public static void main(String[] args) {
		
		int num, i;
		
		System.out.print("Introduzca número para realizarle la serie de Fibonacci:");
		num=Leer.datoInt();
		if(num<=0){
			System.out.println("Error fibonacci no puede ser negativo ni 0");
		}else{
			for(i=0;i<num;i++){
				System.out.print(ejercicio2.fibonacci(i)+", ");
			}
		}
	}
}