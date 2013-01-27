package ejercicio6;

public class ejercicio6 {
	
	public void entero (int a,int b){
		int suma = 0, j = 0, aux;
		
		if (a > b){
			aux = a;
			a = b;
			b = aux;
		}
		
		for(j=a+1; j<b; j++){
				suma = suma + j;
			}
		System.out.println("La suma entre " + a + " y " + b + " es: " + suma);
	}
}