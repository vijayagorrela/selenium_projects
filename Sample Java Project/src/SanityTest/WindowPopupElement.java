package SanityTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowPopupElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");

		options.addArguments("–start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
	    Alert warning = driver.switchTo().alert();
	    String ErrorMessage = warning.getText();
	    System.out.println(ErrorMessage);
	    Thread.sleep(5000);
	    warning.accept();
	    driver.findElement(By.id("login1")).sendKeys("vijaya_mca44");
		

	}

}
