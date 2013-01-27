package ejercicio3r;

public class CHanoi{
	
	public static void solucion(int discos, String inicial, String auxiliar, String fin){
		if (discos==1){
			System.out.println("Pasar "+discos+" de "+inicial+" a "+fin);
		}else{
			solucion(discos-1,inicial,fin,auxiliar);
			System.out.println("Pasar "+discos+" de "+inicial+" a "+fin);
			solucion(discos-1,auxiliar,inicial,fin);
		}
	}
}