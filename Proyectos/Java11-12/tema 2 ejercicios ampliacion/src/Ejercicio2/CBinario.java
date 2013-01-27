package Ejercicio2;

public class CBinario{
	
	private long numero;
	
	public CBinario(long n){	
		numero = n;
	}
	
	public long Conversion(){

		// establezco una variable auxiliar
		// una variable posicion
		// y una copia del numero original
		
		long parcial = 0;
		long res = 0;
		long pos = 1;
		long num = numero;
			
		
		// si el numero es mayor que 0
		while( num > 0)
		{
		// separamos el ultimo numero
			parcial = num%10;

		// y lo comparamos, si es diferente de 0
			if(parcial != 0){
				
				// a resultado, le sumamos el equivalente a la posicion
				res = res +  pos;
				
			}
			//hacemos la potencia de 2 a la posicion
			pos = 2 * pos;
			// y quitamos el numero que acabamos de analizar al numero
			num = num/10;
				
		}
		
		// devolvemos el resultado completo que es la suma de todas las veces que el 
		// parcial ha sido  != 0   o  == 1 que es lo mismo ya que hablamos de un numero binario
		return res;
		
	}
}
