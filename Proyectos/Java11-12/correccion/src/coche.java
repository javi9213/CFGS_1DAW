
public class coche extends vehiculoTransporte
{
	public coche(String mat) 
	{
		super(mat);
	}

	public float alquiler(int dias)
	{
		return	(float) ((precioBase+1.5)*dias);	
	}
}
