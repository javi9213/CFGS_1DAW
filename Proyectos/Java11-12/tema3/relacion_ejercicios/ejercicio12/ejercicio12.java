package ejercicio12;

public class ejercicio12 {

	public void suma(int num,int num1){
		int suma=0;
		if((num<0)||(num1<0)){
			System.out.println("Error número introducido negativo");
		}else{
			for(int i=1;i<=num1;i++){
				suma=suma+num;
			}
			System.out.println("La multiplicación de "+num+" por "+num1+" da como resultado: "+suma);
		}
	}
}