package SanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomerLogin {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");

		options.addArguments("–start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.gcrit.com/build3/index.php");
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys("vijji009@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcde123");
		driver.findElement(By.id("tdb5")).click();
		String url = driver.getCurrentUrl();
		if(url.contains("http://www.gcrit.com/build3/index.php"))
{
	    System.out.println("Login Successfull");
}
		else
		{
		    System.out.println("Login UnSuccessfull");
	}	
		
	}

}
