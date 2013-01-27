package Ejercicio2y3rj;
import java.util.*;

public abstract class Reloj {
	
	protected int hora;
	protected int minuto;
	protected int segundos;
	
	public Reloj(){}
	
	public Reloj(int horanueva, int minutonuevo){
		hora = horanueva;
		minuto = minutonuevo;
		segundos = 0;
	}

	public void obtenerHora(){
		Date d = new Date();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(d);
		hora = c.get(Calendar.HOUR);
		minuto = c.get(Calendar.MINUTE);
		segundos = c.get(Calendar.SECOND);
	}
	
	public void establecerAlarma(int horas, int minutos){
		if((this.hora == horas) && (this.minuto == minutos)){
			System.out.println("DESPIERTA");
		}
	}
	
	public int getHora(){
		return hora;
	}

	public int getMinuto(){
		return minuto;
	}

	public int getSegundos(){
		return segundos;
	}

	public abstract void imprimirHora();
}