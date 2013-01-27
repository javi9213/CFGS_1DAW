package examen;

public class Equipo{
	private Jugador jug1;
	private Jugador jug2;
	private Jugador jug3;
	private Jugador jug4;
	private Jugador jug5;
	
	public Equipo(){
		jug1 = new Jugador("Marcelinho Huertas", 190);
		jug2 = new Jugador("Juan Carlos Navarro", 189);
		jug3 = new Jugador("Pete Mickael", 198);
		jug4 = new Jugador("Erazem Lorbek", 206);
		jug5 = new Jugador("Boniface Ndong", 211);
	}
	
	public void recogerDatosUltimoPartidoConsola(){
		int puntos = 0;
		int rebotes = 0;
		
		// Jugador 1
		System.out.print("Introduce los puntos de " + jug1.getNombre() + ": ");
		puntos = Leer.datoInt();
		jug1.setPuntos(puntos);
		System.out.print("Introduce los rebotes de " + jug1.getNombre() + ": ");
		rebotes = Leer.datoInt();
		jug1.setRebotes(rebotes);
		
		// Jugador 2
		System.out.print("Introduce los puntos de " + jug2.getNombre() + ": ");
		puntos = Leer.datoInt();
		jug2.setPuntos(puntos);
		System.out.print("Introduce los rebotes de " + jug2.getNombre() + ": ");
		rebotes = Leer.datoInt();
		jug2.setRebotes(rebotes);
				
		// Jugador 3
		System.out.print("Introduce los puntos de " + jug3.getNombre() + ": ");
		puntos = Leer.datoInt();
		jug3.setPuntos(puntos);
		System.out.print("Introduce los rebotes de " + jug3.getNombre() + ": ");
		rebotes = Leer.datoInt();
		jug3.setRebotes(rebotes);
				
		// Jugador 4
		System.out.print("Introduce los puntos de " + jug4.getNombre() + ": ");
		puntos = Leer.datoInt();
		jug4.setPuntos(puntos);
		System.out.print("Introduce los rebotes de " + jug4.getNombre() + ": ");
		rebotes = Leer.datoInt();
		jug4.setRebotes(rebotes);
				
		// Jugador 5
		System.out.print("Introduce los puntos de " + jug5.getNombre() + ": ");
		puntos = Leer.datoInt();
		jug5.setPuntos(puntos);
		System.out.print("Introduce los rebotes de " + jug5.getNombre() + ": ");
		rebotes = Leer.datoInt();
		jug5.setRebotes(rebotes);	
	}
	
	public int puntosEquipo(){
		return (jug1.getPuntos() + jug2.getPuntos() + jug3.getPuntos() + jug4.getPuntos() + jug5.getPuntos());
	}
	
	public int rebotesEquipo(){
		return (jug1.getRebotes() + jug2.getRebotes() + jug3.getRebotes() + jug4.getRebotes() + jug5.getRebotes());
	}
}