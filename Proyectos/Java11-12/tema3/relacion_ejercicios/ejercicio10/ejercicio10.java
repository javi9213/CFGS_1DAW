package ejercicio10;

public class ejercicio10 {

	public void muestre (int num){
		if(num<0){
			System.out.println("Error número introducido negativo");
		}else{
			System.out.println("Los números que son múltiplos de 3 son:");
			for(int i=1;i<=num;i++){
				if(i%3==0)
					System.out.println(i);
			}
		}
	}
	
	public void cuente(int num){
		if(num<0){
			System.out.println("Error número introducido negativo");
		}else{
			System.out.println();
			int p=0;
			for(int j=1;j<=num;j++){
				if(j%3==0){
					p=j/3;
				}
			}
			System.out.println("El número total de números múltiplos de 3 son: "+p);
		}
	}
	
	public void suma(int num){
		if(num<0){
			System.out.println("Error número introducido negativo");
		}else{
			int suma=0;
			for(int k=1;k<=num;k++){
				if(k%3==0)
					suma=suma+k;
			}
			System.out.println("La suma de los múltiplos de 3 son: "+suma);
		}
	}
}