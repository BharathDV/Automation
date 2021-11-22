package TestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Alten.QA.Com.Alten.QA.BaseClass;

public class LandingPage extends BaseClass
{

	@FindBy(xpath="//p[contains(text(),'automateme')]")
	static	WebElement LandingPage_Frequent;
	
	public LandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void ClickOnAutomateMe()
	{
		try {
		LandingPage_Frequent.click();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
}
