package ejercicio1B;

public class aplicacion1b {

	public static void main(String[] args) {
		System.out.print("Introduzca número para hacerle su factorial:");
		int num=Leer.datoInt();
		ejercicio1b fact = new ejercicio1b();
		if(num<0){
			System.out.println("Error factorial no puede ser negativo");
		}else{
			fact.numero(num);
		}
	}
}