public class Restaurante {
	private float cantidadPapas=0, cantidadChocos=0;
	
	public int getComensales (double papas, double chocos) {
		int clientes;
		double cantidadPapas_calculo, cantidadChocos_calculo;
		cantidadPapas_calculo=cantidadPapas;
		cantidadChocos_calculo=cantidadChocos;
		for (clientes=1; cantidadPapas_calculo>1 && cantidadChocos_calculo>0.5;clientes ++){
			cantidadPapas_calculo=cantidadPapas_calculo-1;
			cantidadChocos_calculo=cantidadChocos_calculo-0.5;	
		}
		return clientes;
	}
	public void addPapas (float papas) {
		cantidadPapas+=papas;
	}
	public void addChocos (float chocos) {
		cantidadChocos+=chocos;
	}
	public void showChocos () {
		System.out.println(cantidadChocos);
	}
	public void showPapas () {
		System.out.println(cantidadPapas);
	}	
}