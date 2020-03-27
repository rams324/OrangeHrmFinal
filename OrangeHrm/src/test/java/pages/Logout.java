package pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;



public class Logout {
	WebDriver driver;
	
	//method to launch application through multiple browsers
	public void LaunchUrl6(String browser) 
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
//method to give login details of the application
	public void loginData()  {
	
		driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys("admin123");
	}
	//method for click on submit
		public void submit() {
		driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		System.out.println(driver.getTitle());
	}
		//method for clicking logout
		public void LogOut() {
			driver.findElement(By.xpath("//a[text()='Welcome Admin']")).click();
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")));
			act.click().build().perform();;
			
		}

}
