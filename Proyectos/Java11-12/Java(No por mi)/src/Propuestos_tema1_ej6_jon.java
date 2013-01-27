import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Propuestos_tema1_ej6_jon {
	/*Diseña un programa que muestre si un número es múltiplo de otro. En caso afirmativo indicar que 
	 * múltiplo es y en caso contrario indicar cuál es el más cercano redondeando hacia abajo.*/
	public static void main(String[]args)throws IOException{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		double num;
		double num2;
		double result;
	
		System.out.println("Introduce el numero:");
		num=Integer.parseInt(lectura.readLine());
		System.out.println("Introduce el multiplo:");
		num2=Integer.parseInt(lectura.readLine());
		
		result=num%num2;
		if(result==0){
			System.out.println("Es multiple");
		}else{
			System.out.println("No es multiple");
			do{
				num--;
				result=num%num2;
			}while(result!=0);
			System.out.println("El mas cercano es "+num);
		}
	}
}