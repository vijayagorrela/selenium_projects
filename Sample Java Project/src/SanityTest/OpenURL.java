package SanityTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System. setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.yahoo.com");
	}

}
