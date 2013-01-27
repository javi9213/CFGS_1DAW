import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class radio {
	public static void main(String[] args) throws IOException {
		final float PI=3.141592F;
		float longitud;
		System.out.println("Introduzca el radio de la circunferencia:");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader buff=new BufferedReader(isr);
		String ln=buff.readLine();
		int radio =Integer.parseInt(ln);
		longitud=2*PI*radio;
		System.out.println("La longitud de radio "+radio+" la circunferencia es: "+longitud);
	}
}