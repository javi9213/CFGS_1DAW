package propuestos;

public class Ejercicio6 {

	public static boolean esCapicua(int dato){
		Integer i = new Integer(dato);
		String reverse = new StringBuffer(i.toString()).reverse().toString();
		return i.toString().equals(reverse.toString());
	}
	
	public static void main(String[] args) {
		esCapicua(789);
	}
}