package com.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.utility.UserActions;

import base.TestSetup;

public class Login_AdminPortal extends TestSetup {
	
	
	
	public WebDriver d;
	
	
	public Login_AdminPortal (WebDriver d) {
		this.d = d;

	}
	
	public final By userid = By.id(p.getProperty("id_locator"));
	public final By password = By.id(p.getProperty("pass_locator"));
	public final By logon = By.id(p.getProperty("logon_locator"));
	public final By NoSecurity = By.id(p.getProperty("SecurityNo_locator"));
	public final By text = By.xpath(p.getProperty("text_locator"));
	
	
	
/*	public void GetAppUrl()
	{
		
	}*/
	
	public void VerifyUrl()
	{
		Boolean flag = UserActions.getCurrentUrl().contains("Plan");
		String url = UserActions.getCurrentUrl();
		if(flag)
		{
			Assert.assertTrue(true);
			scenario.write("Application url"+" "+url+" "+"verified successfully");
			
		}
		else
		{
			Assert.assertFalse(false);
		}
	}
     public  SelectCompany login (String user, String pass) {
    	 
    	 
    	
    	 UserActions.SetValue(userid, user);
    	 UserActions.SetValue(password, pass);
    	 UserActions.Click_JavaScript(logon);
    	 UserActions.Wait_Sec();
    	if( d.findElement(NoSecurity).isDisplayed())
    	{
    		UserActions.click(NoSecurity);
    	}
    	 Boolean flag = d.getCurrentUrl().contains("client");
    	 String SelectClient_Page = d.getCurrentUrl();

		return new SelectCompany(d);
    	 
     }
}
