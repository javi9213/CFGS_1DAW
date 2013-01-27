import java.io.*;

public class Llamada_restaurante  {
	public static void main (String [] args) throws IOException {
		float chocos_totales, papas_totales, chocos_añadidos, papas_añadidos, papas_final, chocos_final;
		
		Restaurante consulta = new Restaurante ();
		
		BufferedReader ingrediente = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("Introduzca la cantidad de chocos");		//Establecer cantidad de chocos
		chocos_totales=Float.parseFloat(ingrediente.readLine());
		consulta.addChocos(chocos_totales);
		
		System.out.println("Introduzca la cantidad de papas");		//Establecer cantidad de papas
		papas_totales=Float.parseFloat(ingrediente.readLine());
		consulta.addPapas(papas_totales);
		
		System.out.println("Añada mas cantidad de chocos");			//Chocos añadidos
		chocos_añadidos=Float.parseFloat(ingrediente.readLine());
		consulta.addChocos(chocos_añadidos);	
		
		System.out.println("Añada mas cantidad de papas");			//Papas añadidas
		papas_añadidos=Float.parseFloat(ingrediente.readLine());
		consulta.addPapas(papas_añadidos);
		
		papas_final=papas_totales+papas_añadidos;
		chocos_final=chocos_totales+chocos_añadidos;
																	//Emision de los resultados
		System.out.println("Chocos totales:");
		consulta.showChocos();
		System.out.println("Papas totales:");
		consulta.showPapas();
		System.out.println("Clientes atendidos:");
		System.out.println(consulta.getComensales(papas_final, chocos_final));
	}
}