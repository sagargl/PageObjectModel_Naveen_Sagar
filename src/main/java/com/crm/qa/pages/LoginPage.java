package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	//PageFactory-OR:
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password')]")
	WebElement forgotpassword;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement loginbtn;
	
	
	//Initiliaze the page objects
	public LoginPage()
	{
		//PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, this);
	}
	
    //Action class
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateForgotPassword()
	{
		return forgotpassword.isDisplayed();
	}
	
	public void login(String un, String pw)
	{
		email.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
	}
	
}
