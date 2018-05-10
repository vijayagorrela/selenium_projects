package Inheritance;

public class ClassB extends ClassA
{
	int c= 100;
	int d = 200;



public static void main(String[] args)
{
	ClassB objB = new ClassB();
	objB.add();
	System.out.println(objB.d);
}
}