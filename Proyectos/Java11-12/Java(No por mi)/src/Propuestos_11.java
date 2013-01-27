public class Propuestos_11{														// Calculadora de tiempo.

	public static void main(String[] args){
		
		int introducido;
		int segundos=7000;
		int minutos=0;
		int horas=0;
		
		introducido=segundos;
		if(segundos>60){
			minutos=segundos/60;
			segundos=segundos-(minutos*60);
		}
		if(minutos>60){
			horas=minutos/60;
			minutos=minutos-(horas*60);
		}
		
		System.out.println("Dados "+introducido+" segundos");
		System.out.println("Horas:" +horas+" Minutos:" +minutos+" Segundos:"+segundos);
	}
}