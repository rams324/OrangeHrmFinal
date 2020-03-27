package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DashBorad {
	WebDriver driver;
	public DashBorad(WebDriver driver) {
		this.driver=driver;
		
	}
	//method to launch application through multiple browsers
	public void LaunchUrl1(String browser) 
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
		driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		System.out.println(driver.getTitle());
	}
	
		//method to take the dashboard screenshot
	public void Dashboard_Screenshot() throws IOException  {
		
		TakesScreenshot ts=(TakesScreenshot)(driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source ,new File("C:\\Users\\hp\\Downloads\\845070\\OrangeHrm\\ScreenShot\\ScreenShot1.png"));
		
	}

}
