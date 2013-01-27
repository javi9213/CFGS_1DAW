package ejercicio1r;

public class CProfesor extends CPersona {

	private int num_registro = 0;
	private int clase = 0;
	private int profesores = 0;
	
	public CProfesor(String nom, int ed, int alt, int numregistro, int clase1){
		nombre = nom;
		edad = ed;
		altura = alt;
		num_registro = numregistro;
		clase = clase1;
		profesores++;
	}
	
	public void setNumregistro (int num){
		num_registro = num;
	}
	
	public void setClase (int clases){
		clase = clases;
	}
	
	public int getNumregistro(){
		return num_registro;
	}
	
	public int getClase(){
		return clase;
	}
	
	public int getProfesor(){
		return profesores;
	}
	
	public CProfesor clone(){
		CProfesor nuevo;
		nuevo = new CProfesor(nombre, edad, altura, num_registro, clase);
		nuevo.setNumregistro(this.getNumregistro());
		nuevo.setClase(this.getClase());
		return nuevo;
	}
	
	public boolean equals(CProfesor profe){
		boolean cierto = false;
		if(profe.getNumregistro()==(this.getNumregistro()))
			cierto = true;
		else if(profe.getClase()==(this.getClase()))
			cierto = true;
		return cierto;
	}
	
	public void mostrarinformacionpro(){
		System.out.println("El nombre de esta persona es: "+nombre);
		System.out.println("La edad de esta persona es: "+edad);
		System.out.println("La altura de esta persona es: "+altura);
		System.out.println("El número de registro del profesor/a es: "+num_registro);
		System.out.println("La clase del profesor/a es: "+clase);
		System.out.println("Hay "+profesores+" profesores");
	}
}