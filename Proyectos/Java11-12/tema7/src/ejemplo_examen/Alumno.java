package ejemplo_examen;

public class Alumno extends Persona
{
	private String codMatricula;
	
	public Alumno(String nom, int ed, String codMat)
	{
		super(nom,ed);
		this.codMatricula = codMat;
	}

	public String getCodMatricula() {
		return codMatricula;
	}

	public void setCodMatricula(String codMatricula) {
		this.codMatricula = codMatricula;
	}
	
	@Override
	public String toString()
	{
		String cadena;
		
		cadena = super.toString();
		cadena += "Codigo Matricula: " + this.getCodMatricula() + "\n";
		
		return cadena;
	}
}