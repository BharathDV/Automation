package TestPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Alten.QA.Com.Alten.QA.BaseClass;

public class DashboardPage extends BaseClass 
{
   @FindBy (xpath="//button[@id='createGlobalItem']")
   static WebElement Dashboard_Create;
	
   
   public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
   public static void ClickOnCreate()
	{
	   try
	   {
	   Dashboard_Create.click();
	   }
	   catch (Exception e)
	   {
		   System.out.println(e);
	   }
	}
	
   
  
}
