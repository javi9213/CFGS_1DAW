package examen;
public class Naipe{
	private int numero;
	private int palo;
	
	public Naipe(){
		numero = (int)((Math.random()*12)+1);
		palo = (int)((Math.random()*4)+1);
	}
	
	public int devolverNumero(){
		return numero;
	}
	
	public String devolverPalo(){
		String cadena = "";
		
		switch(palo){
			case 1:
				cadena = "Oros";
				break;
			case 2:
				cadena = "Copas";
				break;
			case 3:
				cadena = "Espadas";
				break;
			case 4:
				cadena = "Bastos";
				break;
		}
		
		return cadena;
	}

	public void mostrarNaipe(){
		System.out.println("Naipe: " + this.devolverNumero() + " de " + this.devolverPalo());
	}		
}