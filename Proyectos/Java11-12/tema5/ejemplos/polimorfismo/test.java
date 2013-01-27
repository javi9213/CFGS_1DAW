package polimorfismo;

public class test {

	public static void main(String[]args){
		persona p1;
		p1 = new empleado();
		p1.setNombre("Isaac Sanchez");
		/**p1.setSueldoBase(100);*///dará error al compilar
		empleado e1;
		e1 = new empleado();
		e1.setSueldoBase(500);
		/**e1.setPuesto("Jefe almacen")*/;//dará error al compilar
		System.out.println(e1.getSueldo());
	}
}