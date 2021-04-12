package com.pageObjects;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.UserActions;

import base.TestSetup;

public class FileTransfer extends TestSetup {
	
	
	
	public WebDriver d;

	
	public FileTransfer (WebDriver d) 
	{
		this.d = d;

	}
	
    public final By filetr = By.xpath(p.getProperty("File_Tranfer_Locator"));
    public final By slclnt = By.id(p.getProperty("Selectclient_locator"));
    public final By frmdat = By.xpath(p.getProperty("selectFromsDate_locator"));
    public final By todat = By.xpath(p.getProperty("selectTosDate_locator"));
    public final By btnftr = By.id(p.getProperty("File-Transfer_Filter_Button_locator"));
    public final By ckloc = By.xpath(p.getProperty("File_Import_click_locator"));
    public final By rsltloc = By.xpath(p.getProperty("File_Transfer_Result_locator"));
    public final By imploc = By.xpath(p.getProperty("verify_import_click_locator"));
    
    public void ClickFileTransfer()
    {
       UserActions.Click_JavaScript(filetr);
   	   UserActions.Wait_Sec();
    }
    public void enterdetils(String Froms)
    {
    	UserActions.Wait_Sec();
    	UserActions.SelectValue(slclnt,"Accenture");
    	UserActions.Wait_Sec();
    	UserActions.SetValue(frmdat,Froms);
    	
//    	UserActions.Wait_Sec();
//    	
//    	UserActions.click(todat);
    	 
    	//UserActions.SetValue(todat,Tos);
    	
    	 }
    public void RetrieFiletransfer()
    {
    	UserActions.Wait_Sec();
    	UserActions.Click_JavaScript(btnftr);
    	
    }
    public void GetSearchResultonFileTrasnferPage()
    {
        UserActions.Wait_Sec();
    	
    	//String malfd = "Mailing Search Results";
    	//assertEquals(UserActions.getText(mailingverify), malfd);
        //String getresult = "Search Results";
    	//assertEquals(UserActions.getText(rsltloc), getresult);
        UserActions.getText(rsltloc);
    }
    public void ClickFileImport()
    {
    	UserActions.Wait_Sec();
       UserActions.Click_JavaScript(ckloc);
    }   
    public void GetSearchFileImport()
    {
        UserActions.Wait_Sec();
    	
       UserActions.getText(imploc);
       UserActions.Wait_Sec();
    }   
}
    