package scripts;

import org.testng.annotations.Test;

import generic.BaseTEST;
import generic.Library;
import pompages.LoginPAGE;

public class InvalidLogin extends BaseTEST {
  @Test
 public static void invalidlogin() {
	  LoginPAGE ip = new LoginPAGE(driver);
	  int rowCount = Library.getRowCount("invalid");
	  for(int i=0;i<rowCount;i++){
		  String cellValue = Library.getCellValue("invalid", i, 0);
		  String cellValue1 = Library.getCellValue("invalid", i, 1);
		  ip.setUsername(cellValue);
		  ip.setPassword(cellValue1);
		  ip.login();
		  driver.switchTo().alert().accept();
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  }
	  
	  
	  
  }
}
