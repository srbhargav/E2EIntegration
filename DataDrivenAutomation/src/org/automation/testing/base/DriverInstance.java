package org.automation.testing.base;

import org.openqa.selenium.WebDriver;
import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.automation.testing.utility.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class DriverInstance {

	public WebDriver driver;
	
	
	@BeforeMethod
	public void initiateDriverInstance() throws Exception{
		if(Utility.fetchpropertiesvalues("BrowserName").toString().equals("chrome"))
		{
	    System.setProperty("webdriver.chrome.driver","D://MIST_TRAVEL//DataDrivenAutomation//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	    } 
	    else if (Utility.fetchpropertiesvalues("BrowserName").toString().equals("firefox"))
	    {
    	System.setProperty("webdriver.gecko.driver","D://MIST_TRAVEL//DataDrivenAutomation//Drivers//geckodriver.exe");
    	driver = new FirefoxDriver();
        } 
		driver.get(Utility.fetchpropertiesvalues("ApplicationURL").toString());
     }

	@AfterMethod
    public void CloseDriverInstance() {
        driver.quit();
     }
	
	@AfterSuite
	public void generatereport() throws Exception{
		Xl.generateReport("Report_Excel.xlsx");
	}
   }