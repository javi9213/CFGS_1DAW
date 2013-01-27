package ejercicio7propuesto;
import java.util.*;
public class ejercicio7p{

	public static void main(String[] args){
		Random rnd= new Random();
		int valor = rnd.nextInt(100);
		valor = valor + 100;
		System.out.println(valor);
	}
}