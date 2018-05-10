package SanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginAttempts {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");

		options.addArguments("–start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.gcrit.com/build3/admin/login.php//");
		for (int i =1;i <4;i++)
		{
		driver.findElement(By.name("username")).sendKeys("xyz");
		driver.findElement(By.id("tdb1")).click();
		driver.findElement(By.name("username")).clear();
		}
		
		String errormessage = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td")).getText();
		System.out.println(errormessage);
		Thread.sleep(300000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		String url = driver.getCurrentUrl();
		if (url.contains("http://www.gcrit.com/build3/admin/index.php"))
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login UnSuccessfull");
			
		}

}
}