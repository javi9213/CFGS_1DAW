import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperatura {
	public static void menu(){
		System.out.println();
		System.out.println("MENU TEMPERATURA");
		System.out.println("----------------");
		System.out.println("1.- PASAR A CELSIUS");
		System.out.println("2.- PASAR A FAHRENHEIT");
		System.out.println("0.- SALIR");
	}
	public static void pasarCelcius(double valor) throws IOException, InterruptedException{
		double resultado;
		resultado=(valor-32)/1.8;
		System.out.println("El valor del Celcius de "+valor+" es "+resultado);
		Thread.sleep(3000);
		main(null);
	}
	public static void pasarFahrenheit(double valor) throws IOException, InterruptedException{
		double resultado;
		resultado=((1.8)*valor)+35;
		System.out.println("El valor del Fahrenheit de "+valor+" es "+resultado);
		Thread.sleep(3000);
		main(null);
	}
	public static void main(String[]args)throws IOException, InterruptedException{
		BufferedReader ln = new BufferedReader(new InputStreamReader(System.in));
		
		int opc=0;
		double valor=0;
		
		do{
			menu();
			System.out.println("Introduce opcion que desea realizar: ");
			opc=Integer.parseInt(ln.readLine());
			System.out.println("Ha elegido la opcion:"+opc);
			if((opc>2)||(opc<0)){
				System.out.println("No a introducido la opcion correcta");
				Thread.sleep(3000);
			}
		}while ((opc>2)||((opc<0)));
		
		switch(opc){
			case 1:
				System.out.println("PASAR A CELCIUS");
				System.out.println("Valor de temperatura");
				valor=Double.parseDouble(ln.readLine());
				pasarCelcius(valor);
				break;
			case 2:
				System.out.println("PASAR A FAHRENHEIT");
				System.out.println("Valor de temperatura");
				valor=Double.parseDouble(ln.readLine());
				pasarFahrenheit(valor);
				break;
			case 0:
				System.out.println("SALIR");
				break;
		}
	}
}