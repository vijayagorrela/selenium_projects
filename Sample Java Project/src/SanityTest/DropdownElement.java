package SanityTest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownElement {
	public static void main(String args[]) throws InterruptedException
	{
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");

		options.addArguments("–start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.gcrit.com/build3/create_account.php");
		Select Dropdown = new Select(driver.findElement(By.name("country")));
		//Dropdown.selectByVisibleText("India"); // selecting by entering value
		Dropdown.selectByIndex(10);
		List<WebElement> e = Dropdown.getOptions();
		int itemsCount = e.size();
		System.out.println(itemsCount);
		
		
	}
		
		
		

}

	