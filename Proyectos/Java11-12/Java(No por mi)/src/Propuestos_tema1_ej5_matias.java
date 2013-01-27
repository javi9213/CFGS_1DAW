public class Propuestos_tema1_ej5_matias{
	/*Crea un programa en donde se le pase un tiempo (Ej: 3hs, 184m, 90s) y te devuelva como resultado el
	 * tiempo real (Resultado del ejemplo: 6h, 5m, 30s). Desarrolla un método "public static void calcular"
	 * en donde se le pase 3 variables: hora, minutos, segundos y ejecuta las operaciones necesarias para 
	 * llegar a dicha respuesta. (Matías)*/
	public static void calcular(int horas,int minutos,int segundos){
		do{
			segundos=segundos-60;
			minutos=minutos+1;
		}while(segundos>60);
		
		do{
			minutos=minutos-60;
			horas=horas+1;
		}while(minutos>60);
		
		System.out.println("Horas:" +horas+" Minutos:" +minutos+" Segundos:"+segundos);
	}
		
	public static void main(String[] args){
		calcular(3,184,90);
	}
}