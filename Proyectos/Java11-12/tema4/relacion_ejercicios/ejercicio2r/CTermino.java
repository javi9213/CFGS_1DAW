package ejercicio2r;

public class CTermino {

	protected int coeficiente = 0;
	protected int exponente = 0;
	
	public CTermino(int coefi, int expo){
		coeficiente = coefi;
		exponente = expo;
	}
	
	public void setCoeficiente(int coef){
		coeficiente = coef;
	}
	
	public void setExponente(int exp){
		exponente = exp;
	}
	
	public int getCoeficiente(){
		return coeficiente;
	}
	
	public int getExponente(){
		return exponente;
	}
	
	public void termino(){
		if((coeficiente>0)&&(exponente>1))
			System.out.println("+"+coeficiente+"x^"+exponente);
		else if((coeficiente<0)&&(exponente>1))
			System.out.println("-"+coeficiente+"x^"+exponente);
		else if((coeficiente>0)&&(exponente==1))
			System.out.println("+"+coeficiente+"x");
		else if((coeficiente<0)&&(exponente==1))
			System.out.println("-"+coeficiente+"x");
		else if((coeficiente>0)&&(exponente==0))
			System.out.println("+"+coeficiente);
		else if((coeficiente<0)&&(exponente==0))
			System.out.println("-"+coeficiente);
	}
}