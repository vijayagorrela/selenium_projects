package SanityTest;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class AdminLogin {
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.gecko.driver", "/home/vijaya/Selinium/geckodriver");
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		/*driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
		String url = driver.getCurrentUrl();
		if(url.equals("http://www.gcrit.com/build3/admin/index.php"))
		{
			System.out.println("Login Successfull");
		}
			else
			{
				System.out.println("Login Unsucessfull");
				
		}
		
		driver.close();*/
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
		driver.navigate().to("https://accounts.google.com");
		driver.navigate().back();
	    driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
	} 
}


