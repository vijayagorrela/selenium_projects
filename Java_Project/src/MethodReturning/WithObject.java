package MethodReturning;


public class WithObject 

{
	public int Add(int a, int b )
	{
	int c = a+b;
	return c;
}
public static void main(String[]args)
{
	WithObject obj = new WithObject();
    int x = obj.Add(20,30);
    System.out.println(x);
}
}