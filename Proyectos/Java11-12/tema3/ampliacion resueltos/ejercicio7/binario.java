package ejercicio7;

public class binario{

	//conversiones
	public static long decAbin(long dec){
		long num=dec;
		long aux;
		long bin=0;
		int contador=1;
		
		while(num>0){
			aux=num%2;
			
			num=(int)num/2;
			
			bin=bin+(aux*contador);
			
			contador=contador*10;
		}	
		return bin;
	}
	
	public static int binAdec(long bin){
		long num=bin;
		long aux;
		int dec=0;
		int contador=0;		
		
		while(num>0){
			aux=num%10;
			
			num=num/10;
			
			if (aux==1){
			dec=(int) (dec+(aux*Math.pow(2, contador)));
			}
			contador++;
		}
		return dec;
	}
}