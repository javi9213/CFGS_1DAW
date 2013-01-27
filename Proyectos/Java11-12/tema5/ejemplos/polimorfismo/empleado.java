package polimorfismo;

public class empleado extends persona {

	protected int sueldoBase;
	public int getSueldo(){
		return sueldoBase;
	}
	
	public void setSueldoBase(int s){
		sueldoBase = s;
	}
}