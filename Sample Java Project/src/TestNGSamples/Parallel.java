package TestNGSamples;

import org.testng.annotations.Test;

public class Parallel {
	@Test
	public void testcase1()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Testcase1 is successfull - Thread id is:"+id);
	}
 
    @Test
	public void testcase2()
	{
    	long id = Thread.currentThread().getId();
		System.out.println("Testcase2 is successfull - Thread id is:"+id);
	}
  
    @Test
	public void testcase3()
	{
    	long id = Thread.currentThread().getId();
		System.out.println("Testcase3 is successfull - Thread id is:"+id);
	}
    @Test
	public void testcase4()
	{
    	long id = Thread.currentThread().getId();
		System.out.println("Testcase4 is successfull - Thread id is:"+id);
	}
}
