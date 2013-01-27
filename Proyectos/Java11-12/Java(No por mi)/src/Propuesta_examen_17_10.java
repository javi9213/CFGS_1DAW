
public class Propuesta_examen_17_10 {

	public static void main(String[] args) {
		double principal;
		double cuota;
		double i;
		double n;
		double interes_anual;
		double años;
		double pago_total;
		
		//Datos iniciales
		principal=100000;
		interes_anual=3.5;
		años=15;
		
		//Interes anual
		interes_anual=interes_anual/100;
		
		//Interes mensual
		i=interes_anual/12;
		
		//Duracion del prestamo
		n=años*12;
	
		//Calcular cuota
		cuota=(principal*i)/(1-(Math.pow(1+i,-n)));
		
		//Calculo total a pagar
		pago_total=cuota*12*años;
		
		//Visualizacion
		System.out.println("La cuota mensual es: "+cuota);
		System.out.println("Pago total es: "+pago_total);
	}
}