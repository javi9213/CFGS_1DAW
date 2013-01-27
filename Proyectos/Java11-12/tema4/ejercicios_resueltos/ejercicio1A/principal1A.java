package ejercicio1A;

public class principal1A {

	public static void main(String[] args) {
		System.out.print("Introduzca número para hacerle su factorial:");
		int num=Leer.datoInt();
		ejercicio1a fact = new ejercicio1a();
		if(num<0){
			System.out.println("Error el factorial no puede ser negarivo");
		}else{
			fact.numero(num);
		}
	}
}