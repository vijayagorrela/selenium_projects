package SanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImageElement {
	public static void main(String args[]) throws InterruptedException
	{
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");

		options.addArguments("–start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println(driver.findElement(By.id("hplogo")).getAttribute("title"));
		driver.navigate().to("https://www.yahoo.com/");
		driver.findElement(By.id("uh-signin")).click();
		driver.navigate().to("https://login.yahoo.com");
		driver.findElement(By.name("signin")).click();
	}

}
