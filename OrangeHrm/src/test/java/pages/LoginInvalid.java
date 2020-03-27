package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import excelUtility.LoginInvaliddata;

public class LoginInvalid   {
	WebDriver driver;

	//method to launch application through multiple browsers
	public void LaunchUrl4(String browser) 
	{
		if(browser.equalsIgnoreCase("Chrome")) {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\845070\\OrangeHrm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Explorer")) {
			
			System.setProperty("webdriver.IE.driver","C:\\Users\\user\\Downloads\\Orange\\Orange\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
	}
	//method to retrieve the  invalid data from excel
	public void loginData() throws InterruptedException, IOException {
		LoginInvaliddata e=new LoginInvaliddata();
		driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys(e.Username(1));
		driver.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys(e.Password(1));
	}
	 //method to click the submit
		public void submit() {
		driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		System.out.println(driver.getTitle());
	}
}
