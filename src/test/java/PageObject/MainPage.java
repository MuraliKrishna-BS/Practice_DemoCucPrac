package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage{

	public MainPage(WebDriver Driver) {
		super(Driver);
	}
	WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
	Actions act = new Actions(Driver);
	//Web Elements
	
	private 
	@FindBy(xpath="(//a[@href=\"/login\"])[2]") WebElement Nav_LoginPage;
	@FindBy(id="flash") WebElement flash;
	@FindBy(xpath="//li[.='Login Page']") WebElement verfiy;
	
	//Web Elements Actions
	
	public void Click_LoginPage() {
		act.scrollToElement(Nav_LoginPage).build().perform();
		act.scrollByAmount(0, 150).build().perform();
		Nav_LoginPage.click();
		Driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.titleContains("Test Login Page for Automation Testing Practice"));
		wait.until(ExpectedConditions.visibilityOf(verfiy));
		
	}
}
