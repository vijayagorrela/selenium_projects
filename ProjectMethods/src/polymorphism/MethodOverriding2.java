package polymorphism;

public class MethodOverriding2 extends MethodOverriding1{
	
	public void multiply(int a, int b, int c)
	{
		System.out.println(a*b*c);
	}

	public static void main(String[] args) {
		MethodOverriding2 obj1  = new MethodOverriding2();
		obj1.multiply(20,30);

	}

}
