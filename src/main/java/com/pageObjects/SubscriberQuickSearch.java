package com.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.UserActions;

import base.TestSetup;

public class SubscriberQuickSearch extends TestSetup {
	
	
	public WebDriver d;
	
	
	public SubscriberQuickSearch (WebDriver d) {
		this.d = d;

	}
	
	public final By ReceivedDocument = By.xpath(p.getProperty("DocumentReceived_locator"));
	public final By MailPrep = By.id(p.getProperty("MailPrep_locator"));
	public final By RecordInfo = By.id(p.getProperty("SearchRecordInfo_locator"));
	public final By QuickSearchPage = By.xpath(p.getProperty("QuickSearch_locator"));
	public final By FN = By.id(p.getProperty("SearchByFirstName_locator"));
	public final By LN = By.id(p.getProperty("SearchByLastName_locator"));
	public final By PartialSearch = By.id(p.getProperty("PartialSearch_locator"));
	public final By AdvanceSearch = By.id(p.getProperty("AdvanceSearch_locator"));
	public final By ExactSearch = By.id(p.getProperty("ExactSearch_locator"));
	public final By RetrieveButton = By.id(p.getProperty("RetrieveSub_locator"));
	public final By GridResultSub = By.xpath(p.getProperty("GetGridResultSub_locator"));
	public final By GridResultDep = By.xpath(p.getProperty("GetGridResultDep_locator"));
	public final By Dep = By.id(p.getProperty("DependantRadio_locator"));
	public final By Grid = By.xpath(p.getProperty("verifyGridResult_locator"));
	public final By Error = By.id(p.getProperty("ErrorMsg_locator"));
    public final By ProcessedFile=By.xpath(p.getProperty("Processed_File"));
    public final By ScanQueBt=By.xpath(p.getProperty("Scan_Queue_btn"));
	public final By ScanDat=By.xpath(p.getProperty("Scan_date"));
	public final By ClntSelct=By.xpath(p.getProperty("Client_select"));
	public final By RtrvBt=By.xpath(p.getProperty("Retrieve_bt"));	
	public final By resltscan=By.xpath(p.getProperty("Result_dis"));	
	public final By viewpdf=By.xpath(p.getProperty("View_pdflocator"));
	
	
	/* Meenakhsi locators start */
	public final By faxqueue=By.xpath(p.getProperty("Fax_queue_locator"));
	public final By faxprocessed=By.xpath(p.getProperty("Fax_queue_processed"));
	public final By faxDate=By.xpath(p.getProperty("Faxdate_locator"));
	public final By faxRtrvBt=By.xpath(p.getProperty("Faxbutton_locator"));	
	public final By resltfax=By.xpath(p.getProperty("FaxResult_locator"));	
	public final By OpenFaxPdf = By.xpath(p.getProperty("FaxPDFOpen_locator"));
	/* Meenakhsi locators end */
	
	
	public void ClickReceivedDocument()
	{
		//UserActions.SetObjectSyncronizationTimeOut();
		UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(ReceivedDocument);
	}
	
	public void ClickMailPrep()
	{
		//UserActions.SetObjectSyncronizationTimeOut();
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(MailPrep);
	}
	
	public void ClickRecordInfo()
	{
		//UserActions.SetObjectSyncronizationTimeOut();
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(RecordInfo);
	}
	
	public void VerifyQuickSearchPage()
	{
		//UserActions.SetObjectSyncronizationTimeOut();
		UserActions.Wait_Sec();
		String expected = "Quick Search";
		UserActions.Wait_Sec();
		String Actual = UserActions.getText(QuickSearchPage);
		Assert.assertEquals(expected,Actual);
		//UserActions.RefreshBrowser();
	}
	
	public void RetrieveSubscriber_ExactMatch(String FirstName)
	{
		//UserActions.SetObjectSyncronizationTimeOut();
		UserActions.Wait_Sec();
		UserActions.SetValue(FN, FirstName);
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(RetrieveButton);
		
	}
	
	public void GetGridResult_Sub()
	{
		//UserActions.SetObjectSyncronizationTimeOut();
		UserActions.Wait_Sec();
	    UserActions.getText(GridResultSub);
		//UserActions.GetElementText(GridResultSub);
	}
	
	
	public void GetGridError()
	{
		//UserActions.SetObjectSyncronizationTimeOut();
		UserActions.Wait_Sec();
		UserActions.getText(Error);
	}
	
