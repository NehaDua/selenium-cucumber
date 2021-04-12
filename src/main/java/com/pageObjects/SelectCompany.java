package com.pageObjects;

import static org.junit.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.UserActions;

import base.TestBase;
import base.TestSetup;

public class SelectCompany extends TestSetup {
	
	
	 public WebDriver d;



	public final By client = By.xpath(p.getProperty("SelectBrazil_locator"));
	public final By ClientPageTitle = By.id(p.getProperty("validateClientPage"));
	
    
	
	
	public SelectCompany (WebDriver d) {
		this.d = d;

	
	}
	
	public SelectPeriod SelectClient()
	{
		UserActions.Wait_Sec();
		
		UserActions.Click_JavaScript(client);
		return new SelectPeriod(d);
		
	}
	
	
	
	public SelectPeriod VerifySelectClientPage()
	{
		UserActions.Wait_Sec();
		
		String expectedClientpageTitle = "Select Client";
		assertEquals(UserActions.getText(ClientPageTitle), expectedClientpageTitle);
		return new SelectPeriod(d);
		}
	
       
}
