package ej2;


public class darVuelta 
{
	public static String cambiar(int n1)
	{
		
		String volteado="";	
		String auxiliar="";
		
		volteado=String.valueOf(n1%10);
		
		if(n1==0)
		{
			volteado="";
		}
		else
		{
			auxiliar=darVuelta.cambiar(n1/10);
		}
		
		return volteado+auxiliar;
	}

}
