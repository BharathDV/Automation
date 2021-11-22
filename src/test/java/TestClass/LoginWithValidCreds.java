package TestClass;


import Com.Alten.QA.Com.Alten.QA.*;
import TestPage.CreateIssuePage;
import TestPage.DashboardPage;
import TestPage.LandingPage;
import TestPage.LoginPage;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Com.Alten.QA.*;

import Com.Alten.QA.Com.*;
public class LoginWithValidCreds extends BaseClass {

	public LoginPage loginPage;
    public LandingPage landingPage;
    public DashboardPage dashboardPage;
    public CreateIssuePage createissuePage;
    
    
	public LoginWithValidCreds()
	{
		super();
	}
	
	@BeforeTest
	public void setup1()
	{
		intilization();
		loginPage = new LoginPage();
		landingPage = new LandingPage();
		dashboardPage = new DashboardPage();
		createissuePage = new CreateIssuePage();
	}
	
	@BeforeMethod
	public void setup()
	{
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void EnterUserName()
	{
		loginPage.LoginPageSendValues(driver, "UserId", "bharathc719@gmail.com");
		loginPage.LoginPageSendValues(driver, "ContinueButton","");
		loginPage.LoginPageSendValues(driver, "password", "India@18199");
		loginPage.LoginPageSendValues(driver, "loginSubmit", "");
	}
	
	@Test(priority=2, dependsOnMethods= {"EnterUserName"})
	public void ClickonProject()
	{
		landingPage.ClickOnAutomateMe();
	}
	
	@Test(priority=3,dependsOnMethods= {"ClickonProject"})
	public void ClickOnCreateIssue()
	{
		dashboardPage.ClickOnCreate();
			
	}

	@Test(priority=4)
	public void PerformOnCreateIssue() throws InterruptedException 
	{
		createissuePage.PerformDetailsonIssue("Task","BharathSummery1","Web","IssueDescription");
		
			
	}
	
}
