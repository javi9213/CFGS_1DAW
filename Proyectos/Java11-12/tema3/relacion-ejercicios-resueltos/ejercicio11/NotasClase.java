package ejercicio11;

public class NotasClase{
	private double notamasalta;
	private double notamasbaja;
	private int numeronotas;
	private double sumanotas;
	
	public NotasClase(){
		notamasalta = Double.MIN_VALUE;
		notamasbaja = Double.MAX_VALUE;
		numeronotas = 0;
		sumanotas = 0.0;
	}
	
	public void insertarNota(double nuevanota){
		if (nuevanota >= 0.0){
			sumanotas += nuevanota;
			numeronotas++;
			if (nuevanota > notamasalta)
				notamasalta = nuevanota;
			if (nuevanota < notamasbaja)
				notamasbaja = nuevanota;
		}
	}
	
	public double getNotaMasAlta(){
		return notamasalta;
	}
	
	public double getNotaMasBaja(){
		return notamasbaja;
	}
	
	public int getNumeroNotas(){
		return numeronotas;
	}
	
	public double calcularNotaMedia(){
		double res = 0.0;
		
		if (numeronotas > 0)
			res = sumanotas/numeronotas;
		
		return res;
	}
}