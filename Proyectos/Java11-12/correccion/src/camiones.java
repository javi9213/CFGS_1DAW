
public class camiones extends vehiculoCarga
{

	public camiones(String mat) 
	{
		super(mat);
	}
	
	public float alquiler(int PMA)
	{
		return	(super.alquiler(PMA))+40;	
	}
}
