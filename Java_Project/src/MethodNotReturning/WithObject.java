package MethodNotReturning;

public class WithObject {
	public void Studentmarks(int marks)
	{

         if( marks > 70)
		{
			System.out.println("Pass");
		}
		else
		
			System.out.println("Fail");
		}

		public static void main(String[]args)
		{
			WithObject obj = new WithObject();
			obj.Studentmarks(80);
			
		}
	}