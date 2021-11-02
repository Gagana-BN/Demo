package TestPom.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
//import org.testng.reporters.TestHTMLReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.ExtentReporter;

import TestPom.utilities.BrowserFactory;

public class BaseClass {
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest logger;
	@BeforeSuite
	public void setUpSuite() {
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("User.dir")+"/Reports/Open.html"));
		report=new ExtentReports();
		report.attachReporter(extent); 
		
	}
	@BeforeClass
	public void setup() {
		driver=BrowserFactory.startApplication(driver, "chrome", "https://demo.openmrs.org/openmrs/");
	}
	@AfterClass
	public void tearDown() {
	//BrowserFactory.quitBrowser(driver);
	report.flush();
	}

}
