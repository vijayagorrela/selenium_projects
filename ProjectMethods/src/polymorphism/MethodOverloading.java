package polymorphism;

public class MethodOverloading {
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println(a+b);
	}
	public void add(double a, double b)
	{
		System.out.println(a+b);
	}
	public void add(double a, double b, double c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args)
	{
		MethodOverloading obj = new MethodOverloading();
		obj.add(25, 30);
		obj.add(15, 60, 25);
		obj.add(12.67, 34.789);
		obj.add(16.244, 9.087,5.675);
	

	}

}
