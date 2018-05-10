package polymorphism;

public class MethodOverriding1 {
	public void multiply(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args)
	{
		MethodOverriding1 obj = new MethodOverriding1();
		obj.multiply(60, 10);
		
		MethodOverriding2 obj2 = new MethodOverriding2();
		obj2.multiply(10, 20, 30);
	}

}
