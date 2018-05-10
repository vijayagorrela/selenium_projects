package SanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InlineElement {
	public static void main(String args[]) throws InterruptedException
	{
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");

		options.addArguments("–start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		WebElement inline = driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div[1]/a"));
		inline.click();
		inline.findElement(By.xpath("//*[@id=\"gb49\"]/span[1]")).click();

}
}
