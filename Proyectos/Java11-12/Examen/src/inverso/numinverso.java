package inverso;

public class numinverso {
	
	public static long inverso(long num){
		long aux = 0, contador = 0, resul = 0;
		while(num>10){
			aux = num%10;
			num = num/10;
		}
		contador++;
		while(contador>0){
			resul = aux * 10;
			contador--;
		}
		resul = resul + num;
		System.out.println("El número inverso es: "+resul);
		return resul;
	}
}