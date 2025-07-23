package StepDefinition;

import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import PageObject.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainPageDefinition {
	
	WebDriver Driver;
	
	MainPage mp= new MainPage(BaseClass.getDriver());
	
	@Given("Click on Try_Login_Page_Link button")
	public void click_on_Try_Login_Page_Link_button() {
	    mp.Click_LoginPage();
	    
	}

	

	

	

	

}
