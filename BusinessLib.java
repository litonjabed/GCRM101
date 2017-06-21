package businessLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BusinessLib
{
	//code for re-usable scenarios in the current project
	// we can not use this business library for other projects
	
	
	public static WebDriver driver;
	
	//open browser
	public static void openBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			//open chrome
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\driverservers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			//Open IE browser
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\driverservers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			//Firefox browser
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\driverservers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			//safari browser
			driver=new SafariDriver();
		}
		
		//Navigate to the application
		driver.get("http://demo.testfire.net/bank/login.aspx");
		
	}
}
