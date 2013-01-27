package ejercicio1r;

public class CAlumnado extends CPersona {
	
	private int num_matricula = 0;
	private String asignatura;
	private double nota = 0.0;
	private int alumnos = 0;

	public CAlumnado(String nom, int ed, int alt, int num_matric, String asign, double notas){
		nombre = nom;
		edad = ed;
		altura = alt;
		num_matricula = num_matric;
		asignatura = asign;
		nota = notas;
		alumnos++;
	}
	
	public void setNumatricula(int matricula){
		num_matricula = matricula;
	}
	
	public void setAsignatura(String asigna){
		asignatura = asigna;
	}
	
	public void setNota(double nota1){
		nota = nota1;
	}
	
	public int getNumatricula(){
		return num_matricula;
	}
	
	public String getAsignatura(){
		return asignatura;
	}
	
	public double getNota(){
		return nota;
	}
	
	public int getAlumnos(){
		return alumnos;
	}
	
	public CAlumnado clone(){
		CAlumnado nuevo;
		nuevo = new CAlumnado(nombre, edad, altura, num_matricula, asignatura, nota);
		nuevo.setNumatricula(this.getNumatricula());
		nuevo.setAsignatura(this.getAsignatura());
		nuevo.setNota(this.getNota());
		return nuevo;
	}
	
	public boolean equals(CAlumnado alum){
		boolean diferente = false;
		if(alum.getNumatricula()==(this.getNumatricula()))
			diferente = true;
		else if(alum.getAsignatura().compareTo(this.getAsignatura())==0)
			diferente = true;
		else if(alum.getNota()==(this.getNota()))
			diferente = true;
		return diferente;
	}
	
	public void mostrarinformacionalumno(){
		System.out.println("El nombre de esta persona es: "+nombre);
		System.out.println("La edad de esta persona es: "+edad);
		System.out.println("La altura de esta persona es: "+altura);
		System.out.println("El alumno/a tiene la matrícula: "+num_matricula);
		System.out.println("El alumno/a tiene la asignatura: "+asignatura);
		System.out.println("El alumno/a tiene la nota: "+nota);
		System.out.println("Hay "+alumnos+" alumnos registrados");
	}
}