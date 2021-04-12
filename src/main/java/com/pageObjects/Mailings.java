package com.pageObjects;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.utility.UserActions;

import base.TestSetup;

public class Mailings extends TestSetup {
	
	
	
	public WebDriver d;
	
	
	public Mailings (WebDriver d) {
		this.d = d;

	}
	public final By mails = By.xpath(p.getProperty("Mail_locator"));
	public final By subscribeids = By.id(p.getProperty("Mailings_SubscriberID_locator"));
	public final By mailingRetrieve = By.xpath(p.getProperty("Mailings_Retrieve_locator"));
	public final By mailingverify = By.xpath(p.getProperty("Mailing_Result_locator"));

	public final By mailpdf = By.xpath(p.getProperty("pdf_mail"));
	public final By mailvndr= By.xpath(p.getProperty("mailvendor_button"));
	public final By mailing_goback_locator = By.xpath(p.getProperty("mailing_goback_locator"));
	
	
public void ClickMailings()
{
	UserActions.Click_JavaScript(mails);
	
	}

public void Entersubscriberid(String subids)
{
	UserActions.Wait_Sec();
	UserActions.SetValue(subscribeids,subids);
}
public void RetrieveMailings()
{
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(mailingRetrieve);
	
}
public void GetSearchResultonMailingPage()
{
    UserActions.Wait_Sec();
	
	//String malfd = "Mailing Search Results";
	//assertEquals(UserActions.getText(mailingverify), malfd);
   UserActions.getText(mailingverify);
}
public void OpensAndClosemailpdf()
{
	
	           
UserActions.Wait_Sec();			   		    		  
//JavascriptExecutor executor = (JavascriptExecutor)d;
//executor.executeScript("arguments[0].click();",d.findElement(mailpdf));
UserActions.Click_JavaScript(mailpdf);
UserActions.Wait_Sec();	
UserActions.SelectWindow();    				
                
} 
public void clkmailVendor()
{
UserActions.Wait_Sec();
UserActions.Click_JavaScript(mailvndr);
UserActions.Wait_Sec();
UserActions.Wait_Sec();
UserActions.Wait_Sec();
UserActions.Click_JavaScript(mailing_goback_locator);
}
}