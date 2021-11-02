package TestPom.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	

	public static WebDriver startApplication(WebDriver driver,String browserName,String appUrl)
	{
	if(browserName.equals("chrome"))  
	{
	System.setProperty("webdriver.chrome.driver", "C:/Program Files/browserdriver/chromedriver.exe/chromedriver.exe");
	driver=new ChromeDriver();	
	
	
	}
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.firefox.driver", "C:/Program Files/browserdriver/chromedriver.exe/chromedriver.exe");
		driver=new ChromeDriver();	
	}
	else if(browserName.equals("Microsoft edge"))
	{
		System.setProperty("webdriver.Me.driver", "C:/Program Files/browserdriver/chromedriver.exe/chromedriver.exe");
		driver=new ChromeDriver();
	}
	else
	{
		System.out.println("This browser doesn't supports");
	}
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(appUrl);
	return driver;
	} 
public static void quitBrowser(WebDriver driver)
{
	driver.quit();
}
}
