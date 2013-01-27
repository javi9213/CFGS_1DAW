package ejercicio8;

public class ejercicio8 {
	
	public void triangulo(int a){
		int i,j,k;
		if(a<=0){
			System.out.println("Error la altura no puede ser 0 o menor");
		}else{
		for(i=1;i<=a;i++){
			for(k=1;k<=a-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=2*(i-1)+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}
}
