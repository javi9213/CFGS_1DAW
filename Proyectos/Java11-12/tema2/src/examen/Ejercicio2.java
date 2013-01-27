package examen;
public class Ejercicio2{
	public static void main(String[] args){
		Equipo eq1 = new Equipo();
		
		eq1.recogerDatosUltimoPartidoConsola();
		
		System.out.println("El equipo realizo " + eq1.puntosEquipo() + " puntos");
		System.out.println("El equipo recogio " + eq1.rebotesEquipo() + " rebotes");
	}
}