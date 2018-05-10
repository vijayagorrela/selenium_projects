package Sample;

public class MultiDimensionalArray {
	public static void main(String[] args)
	{
		int[][] array1 = {{1,2,3,4},{5,6,7,8}};
		
		
		for (int i=0; i<array1.length; i++) {
			
			for (int j=0; j<array1[i].length; j++)
			{
				System.out.println(array1[i][j]);
			}
		}
	}

}
 