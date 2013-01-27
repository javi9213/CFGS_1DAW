package ejercicio5p;

public class conversorfechas {

	private int dia;
	private int mes;
	private int año;
	
	public conversorfechas(int dias, int meses, int años){
		this.dia = dias;
		this.mes = meses;
		this.año = años;
	}
	
	public String normalToAmericano(){
		String cadena;
		cadena = mes+"/"+dia+"/"+año;
		return cadena;
	}
	
	public String americanoToNormal(){
		String cadena1;
		cadena1 = dia+"/"+mes+"/"+año;
		return cadena1;
	}
	
	/*substring(n,f)
	 * n: primer caracter que cogemos de String
	 * f: el último caracter que cogemos del String
	 * 
	 * substring(m)
	 * m: es el principio del string y llega hasta el final*/
	
	/**public static String normalToAmericano(String normal){
	 * String americano = "";
	 * StringBuffer str = new StringBuffer(normal);
	 * americano = ((str.insert(0,str.substring(3, 6))).delete(6, 9).toString());
	 * return americano;
	 * }
	 * 
	 * public static String americanoToNormal(String americano){
	 * String normal = "";
	 * normal = americano.substring(3,5) + americano.substring(0,2) + americano.substring(6).toString();
	 * return normal;
	 * }*/
}