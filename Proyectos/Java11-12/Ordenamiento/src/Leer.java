import java.io.*;
public class Leer{
	public static String dato(){
		String sdato = "";
		try{
		// Definir un flujo de caracteres de entrada: flujoE
			InputStreamReader isr =
				new InputStreamReader(System.in);
			BufferedReader flujoE=
				new BufferedReader(isr);
		// Leer. La entrada finaliza al pulsar la tecla Entrar
			sdato = flujoE.readLine();
		}catch(IOException e){
			System.err.println("Error: " + e.getMessage());
		}return sdato; // devolver el dato tecleado
	}

	public static short datoShort(){
		try{return Short.parseShort(dato());
		}
		catch(NumberFormatException e){
			// valor más pequeño
			return Short.MIN_VALUE;
		}
	}

	public static int datoInt(){
		try{return Integer.parseInt(dato());
		}
		catch(NumberFormatException e){
			// valor más pequeño
			return Integer.MIN_VALUE;
		}
	}

	public static long datoLong(){
		try{return Long.parseLong(dato());
		}
		catch(NumberFormatException e){
			// valor más pequeño
			return Long.MIN_VALUE;
		}
	}

	public static float datoFloat(){
		try{Float f = new Float(dato());
			return f.floatValue();
		}
		catch(NumberFormatException e){
			// No es un Número; valor float.
			return Float.NaN;
		}
	}

	public static double datoDouble(){
		try{Double d = new Double(dato());
			return d.doubleValue();
		}
		catch(NumberFormatException e){
			// No es un Número; valor double.
			return Double.NaN;
		}
	}

	public static String datoString(){
		return dato();
	}

	public static char datoChar(){
		int c=0;
		try{InputStreamReader isr =new InputStreamReader(System.in);
			BufferedReader flujoE=new BufferedReader(isr);
			c=flujoE.read();
			char car;
			car=(char) c;
			return car;
		}
		catch(IOException e){
			return '\0';
		}
	}
}