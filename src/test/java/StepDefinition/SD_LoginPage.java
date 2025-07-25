package StepDefinition;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import PageObject.Loging_in_Page;
import PageObject.Secure_Area_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_LoginPage {
	
	WebDriver Driver;
	
	
	Loging_in_Page lp = new Loging_in_Page(BaseClass.getDriver());
	Secure_Area_Page SAP = new Secure_Area_Page(BaseClass.getDriver());
	
	
	@Then("Validate the expected Login Page")
	public void validate_the_expected_login_page() 
	{
	String	Expected ="Test Login Page for Automation Testing Practice";
	String Actual =lp.GetPagetitle();
	Assert.assertNotNull(lp.GetPagetitle());
	Assert.assertTrue("Title is not Matching 1",Expected.equals(Actual));
	}
	
	@When("Enter the UserName {string} and Password {string}")
	public void enter_the_user_name_and_password(String name, String pass) {
		
		lp.Enter_UName(name);
		lp.Enter_Password(pass);
		
	    
	}
	@When("Click on Login Button")
	public void click_on_login_button() {
	   
		lp.Click_Login_Button();
		
	}
	
	@Then("Validate the Login Page {string}")
	public void validate_the_login_page(String status) {

		System.out.println(SAP.getflashmsg());
		
		if(SAP.getflashmsg().equals("You logged into a secure area!")) {
		
		}
		String Expected ="You logged into a secure area!";
		
		
		Assert.assertNotNull(SAP.getflashmsg(),"Get Null Value in Flash");
		Assert.assertTrue(SAP.getflashmsg(),SAP.getflashmsg().equals(Expected));
	}

	

}
