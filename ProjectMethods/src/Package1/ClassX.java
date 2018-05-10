package Package1;

public class ClassX 
{
	protected int  a = 100;
	protected int b = 200;

	
	protected void multiply()
	{
	System.out.println(a*b);
	}
	public static void main(String[] args)
	{
		ClassX objX = new ClassX();
		objX.multiply();
	}
	
	

}
