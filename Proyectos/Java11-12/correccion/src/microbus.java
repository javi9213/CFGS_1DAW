
public class microbus extends vehiculoTransporte
{
	
	public microbus(String mat) 
	{
		super(mat);
	}

	public float alquiler(int numPlazas)
	{
		return	(float) (precioBase+(numPlazas*2));	
	}
	
}
