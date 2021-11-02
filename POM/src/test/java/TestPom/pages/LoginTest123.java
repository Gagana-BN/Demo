package TestPom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TestPom.Testcases.HomePageTestcases;

public class LoginTest123 {
	WebDriver driver;
	public LoginTest123(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
@FindBy(xpath="//input[@id='username']") WebElement uname;
@FindBy(xpath="//input[@name='password']") WebElement pwd;
@FindBy(xpath="//li[@id='Inpatient Ward']") WebElement Inpatientward;
@FindBy(xpath="//input[@type='submit']") WebElement loginbutton;
public HomePageTestcases LoginToApp(String username,String password)
{
uname.sendKeys(username);
pwd.sendKeys(password);
Inpatientward.click();
loginbutton.click();
return new HomePageTestcases();
	}
}
