package SanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC001 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");

		options.addArguments("–start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.findElement(By.xpath("//*[@id=\"pt-createaccount\"]/a")).click();
		String url = driver.getCurrentUrl();
		if (url.contains("wikipedia.org"))
		{
			System.out.println("Its Internal link, Test Case Passed");
		}
			else
			{
				System.out.println("Its not Internal link, Test Case Failed");
		}
driver.navigate().back();

}
}