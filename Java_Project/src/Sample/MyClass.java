package Sample;

public class MyClass
{
	public int age()
	{
		int myage = 30;
		return myage;
	}
	public static void main(String[] args)
	{
		int a=10;
	
		System.out.println(a);
		a+=10;
		System.out.println(a);
	
	MyClass obj = new MyClass();
	obj.age();
	System.out.println(obj.age());

}
}