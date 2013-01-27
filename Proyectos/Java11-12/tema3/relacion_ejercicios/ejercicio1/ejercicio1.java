package ejercicio1;

public class ejercicio1 {
	
	private final float PI=3.1415926f;
	
	public void volumen(int radio){
		if(radio<0){
			System.out.println("Error número introducido negativo");
		}else{
			float volumen=(float) ((4/3)*PI*(Math.sqrt(radio)+radio));
			System.out.println("El volumen de radio "+radio+" es: "+volumen);
		}
	}
}