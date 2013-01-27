package ejercicio11;
/*==============================================================================*/
/* TEMA : 03																	*/
/* TITULO PROGRAMA:(package)	Mi_Math                        		 	      	*/
/* REALIZADO POR: JMLB_CRECIONES S.L.	                                     	*/
/*																				*/
/*==============================================================================*/

/*======================================================================*/
/* DESCRIPCION: desarrollamos un programa con una clase que haga varios */
/*		calculos matemáticos sin utilizar la 							*/
/*		clase Math.java, sin utilizar recursividad, sólo bucles.		*/
/*		1º el primer método calculará el factorial de un nºint			*/
/*		el segundo una potencia de otro número.  						*/
/*		y sin utilizar bucles como tu quieras suma la sucesión			*/
/*		de números desde el 1 hasta el número dado.						*/
/*		Buscar la solución más sencilla. Utiliza estas cabeceras		*/
/*		el nº 4 del menú es un SetNumero(), para cambiarlo.
/* CLASE1:   MiMath														*/
/* METODO1:  Factorial()               		                       		*/
/* METODO2:  Potencia()    	           		        					*/
/* METODO3:  SumaSucesion()                            		        	*/
/*																		*/
/* MAIN:     AppMiMath                									*/
/* 				                 		       						    */
/*======================================================================*/

public class MiMath{

	/*======================================================================*/
	/* ATRIBUTOS: Numero	                                              	*/
	/* VARIABLES TIPO STATIC EMPLEADAS:   no	                            */
	/* VARIABLES LOCALES EMPLEADAS:	 ...     				                */
	/* CONSTANTES EMPLEADAS:	no      				                    */
	/*									                                    */
	/*======================================================================*/	
	
	private long Numero=1; //inicialmente le damos el valor 1 para poder aceptar las demás opciones del menú sin errores
	
	/*======================================================================*/
	/* Constructor: MiMath(int n)   					                    */
	/*      PARAMETROS:	no						                            */
	/*	    DESCRIPCION: Es el constructor de la clase			           	*/	
	/*======================================================================*/
	
	public MiMath(){}
	
	/*======================================================================*/
	/* METODO1: Factorial()   					                            */
	/*      PARAMETROS:	no						                            */
	/*	    DESCRIPCION: Realiza la multiplicación de números desde un  nº  */
	/*		hasta el 1. 19!(factorial) = 19*18*17*16...*2*1 =            	*/	
	/*======================================================================*/

	public long Factorial(){
		long numero=this.Numero;
		long resultado=1;
		for(int i=1; i<=numero; i++){
			resultado*=i;
		}
		return resultado;
	}
	
	/*======================================================================*/
	/* METODO2: Potencia()                  								*/
	/*      PARAMETROS:	npotencia número por teclado           						*/
	/*		DESCRIPCION: Calcula la potencia de un núemro N ^ a otro M dado	*/
	/*					por teclado 										*/
	/*																		*/
	/*======================================================================*/
	
	public long Potencia(){
		int npotencia;
		System.out.println("Dime otro número");
		npotencia= Leer.datoInt();
		long numero=this.Numero;
		long resultado=1;
		if (resultado ==0) {System.out.println(" Demasiado grande para mi ");}
		for (int i=1; i<=npotencia; i++){
			resultado=resultado*numero;
		}
		return resultado;
	}
	
	/*======================================================================*/
	/* METODO3: SumaSucesion()     							            	*/
	/*      PARAMETROS:	no                          						*/
	/*		DESCRIPCION: Calcula la sucesión de números desde 1 hasta n,    */
	/*					sumados todos ellos. Sin bucles Dif. Max.			*/
	/*																		*/
	/*======================================================================*/
	
	public long SumaSucesion(){
		long numero=this.Numero;
		long resultado=1;
		long med=(numero+1)/2;
		if (numero%2==0){
			resultado=(1+numero)* numero/2;
		}else{
			resultado=((1+numero)*numero/2)+med;
		}
		return resultado;
	}

	/*======================================================================*/
	/* METODO4: SetNumero()     							            	*/
	/*      PARAMETROS:	no  en principio luego se toma por teclado			*/
	/*		DESCRIPCION: Cambia el valor del atributo Numero    			*/
	/*																		*/
	/*======================================================================*/
	
	public void SetNumero(){
		long n;
		System.out.println("Dime un número: ");
		n=Leer.datoLong();
		this.Numero=n;
	}
	
	/*======================================================================*/
	/* METODO5: GetNumero()     							            	*/
	/*      PARAMETROS:	No													*/
	/*		DESCRIPCION: Devuelve el valor del atributo Numero    			*/
	/*																		*/
	/*======================================================================*/
	
	public long GetNumero(){
		long n;
		n=this.Numero;
		return n;		
	}
	
	/*======================================================================*/
	/* METODO6: AveriguaM(resultado)     			     	            	*/
	/*      PARAMETROS:	SI. resultado de la potencia  						*/
	/*		DESCRIPCION: averigua m en la potencia n^m=resultado ; n es el 	*/
	/*		Atributo Numero de la clase 									*/
	/*																		*/
	/*======================================================================*/
	
	public long AveriguaM(long resultado){
		long m=0; long n; // m intentamos averiguar, n = Numero; resultado= n^m, aux= variable auxiliar
		n=this.Numero; long aux=1;
		do{
			aux=aux*n;
			m++;	
		}while (aux<resultado);
		return m;
	}
}