package TestNGSamples;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGTest2 {
	@Test(priority = 3,enabled = false)
	public void Cognizant()
	{
		Assert.assertEquals("Akshaya", "Akshaya");
	}
	@Test(priority = 2)
	public void Zynosis()
	{
		Assert.assertEquals("Anil", "Bujji");
	}
	@Test(priority = 1,enabled = false)
	public void TCS()
	{
		Assert.assertEquals("Anil", "Anil");
	}
}
