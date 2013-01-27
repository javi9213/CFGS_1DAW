package ejercicio1;

public class CEsfera{
	
	//Atributos
	private int rad;
  
	//Constructor
	public CEsfera(){
		rad = 0;
	}
  
	//Métodos
	public void setRadio(int r){
		rad = r;
	}
  
	public int getRadio(){
		return rad;
	}
  
	public double Volumen(){
		return (double)(4/3)*Math.PI*rad*rad*rad;
	}
}
