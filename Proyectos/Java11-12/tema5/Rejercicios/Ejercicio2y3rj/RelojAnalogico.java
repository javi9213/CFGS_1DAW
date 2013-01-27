package Ejercicio2y3rj;

public class RelojAnalogico extends Reloj{

	public RelojAnalogico(){
		super();
	}
	
	public RelojAnalogico(int hora, int minuto){
		super(hora, minuto);
	}
	
	public void imprimirHora() {
		System.out.print(getHora()+":"+getMinuto()+":"+getSegundos());
	}
	
	public static void main (String[]args){
		RelojAnalogico relok = new RelojAnalogico();
		relok.obtenerHora();
	}
}