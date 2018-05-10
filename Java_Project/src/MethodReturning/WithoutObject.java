package MethodReturning;

public class WithoutObject {
	public static int add(int a, int b)
	{
		int c =a+b;
		return c;
	
	}
public static void main(String[] args)
{
	int x = add(10,20);
	System.out.println(x);
	
}
}
