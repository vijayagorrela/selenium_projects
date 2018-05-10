package SanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CustomerRegistration {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System. setProperty("webdriver.chrome.driver", "/home/vijaya/Selinium/chromedriver");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		options.addArguments("user-data-dir=/home/vijaya//Selinium/SeleniumBrowser");

		options.addArguments("–start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.gcrit.com/build3//");
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Vijaya");
	    driver.findElement(By.name("lastname")).sendKeys("lakshmi");
	    driver.findElement(By.name("dob")).sendKeys("11/22/1988");
	    driver.findElement(By.name("email_address")).sendKeys("vijji009@gmail.com");
	    driver.findElement(By.name("street_address")).sendKeys("Bauer Lane");
	    driver.findElement(By.name("postcode")).sendKeys("08533");
	    driver.findElement(By.name("city")).sendKeys("Cranbury");
	    driver.findElement(By.name("state")).sendKeys("New Jersey");
	    Select Dropdown = new Select(driver.findElement(By.name("country")));
		//Dropdown.selectByVisibleText("India"); // selecting by entering value
		Dropdown.selectByIndex(10);
		driver.findElement(By.name("telephone")).sendKeys("9849526656");
		driver.findElement(By.name("password")).sendKeys("abcde123");
		driver.findElement(By.name("confirmation")).sendKeys("abcde123");
		driver.findElement(By.xpath("//*[@id=\"tdb4\"]/span[2]")).click();
		String confirmationmessage = driver.findElement(By.id("bodyContent")).getText();
		System.out.println(confirmationmessage);
		
		String errormessage = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/table/tbody/tr/td")).getText();
		System.out.println(errormessage);
		
		if (confirmationmessage.contains("Your Account Has Been Created!"))
		{
			System.out.println("Customer Registration Successfull");
		}
		else if (errormessage.contains("Your E-Mail Address already exists in our records - please log in with the e-mail address or create an account with a different address."));
		{
			System.out.println("Customer Registration UnSuccessfull");
		}
		 
		
		
	}}
