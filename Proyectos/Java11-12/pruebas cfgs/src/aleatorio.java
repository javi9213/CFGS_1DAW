
public class aleatorio {
	public static char getLetras(){
	return (char) (Math.random()*26+'a');
	}
		public static void main(String[] args) {
		char letras=getLetras();
		char letras1;
		boolean prueba;
		(letras1)=letras;
			if(prueba=letras1=='a'){
				System.out.println("La letra seleccionada es una vocal. "+prueba);
			}
			if(prueba=letras1=='e'){
				System.out.println("La letra seleccionada es una vocal. "+prueba);
			}
			if(prueba=letras1=='i'){
				System.out.println("La letra seleccionada es una vocal. "+prueba);
			}
			if(prueba=letras1=='o'){
				System.out.println("La letra seleccionada es una vocal. "+prueba);
			}
			if(prueba=letras1=='u'){
				System.out.println("La letra seleccionada es una vocal. "+prueba);
			}
		System.out.println("La letra seleccionada es una consonante.");
	}
}


