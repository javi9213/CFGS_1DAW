package resueltos;

import java.util.StringTokenizer;
public class Ejercicio5 {
	
	public static void main(String[] args) {
		StringTokenizer notas;
		notas=new StringTokenizer("Juan Carlos\n8.5\nAndrés\n4.9\nPedro\n3.8\nJuan\n6.3","\n");
		while(notas.hasMoreTokens())
			System.out.println("El alumno "+notas.nextToken()+" ha sacado un "+notas.nextToken());
	}
}