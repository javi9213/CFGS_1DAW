package tema2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class coche8 {
	InputStreamReader isr=new InputStreamReader (System.in);
	BufferedReader lectura= new BufferedReader(isr);
	public coche8() throws IOException{
		char marca=(char)Integer.parseInt(lectura.readLine());
		char modelo=(char)Integer.parseInt(lectura.readLine());
	}
	public coche8(char marca, char modelo) throws IOException {
	System.out.println(marca);
	System.out.println(modelo);
		
	}
	public static void main(String[] args) throws IOException {
	coche8 c=new coche8();
	System.out.println(c);
	coche8 c1=new coche8('o','a');
	}
}