	public void RetrieveSubscriber_PartialMatch()
	{
		//UserActions.SetObjectSyncronizationTimeOut();
		UserActions.Wait_Sec();
		UserActions.click(PartialSearch);
		UserActions.Click_JavaScript(RetrieveButton);
		UserActions.Wait_Sec();
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(FN);
		UserActions.Wait_Sec();
		UserActions.Wait_Sec();
		UserActions.SetValueClear(FN);
		
	}
	
    public void ClickDepRadioButton()
    {
    	//UserActions.SetObjectSyncronizationTimeOut();
    	UserActions.Wait_Sec();
    	UserActions.Click_JavaScript(Dep);
    }
    
    public void ClickExactMatch_Dep()
    {
    	//UserActions.SetObjectSyncronizationTimeOut();
    	UserActions.Wait_Sec();
    	UserActions.click(ExactSearch);
    }
    
    public void RetrieveDependent_ExactMatch(String LastName)
    {
    	//UserActions.SetObjectSyncronizationTimeOut();
    	UserActions.Wait_Sec();
    	UserActions.SetValue(LN, LastName);
    	UserActions.Wait_Sec();
    	UserActions.Click_JavaScript(RetrieveButton);
    }
    
    public void GetGridResult_Dep()
    {
    	//UserActions.SetObjectSyncronizationTimeOut();
    	UserActions.Wait_Sec();
    	UserActions.getText(GridResultDep);
    	
    }
    
    public void RetrieveDependent_PartialMatch()
    {
    	//UserActions.SetObjectSyncronizationTimeOut();
    	UserActions.click(PartialSearch);
    	UserActions.Wait_Sec();
    	UserActions.Click_JavaScript(RetrieveButton);
    }
    
    public void ClickScanQueue()
	{
		//UserActions.SetObjectSyncronizationTimeOut();
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(ScanQueBt);
	}  
   public void EnterScanQueuDetail(String ScanDate)
   {
	   UserActions.Wait_Sec();
	   UserActions.SelectValue(ProcessedFile,"All");
	   UserActions.Wait_Sec();
   	UserActions.SetValue(ScanDat, ScanDate);
    UserActions.Wait_Sec();
    UserActions.SelectValue(ClntSelct,"zKarenH's Client");
    UserActions.Wait_Sec();   
   }
   public void RetrveScan()
   {
   UserActions.Wait_Sec();
   UserActions.Click_JavaScript(RtrvBt);
   }
   public void GetScanQueueResult()
   {
       UserActions.Wait_Sec();
   	
      UserActions.getText(resltscan);
      UserActions.Wait_Sec();
   }  
   
   /* Meenakshi fax queue code */
   
   public void FaxQueueClick()
   {
      UserActions.Click_JavaScript(faxqueue);
   }
                    
	public void Enterdetails(String From)
	{
	      UserActions.Wait_Sec();
	      UserActions.SelectValue(faxprocessed,"All");
	      UserActions.Wait_Sec();
	      UserActions.SetValue(faxDate,From);
	}
	         
	public void RetrieveFaxQueue()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(faxRtrvBt);
	}
	public void VerifySearchResultonFaxqueue()
	{
		UserActions.Wait_Sec();
		String expectedSearchResultTitle = "SubID";
		UserActions.Wait_Sec();
		Assert.assertEquals(UserActions.getText(resltfax), expectedSearchResultTitle);
	}

	public void OpenAndCloseFaxPDF()
	{	           
		UserActions.Wait_Sec();			   		    		  
		//JavascriptExecutor executor = (JavascriptExecutor)d;
		//executor.executeScript("arguments[0].click();",d.findElement(OpenFaxPdf));
		UserActions.Click_JavaScript(OpenFaxPdf);
		UserActions.Wait_Sec();	
	    UserActions.SelectWindow();                 
	}
	/* Meenakshi fax queue code end */
   

public void OpensAndCloseAllPDF()
	{
		
		           
    UserActions.Wait_Sec();			   		    		  
	//JavascriptExecutor executor = (JavascriptExecutor)d;
	//executor.executeScript("arguments[0].click();",d.findElement(viewpdf));
    UserActions.Click_JavaScript(viewpdf);
    UserActions.Wait_Sec();	
    UserActions.SelectWindow();    				
	                
	}    

}
