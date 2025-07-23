package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Secure_Area_Page extends BasePage {

	public Secure_Area_Page(WebDriver Driver) {
		super(Driver);
	}
	
	WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
	
	//Web Element
	@FindBy(xpath ="//b[.='You logged into a secure area!']") WebElement ValidatePage;
	@FindBy(id="flash") WebElement flash;
	
	
	
	
	// Web Elements Actions
	
	public String getflashmsg() {
		
	return	flash.getText();
		
		
	}
	
//	public boolean GetPageStatus() {
		
		//Driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
//		if(Driver.getTitle().equals("Secure Page page for Automation Testing Practice123")) {
//			
//			System.out.println(Driver.getTitle());
//			return true;
//		
//			
//		}
//		else
//		{
//			System.out.println(Driver.getTitle());
//			return false;
//		}
		
//	try {
//		wait.until(ExpectedConditions.titleIs("Secure Page page for Automation Testing Practice"));
//		
//		return true;
//	} catch (Exception e) {
//		return false;
//	}
	
		
		
	}
		
		
		
	
	
//	public String getPageTitle() {
//		
//		return Driver.getTitle();
//	}
//	
	
	

//}
