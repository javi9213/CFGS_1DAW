package inmueble;

public class AgenciaInmobilaria {
	
	//atributos privados
	private final int numMaxInmueble=300;
	private CInmuebles [] venta;
	private CInmuebles [] alquiler;
	private int numInmVenta;
	private int numInmAlquiler;
	
	//constructor
	public AgenciaInmobilaria(){
		venta=new CInmuebles [numMaxInmueble];
		alquiler=new CInmuebles [numMaxInmueble];
		numInmVenta=0;
		numInmAlquiler=0;
	}
	
	//metodo aniadeVentaMueble()
	public void aniadeVentaInmueble(CInmuebles in){
		
		boolean existe=false;
		
		if(numInmVenta<numMaxInmueble){
			
			//recorrer el array para ver si tenemos este objeto
			for(int i=0; i<numInmVenta; i++){
				
				if(venta[i].equals(in)) existe=true;
			}
			
			if(!existe){
				venta[numInmVenta]=in;
				numInmVenta++;
			}
		}
	}
	
	//metodo aniadeAlquilerMueble()
	public void aniadeAlquilerInmueble(CInmuebles in){
		
		boolean existe=false;
		
		if(numInmAlquiler<numMaxInmueble){
			
			//recorrer el array para ver si tenemos este objeto
			for(int i=0; i<numInmAlquiler; i++){
				
				if(alquiler[i].equals(in)) existe=true;
			}
			
			if(!existe){
				alquiler[numInmAlquiler]=in;
				numInmAlquiler++;
			}
		}
	}
	
	//inMuebles con precios inferior que el parametro
	public void inmuebleVenta(float precioComp){
		
		for(int i=0; i<numInmVenta; i++){
			
			if(venta[i] instanceof CSolares){
				
				if(((CSolares)venta[i]).precio()<precioComp){
					
					((CSolares)venta[i]).muestra();
				}
				
			}
			
			if(venta[i] instanceof CViviendas){
				
				if(((CViviendas)venta[i]).getPrecio()<precioComp){
					
					((CViviendas)venta[i]).muestra();
				}
			}
		}
	}
	
	//locales comerciales de segunda mano con superfiecie menor que el parametro
	public void localesSegundaMano(float m){
		
		for(int i=0; i<numInmAlquiler; i++){
			
			if(alquiler[i] instanceof CLocales){
				if(((CLocales)alquiler[i]).isTipo()==false && ((CLocales)alquiler[i]).getmCuadr()>m ){
					((CLocales)alquiler[i]).muestra();
				}
			}
		}
	}
	
	//el numero de solares rusticos
	public void solaresRusticos(){
		
		for(int i=0; i<numInmVenta; i++){
			
			if(venta[i] instanceof CSolares){
				
				if(((CSolares)venta[i]).isZona()){
					
					((CSolares)venta[i]).muestra();
				}
			}
		}
	}

	//fusionAg
	public AgenciaInmobilaria fusionAg(AgenciaInmobilaria ag){
		
		int ind=0;
		AgenciaInmobilaria agGrande=new AgenciaInmobilaria();
		
		agGrande.numInmAlquiler=this.numInmAlquiler+ag.numInmAlquiler;
		agGrande.numInmVenta=this.numInmVenta+ag.numInmVenta;
		
		while(ind<numInmAlquiler){
			
			for(int i=0; i<this.numInmAlquiler; i++){
				
				agGrande.alquiler[ind]=this.alquiler[i];
				ind++;
			}
			
			for(int i=0; i<ag.numInmAlquiler; i++){
				
				agGrande.alquiler[ind]=ag.alquiler[i];
				ind++;
			}
		}
		ind=0;
		
		while(ind<numInmVenta){
			
			for(int i=0; i<this.numInmVenta; i++){
				
				agGrande.venta[ind]=this.venta[i];
				ind++;
			}
			
			for(int i=0; i<ag.numInmVenta; i++){
				
				agGrande.venta[ind]=ag.venta[i];
				ind++;
			}
		}
		return agGrande;
	}
	
	//equals()
	public  boolean equals(AgenciaInmobilaria ag){
		
		boolean igual=true;
		
		for(int i=0; i<numInmAlquiler; i++){
			if(!alquiler[i].equals(ag.alquiler[i])) igual = false;
		}
		
		for(int i=0; i<numInmVenta; i++){
			if(!venta[i].equals(ag.venta[i])) igual = false;
		}
		
		if(this.numInmAlquiler != ag.numInmAlquiler) igual = false;
		else if(this.numMaxInmueble != ag.numMaxInmueble) igual = false;
		else if(this.numInmVenta != ag.numInmVenta) igual = false;
		return igual;
	}
	
	//toString
	public String toString() {
		
		String cadena = "Los datos de ";
		
		for(int i=0; i<numInmAlquiler; i++){
			if(alquiler[i] instanceof CPlazaGaraje)		cadena += "plaza de garaje son: \n";
			else if (alquiler[i] instanceof CLocales)	cadena += "locales son: \n";
			
			cadena += alquiler[i].toString();
			cadena += "\n";
		}
		
		for(int i=0; i<numInmVenta; i++){
			if(venta[i] instanceof CSolares)			cadena += "solares: \n";
			else if (venta[i] instanceof CViviendas)	cadena += "viviendas son: \n";
			
			cadena += venta[i].toString();
			cadena += "\n";
		}
		return cadena;
	}
}