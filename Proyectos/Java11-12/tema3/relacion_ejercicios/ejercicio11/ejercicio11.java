package ejercicio11;

public class ejercicio11 {

	public void media(double nota){
		double suma=0, media;
		for(int i=0;i<=nota;i++){
			suma = suma + nota;
			media=suma/nota;
			System.out.println(media);
		}	
	}
}

/**for(int i=0;i<=nota;i++){
double suma=0;
suma = suma + nota;
double media;
media=suma/i;
System.out.println(suma);
}*/