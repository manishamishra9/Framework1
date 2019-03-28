package scripts;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTEST;
import generic.Library;
import pompages.LoginPAGE;

public class TestValidLogin  extends BaseTEST{
  @Test
  public void validLogin() {
	  
		//WebDriver driver = null;
		LoginPAGE lp = new LoginPAGE(driver);
	
		
		String u = Library.getCellValue("valid",0,0);
		String pw= Library.getCellValue("valid",0,1);
		lp.setUsername(u);
		lp.setPassword(pw);
		lp.login();
		String title=driver.getTitle();
		System.out.println("Title of the page :"+title);
		lp.Manager();
		lp.Link(driver);
	   SoftAssert sa = new SoftAssert(); 
		sa.assertEquals(title,"Guru99 Bank Manager HomePage");
		sa.assertAll();
		
	}
}
