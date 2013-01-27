package ejercicio12;

public class Mrusa {
	
	private long num1,num2;							//variables de la clase (long para evitar desvordamientos)
	
	/*public Mrusa()
	{
		num1=100;
		num2=200;
	}*/
	public Mrusa(long n1,long n2){					//constructor de la clase, con dos parametros de entrada
		num1=n1;
		num2=n2;
	}
	public void setNums(long n1,long n2){			//metodo para asigna valores a los numeros en caso de querer hacer otra 
		num1=n1;									//multiplicacion con el mismo objeto
		num2=n2;
	}
	private void gestionDeSigno(){					//metodo para evitar un error en el metodo multiplicar()
														//evita un valor negativo en la variable num1
		if ((num1<0)&&(num2<0)){
			
			num1=Math.abs(num1);
			num2=Math.abs(num2);
		}
		else if((num1<0)&&(num2>0)){
			num1=-num1;
			num2=-num2;	
			}	
		}
	public long multiplicar(){						//algoritmo de multiplicacion a la rusa, devuelve el producto (long)
		long resultado=0;
		gestionDeSigno();
		while (num1>0){
			if (num1%2!=0){
				resultado=resultado+num2;
				}
			/*else
				{									//la parte del codigo comentada tan solo muestra el algoritmo  
				System.out.print("NO -->");			//de la multiplicacion rusa
				}
			
			System.out.print("	"+num1+"	");
			System.out.print("	"+num2+"\n");
			if (num1<2)
				{
				System.out.print("	     	+__________________\n	 =		"+resultado+"\n\n");
				}*/
			num1=num1/2;
			num2=num2*2;
			}
		return resultado;
		}
}