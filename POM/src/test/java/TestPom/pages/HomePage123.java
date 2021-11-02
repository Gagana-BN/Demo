package TestPom.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage123 {
	WebDriver driver;
	public HomePage123(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
@FindBy(xpath="//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")  
WebElement Registerbutton;
public void HomePage()
{
Registerbutton.click();

	}
}
