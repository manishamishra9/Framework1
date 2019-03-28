package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BaseTEST;
import pompages.LoginPAGE;

public class NewTest extends BaseTEST{
  @Test
  public void f() {
		LoginPAGE lp = new LoginPAGE(driver);
		lp.OB1();
		lp.OB3();
       driver.switchTo().activeElement().click();
       
	       		        
	
  }
}
