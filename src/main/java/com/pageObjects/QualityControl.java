package com.pageObjects;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.UserActions;

import base.TestSetup;

public class QualityControl extends TestSetup{

	public WebDriver d;
	public QualityControl(WebDriver d) {
		this.d = d;
	}

	public final By qualityConrol = By.xpath(p.getProperty("QualityControl_locator"));
    public final By status = By.xpath(p.getProperty("Status_locator"));
    public final By fromDate = By.xpath(p.getProperty("QualityFromDate_locator"));
    public final By filter= By.xpath(p.getProperty("Filter_locator"));
    public final By searchResult = By.xpath(p.getProperty("QualityResult_locator"));
	
    
    
    public void QualityControlClick()
    {
       UserActions.Click_JavaScript(qualityConrol);
    }
                     
	public void EnterRetrieveDetails(String From)
	{
	      UserActions.Wait_Sec();
	      UserActions.SelectValue(status,"All");
	      UserActions.Wait_Sec();
	      UserActions.SetValue(fromDate,From);
	}
	         
	public void RetrieveQualityDetails()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(filter);
	}
	public void VerifySearchResultonQualityControlPage()
	{
		UserActions.Wait_Sec();
		String expectedSearchResultTitle = "ScanID";
		UserActions.Wait_Sec();
		Assert.assertEquals(UserActions.getText(searchResult), expectedSearchResultTitle);
	}
}
