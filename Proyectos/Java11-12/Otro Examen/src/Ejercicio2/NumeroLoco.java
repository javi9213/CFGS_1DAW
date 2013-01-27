package Ejercicio2;

public class NumeroLoco {

	private static int numero;
	
	public NumeroLoco(){
		numero = 0;
	}
	
	public NumeroLoco(int num){
		while(num>99999){
			int aux = num/10;
			num = aux;
		}
		
		if(num<=0){
			NumeroLoco.numero = 0;
		}else{
			NumeroLoco.numero = num;
		}
	}
	
	public int getNumero(){
		return numero;
	}
	
	public void setNumero(int num){
		NumeroLoco.numero = num;
	}
	
	public int locura(){
		int num = numero, aux1 = 0;
		if(num<1000){
			while(num>=9){
				int aux = num%10;
				num = num/10;
				aux1 = num + aux;
			}
			return aux1;
		}else if((num>=1000)&&(num<=9999)){
			return NumeroLoco.cuatrocifras();
		}else{
			return NumeroLoco.cincocifras();
		}
	}
	
	public static int cuatrocifras(){
		int num = numero, num1 = 0, aux = 0, num2 = 0, num3 = 0, result = 0;
		num1 = num%10;
		aux = num/10;
		num2 = aux%10;
		aux = aux/10;
		num3 = aux%10;
		aux = aux/10;
		result = (((num2*10)+num3)-((num1*10)+aux));
		return result;
	}
	
	public static int cincocifras(){
		int num = numero, num1 = 0, aux = 0, num2 = 0, num3 = 0, num4 = 0, result = 0;
		num1 = num%10;
		aux = num/10;
		num2 = aux%10;
		aux = aux/10;
		num3 = aux%10;
		aux = aux/10;
		num4 = aux%10;
		aux = aux/10;
		result = ((num2*num4)-(num1+num3+aux));
		return result;
	}
}