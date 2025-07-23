package StepDefinition;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import PageObject.Loging_in_Page;
import PageObject.Secure_Area_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_LoginPage {
	
	WebDriver Driver;
	SoftAssert SA = new SoftAssert();
	
	Loging_in_Page lp = new Loging_in_Page(BaseClass.getDriver());
	Secure_Area_Page SAP = new Secure_Area_Page(BaseClass.getDriver());
	
	
	@Then("Validate the expected Login Page")
	public void validate_the_expected_login_page() 
	{
	String	Expected ="Test Login Page for Automation Testing Practice";
	String Actual =lp.GetPagetitle();
	SA.assertNotNull(lp.GetPagetitle());
	SA.assertTrue(Expected.equals(Actual), "Title is not Matching 1");
	//SA.assertEquals("Title is not Matching 2", Expected, Actual);
	SA.assertAll();
	
//	Assert.assertNotNull(lp.GetPagetitle());
//	Assert.assertTrue("Title is not Matching 3",Expected.equals(lp.GetPagetitle()));
//	Assert.assertEquals("Title is not Matching 4", Expected, lp.GetPagetitle());
	  
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
		
		
		SA.assertNotNull(SAP.getflashmsg(),"Get Null Value in Flash");
		SA.assertTrue(SAP.getflashmsg().equals(Expected),"Notable to Login to Secure Page-1");
		SA.assertEquals( SAP.getflashmsg(), Expected, "Notable to Login to Secure Page-2");
		SA.assertAll("The following asserts failed: Case Status should be "+status);
		
		
	}

	

}
