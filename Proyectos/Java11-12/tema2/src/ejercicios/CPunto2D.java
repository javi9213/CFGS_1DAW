package ejercicios;
class CPunto2D{
	private int x, y;
  
	public CPunto2D(){
		x = 100;
		y = 100;
		System.out.println("Se ha creado un punto en las coordenadas " + x + "." + y);
	}
	
	public CPunto2D(int coordx, int coordy){
		x = coordx;
		y = coordy;
		System.out.println("Se ha creado un punto en las coordenadas " + x + "." + y);
	}
}