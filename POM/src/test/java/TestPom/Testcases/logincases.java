package TestPom.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import TestPom.pages.BaseClass;
import TestPom.pages.LoginTest123;
import TestPom.utilities.ExcelData;

public class logincases extends BaseClass{
	
	@Test
	public void loginApp() {
	logger=report.createTest("LoginApp");
		ExcelData excel=new ExcelData();
	LoginTest123 loginTest123=PageFactory.initElements(driver, LoginTest123.class);
	logger.info("starting application");
	loginTest123.LoginToApp(excel.getStringData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));
	logger.pass("Login successful");
	}
	
}
