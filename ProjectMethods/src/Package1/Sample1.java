package Package1;

public class Sample1 {
	//Declare Static Variables
	static int a = 10, b= 20;
	//Declare non static variables
	int c= 30, d=40;
	//Create static method with returning a value
	public static int add (int a, int b)
	{
		int x= a+b;
		return x;
	}
	
	//Create static method without returning value
	public static void Result (int marks)
	{
		if (marks>80)
			System.out.println("Good");
		else
			System.out.println("Average");
	}
	
	//Create a non static method with returning value
	public int multiply(int c, int d)
	{
		int y = c*d;
		return y;
	}
	
	//Create a non static method without returning a value
	public  void multiply1(int c, int d)
	{
		System.out.println(c*d);
	}
	
	public static void main(String[] args)
	{
		Sample1.add(10, 20);
		System.out.println(add(10,20));
		Sample1.Result(100);
		
		Sample1 obj = new Sample1();
			int z =	obj.multiply(30, 40);
			System.out.println(z);
			 obj.multiply1(30,40);
			//System.out.println(0);
		
		
	}
	

}

		
	
	