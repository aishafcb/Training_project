//Sir's Imported code for 15th session class 02-22-2020
package Run;

import org.testng.annotations.Test;

import Common.browsers;
//import Site.pages.Home;

public class Forgot_psswd extends browsers {
  @Test
  public void f() {
	  Com.pages.Home h= new Com.pages.Home(driver);
		h.Emailidfield("Zoha.kharazmi@yahoo.com");
		h.psswordfield("zk");
		h.loginbt();
		driver.navigate().back();
  }
}
