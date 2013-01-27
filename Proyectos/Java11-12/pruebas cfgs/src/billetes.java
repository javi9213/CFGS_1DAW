
public class billetes {
	public static void main(String[] args) {
		int euros=232, resultado;
		if (euros>=500){
			resultado=euros/500;
			System.out.println(resultado + " billete(s) de 500.");
			euros=euros-(500*resultado);
			resultado=0;
			}
				if(euros>=200){
					resultado=euros/200;
					System.out.println(resultado+" billete(s) de 200.");
					euros=euros-(200*resultado);
					resultado=0;
					}
						if(euros>=100){
							System.out.println("1 billete(s) de 100.");
							euros=euros-100;
							}
								if(euros>=50){
									System.out.println("1 billete(s) de 50.");
									euros=euros-50;
									}
										if(euros>=20){
											resultado=euros/20;
											System.out.println(resultado+" billete(s) de 20.");
											euros=euros-(20*resultado);
											resultado=0;
											}
												if(euros>=10){
													System.out.println("1 billete(s) de 10.");
													euros=euros-10;
													}
														if(euros>=5){
															System.out.println("1 billete(s) de 5.");
															euros=euros-5;
															}
																System.out.println("Sobran "+euros+".");
	}
}
															