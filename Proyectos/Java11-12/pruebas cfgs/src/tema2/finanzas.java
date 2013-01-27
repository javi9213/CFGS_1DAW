package tema2;
class finanzas {
	private double dolar_euro;
	public double dolaresToEuros(double dolares){
		return(dolares/dolar_euro);
	}
	public double eurosToDolares(double euros){
		return(euros*dolar_euro);
	}
	public finanzas(){
		dolar_euro=1.36;
	}
	public finanzas(double dolar_euro2){
		dolar_euro=dolar_euro2;
	}
	public static void main (String[]args){
		finanzas f=new finanzas();
		System.out.println(f.dolaresToEuros(1000));
		System.out.println(f.eurosToDolares(1000));
	}
}