import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios_08 {
	/* Define e inicializa variables para representar las personas que hay en un teatro, las líneas telefónicas de
	 * un país, los días de la semana o la posición de un bit en un octeto (byte).*/
	public static void main(String[]args)throws IOException {
		BufferedReader ln = new BufferedReader(new InputStreamReader(System.in));
		
		int personas;
		long telefono;
		byte octeto;
		short semana;
		
		System.out.println("Introduce personas: ");
		personas=Integer.parseInt(ln.readLine());
		
		System.out.println("Introduce telefono: ");
		telefono=Long.parseLong(ln.readLine());
		
		System.out.println("Introduce octeto: ");
		octeto=Byte.parseByte(ln.readLine());
		
		System.out.println("Introduce semana: ");
		semana=Short.parseShort(ln.readLine());
		
		System.out.println("Mostrar personas de un teatro: "+personas);
		System.out.println("Mostrar telefono: "+telefono);
		System.out.println("Mostrar byte: "+octeto);
		System.out.println("Mostrar dia de semana: "+semana);
	}
}