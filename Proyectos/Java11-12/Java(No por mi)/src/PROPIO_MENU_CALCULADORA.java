/* Realizar un MENU por consola, donde te de las sigientes opciones: suma, resta, multiplicacion,division y salir.
 * Realizar funciones para elavorar cada una de las tareas del menu. Se introducen los valores por teclado 
 * para moverse por el menu de la consola.*/

import java.io.*;
public class PROPIO_MENU_CALCULADORA {
	
	public static void menu(){
		System.out.println();
		System.out.println("MENU CALCULADORA");
		System.out.println("----------------");
		System.out.println("1.- SUMAR");
		System.out.println("2.- RESTAR");
		System.out.println("3.- MULTIPLICAR");
		System.out.println("4.- DIVIDIR");
		System.out.println("0.- SALIR");
	}
	
	public static void suma(int num1,int num2) throws IOException{
		int suma=0;
		suma=num1+num2;
		System.out.println("SUMA="+num1+"+"+num2+"="+suma);		
		main(null);
	}
	
	public static void restar(int num1,int num2)throws IOException{
		int restar=0;
		restar=num1-num2;
		System.out.println("RESTAR="+num1+"-"+num2+"="+restar);
		main(null);
	}
	
	public static void multiplicar(int num1,int num2)throws IOException{
		int multiplicar=0;
		multiplicar=num1*num2;
		System.out.println("MULTIPLICAR="+num1+"*"+num2+"="+multiplicar);
		main(null);
	}	
	
	public static void dividir(int num1,int num2)throws IOException{
		int dividir=0;
		int temp=0;
		dividir=num1/num2;
		temp=num1%num2;
		System.out.println("DIVIDIR="+num1+"/"+num2+"="+dividir);
		System.out.println("RESTO="+temp);
		main(null);
	}	

	public static void main(String[]args)throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		
		int opc;
		int num1=0;
		int num2=0;		
		
		do{
			menu();
			System.out.println("Introduce opcion que desea realizar: ");
			//opc=lectura.read();
			opc=Integer.parseInt(lectura.readLine());
			System.out.println("Ha elegido la opcion:"+opc);
		}while ((opc>4)||((opc<0)));
		
		switch(opc){
			case 1:
				System.out.println("SUMA");
				System.out.println("Valor de num1");
				//num1=lectura.read();
				num1=Integer.parseInt(lectura.readLine());
				System.out.println("Valor de num2");
				//num2=lectura.read();
				num2=Integer.parseInt(lectura.readLine());
				suma(num1,num2);
				break;
			case 2:
				System.out.println("RESTAR");
				System.out.println("Valor de num1");
				//num1=lectura.read();
				num1=Integer.parseInt(lectura.readLine());
				System.out.println("Valor de num2");
				//num2=lectura.read();
				num2=Integer.parseInt(lectura.readLine());
				restar(num1,num2);
				break;
			case 3:
				System.out.println("MULTIPLICAR");
				System.out.println("Valor de num1");
				//num1=lectura.read();
				num1=Integer.parseInt(lectura.readLine());
				System.out.println("Valor de num2");
				//num2=lectura.read();
				num2=Integer.parseInt(lectura.readLine());
				multiplicar(num1,num2);
				break;
			case 4:	
				System.out.println("DIVIDIR");
				System.out.println("Valor de num1");
				//num1=lectura.read();
				num1=Integer.parseInt(lectura.readLine());
				System.out.println("Valor de num2");
				//num2=lectura.read();
				num2=Integer.parseInt(lectura.readLine());
				dividir(num1,num2);
				break;
			case 0:
				System.out.println("SALIR");
				break;
		}
	}
}