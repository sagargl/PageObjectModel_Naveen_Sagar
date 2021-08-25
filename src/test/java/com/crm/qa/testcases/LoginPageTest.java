package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	TestUtil util;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod() 
	public void setUP()
	{ 
		initialization();
		util=new TestUtil();
		loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginTest()
	{
		loginpage.login(prop.getProperty("uname"), prop.getProperty("pwd"));
		
	}
	
	@Test(priority=2)
	public void loginPageTitleTest()
	{
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals("Cogmento CRM", title);
		
	}
  
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
}
