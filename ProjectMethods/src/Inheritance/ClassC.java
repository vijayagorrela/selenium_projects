package Inheritance;

public class ClassC extends ClassB {
	int x=500;
	int y = 1000;

	public static void main(String[] args) {
		ClassC objC = new ClassC();
		objC.add();
		System.out.println(objC.x);
		System.out.println(objC.y);
		
	}

}
