package Sample;

import java.util.Scanner;

public class IOOperations {
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		/*System.out.println("Enter your name");
		String name = scan.nextLine();
		System.out.println("your name is "+name);
		
		
		System.out.println("Enter a number");
		int number = scan.nextInt();
		System.out.println("Number is"+number);
		
		
		System.out.println("Enter a mobile number");
		long mnumber = scan.nextLong();
		System.out.println("your mobile number is"+mnumber);
		
		System.out.println("Enter a Word");
		char Word = scan.next().charAt(1);
		System.out.println("your word is"+Word);
		
		System.out.println("Enter a float value");
		float num = scan.nextFloat();
		System.out.println("your float is"+num);*/
		
		System.out.println("Enter a Bool");
		Boolean num1 = scan.nextBoolean();
		System.out.println("your Bool is" +num1);
	}

}

