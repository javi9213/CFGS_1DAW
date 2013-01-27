public class finanzas {
	public static double dolar_euro;
	public static double dolaresToEuros(double dolares){
		return(dolares/dolar_euro);
	}
	public static double eurosToDolares(double euros){
		return(euros*dolar_euro);
	}
	finanzas(){
		dolar_euro=1.36;
	}
	finanzas(double dolares){
		dolaresToEuros(dolares);
	}
}