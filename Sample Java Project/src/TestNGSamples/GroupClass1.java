package TestNGSamples;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupClass1 {
	
	@BeforeGroups(groups= {"Sanity","Regression"})
	  public void Login()
	  {
		  System.out.println("Login Successful");
	  }
  @Test(groups= {"Regression"}, priority = 3)
  public void fundTransfer()
  {
	  System.out.println("Fund Transfer Successful");
  }
  @Test(groups= {"Sanity"}, priority = 3)
  public void Search()
  {
	  System.out.println("Search Successful");
  }
  
  @Test(groups= {"Regression"}, priority = 2)
  public void AdvancedSearch()
  {
	  System.out.println("Advance Search Successful");
  }
  
  @Test(groups= {"Sanity"}, priority = 2)
  public void PrepaidRecharge()
  {
	  System.out.println("Prepaid Recharge Successfully");
  }
  
  @Test(groups= {"Sanity"}, priority = 4)
  public void BillPayment()
  {
	  System.out.println("BillPayment Successfully");
  }
  
  @AfterGroups(groups= {"Sanity","Regression"})
  public void Logout()
  {
	  System.out.println("Logout Successful");
  }
  
}
