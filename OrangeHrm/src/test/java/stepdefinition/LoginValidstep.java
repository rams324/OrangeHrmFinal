package stepdefinition;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import excelUtility.ExcelLoginData;

public class LoginValidstep extends ExcelLoginData{
	pages.LoginValid logindata=new pages.LoginValid();
	@Given("^user launch the chrome browser$")
	public void user_launch_the_chrome_browser() {
		
		logindata.LaunchUrl5("Chrome");
	}

	@When("^user enter the username and password with valid data$")
	public void user_enter_the_username_and_password_with_valid_data() throws InterruptedException, IOException,IncompatibleClassChangeError {
		logindata.loginData();
	}

   @Then("^user click the Login button$")
   public void user_click_the_Login_button() throws Throwable {
  logindata.submit();
   }

}
