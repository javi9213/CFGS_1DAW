package ejercicior;

public class nota {

	private int[] numero;
	final int POS = 3;
	
	public nota()
	{
		numero = new int[POS];
	}
	
	public int notamedia(){
		int num = 0, notamedia = 0;
		for (int i = 0;i<POS;i++){
			System.out.print("Introduzca nota del alumno:");
			num = Leer.datoInt();
			numero[i] = num;
		}
		for (int j = 0;j<POS;j++){
			notamedia = notamedia + numero[j];
		}
		notamedia = notamedia / POS;
		System.out.println("La media del alumno es de "+notamedia);
		return notamedia;	
	}
	
	public int notamasbaja(){
		int notamasbaja = 0, num = 0;
		for (int i = 0;i<POS;i++){
			System.out.print("Introduzca nota del alumno:");
			num = Leer.datoInt();
			numero[i] = num;
			if(numero[i]>numero[i-1]){
				System.out.println("Este es la nota mas baja: "+numero[i]);
			}
		}
		return notamasbaja;
	}
	
	public static void main (String[]args){
		nota n = new nota();
		//n.notamedia();
		n.notamasbaja();
	}
}