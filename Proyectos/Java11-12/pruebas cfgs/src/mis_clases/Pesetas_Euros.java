package mis_clases;
/*Programa para pasar de Pesetas a Euros*/

import java.io.*;//importamos un archivo java para llamar a una declaración
public class Pesetas_Euros {
	public static void main(String[] args) {
		float euros;
		final float ptseuros=166.386F;//añadimos una constante tipo float
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
			try{
				System.out.print("Introduzca pesetas a pasar a euros:");
				float pesetas = Integer.parseInt(br.readLine());//leemos por teclado las pesetas
				euros=pesetas/ptseuros;//hacemos el traspase
				System.out.println("El valor en euros es:"+euros);//lo mostramos por pantalla
			}
				catch (Exception e){
					e.printStackTrace();//hacemos la excepción
				}
	}
}
/*Hecho por Javier González*/