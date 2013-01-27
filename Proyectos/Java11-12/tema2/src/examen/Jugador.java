package examen;
public class Jugador{
	private String nombre;
	private int altura;
	private int puntos;
	private int rebotes;
	
	public Jugador(String nom, int alt){
		nombre = nom;
		altura = alt;
		puntos = 0;
		rebotes = 0;
	}
	
	public String getNombre(){
		return nombre;
	}

	public int getPuntos(){
		return puntos;
	}

	public void setPuntos(int punt){
		if (punt >= 0)
			this.puntos = punt;
	}

	public int getRebotes(){
		return rebotes;
	}

	public void setRebotes(int reb){
		if (reb >= 0)
			this.rebotes = reb;
	}
	
	public void imprimirJugador(){
		System.out.println(nombre + ", " + altura + "cms : " + puntos + " pts y " + rebotes +" rebotes.");
	}
}