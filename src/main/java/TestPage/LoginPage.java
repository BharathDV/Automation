package TestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Alten.QA.Com.Alten.QA.*;

public class LoginPage extends BaseClass
{

	@FindBy(id="username")
	WebElement Login_UserId;
	
	@FindBy(id="login-submit")
	WebElement Login_ContinueButton;
	
	@FindBy (id="password")
	WebElement Login_Password;
	
	@FindBy (id="login-submit")
	WebElement Login_LoginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginPageSendValues(WebDriver driver,String ElementName, String Values)
	{
		try {
		if(ElementName.equalsIgnoreCase("UserId"))
		{
			Login_UserId.click();
			Login_UserId.clear();
			Login_UserId.sendKeys(Values);
		}
		else if (ElementName.equals("ContinueButton"))
		{
			Login_ContinueButton.click();
		}
		else if (ElementName.equals("password"))
		{
			Login_Password.click();
			Login_Password.sendKeys(Values);
		}
		else if (ElementName.equals("loginSubmit"))
		{
			Login_LoginButton.click();
		}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}


	
}

