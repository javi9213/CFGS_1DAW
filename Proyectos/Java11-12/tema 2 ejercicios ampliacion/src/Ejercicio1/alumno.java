package Ejercicio1;

public class alumno {

	private String nombre;
	private String curso;
	private String matricula;
	
	public alumno(){
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setMatricula() {
		matricula = "M" + ((int)(Math.random()*2000)+1000);
	}

	public String getMatricula() {
		return matricula;
	}
	
	public void ImprimirInfo(){
		System.out.println("\n###### Alumno ######");
		System.out.println("El nombre del alumno es: " + getNombre());
		System.out.println("El numero de matricula es: " + getMatricula());
		System.out.println("El curso que esta matriculado el alumno es: " + getCurso());
	}
	
	
	
}
