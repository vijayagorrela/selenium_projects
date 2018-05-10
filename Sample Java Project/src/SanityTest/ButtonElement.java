package SanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ButtonElement {
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
		driver.findElement(By.id("identifierNext")).click();
		System.out.println(driver.findElement(By.id("identifierNext")).isEnabled());
		System.out.println(driver.findElement(By.id("identifierNext")).isDisplayed());
		System.out.println(driver.findElement(By.id("identifierNext")).getAttribute("class"));
		System.out.println(driver.findElement(By.id("identifierNext")).getAttribute("type"));
		System.out.println(driver.findElement(By.id("identifierNext")).getAttribute("value"));
		
		
		
				}
}
