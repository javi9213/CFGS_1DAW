package resueltos;

public class Ejercicio8 {
	
	public static boolean esCapicua(int dato){
		boolean verdad=false;
		
		Integer i = new Integer(dato);
		String reverse = new StringBuffer(i.toString()).reverse().toString();
		verdad=i.toString().equals(reverse.toString());
		
		return verdad;
	}
	
	public static void main(String[] args) {
		esCapicua(798);
	}
}