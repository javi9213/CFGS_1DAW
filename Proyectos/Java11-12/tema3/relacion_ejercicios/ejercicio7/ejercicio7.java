package ejercicio7;

public class ejercicio7 {
	
	public void crapulo(int num){
		if(num<0){
			System.out.println("Error número introducido negativo");
		}else{
			cambiar(num);
		}
	
	}
	public void cambiar(int num){
		int millar=num/1000;
		int centena=num%1000;
		centena/=100;
		int decena=num%100;
		decena/=10;
		int unidad=num%10;
		int resultado=unidad+centena+decena+millar;
		if(resultado>=10){
			cambiar(resultado);
		}else{
			System.out.println("El número dado en crápulo es: "+resultado);
		}
	}
}