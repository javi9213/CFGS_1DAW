package ejercicio6;

public class calculo{
	//atributos que suministra el usuario
	private double color1;
	private double color2;
	private double multiplicador;
	private double tolerancia;
	private double voltios;
	
	//atributos que calcula la clase
	private double resistencia;
	private double toleranciabaja;
	private double toleranciaalta;
	private double intensidad;
	private double potencia;
	
	//constructor
	public calculo(){}
	
	//metodos de recogida de datos
	public void primerColor(int n1){
		
		switch (n1){
			case 1:
				color1=1;
				break;
			case 2:
				color1=2;
				break;	
			case 3:
				color1=3;
				break;
			case 4:
				color1=4;
				break;
			case 5:
				color1=5;
				break;
			case 6:
				color1=6;
				break;
			case 7:
				color1=7;
				break;
			case 8:
				color1=8;
				break;
			case 9:
				color1=9;
				break;
		}
	}
	
	public void segundoColor(int n1){
		switch (n1){
			case 0:
				color2=0;
				break;
			case 1:
				color2=1;
				break;
			case 2:
				color2=2;
				break;	
			case 3:
				color2=3;
				break;
			case 4:
				color2=4;
				break;
			case 5:
				color2=5;
				break;
			case 6:
				color2=6;
				break;
			case 7:
				color2=7;
				break;
			case 8:
				color2=8;
				break;
			case 9:
				color2=9;
				break;
		}
	}
	
	public void tercerColor(int n1){
		switch(n1){
			case 0:
				multiplicador=0;
				break;
			case 1:
				multiplicador=10;
				break;
			case 2:
				multiplicador=100;
				break;	
			case 3:
				multiplicador=1000;
				break;
			case 4:
				multiplicador=10000;
				break;
			case 5:
				multiplicador=100000;
				break;
			case 6:
				multiplicador=1000000;
				break;
			case 7:
				multiplicador=10000000;
				break;
			case 8:
				multiplicador=100000000;
				break;
			case 9:
				multiplicador=1000000000;
				break;
			case 10:
				multiplicador=0.1;
				break;
			case 11:
				multiplicador=0.01;
				break;
		}	
	}

	public void cuartoColor(int n1){
		switch(n1){
		case 1:
			tolerancia=1;
			break;
		case 2:
			tolerancia=2;
			break;		
		case 3:
			tolerancia=0.5;
			break;		
		case 4:
			tolerancia=5;
			break;		
		case 5:
			tolerancia=10;
			break;		
		case 6:
			tolerancia=20;
			break;
		}
	}
	
	public void voltaje(int n1){
		voltios=n1;
	}
	
	//metodos de calculo
	public void calculoResistencia(){
	
		resistencia=(double) ((color1*10)+color2)*multiplicador;
		toleranciabaja=(double) (resistencia*((100-tolerancia)/100));
		toleranciaalta=(double) (resistencia*((100+tolerancia)/100));
	}
	
	public void calculoIntensidad(){
		intensidad=(double)(voltios/resistencia);
	}
	
	public void calculoPotencia(){
		potencia=(double)(voltios*intensidad);
	}
	
	//metodos que devuelve datos
	public double devuelveResistencia(){
		return resistencia;
	}
	
	public double devuelvetoleranciabaja(){
		return toleranciabaja;
	}
	
	public double devuelvetoleranciaalta(){
		return toleranciaalta;
	}
	
	public double devuelveintensidad(){
		return intensidad;
	}
	
	public double devuelvepotencia(){
		return potencia;
	}
}