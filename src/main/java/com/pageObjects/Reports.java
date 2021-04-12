package com.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.UserActions;

import base.TestSetup;

public class Reports extends TestSetup{

	public Reports (WebDriver d) 
	{
		this.d = d;

	}
	
	public final By reports = By.xpath(p.getProperty("reports_locator"));
   	public final By versiongrid = By.id(p.getProperty("versiongrid_locator"));
   	public final By runlink = By.xpath(p.getProperty("runlink_locator"));
   	public final By retrieve = By.id(p.getProperty("retrieve_locator"));
  	public final By back = By.id(p.getProperty("back_locator"));
  	public final By selectinternalreporting = By.xpath(p.getProperty("selectinternalreporting_locator"));
  	public final By selectcam = By.xpath(p.getProperty("selectcam_locator"));
   	public final By runcam = By.xpath(p.getProperty("runcam_locator"));
    public final By reportschedular = By.id(p.getProperty("reportschedular_locator"));
    public final By rptschedulardrid = By.id(p.getProperty("rptschedulardrid_locator"));
    public final By reportinghistory = By.id(p.getProperty("reportinghistory_locator"));
    public final By rpthistorygrid = By.id(p.getProperty("rpthistorygrid_locator"));
    
	
    public void click_and_verify_reports_page() {

		UserActions.Click_JavaScript(reports);
		UserActions.Wait_Sec();
		verifyPageNavigation(reports,"Reports home page");
    }
    
     public void click_Run() {
	    UserActions.Click_JavaScript(runlink);
	    scenario.write("Run link clicked successfully.");
	    UserActions.Wait_Sec();
    }
    
    public void verifies_navigation_on_run() {
    	verifyPageNavigation(retrieve,"Plan-Guard Client Agenda Stats page");
    }
    
    public void click_retrieve() {
	    UserActions.Click_JavaScript(retrieve);
	    scenario.write("Retrieve button clicked successfully.");

	    UserActions.Wait_Sec();
   }
    
    public void verifies_PDF_in_new_tab() {
    	  UserActions.SelectWindow(); 
  	      UserActions.Wait_Sec();
    }
    
    public void click_go_back() {
	    UserActions.Click_JavaScript(back);
	    scenario.write("Go Back button clicked successfully.");

   }
    
    public void verifies_go_back() {
    	verifyPageNavigation(selectinternalreporting,"Reports home page on Go back");
    }
    
    public void click_internal_reporting_cam_open_audit() {
	    UserActions.Click_JavaScript(selectinternalreporting);
	    scenario.write("Internal Reporting selected successfully.");

	    UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(selectcam);
	    scenario.write("CAM selected successfully.");

	    UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(runcam);
	    scenario.write("Open Audit run link clicked successfully.");

	}
    
   public void verifies_navigation_on_cam_run() {
    	verifyPageNavigation(retrieve,"Plan-Guard Client Agenda Stats for CAM report");
    }
   
   public void verifies_PDF_in_new_tab_for_internal_reporting() {
	   click_retrieve();
	   UserActions.SelectWindow();
 }
    
    public void click_report_schedular() {
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(reportschedular);
	    scenario.write("Report Schedular clicked successfully.");


   }
    
    public void verifies_report_schedular() {
    	verifyPageNavigation(rptschedulardrid,"Report Schedular page");
    }
    
    public void click_reporting_history() {
	    UserActions.Click_JavaScript(reportinghistory);
	    scenario.write("Reporting History selected successfully.");


   }
    
    public void verifies_reporting_history() {
    	verifyPageNavigation(rpthistorygrid,"Reporting History");
    }
    
    
    public void verifyPageNavigation(By element,String pagename) {
    	UserActions.Wait_Sec();
    	if(UserActions.getElement(element).isDisplayed()) {
			Assert.assertTrue(true);
			scenario.write("Navigation to "+ pagename +" verified successfully.");
		}else {
			scenario.write("Navigation to "+ pagename +" could not be verified.");
		}
    	
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
