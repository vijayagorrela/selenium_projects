package SanityTest;
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserElement{
	public static void main(String args[]) throws InterruptedException
	{
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		WebDriver driver = new ChromeDriver(options);
		
		//Browser Operations
		driver.get("https://accounts.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.manage().window().maximize();
		driver.navigate().to("https://www.yahoo.com/");
		Thread.sleep(5000);
		driver.navigate().back(); //google
		Thread.sleep(5000);
		
		driver.navigate().forward(); //yahoo
		driver.manage().window().maximize();
		driver.quit();
		

	}

}