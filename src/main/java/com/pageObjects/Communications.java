package com.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.UserActions;

import base.TestSetup;

public class Communications extends TestSetup {
	
	
	public WebDriver d;
	
	
	public Communications(WebDriver d)
	{
		this.d = d;
	}
	
	public final By communication = By.xpath(p.getProperty("Communications_locator"));
	public final By verifyCommunication = By.xpath(p.getProperty("VerifyCommunication_locator"));
	public final By edit = By.xpath(p.getProperty("Edit_locator"));
	public final By AdditionalOptions = By.id(p.getProperty("AdditionalOptions_locator"));
	public final By close = By.id(p.getProperty("Close_locator"));
	public final By pdf = By.id(p.getProperty("PdfPreview_locator"));
	public final By html = By.id(p.getProperty("HtmlPreview_locator"));
	public final By issues = By.id(p.getProperty("Communication_Issues_locator"));
	public final By emails = By.id(p.getProperty("Emails_locator"));
	public final By sms = By.id(p.getProperty("Sms_locator"));
	public final By verifyTab = By.xpath(p.getProperty("VerifyTabs_locator"));
	public final By VerifyIssue_locator = By.xpath(p.getProperty("VerifyIssue_locator"));
	
	
	public void ClickCommunicationAndVerify()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(communication);
		String expected = "Currently Configured Letters";
		UserActions.Wait_Sec();
		Assert.assertEquals(expected, UserActions.getText(verifyCommunication));
		
		
	}
	
	
	public void ClickEdit()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(edit);
		
	}
	
	public void ClickAdditionalOptionsAndClose()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(AdditionalOptions);
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(close);
		
	}
	
	public void ClickPdfPreviewAndClose()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(pdf);
		UserActions.Wait_Sec();
		UserActions.SelectWindow();
		
	}
	
	public void ClickHtmlPreviewAndClose()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(html);
		UserActions.Wait_Sec();
		UserActions.SelectWindow();
		
	}
	
	public void ClickIssueTabAndVerify()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(issues);
		String IssueTitle = "Edit Issue";
		UserActions.Wait_Sec();
		Assert.assertEquals(IssueTitle, UserActions.getText(VerifyIssue_locator));
		
	}
	
	
	public void ClickEmailTabAndVerify()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(emails);
		String EmailTitle = "Currently Configured Emails";
		UserActions.Wait_Sec();
		Assert.assertEquals(EmailTitle, UserActions.getText(verifyTab));
		
		
	}
	
	public void ClickSMSTabAndVerify()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(sms);
		String SMSTitle= "Currently Configured SMS";
		UserActions.Wait_Sec();
		Assert.assertEquals(SMSTitle, UserActions.getText(verifyTab));
		
		
	}
	
	
	

}
