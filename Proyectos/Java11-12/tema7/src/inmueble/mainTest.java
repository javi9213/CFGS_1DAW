package inmueble;

public class mainTest {

	//menu
	public static int menu1(){
		int opc1=0;
		do{
			System.out.printf("\nElige la opcion\n" +
					"1.Insertar el inmueble de venta\n" +
					"2.Insertar el inmueble de alquiler\n" +
					"3.Ver los inmuebles de venta con precios inferior con respeto al precio indicado\n" +
					"4.Ver los locales de segunda mano con superfiecie superios con respeto al superficie indicado\n" +
					"5.Ver el numero de solares rusticas en la venta\n" +
					"6.Funcionar dos agencias\n" +
					"7.Sacar la informacion de todos los inmuebles\n" +
					"8.Salir\n");

			opc1=Leer.datoInt();

		}while(opc1<1 || opc1>8);

		return opc1;
	}

	public static int menuVenta(){

		int opc=0;

		do{
			System.out.printf("\n1.Solares\n" +
					"2.Viviendas\n");
			opc=Leer.datoInt();

		}while(opc!=1 && opc!=2);

		return opc;
	}

	public static void main(String [] args){
		int opc;
		String ubic;
		float mCuadrado, pMCuadrado;
		boolean zonaSolar;

		//creamos una agencia de inmobilaria
		AgenciaInmobilaria ag1=new AgenciaInmobilaria();

		do{
			//llamamos al menu
			opc=menu1();

			switch(opc){

			case 1:
				if(menuVenta()==1){
					System.out.printf("\nIntroduzca los datos de solares:\n" +
							"Ubicacion: ");
					ubic=Leer.dato();

					System.out.printf("\nMetros cuadrados\n");
					mCuadrado=Leer.datoFloat();

					System.out.printf("\nPrecio por metro cuadrado\n");
					pMCuadrado=Leer.datoFloat();

					System.out.printf("\nElige la zona\n" +
							"1.Rustica\n" +
							"2.Urbana\n");
					opc=Leer.datoInt();
					if(opc==1) zonaSolar=true;
					else zonaSolar=false;

					//crear el objeto solar
					CSolares s1=new CSolares(ubic,mCuadrado,pMCuadrado, zonaSolar);

					//insertar el objeto
					ag1.aniadeVentaInmueble(s1);

				}
					break;

				case 7:
						System.out.printf("%s",ag1.toString());
						break;	
			}

		}while(opc!=8);
	}
}