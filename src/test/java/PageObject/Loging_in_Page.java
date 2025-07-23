package PageObject;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loging_in_Page extends BasePage {

	public Loging_in_Page(WebDriver Driver) {
		super(Driver);
	}
	
	WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
	Actions act = new Actions(Driver);
	JavascriptExecutor Js = (JavascriptExecutor)Driver;
	
	//Web Elements
	private
	@FindBy (css = "li[aria-current='page']") WebElement PageVerify;
	private
	@FindBy (id = "username") WebElement Txt_UName;
	private
	@FindBy (id = "password") WebElement Txt_UPassword;
	
	@FindBy (xpath = "//button[.='Login']") WebElement Btn_Login;
	
	//Web Element's Actions
	public  String GetPagetitle() {
		return Driver.getTitle();
	}
	
	public void Enter_UName(String Uname) {
		Txt_UName.sendKeys(Uname);
	}
	
	public void Enter_Password(String Password) {
		Txt_UPassword.sendKeys(Password);
	}
	
	public void Click_Login_Button() {
		Btn_Login.click();
		
		
		
	}

}

