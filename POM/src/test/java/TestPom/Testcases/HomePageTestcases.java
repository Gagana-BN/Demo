package TestPom.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import TestPom.pages.BaseClass;
import TestPom.pages.HomePage123;
//import TestPom.pages.LoginTest123;

public class HomePageTestcases extends BaseClass{
	@Test
	public void HomePage() {
		logincases LG=new logincases();
		LG.loginApp();
		logger=report.createTest("HomePage");
		HomePage123 HomePage123 = PageFactory.initElements(driver, HomePage123.class);
		logger.info("clicked on the register patient button");
		
	
	}
}
