package com.pageObjects;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.UserActions;

import base.TestSetup;

public class SelectPeriod extends TestSetup {
	
	
	
	public WebDriver d;
	
	
	public SelectPeriod (WebDriver d) {
		this.d = d;

	}
	
	public final By project = By.xpath(p.getProperty("SelectProjectBrazilPS_locator"));
	public final By StatisticsData = By.xpath(p.getProperty("StatisticsData_locator"));
	public final By ProjectPageTitle=By.xpath(p.getProperty("validateProjectPage"));
	public final By homeStatsTitle=By.xpath(p.getProperty("homeStatsPageText"));
	public final By OpenPdf = By.id(p.getProperty("Pdf_locator"));
	public Object KeyValue = null;
	

	
	
	public void VerifySelectPeriodPage()
	{

		
        UserActions.Wait_Sec();
		System.out.println("verifying project page");
		String expectedProjectPageTitle = "Select Project";
		UserActions.Wait_Sec();
		assertEquals(UserActions.GetText_JavaScript(ProjectPageTitle), expectedProjectPageTitle);
		}
	
		//need to verify
	
	public SubscriberPage SelectProject()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(project);
		//need to verify
		return new SubscriberPage(d);
	}
	
	
	public void verifyNavigateToHomePage()
	{
//		UserActions.Wait_Sec();
//		Boolean flag = UserActions.getCurrentUrl().contains("landing");
//		String Homepage_URL = UserActions.getCurrentUrl();
//		if(flag)
//		{
//		Assert.assertTrue(true);
//		//scenario.write("User is on home page"+"  "+Homepage_URL);
//		}
//		else
//		{
//			Assert.assertFalse(false);
//			Assert.fail();
//		}
		
	       UserActions.Wait_Sec();
		
		String expectedhomeStatsTitle = "Plan-Smart Statistics";
		assertEquals(UserActions.getText(homeStatsTitle), expectedhomeStatsTitle);
		
	}
	
	public void GetStatisticsData() throws Exception
	{
		String data = UserActions.getText(StatisticsData);
		scenario.write("statistics data is"+ "  "+data);		
							 
	}
	
	
	public void OpenAndCloseAllPDF()
	{
		
		           
    UserActions.Wait_Sec();			   		    		  
	//JavascriptExecutor executor = (JavascriptExecutor)d;
	//executor.executeScript("arguments[0].click();",d.findElement(OpenPdf));
    UserActions.Click_JavaScript(OpenPdf);
    UserActions.SelectWindow();    	
				
	                
	}

}
