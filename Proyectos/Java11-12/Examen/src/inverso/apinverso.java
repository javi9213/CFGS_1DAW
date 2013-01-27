package inverso;

public class apinverso {

	public static void main(String[] args) {
		
		long num = 0;
		
		do{
			System.out.print("Introduzca número:");
			num = Leer.datoLong();
		}while(num>0);
		numinverso.inverso(num);
	}
}