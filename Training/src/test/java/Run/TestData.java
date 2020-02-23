//Sirs code 02-23-2020
package Run;
//how to use data providers.
import org.testng.annotations.Test;

import Common.browsers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestData extends browsers {
  @Test(dataProvider = "signin")
  public void f(String n, String s) throws InterruptedException {
	  Com.pages.Home h= new Com.pages.Home(driver);
	  Reporter.log("Executed successfully");
		h.Emailidfield(n);
		h.psswordfield(s);
		h.loginbt();
		driver.navigate().back();
		h.empty();
		Thread.sleep(6000);
		
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "shahbaz@gmail.com", "a" },
      new Object[] { "zoha@gmail.com", "b" },
      new Object[] { "payman@gmail.com", "b" },
    };
  }
  

}
