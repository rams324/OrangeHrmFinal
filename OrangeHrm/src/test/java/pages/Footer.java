package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Footer {
	WebDriver driver;

	//method to launch application through multiple browsers
	public void LaunchUrl2(String browser) 
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
	//method to give the login details of the application
	public void loginData() throws InterruptedException, IOException {

		driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys("admin123");
	}
	 //method to click the submit
		public void submit() {
		driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		System.out.println(driver.getTitle());
	}
		//method to print the footer data
	public String getdata() {
		String m= driver.findElement(By.xpath("//*[@id=\"task-list-group-panel-menu_holder\"]/table/tbody/tr/td")).getText();
		System.out.println(m);
		return m;
	}
}
