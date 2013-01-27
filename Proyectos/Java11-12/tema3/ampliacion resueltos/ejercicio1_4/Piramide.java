package ejercicio1_4;

public class Piramide {
	
	private int altura;
	
	public Piramide(int altura){
		this.altura = altura;
	}
	
	public void generarPiramide1(){
		
		int lineas,blancos,aste,risco,numero=1;
		
		//imprime las líneas
		for(lineas=1;lineas<=altura;lineas++){
			
			//imprime los espacios en blanco
			for(blancos=1;blancos<=(altura-lineas);blancos++)
				System.out.print(" ");
			
			//imprime la mitad de la piramide
			for(aste=1;aste<=lineas;aste++){
				if(numero>9)numero=0;
				System.out.print(numero);
			}
			
			//imprime justo el medio de la piramide
			//imprime la otra mitad
			for(risco=1;risco<lineas;risco++)
				System.out.print(numero);
				
			numero ++;
			System.out.println("");
		}
	}
	
	public void generarPiramide2(){
		
		int lineas,blancos,aste,risco,numero=1;
		
		//imprime las líneas
		for(lineas=1;lineas<=altura;lineas++){
			
			//imprime los espacios en blanco
			for(blancos=1;blancos<=(altura-lineas);blancos++)
				System.out.print(" ");
			
			numero=1;
			//imprime la mitad de la piramide
			for(aste=1;aste<=lineas;aste++){
				if(numero>9)numero=0;
				System.out.print(numero);
				numero++;
			}
			
			numero --;
			int numero2=numero;
			//imprime la otra mitad
			for(risco=1;risco<lineas;risco++){
				if(numero2>9)numero2=0;
				System.out.print(numero2);	
			}
			System.out.println("");
		}
		
	}
	
	public void generarPiramide3(){
		
		int lineas,blancos,aste;
		
		//imprime las líneas
		for(lineas=1;lineas<=altura;lineas++){
			
			//imprime los espacios en blanco
			for(blancos=1;blancos<=(altura-lineas);blancos++){
				System.out.print(" ");
			}
			
			//imprime la mitad de la piramide
			for(aste=1;aste<lineas*2;aste++){
				if(aste%2==0){
					System.out.print("+");
				}else{
				System.out.print("*");
				}
			}
			
			//imprime la otra mitad
			System.out.println("");
		}
	}
	
	public void generarPiramide4(){
		int i,j,k,p,a=0;
		int lineas = 10;
	
		for(i=1;i<=lineas;i++){
			for(j=1;j<=lineas-i;j++){
				System.out.print(" ");
			}
			for(k=1;k<=i;k++){
				a++;
				if(a>9)
					a=0;
				System.out.print(a);
			}
		
			for(p=1;p<i;p++){
				a--;
				if(a<0)
					a=9;
				System.out.print(a);
			}
		
			System.out.println();
		}
	}
}