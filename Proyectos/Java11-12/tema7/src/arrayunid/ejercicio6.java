package arrayunid;

import ejercicior.Leer;

public class ejercicio6 {

	private static int POS=7;
	private static int []numero = new int [POS];
	public static void main (String[]args){
		int num;
		for(int i=0;i<POS;i++){
			System.out.print("Introduzca número:");
			num = Leer.datoInt();
			numero[i] = num;
		}
		StringBuffer str = new StringBuffer();
		for(int j=0;j<POS;j++){
			str = str.append(" "+numero[j]);
		}
		str.reverse();
		System.out.println(str);
	}
}