package pompages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTEST;

public class LoginPAGE extends BaseTEST{

	@FindBy(xpath="//input[@type='email']")
	WebElement un;
	@FindBy(xpath="//input[@type='password']")
	WebElement pwd;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutn;
	@FindBy(xpath="//td[text()='Manger Id : mngr174644']")
	WebElement manager;
	@FindBy(xpath="//a")
	List<WebElement> link;
	@FindBy(id="hp-widget__sTo")
	WebElement obj1;
	@FindBy(xpath="//span[text()='New Delhi, India ']")

	WebElement obj2;
	@FindBy(xpath="//li[@aria-label='Top Cities : New Delhi, India ']")
	List<WebElement> obj3;
	@FindBy(id="hp-widget__return")
	WebElement obj4;
	
	



	 public LoginPAGE(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	

	public void setUsername(String u){
		un.sendKeys(u);
		}
	public void setPassword(String pw){
		pwd.sendKeys(pw);
		}
	public void login(){
		loginbutn.submit();
		}
	public void Manager(){
		boolean displayed = manager.isDisplayed();
		if(displayed) {
			System.out.println("managerId is displaying");
		}
		
		}
	public void Link(WebDriver driver){
		int count=0;
		System.out.println(link.size());
		// String[] linkTexts = new String[link.size()];	
		for(WebElement wb:link){
			
			wb.click();
			String title = driver.getTitle();
			System.out.println(title);
			if(title.equals("404 Not Found")) {
				count++;}
			driver.navigate().back();
		}
		System.out.println(count);
		//driver.navigate().back();	
		}
	
	public void OB1(){
		obj1.click();
		}
	public void OB2(){
		obj2.click();
		}
	public void OB3() {
		for(WebElement wb:obj3) {
			System.out.println(wb);
			String text = wb.getText();
			System.out.println(text);
			if(text.equals("New Delhi, India")){
				wb.click();}
		}}
		
	public void OB4(){
		obj4.click();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

