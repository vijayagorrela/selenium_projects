package SanityTest;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditElement {
	public static void main(String args[]) throws InterruptedException
	{
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.gmail.com");
		//driver.findElement(By.id("identifierId")).sendKeys("vijayalakshmi.gorrela");
		WebElement Email = driver.findElement(By.tagName("input"));
		Email.sendKeys("vijayalakshmi.gorrela");
		//System.out.println(Email.getText());
		System.out.println(Email.getAttribute("value"));
		System.out.println(Email.isEnabled());
	    System.out.println(Email.isDisplayed());
	    Email.clear();

}
}
