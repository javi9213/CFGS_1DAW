package ejercicio11;

public class AppMiMath {

	public static void main(String[] args){
		int opc; //opcion del menu
		MiMath N1= new MiMath(); //definimos el número sin valores
		do{		
			System.out.println("-1.- Introducir Numero");
			System.out.println("-2.- Potencia (N^M)");
			System.out.println("-3.- Factorial");
			System.out.println("-4.- Sucesion Numero: 1+2+3+4,...,+N-1+N");
			System.out.println("-0.- Salir del programa");
			opc= Leer.datoInt();
			
			switch (opc){
			case (1):{
				N1.SetNumero();
			}break;
			case (2):  //Potencia 
			{	long n;long resultado;long m;
				resultado=N1.Potencia(); 
				n=N1.GetNumero(); // averiguamos n
				m= N1.AveriguaM(resultado);  //sistema o método para averiguar m a través de n y resultado; resultado=n^m
				System.out.println("El número "+n+" elevado a "+m+" es = "+resultado);
			}break;
			case(3):  //factorial
			{
				long resultado;long n;
				n=N1.GetNumero();
				resultado= N1.Factorial();
				System.out.println("el factorial del número "+n+" es "+resultado);
			}break;
			case(4):  //Sucesion sumada
			{
				long resultado;long n;
				n=N1.GetNumero();
				resultado=N1.SumaSucesion();
				System.out.println("La suma de la sucesió: 1+2+3+...+"+n+" es "+resultado);
			}break;
			default:
			{
				System.out.println("!!Bye");
			}
						
			}
			
			
			
		}while (opc !=0);
		
		

	}

}
