package WebDriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Method1
{
	public static WebDriver driver;
	public void launchbrowser()
	{	
	System.setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
	ChromeOptions options = new ChromeOptions(); 
	options.addArguments("disable-infobars"); 
	options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");
	options.addArguments("–start-maximized");
	 driver = new ChromeDriver(options);
	}	
	
	
	public void AdminLogin(String username,String password) 
	{
		
		try {
			driver.get("http://www.gcrit.com/build3/admin/login.php//");
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.id("tdb1")).click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public void AdminLogin()
	{
		driver.get("http://www.gcrit.com/build3/admin/login.php//");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
	}
	
	public static void main(String[] args)
	{
		
		Method1 obj = new Method1();
		obj.launchbrowser();
		obj.AdminLogin("admin","admin@123");
		obj.AdminLogin();
	}

}

