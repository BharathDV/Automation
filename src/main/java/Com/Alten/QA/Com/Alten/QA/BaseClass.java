package Com.Alten.QA.Com.Alten.QA;

import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.inference.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	
	public static String BrowserType = "chrome";
	public static WebDriver driver;
	public String url="https://id.atlassian.com/login";
	
	public static void intilization()
	{
		if (true)
		{
			//System.setProperty("webdriver.chrome.driver", "D:/JavaProjects/MavanProject/Panasonice/chromedriver.exe");
			String SystemProp=System.getProperty("user.dir")+"/Driver/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",SystemProp);
	        driver = new ChromeDriver();
		}
		
		else 
		{
			System.out.println("------------intilization fails--------------");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://id.atlassian.com/login");
	}

}
