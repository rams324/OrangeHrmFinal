package stepdefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashBorad;

public class DashBoradStep 
{
	WebDriver driver;
	DashBorad p=new DashBorad(driver);
	@Given("^user launch the Chrome browser$")
	public void user_launch_the_Chrome_browser() throws Throwable
	{
		p.LaunchUrl1("Chrome");
	}

	
	@When("^the user enter the username and password with valid data$")
	public void the_user_enter_the_username_and_password_with_valid_data() throws Throwable {
	  p.loginData();
	}

	@Then("^take the screenshot of the dashboard page$")
	public void take_the_screenshot_of_the_dashboard_page() throws Throwable {
		 p.Dashboard_Screenshot();
	}
	
}