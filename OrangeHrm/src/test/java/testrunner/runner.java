package testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\hp\\Downloads\\845070\\OrangeHrm\\src\\main\\resources\\features\\OrangeFeatures.feature",
plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
tags = {"@tc_01,@tc_02,@tc_03,@tc_04,@tc_05,@tc_06"},
glue = {"stepdefinition"},
monochrome = true
)
public class runner {
	@AfterClass
	  public static void extendReport() 
	{
	      Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
	      Reporter.setSystemInfo("user", System.getProperty("user.name"));
	      Reporter.setSystemInfo("os", "Windows");
	      Reporter.setTestRunnerOutput("Sample test runner output message");
	}


}
