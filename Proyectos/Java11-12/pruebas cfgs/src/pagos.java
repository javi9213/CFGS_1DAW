public class pagos {
	public static void main(String[] args) {
		float principal=100000, i=3.5F, n=15;
		float mensual=(i/100)/12;
		float nº_pagos=n*12;
		float suma=1+mensual;
		double cuota_mensual=(principal*mensual)/(1-(Math.pow(suma,-nº_pagos)));
		System.out.println("La cuota mensual es: "+cuota_mensual+"€");
		double resultado=(cuota_mensual*12)*n;
		System.out.print("El pago total es: "+resultado+"€");
	}
}