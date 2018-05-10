package TestNGSamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
	
  @BeforeTest
  public void login() {
	  System.out.println("Login Successfull");
	  
  }

  
  @AfterTest
  public void logout() {
	  System.out.println("Logout Successfull");
	  
  }
  @Test
  public void addvendor()
  {
	  System.out.println("Add Vendor Successfull");
	  
  }
  
  @Test
  public void addproduct()
  {
	  System.out.println("Add Product Successfull");
	  
  }
  
  @Test
  public void addcurrency()
  {
	  System.out.println("Add Currency Successfull");
	  
  }
}

