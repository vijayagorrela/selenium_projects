package Sample;

public class ControlFlowSample {
	public static void main(String[] args)
	{
		int a = -35;
		if ((a>=1)&&(a<=100))
		{
			System.out.println("a is a small number");
		}
		if ((a>=101)&&(a<=1000))
		{
			System.out.println("a is a medium number");
		}
		if ((a>=1001)&&(a<=10000))
		{
				System.out.println("a is a big number");
		}
		if (a>10000)
		{
			System.out.println("a is a high number");
		}
		else
			System.out.println("Display Number is Zero or Negative Number");
	}

}

		