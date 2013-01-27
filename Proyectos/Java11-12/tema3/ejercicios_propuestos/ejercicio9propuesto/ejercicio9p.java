package ejercicio9propuesto;

public class ejercicio9p {

		public void esOmirp(int num){
		int contador=2;
		boolean primo=true;
		while ((primo)&&(contador!=num)){
			if (num%contador==0)
		      primo=false;
			contador++;
		  }
		System.out.println("El número "+num+" es primo "+primo);
		
	}
	
	public void cambiar(int num){
		int num1=num;
		int unidad=num1%10;
		int decena=num1%100;
		decena/=10;
		int centena=num1%1000;
		centena/=100;
		int millar=num1/1000;
		int resultado=(unidad*1000)+(decena*100)+(centena*10)+millar;
		if(resultado==0){
		}else{
			esOmirp(resultado);
		}
	}
}