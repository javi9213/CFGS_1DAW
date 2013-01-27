package mis_clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {

	public static void menu(){
		System.out.println("MENU CALCULADORA");
		System.out.println("----------------");
		System.out.println("1.- SUMAR");
		System.out.println("2.- RESTAR");
		System.out.println("3.- MULTIPLICAR");
		System.out.println("4.- DIVIDIR");
		System.out.println("5.- POTENCIA");
		System.out.println("6.- RAIZ CUADRADA");
		System.out.println("7.- SENO");
		System.out.println("8.- COSENO");
		System.out.println("9.- TANGENTE");
		System.out.println("10.- NUMERO e ELEVADO A UN NUMERO");
		System.out.println("11.- LOGARITMO DE BASE e (LOGARITMO NEPERIANO)");
		System.out.println("12.- LOGARITMO DE BASE 10");
		System.out.println("13.- SENO HIPERBOLICO");
		System.out.println("14.- COSENO HIPERBOLICO");
		System.out.println("15.- TANGENTE HIPERBOLICA");
		System.out.println("16.- ECUACION DE SEGUNDO GRADO");
		System.out.println("17.- ECUACION CUADRATICA");
		System.out.println("18.- ARCOSENO");
		System.out.println("19.- ARCOCOSENO");
		System.out.println("20.- ARCOTANGENTE");
		System.out.println("21.- ARCOSENO HIPERBOLICO");
		System.out.println("22.- ARCOCOSENO HIPERBOLICO");
		System.out.println("23.- ARCOTANGENTE HIPERBOLICO");
		System.out.println("24.- SECANTE");
		System.out.println("25.- COSECANTE");
		System.out.println("26.- COTANGENTE");
		System.out.println("27.- ARCOSECANTE");
		System.out.println("28.- ARCOCOSECANTE");
		System.out.println("29.- ARCOCOTANGENTE");
		System.out.println("30.- SECANTE HIPERBOLICO");
		System.out.println("31.- COSECANTE HIPERBOLICO");
		System.out.println("32.- COTANGENTE HIPERBOLICA");
		System.out.println("33.- ARCOSECANTE HIPERBOLICA");
		System.out.println("34.- ARCOCOSECANTE HIPERBOLICA");
		System.out.println("35.- ARCOCOTANGENTE HIPERBOLICA");
		System.out.println("36.- PASAR DE RADIANES A GRADOS");
		System.out.println("37.- PASAR DE GRADOS A RADIANES");
		System.out.println("38.- NUMERO PI");
		System.out.println("39.- NUMERO e");
		System.out.println("0.- SALIR");
	}
	
	//1.- Sumar
	public static void suma(double num1,double num2) throws IOException, InterruptedException{
		double suma=0;
		suma=num1+num2;
		System.out.println("SUMA = "+num1+"+"+num2+" = "+suma);
		Thread.sleep(3000);
		main(null);
	}
	
	//2.- Restar
	public static void restar(double num1,double num2)throws IOException, InterruptedException{
		double restar=0;
		restar=num1-num2;
		System.out.println("RESTAR = "+num1+"-"+num2+" = "+restar);
		Thread.sleep(3000);
		main(null);
	}
	
	//3.- Multiplicar
	public static void multiplicar(double num1,double num2)throws IOException, InterruptedException{
		double multiplicar=0;
		multiplicar=num1*num2;
		System.out.println("MULTIPLICAR = "+num1+"*"+num2+" = "+multiplicar);
		Thread.sleep(3000);
		main(null);
	}
	
	//4.- Dividir
	public static void dividir(double num1,double num2)throws IOException, InterruptedException{
		double dividir=0;
		double temp=0;
		if(num2<=0)
			System.out.println("Error: el divisor nunca puede ser 0.");
		else{
		dividir=num1/num2;
		temp=num1%num2;
		System.out.println("DIVIDIR = "+num1+"/"+num2+" = "+dividir);
		System.out.println("RESTO = "+temp);}
		Thread.sleep(3000);
		main(null);
	}
	
	//5.- Potencia
	public static void potencia(double num1, double num2)throws IOException, InterruptedException{
		double pot=Math.pow(num1, num2);
		System.out.println("POTENCIA = "+pot);
		Thread.sleep(3000);
		main(null);
	}
	
	//6.- Raiz Cuadrada
	public static void raizcuadrada(double num1)throws IOException, InterruptedException{
		double r=Math.sqrt(num1);
		System.out.println("RAIZ CUADRADA = "+r);
		Thread.sleep(3000);
		main(null);
	}
	
	//7.- Seno
	public static void seno(double num1)throws IOException, InterruptedException{
		double sin=Math.sin(num1);
		System.out.println("SENO = "+sin);
		Thread.sleep(3000);
		main(null);
	}
	
	//8.- Coseno
	public static void coseno(double num1)throws IOException, InterruptedException{
		double cos=Math.cos(num1);
		System.out.println("COSENO = "+cos);
		Thread.sleep(3000);
		main(null);
	}
	
	//9.- Tangente
	public static void tangente(double num1)throws IOException, InterruptedException{
		double tan=Math.tan(num1);
		System.out.println("TANGENTE = "+tan);
		Thread.sleep(3000);
		main(null);
	}
	
	//10.- Numero e elevado a un numero
	public static void e(double num1)throws IOException, InterruptedException{
		double e=Math.exp(num1);
		System.out.println("NUMERO e ELEVADO A UN NUMERO = "+e);
		Thread.sleep(3000);
		main(null);
	}
	
	//11.- Logaritmo neperiano
	public static void loge(double num1)throws IOException, InterruptedException{
		double loge=Math.log(num1);
		System.out.println("LOGARITMO DE BASE e (LOGARITMO NEPERIANO)= "+loge);
		Thread.sleep(3000);
		main(null);
	}
	
	//12.- Logaritmo de base 10
	public static void log10(double num1)throws IOException, InterruptedException{
		double log10=Math.log10(num1);
		System.out.println("LOGARITMO DE BASE 10 = "+log10);
		Thread.sleep(3000);
		main(null);
	}
	
	//13.- Seno hiperbolico
	public static void sinh(double num1)throws IOException, InterruptedException{
		double sinh=Math.sinh(num1);
		System.out.println("SENO HIPERBOLICO = "+sinh);
		Thread.sleep(3000);
		main(null);
	}
	
	//14.- Coseno hiperbolico
	public static void cosh(double num1)throws IOException, InterruptedException{
		double cosh=Math.cosh(num1);
		System.out.println("COSENO HIPERBOLICO = "+cosh);
		Thread.sleep(3000);
		main(null);
	}
	
	//15.- Tangente hiperbolica
	public static void tanh(double num1)throws IOException, InterruptedException{
		double tanh=Math.tanh(num1);
		System.out.println("TANGENTE HIPERBOLICA = "+tanh);
		Thread.sleep(3000);
		main(null);
	}
	
	//16.- Ecuacion de 2º grado
	public static void ecuacion (double num1, double num2, double num3)throws IOException, InterruptedException{
		double ecuacion1= ((-num2)+Math.sqrt(Math.pow(num2,2)-(4*num1*num3)))/(2*num1);
		double ecuacion2= ((-num2)-Math.sqrt(Math.pow(num2,2)-(4*num1*num3)))/(2*num1);
		System.out.println("ECUACION DE SEGUNDO GRADO (+)= "+ecuacion1);
		System.out.println("ECUACION DE SEGUNDO GRADO (-)= "+ecuacion2);
		Thread.sleep(3000);
		main(null);
	}
	
	//17.- Ecuacion cuadratica
	public static void ecuacioncuadratica(double num1, double num2, double num3)throws IOException, InterruptedException{
		double ecuacion1= ((-num2)+Math.sqrt(Math.pow(num2,2)-(4*num1*num3)))/(2*num1);
		double ecuacion2= ((-num2)-Math.sqrt(Math.pow(num2,2)-(4*num1*num3)))/(2*num1);
		ecuacion1=Math.pow(ecuacion1, 2);
		ecuacion2=Math.pow(ecuacion2, 2);
		System.out.println("ECUACION CUADRATICA (+)= "+ecuacion1);
		System.out.println("ECUACION CUADRATICA (-)= "+ecuacion2);
		Thread.sleep(3000);
		main(null);
	}
	
	//18.- Arcoseno
	public static void arcoseno(double num1)throws IOException, InterruptedException{
		double arcsin=Math.asin(num1);
		System.out.println("ARCOSENO = "+arcsin);
		Thread.sleep(3000);
		main(null);
	}
	
	//19.- Arcocoseno
	public static void arcocoseno(double num1)throws IOException, InterruptedException{
		double arccos=Math.acos(num1);
		System.out.println("ARCOCOSENO = "+arccos);
		Thread.sleep(3000);
		main(null);
	}
	
	//20.- Arcotangente
	public static void arcotangente(double num1)throws IOException, InterruptedException{
		double arctag=Math.atan(num1);
		System.out.println("ARCOTANGENTE = "+arctag);
		Thread.sleep(3000);
		main(null);
	}
	
	//21.- Arcoseno hiperbolico
	public static void arcsinh(double num1)throws IOException, InterruptedException{
		double arcsinh=(1/(Math.sinh(num1)));
		System.out.println("ARCOSENO HIPERBOLICO = "+arcsinh);
		Thread.sleep(3000);
		main(null);
	}
	
	//22.- Arcocoseno hiperbolico
	public static void arccosh(double num1)throws IOException, InterruptedException{
		double arccosh=(1/(Math.sinh(num1)));
		System.out.println("ARCOCOSENO HIPERBOLICO = "+arccosh);
		Thread.sleep(3000);
		main(null);
	}
	
	//23.- Arcotangente hiperbolico
	public static void arctagh(double num1)throws IOException, InterruptedException{
		double arctagh=(1/(Math.tanh(num1)));
		System.out.println("ARCOTANGENTE HIPERBOLICO = "+arctagh);
		Thread.sleep(3000);
		main(null);
	}
	
	//24.- Secante
	public static void sec(double num1)throws IOException, InterruptedException{
		double sec=(1/(Math.cos(num1)));
		System.out.println("SECANTE = "+sec);
		Thread.sleep(3000);
		main(null);
	}
	
	//25.- Cosecante
	public static void cosec(double num1)throws IOException, InterruptedException{
		double cosec=(1/(Math.sin(num1)));
		System.out.println("COSECANTE = "+cosec);
		Thread.sleep(3000);
		main(null);
	}
	
	//26.- Cotangente
	public static void cotag(double num1)throws IOException, InterruptedException{
		double cotag=(1/(Math.tan(num1)));
		System.out.println("COTANGENTE = "+cotag);
		Thread.sleep(3000);
		main(null);
	}
	
	//27.- Arcosecante
	public static void arcsec(double num1)throws IOException, InterruptedException{
		double arcsec=Math.acos(1/num1);
		System.out.println("ARCOSECANTE = "+arcsec);
		Thread.sleep(3000);
		main(null);
	}
	
	//28.- Arcocosecante
	public static void arccosec(double num1)throws IOException, InterruptedException{
		double arccosec=Math.asin(1/num1);
		System.out.println("ARCOCOSECANTE = "+arccosec);
		Thread.sleep(3000);
		main(null);
	}
	
	//29.- Arcocotangente
	public static void arccotag(double num1)throws IOException, InterruptedException{
		double arccotag=Math.atan(1/num1);
		System.out.println("ARCOCOTANGENTE = "+arccotag);
		Thread.sleep(3000);
		main(null);
	}
	
	//30.- Secante hiperbolico
	public static void sech(double num1)throws IOException, InterruptedException{
		double sech=(1/(Math.cosh(num1)));
		System.out.println("SECANTE HIPERBOLICO = "+sech);
		Thread.sleep(3000);
		main(null);
	}
	//31.- Cosecante hiperbolico
	public static void coseh(double num1)throws IOException, InterruptedException{
		double coseh=(1/(Math.sinh(num1)));
		System.out.println("COSECANTE HIPERBOLICO = "+coseh);
		Thread.sleep(3000);
		main(null);
	}
	
	//32.- Cotangente hiperbolica
	public static void cotagh(double num1)throws IOException, InterruptedException{
		double cotagh=(1/(Math.tanh(num1)));
		System.out.println("COTANGENTE HIPERBOLICA = "+cotagh);
		Thread.sleep(3000);
		main(null);
	}
	
	//33.- Arcosecante hiperbolica
	public static void arcsech(double num1)throws IOException, InterruptedException{
		double arcsech=(1/(1/(Math.cosh(num1))));
		System.out.println("ARCOSECANTE HIPERBOLICA = "+arcsech);
		Thread.sleep(3000);
		main(null);
	}
	
	//34.- Arcocosecante hiperbolica
	public static void arccoseh(double num1)throws IOException, InterruptedException{
		double arccoseh=(1/(1/(Math.sinh(num1))));
		System.out.println("ARCOCOSECANTE HIPERBOLICA = "+arccoseh);
		Thread.sleep(3000);
		main(null);
	}
	
	//35.- Arcocotangente hiperbolica
	public static void arccotagh(double num1)throws IOException, InterruptedException{
		double arccotagh=(1/(1/(Math.tanh(num1))));
		System.out.println("ARCOCOTANGENTE HIPERBOLICA = "+arccotagh);
		Thread.sleep(3000);
		main(null);
	}
	
	//36.- Pasar de radianes a grados
	public static void degree(double num1)throws IOException, InterruptedException{
		double degree=Math.toDegrees(num1);
		System.out.println("PASAR DE RADIANES A GRADOS = "+degree);
		Thread.sleep(3000);
		main(null);
	}
	
	//37.- Pasar de grados a radianes
	public static void radian(double num1)throws IOException, InterruptedException{
		double radian=Math.toRadians(num1);
		System.out.println("PASAR DE GRADOS A RADIANES = "+radian);
		Thread.sleep(3000);
		main(null);
	}
	
	//38.- Numero pi
	public static void pi(double num1)throws IOException, InterruptedException{
		num1=Math.PI;
		System.out.println("NUMERO PI = "+num1);
		Thread.sleep(3000);
		main(null);
	}
	
	//39.- Numero e
	public static void ne(double num1)throws IOException, InterruptedException{
		num1=Math.E;
		System.out.println("NUMERO e = "+num1);
		Thread.sleep(3000);
		main(null);
	}

	public static void main(String[]args)throws IOException, InterruptedException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		
		int opc;
		double num1=0;
		double num2=0;
		double num3=0;
		
		do{
			menu();
			System.out.print("Introduce opcion que desea realizar: ");
			opc=Integer.parseInt(lectura.readLine());
			System.out.println("Ha elegido la opcion:"+opc);
			System.out.println();
		}while ((opc>39)||(opc<0));
		
		switch(opc){
			case 1:
				System.out.println("SUMAR");
				System.out.print("Valor de num1: ");
				num1=Double.parseDouble(lectura.readLine());
				System.out.print("Valor de num2: ");
				num2=Double.parseDouble(lectura.readLine());
				suma(num1,num2);
				break;
			case 2:
				System.out.println("RESTAR");
				System.out.print("Valor de num1: ");
				num1=Double.parseDouble(lectura.readLine());
				System.out.print("Valor de num2: ");
				num2=Double.parseDouble(lectura.readLine());
				restar(num1,num2);
				break;
			case 3:
				System.out.println("MULTIPLICAR");
				System.out.print("Valor de num1: ");
				num1=Double.parseDouble(lectura.readLine());
				System.out.print("Valor de num2: ");
				num2=Double.parseDouble(lectura.readLine());
				multiplicar(num1,num2);
				break;
			case 4:	
				System.out.println("DIVIDIR");
				System.out.print("Valor de num1: ");
				num1=Double.parseDouble(lectura.readLine());
				System.out.print("Valor de num2: ");
				num2=Double.parseDouble(lectura.readLine());
				dividir(num1,num2);
				break;
			case 5:
				System.out.println("POTENCIA");
				System.out.print("Valor de num1 (número a elevar): ");
				num1=Double.parseDouble(lectura.readLine());
				System.out.print("Valor de num2 (potencia): ");
				num2=Double.parseDouble(lectura.readLine());
				potencia(num1,num2);
				break;
			case 6:
				System.out.println("RAIZ CUADRADA");
				System.out.print("Valor de num1: ");
				num1=Double.parseDouble(lectura.readLine());
				raizcuadrada(num1);
				break;
			case 7:
				System.out.println("SENO");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				seno(num1);
				break;
			case 8:
				System.out.println("COSENO");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				coseno(num1);
				break;
			case 9:
				System.out.println("TANGENTE");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				tangente(num1);
				break;
			case 10:
				System.out.println("NUMERO e ELEVADO A UN NUMERO");
				System.out.print("Valor de num1: ");
				num1=Double.parseDouble(lectura.readLine());
				e(num1);
				break;
			case 11:
				System.out.println("LOGARITMO DE BASE e(LOGARITMO NEPERIANO)");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				loge(num1);
				break;
			case 12:
				System.out.println("LOGARITMO DE BASE 10");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				log10(num1);
				break;
			case 13:
				System.out.println("SENO HIPERBOLICO");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				sinh(num1);
				break;
			case 14:
				System.out.println("COSENO HIPERBOLICO");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				cosh(num1);
				break;
			case 15:
				System.out.println("TANGENTE HIPERBOLICA");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				tanh(num1);
				break;
			case 16:
				System.out.println("ECUACION DE SEGUNDO GRADO");
				System.out.print("Valor de num1(x^2): ");
				num1=Integer.parseInt(lectura.readLine());
				System.out.print("Valor de num2(x): ");
				num2=Integer.parseInt(lectura.readLine());
				System.out.print("Valor de num3: ");
				num3=Integer.parseInt(lectura.readLine());
				ecuacion(num1,num2,num3);
				break;
			case 17:
				System.out.println("ECUACION CUADRATICA");
				System.out.print("Valor de num1(x^4): ");
				num1=Integer.parseInt(lectura.readLine());
				System.out.print("Valor de num2 (x^2): ");
				num2=Integer.parseInt(lectura.readLine());
				System.out.print("Valor de num3: ");
				num3=Integer.parseInt(lectura.readLine());
				ecuacioncuadratica(num1,num2,num3);
				break;
			case 18:
				System.out.println("ARCOSENO");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				arcoseno(num1);
				break;
			case 19:
				System.out.println("ARCOCOSENO");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				arcocoseno(num1);
				break;
			case 20:
				System.out.println("ARCOTANGENTE");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				arcotangente(num1);
				break;
			case 21:
				System.out.println("ARCOSENO HIPERBOLICO");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				arcsinh(num1);
				break;
			case 22:
				System.out.println("ARCOCOSENO HIPERBOLICO");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				arccosh(num1);
				break;
			case 23:
				System.out.println("ARCOTANGENTE HIPERBOLICA");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				arctagh(num1);
				break;
			case 24:
				System.out.println("SECANTE");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				sec(num1);
				break;
			case 25:
				System.out.println("COSECANTE");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				cosec(num1);
				break;
			case 26:
				System.out.println("COTANGENTE");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				cotag(num1);
				break;
			case 27:
				System.out.println("ARCOSECANTE");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				arcsec(num1);
				break;
			case 28:
				System.out.println("ARCOCOSECANTE");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				arccosec(num1);
				break;
			case 29:
				System.out.println("ARCOCOTANGENTE");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				arccotag(num1);
				break;
			case 30:
				System.out.println("SECANTE HIPERBOLICA");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				sech(num1);
				break;
			case 31:
				System.out.println("COSECANTE HIPERBOLICA");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				coseh(num1);
				break;
			case 32:
				System.out.println("COTANGENTE HIPERBOLICA");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				cotagh(num1);
				break;
			case 33:
				System.out.println("ARCOSECANTE HIPERBOLICA");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				arcsech(num1);
				break;
			case 34:
				System.out.println("ARCOCOSECANTE HIPERBOLICA");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				arccoseh(num1);
				break;
			case 35:
				System.out.println("ARCOCOTANGENTE HIPERBOLICA");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				arccotagh(num1);
				break;
			case 36:
				System.out.println("PASAR DE RADIANES A GRADOS");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				degree(num1);
				break;
			case 37:
				System.out.println("PASAR DE GRADOS A RADIANES");
				System.out.print("Valor de num1: ");
				num1=Integer.parseInt(lectura.readLine());
				radian(num1);
				break;
			case 38:
				System.out.println("NUMERO PI");
				pi(num1);
				break;
			case 39:
				System.out.println("NUMERO e");
				ne(num1);
				break;
			case 0:
				System.out.println("SALIR");
				break;
		}
	}
}