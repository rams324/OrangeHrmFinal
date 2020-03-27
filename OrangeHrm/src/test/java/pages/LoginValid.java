package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import excelUtility.ExcelLoginData;

public class LoginValid {
	
	
	WebDriver driver;
	 ExcelLoginData ex=new ExcelLoginData();
	//method to launch application through multiple browsers
	public void LaunchUrl5(String browser) 
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
	//method to retrieve the  valid data from excel
	  public void loginData() throws InterruptedException, IOException {
		 
		driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys(ex.Username(1));
		driver.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys(ex.Password(1));
	  }
	  //method to click the submit
		public void submit() {
		driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		System.out.println(driver.getTitle());
	}

}
