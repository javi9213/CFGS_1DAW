
public class vehiculo 
{
	protected String matricula;
	protected final float precioBase=50;
	
	public vehiculo(String mat)
	{
		matricula=mat;
	}
	
	public float alquiler(int dias)
	{
		return	(float) (precioBase*dias);	
	}
}
