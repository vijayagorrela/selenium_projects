package SanityTest;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TextAreaElement {
	public static void main(String args[]) throws InterruptedException
	{
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");

		options.addArguments("–start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://accounts.google.com/signin");
		driver.manage().window().maximize();
		driver.findElement(By.name("identifier")).sendKeys("vijayalakshmi.gorrela");
		String text = driver.findElement(By.xpath("//*[@id='headingText']")).getText();
		System.out.println(text);
		
		
		
		
		
	}
}

