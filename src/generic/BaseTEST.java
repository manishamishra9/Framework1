package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTEST implements IAutoConstant {
	public static WebDriver driver;
	static {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty( CHROME_KEY, CHROME_VALUE);
	}
	@BeforeMethod
public void openApplication() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
	driver=new ChromeDriver(option);
	driver.get(Library.getPropertyValue("Url"));
	String time = Library.getPropertyValue("MAXTIME");
	int ito = Integer.parseInt(time);
	driver.manage().timeouts().implicitlyWait( ito ,TimeUnit.SECONDS);
	
	
}
	@AfterMethod
	
	
public void closeApplication(ITestResult res){
		System.out.println(res.getStatus());
		System.out.println(res.getTestName());
		System.out.println(res.getName());
		if(ITestResult.FAILURE==res.getStatus()) {
			Library.takeScreenshot(driver,res.getName());
		}
	//driver.close();
}
}

