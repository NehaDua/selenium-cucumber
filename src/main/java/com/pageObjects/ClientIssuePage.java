

package com.pageObjects;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.UserActions;

import base.TestSetup;

public class ClientIssuePage extends TestSetup {
	
	
	
	public WebDriver d;

	
	public ClientIssuePage (WebDriver d) 
	{
		this.d = d;

	}

	
    public final By clientIssue = By.xpath(p.getProperty("ClientIssue_locator"));
    public final By clientName = By.xpath(p.getProperty("ClientName_locator"));
    public final By userName = By.xpath(p.getProperty("UserName_locator"));
    public final By fromDate = By.xpath(p.getProperty("FromDate_locator"));
    public final By toDate = By.xpath(p.getProperty("ToDateLocator"));
    public final By searchResultTitleCount = By.xpath(p.getProperty("ClientIssueSearchResult_locator"));
                      
    /* Author: Pawan Dubey */
   	//public final By issuelink = By.xpath(p.getProperty("ClientIssue_locator"));
   	public final By insertnewissue = By.id(p.getProperty("insertnewissue_locator"));
   	public final By issuetemplateCB = By.id(p.getProperty("issuetemplateCB_locator"));
   	public final By issueclient = By.id(p.getProperty("issueclient_locator"));
   	public final By template = By.id(p.getProperty("template_locator"));
   	public final By insertbutton = By.id(p.getProperty("insertbutton_locator"));
   	public final By datefrom = By.id(p.getProperty("datefrom_locator"));
   	public final By dateto = By.id(p.getProperty("dateto_locator"));
   	public final By selectlink = By.linkText(p.getProperty("selectlink_locator"));
   	public final By issueschedulertab = By.id(p.getProperty("issueschedulertab_locator"));
   	public final By issueeventstab = By.id(p.getProperty("issueeventstab_locator"));
   	public final By savebutton = By.id(p.getProperty("savebutton_locator"));
   	public final By issuetemplatetab = By.id(p.getProperty("issuetemplatetab_locator"));
   	public final By issuecattab = By.id(p.getProperty("issuecattab_locator"));
                         
   public void ClickClientISsue()
        {
           UserActions.Click_JavaScript(clientIssue);
        }
                         
   public void EnterRetrieveDetails(String From)
        {
          UserActions.Wait_Sec();
          UserActions.SelectValue(userName,"-Select-");
          UserActions.Wait_Sec();
          UserActions.SetValue(fromDate,From);
         // UserActions.SetValue_JavaScript(fromDate, From);
        
          UserActions.Wait_Sec();
          UserActions.click(toDate);
          //UserActions.SetValue(toDate,To);
         }
                         
    public void VerifySearchResultonClientIssuePage()
          {
             UserActions.Wait_Sec();
             //String ActualResult=UserActions.getText(searchResultTitleCount);
             //String expectedSearchResultTitleCount="(0 records)";
             //Assert.assertNotEquals(expectedSearchResultTitleCount,ActualResult);
             String expectedSearchResultTitle = "Created";
             assertEquals(UserActions.getText(searchResultTitleCount), expectedSearchResultTitle);
          }
    
 /*  Author: Pawan Dubey */
    
    public void click_and_verify_client_issue_page() {
		

		UserActions.Click_JavaScript(clientIssue);
		UserActions.Wait_Sec();
		String url = UserActions.getCurrentUrl();
		if (UserActions.getElement(insertnewissue).isDisplayed()) {
			Assert.assertTrue(true);
			scenario.write("Application url" + " " + url + " " + "verified for client issue page successfully");
		} else {
			Assert.assertFalse(false);
			scenario.write("Application url" + " " + url + " " + " not verified for client issue page successfully");

		}

	}

	public void insert_new_issue() {

		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(insertnewissue);
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(issuetemplateCB);
		UserActions.Wait_Sec();
		UserActions.SelectValueByIndex(template, 1);
		UserActions.Click_JavaScript(insertbutton);
		UserActions.Wait_Sec();
		UserActions.click(selectlink);
		scenario.write("Issue inserted successfully");
	}

	public void verify_issue_schedular_tab() {

		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(issueschedulertab);
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(savebutton);
		
	}
	
	public void verify_issue_events_tab() {

		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(issueeventstab);
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(savebutton);
		
	}
	
	public void verify_issue_templates_tab() {

		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(issuetemplatetab);
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(savebutton);
		
	}
	
	
	public void verify_template_catagories_tab() {

		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(issuecattab);
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(savebutton);
		
	}
}


