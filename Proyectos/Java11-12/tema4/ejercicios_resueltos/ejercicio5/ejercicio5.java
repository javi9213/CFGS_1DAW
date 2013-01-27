package ejercicio5;

public class ejercicio5 {

	public static void muestraCifra(int dat){
		if(dat<10){
			System.out.print(dat);
		}else{
			dat-=10;
			char c=(char)('A'+dat);
			System.out.print(c);
		}
	}
	
	public static void transforma(int dato, int base){
		if(base>dato){
			muestraCifra(dato);
		}else{
			transforma(dato/base,base);
			muestraCifra(dato%base);
		}
	}
	
	
}