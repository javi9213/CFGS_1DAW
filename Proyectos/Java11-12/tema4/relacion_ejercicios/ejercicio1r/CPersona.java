package ejercicio1r;

public class CPersona {

	protected String nombre;
	protected int edad = 0;
	protected int altura = 0;
	
	public CPersona(){
		
	}
	
	public CPersona(String nom, int ed, int alt){
		nombre = nom;
		edad = ed;
		altura = alt;
	}
	
	public void setNombre(String nom1){
		nombre = nom1;
	}
	
	public void setEdad(int eda){
		edad = eda;
	}
	
	public void setAltura(int altura1){
		altura = altura1;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public int getAltura(){
		return altura;
	}
	
	public CPersona clone(){
		CPersona nuevo;
		nuevo = new CPersona();
		nuevo.setNombre(this.getNombre());
		nuevo.setEdad(this.getEdad());
		nuevo.setAltura(this.getAltura());
		return nuevo;
	}
	
	public boolean equals(CPersona per1){
		boolean igual = false;
		if(per1.getNombre().compareTo(this.getNombre())==0){
			igual = true;
		}else if(per1.getEdad()==(this.getEdad())){
			igual = true;
		}else if(per1.getAltura()==(this.getAltura())){
			igual = true;
		}
		
		return igual;
	}
	
	public void mostrarinformacion(){
		System.out.println("El nombre de esta persona es: "+nombre);
		System.out.println("La edad de esta persona es: "+edad);
		System.out.println("La altura de esta persona es: "+altura);
	}
}