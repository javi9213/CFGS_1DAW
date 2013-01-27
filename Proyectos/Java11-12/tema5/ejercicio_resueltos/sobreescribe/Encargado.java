package sobreescribe;

public class Encargado extends Empleado{

	public int getSueldo(){
		return (int) (sueldobase * 1.1);
	}
}