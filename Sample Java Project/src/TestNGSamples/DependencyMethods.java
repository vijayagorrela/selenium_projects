package TestNGSamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;



public class DependencyMethods {
	
						
	public static WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser()
	{
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");
		options.addArguments("–start-maximized");
		 driver = new ChromeDriver(options);
	}
	@Test
	public void VerifyPageTitle1()
	{
		driver.get("https://www.yahoo.com/");
		Assert.assertEquals("Yahoo", driver.getTitle());
	}
	@Test 
	public void VerifyPageTitle2()
	{
		driver.get("https://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}

}

