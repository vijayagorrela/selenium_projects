package MethodNotReturning;

public class WithoutObject {
	public static void StudentMarks(int marks)
	{
		if(marks>75)
		{
			System.out.println("Grade A");
		}
		else
		{
			System.out.println("Grade B");
		}
	}
		public static void main(String[] args)
		{
			StudentMarks(50);
		}
}
		
	