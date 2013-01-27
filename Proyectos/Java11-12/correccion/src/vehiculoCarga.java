
public class vehiculoCarga extends vehiculo
{
	
	public vehiculoCarga(String mat) 
	{
		super(mat);
	}

	public float alquiler(int PMA)
	{
		return	(float) (precioBase+(PMA*20));	
	}
	
}
