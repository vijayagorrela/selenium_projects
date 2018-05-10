package SanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadiobuttonElement {
	public static void main(String args[]) throws InterruptedException
	{
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");

		options.addArguments("–start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.gcrit.com/build3/create_account.php");
		WebElement Radiobutton = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]"));
		Radiobutton.click();
		System.out.println(Radiobutton.isDisplayed());
		System.out.println(Radiobutton.isEnabled());
		String gender = Radiobutton.getAttribute("value");
		System.out.println(gender);
	}

}

