package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import excelUtility.LoginInvaliddata;

public class LoginInvalidStep extends LoginInvaliddata {
	pages.LoginInvalid plo=new pages.LoginInvalid();
	@Given("^the user launch the chrome browser$")
	public void the_user_launch_the_chrome_browser() throws Throwable {
	   plo.LaunchUrl4("Chrome");
	}

	
	@When("^user enter the username and password with invalid data$")
	public void user_enter_the_username_and_password_with_invalid_data() throws Throwable {
	    plo.loginData();
	}

	@Then("^the user click the Login button$")
	public void the_user_click_the_Login_button() throws Throwable {
	    plo.submit();
	}

}
