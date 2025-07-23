package StepDefinition;

import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	static WebDriver Driver;
	
	@Before 
	public void LunchApp() {
		Driver = BaseClass.LunchBrowser();
		Driver.get("https://practice.expandtesting.com");
		
	}
	
	@After
	public void ExitApp() {
		
		Driver.quit();
	}
	
	

}
