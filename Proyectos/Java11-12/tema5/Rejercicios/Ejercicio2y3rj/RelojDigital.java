package Ejercicio2y3rj;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RelojDigital extends Reloj{
	
	public RelojDigital(){
		super();
	}
	
	public RelojDigital(int hora, int minuto){
		super(hora,minuto);
		/*this.hora = hora;
		this.minuto = minuto;
		this.segundos = 0;*/
	}

	public void imprimirHora() {
		Date d = new Date();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(d);
		
		hora = c.get(Calendar.HOUR);
		minuto = c.get(Calendar.MINUTE);
		segundos = c.get(Calendar.SECOND);
		
		int ampm, hora12 = getHora() + 12;
		ampm = c.get(Calendar.AM_PM);
		
		if(ampm == 1){
			System.out.println(hora12+":"+getMinuto()+":"+getSegundos()+" PM");
		}else{
			System.out.println(getHora()+":"+getMinuto()+":"+getSegundos()+" AM");
		}
	}
	
	public static void main (String[]args){
		RelojDigital reloj = new RelojDigital();
		reloj.imprimirHora();
	}
}