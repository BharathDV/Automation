package TestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Alten.QA.Com.Alten.QA.BaseClass;

public class CreateIssuePage extends BaseClass 
{

	  @FindBy (xpath="//div[@id='issuetype-single-select']")
	   static WebElement Createissue_IssueType;
	   
	  @FindBy (xpath="(//*/div[@id='create-issue-dialog']//span[1][@class='icon aui-ss-icon noloading drop-menu'])[2]")
	  static WebElement Createissue_IssueSelect;
	  
	   @FindBy (xpath="//input[@id='issuetype-field']")
	   static WebElement Createissue_IssueSelectValues;
	   
	   
	   @FindBy (xpath="//*[@id='create-issue-dialog']//*[@id='summary']")
	   static WebElement Createissue_Summary;
	   
	   @FindBy (xpath="//*[@id='components-multi-select']/*[@id='components-textarea']")
	   static WebElement Createissue_Component;
	   
	   @FindBy (xpath="//*[@id='description-wiki-edit']/*[@id='description']")
	   static WebElement Createissue_Description;
	   
	   
	   @FindBy (xpath="//*[@id='create-issue-dialog']//*[@id='create-issue-submit']")
	   static WebElement Createissue_Creatbutton;
	   
	   @FindBy (xpath="//*[@id='aui-flag-container']//a")
	   static WebElement Createissue_issuenum;
	   
	   public CreateIssuePage()
		{
			PageFactory.initElements(driver, this);
		}
	
	   public void PerformDetailsonIssue(String IssueTypeValue, String IssueSummery, String IssueComp, String IssueDes) throws InterruptedException 
	   {
		   
		   Createissue_IssueType.click();
		   Thread.sleep(1000);
		   Createissue_IssueSelect.click();
		   Thread.sleep(1000);
		   Createissue_IssueSelectValues.sendKeys(IssueTypeValue+Keys.ENTER);
		   Thread.sleep(1000);
		   
		   Createissue_Summary.click();
		   Thread.sleep(1000);
		   Createissue_Summary.sendKeys(IssueSummery);
		   
		   Createissue_Component.click();
		   Thread.sleep(1000);
		   Createissue_Component.sendKeys(IssueComp);
		   Thread.sleep(1000);
		   Createissue_Component.sendKeys(Keys.ENTER);
		   
		   Createissue_Description.click();
		   Thread.sleep(1000);
		   Createissue_Description.sendKeys(IssueDes);
		   
		   Thread.sleep(1000);
		   Createissue_Creatbutton.click();
		   
		   Createissue_issuenum.getText();
		   System.out.println("Issues Number is : "+Createissue_issuenum.getText());
		   	   }
}
