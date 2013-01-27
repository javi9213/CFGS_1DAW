/* Escriba un programa que imprima los cinco primeros números enteros positivos, calcule su suma, su 
 * multiplicación la división de la multiplicación por 3.*/
public class Ejercicios_09 {
	public static void main(String[] args) {

		int i;
		int suma=0;
		int multi=1;
		float division;
		
		for(i=1;i<=5;i++){
			System.out.println("***"+i);
			suma=suma+i;
			System.out.println("SUMA: "+suma);
			multi=multi*i;
			System.out.println("MULTIPLICACION: "+multi);
			System.out.println("");
		}
		division=(float)multi/3;
		System.out.println("DIVISION > MULTIPLICACION/3: "+division);
	}
}