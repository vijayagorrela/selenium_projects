package SanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PosNegLoginAttempt {
	 static String username;
     static String password;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");
		options.addArguments("–start-maximized");
		WebDriver driver = new ChromeDriver(options);
					
		for(int i=1; i<=2; i++)
		{
			if(i==1)
			{
				username = "admin";
				password = "admin@123";
				
			}
			else if(i==2)
			{
				username = "adminaa";
				password = "admin@123";
			}
			
			driver.get("http://www.gcrit.com/build3/admin/login.php//");
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.id("tdb1")).click();
			
			String url = driver.getCurrentUrl();
			if (url.contains("http://www.gcrit.com/build3/admin/index.php"))
			{
				System.out.println("Postive Testing + Login Successfull");
				driver.findElement(By.linkText("Logoff")).click();
								
			}
			
			else if (!url.contains("http://www.gcrit.com/build3/admin/index.php"))
			{
				System.out.println("Negative Testing + Login UnSuccessfull");
			}
	}

}
}