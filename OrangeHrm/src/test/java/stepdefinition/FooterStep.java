package stepdefinition;



import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Footer;

public class FooterStep {
	
	Footer f=new Footer();
	@Given("^user Launch the chrome browser$")
	public void user_Launch_the_chrome_browser() throws Throwable {
		f.LaunchUrl2("Chrome");
	    
	}

	
	@When("^User enter the username and password with valid data$")
	public void user_enter_the_username_and_password_with_valid_data() throws Throwable {
		f.loginData();
		
	}

	@Then("^User click the Login button$")
	public void user_click_the_Login_button() throws Throwable {
		f.submit();
	   
	}

	@Then("^compare the footer content$")
	public void compare_the_footer_content() throws Throwable {
	   String foot= f.getdata();
	    Assert.assertEquals("No Records are Available",foot);
	}

}
