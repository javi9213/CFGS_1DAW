package ejercicio9;

public class ejercicio9 {
	
	private int aux;
	
	public void decimal(int num){
		if(num>0){
		int millar=num/1000;
		if(millar>10)
			decimal(millar);
		
		int centena=num%1000;
		centena/=100;

		if(centena>0)
			aux++;
		
		int decena=num%100;
		decena/=10;
		
		if(decena>0)
			aux++;
		
		int unidad=num%10;
		
		if(unidad>0)
			aux++;
		}else
			System.out.println("Error número introducido negativo");
	}

	public void mostrar(int num){
		if(num>0)
		System.out.println("El total de dígitos es: "+aux);
	}
}