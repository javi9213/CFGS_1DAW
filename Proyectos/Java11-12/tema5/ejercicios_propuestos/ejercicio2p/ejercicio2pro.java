package ejercicio2p;

public class ejercicio2pro {

	static void pedir(String... argumentos){
		for(String str:argumentos)
			System.out.println(str);
	}
	
	public static void main(String[] args) {
		pedir("mama pipi", "mama caca", "mama agua");
		pedir(new String[]{
			"papa jugar", "mama me aburro", "papa sed", "papa dormir", "mama tengo hambre"	
		});
	}
}