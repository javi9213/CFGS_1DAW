public class test{

	public static void main(String[] args){
		ordenar orden = new ordenar();

		int valor;

		for(int i = 0; i < orden.getTAMARRAY(); i++){
			System.out.println("Introduzca valores a ordenar:");
			valor=Leer.datoInt();
			orden.anadirnum(valor);
		}

		orden.ordenacion();
		orden.mostrar();
	}
}