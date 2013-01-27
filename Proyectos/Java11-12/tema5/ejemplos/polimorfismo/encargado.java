package polimorfismo;

public class encargado extends empleado {

	public int getSueldo(){
		Double d = new Double(sueldoBase*1.1);
		return d.intValue();
	}
}