package propuestos;

import java.util.*;

public class Ejercicio3 {
	
	public static void main(String[] args){
		ArrayList<Double> array = new ArrayList<Double>();
		array.add(0, 8.5);
		array.add(1, 4.9);
		array.add(2, 3.8);
		array.add(3, 6.3);
		StringTokenizer notas;
		notas=new StringTokenizer("Juan Carlos\n"+array.get(0)+"\nAndrés\n"+array.get(1)+"\nPedro\n"+array.get(2)+"\nJuan\n"+array.get(3),"\n");
		while(notas.hasMoreTokens())
			System.out.println("El alumno "+notas.nextToken()+" ha sacado un "+notas.nextToken());
	}
}