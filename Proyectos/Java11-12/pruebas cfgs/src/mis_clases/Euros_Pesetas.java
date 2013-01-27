package mis_clases;
/*Programa para pasar de Euros a Pesetas*/

import java.io.*;//importamos un archivo java para llamar a una declaración
public class Euros_Pesetas {
	public static void main(String[] args){
		float pesetas;
		final float ptseuros=166.386F;//añadimos una constante tipo float
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader (isr);
			try{
				System.out.print("Introduzca euros para pasar a pesetas:");
				float euros = Integer.parseInt(br.readLine());//leemos por teclado las pesetas
				pesetas=euros*ptseuros;//hacemos el traspase
				System.out.println("El valor en pesetas es:"+pesetas);//lo mostramos por pantalla
				}
					catch (Exception e){
						e.printStackTrace();//hacemos la excepción
										}
											}
							}
/*Hecho por Javier González*/