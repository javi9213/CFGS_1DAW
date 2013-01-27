package ejemplo_wrapper;

public class ejemplow {

	public static void main(String[] args) {

		Integer i1 = new Integer(5);
		Integer i2 = new Integer("7");
		String s1 = i1.toString();
		System.out.println(s1);//muestra 5 por pantalla
		int i3 = Integer.parseInt("10", 10);
		int i4 = Integer.parseInt("10", 8);
		int i5 = Integer.parseInt("BABA", 16);
		System.out.println(i3);//muestra 10 por pantalla
		System.out.println(i4);//muestra 8 por pantalla
		System.out.println(i5);//muestra 47802 por pantalla
		System.out.println(Integer.toOctalString(i4));//muestra 10 por pantalla
		System.out.println(Integer.toHexString(i5));//muestra baba por pantalla
		int i6 = Integer.valueOf("22").intValue();
		System.out.println(i6);//muestra 22 por pantalla
		System.out.println(i2);
	}
}