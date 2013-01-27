public class menu {

	public static void menuH(){
		System.out.println("MENU DEL HOTEL");
		System.out.println("---------------");
		System.out.println("1.- Insertar habitacion convencional");
		System.out.println("2.- Insertar suite");
		System.out.println("3.- Mostrar la informacion de todas las habitaciones");
		System.out.println("4.- Precio por noche");
		System.out.println("5.- Salir");
	}
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		int opc = 0, cod = 0, camas = 0, aseos = 0;
		double superf = 0.0, precio = 0.0;
		String vistas = "", jacuzzi = "";
		boolean vista, jacuzi;
		CHabitacion hab = null;
		CSuite suite = null;
		
		do{
			menuH();
			opc = Leer.datoInt();
		}while((opc<0)&&(opc>6));
		
		switch (opc){
			case 1:{
				
				System.out.print("Introduzca numero de habitacion: ");
				cod = Leer.datoInt();
				hab.setCodigo(cod);
				System.out.println();
				
				System.out.print("Introduzca superficie: ");
				superf = Leer.datoDouble();
				hab.setSuperficie(superf);
				System.out.println();
				
				System.out.print("Introduzca numero de camas: ");
				camas = Leer.datoInt();
				hab.setNumcamas(camas);
				System.out.println();
				
				System.out.print("Introduzca precio por metro cuadrado: ");
				precio = Leer.datoDouble();
				hab.setPrecionoche(precio);
				System.out.println();
				
				System.out.println("Introduzca si quiere vistas al exterior o no");
				System.out.println("SI, NO");
				vistas = Leer.dato();
				
				if(vistas == "SI"){
					vista = true;
				}else{
					vista = false;
				}
				
				hab.setVistaext(vista);
			}
			
			case 2:{
				System.out.print("Introduzca numero de habitacion: ");
				cod = Leer.datoInt();
				suite.setCodigo(cod);
				System.out.println();
				
				System.out.print("Introduzca superficie: ");
				superf = Leer.datoDouble();
				suite.setSuperficie(superf);
				System.out.println();
				
				System.out.print("Introduzca numero de camas: ");
				camas = Leer.datoInt();
				suite.setNumcamas(camas);
				System.out.println();
				
				System.out.print("Introduzca precio por metro cuadrado: ");
				precio = Leer.datoDouble();
				suite.setPrecionoche(precio);
				System.out.println();
				
				System.out.print("Introduzca numero de aseos: ");
				aseos = Leer.datoInt();
				suite.setNumaseos(aseos);
				
				System.out.println("Introduzca si quiere jacuzzi o no");
				System.out.println("SI, NO");
				jacuzzi = Leer.dato();
				
				if(jacuzzi == "SI"){
					jacuzi = true;
				}else{
					jacuzi = false;
				}
				
				suite.setJacuzzi(jacuzi);
			}
			
			case 3:{
				hab.toString();
			}
			
			case 4:{
				hab.precio();
			}
			
			case 5:{
				System.out.println("SALIR");
			}
		}
	}
}