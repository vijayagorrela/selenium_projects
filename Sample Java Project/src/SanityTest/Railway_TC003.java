package SanityTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Railway_TC003 {
	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
	ChromeOptions options = new ChromeOptions(); 
	options.addArguments("disable-infobars"); 
	options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");

	options.addArguments("–start-maximized");
	WebDriver driver = new ChromeDriver(options);
	driver.get("http://www.irctc.co.in/");

}
}

