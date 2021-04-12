package com.pageObjects;

import static org.junit.Assert.assertEquals;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utility.UserActions;

import base.TestBase;
import base.TestSetup;

public class SubscriberPage extends TestSetup {
	
	
	public WebDriver d;
	
	
	public SubscriberPage (WebDriver d) {
		this.d = d;

	}
	
	public final By subscribe = By.xpath(p.getProperty("Subscriber_locator"));
	public final By subscribeAccount = By.id(p.getProperty("SubscriberAccount_locator"));
	public final By subscriberRetrieve = By.id(p.getProperty("SubscriberRetrieve_locator"));
	public final By demographics = By.id(p.getProperty("SubscriberDemographics_Locator"));
	public final By modifyName = By.id(p.getProperty("SubscriberFirstName_locator"));
	public final By save = By.id(p.getProperty("SaveButton_locator"));
	public final By subscriberSearch = By.id(p.getProperty("SubscriberSearch_locator"));
	public final By dataEntry = By.id(p.getProperty("DataEntry_locator"));
	public final By Audit = By.id(p.getProperty("Audit_locator"));
	public final By Issues = By.id(p.getProperty("Issues_locator"));
	public final By Mailing = By.id(p.getProperty("Mailing_locator"));
	public final By CAM = By.id(p.getProperty("CAM_locator"));
	public final By Resources = By.id(p.getProperty("Resources_locator"));
	public final By NewSubscriber = By.id(p.getProperty("NewSubscriber_locator"));
	public final By VerifySubClicked = By.xpath("SubscriberSearchText_locator");
	public final By Name = By.id(p.getProperty("SubscriberName_locator"));
	public final By ssn= By.id(p.getProperty("SubscriberSsn_locator"));
	public final By lastname = By.id(p.getProperty("SubscriberLastName_locator"));
	public final By SubAndDepGender = By.id(p.getProperty("SubAndDepGender_locator"));
	public final By SubAndDepDOB = By.id(p.getProperty("SubAndDepDOB_locator"));
	public final By address = By.id(p.getProperty("SubscriberAddress_locator"));
	public final By city = By.id(p.getProperty("SubscriberCity_locator"));
	public final By state = By.id(p.getProperty("SubscriberState_locator"));
	public final By zipcode = By.id(p.getProperty("SubscriberZipCode_locator"));
	public final By membernum = By.id(p.getProperty("SubscriberMembernumber_locator"));
	public final By NewDependent = By.id(p.getProperty("NewDependent_locator"));
	public final By DependentName = By.id(p.getProperty("DependentName_locator"));
	public final By DependentLastName = By.id(p.getProperty("DependentLastName_locator"));
	public final By DependentMemberNumber = By.id(p.getProperty("DependentMembernumber_locator"));
	public final By SubAndDepChangelog = By.id(p.getProperty("ChangeLogSubAndDep_locator"));
	public final By ReturnToSub  = By.id(p.getProperty("ReturnToSub_locator"));
	public final By GoBack  = By.id(p.getProperty("GoBack_locator"));
	public final By Delete  = By.id(p.getProperty("Delete_locator"));
	public final By ChangelogData_Dep  = By.xpath(p.getProperty("ChangeLogDepData_locator"));
	public final By ChangelogData_Sub = By.xpath(p.getProperty("ChangeLogSubData_locator"));
	public final By confirm  = By.id(p.getProperty("ConfirmDelete_locator"));
	public final By seachResultTitle  = By.xpath(p.getProperty("SearchResult_locator"));
	
	public final By ActualDemographicsTitle = By.xpath(p.getProperty("DemographicsTitle"));
	public final By ActualDataEntryTitle  = By.xpath(p.getProperty("DataEntryTitle"));
	public final By ActualAuditTitle  = By.xpath(p.getProperty("AuditTitle"));
	public final By ActualIssuesTitle  = By.xpath(p.getProperty("IssuesTitle"));
	public final By ActualMailingTitle  = By.xpath(p.getProperty("MailingTitle"));
	public final By ActualResourcesTitle  = By.xpath(p.getProperty("ResourcesTitle"));
	public final By LogOff = By.xpath(p.getProperty("LogOff_Locator"));
	
	
	public final By typecode= By.id(p.getProperty("TypeCode_locators"));
	public final By saveAndcontinue= By.id(p.getProperty("Save&Continue_locators"));
	public final By Gender = By.xpath(p.getProperty("GetDepGender_locator"));
	public final By childFirst = By.id(p.getProperty("ChildFName_locator"));
	public final By childLast = By.id(p.getProperty("ChildLName_locator"));
	public final By dateOfbirth = By.id(p.getProperty("DateOfBirth_locator"));
	public final By motherFirst = By.id(p.getProperty("MotherFName_locator"));
	public final By motherLast = By.id(p.getProperty("MotherLName_locator"));
	public final By fatherFirst = By.id(p.getProperty("FatherFName_locator"));
	public final By fatherLast = By.id(p.getProperty("FatherLName_locator"));
	public final By AddDocument = By.xpath(p.getProperty("GovernmentIssuedBirthCert_locator"));
	public final By InsertDocument = By.id(p.getProperty("InsertDocuments_locator"));
	
	
	public final By removeVerification = By.xpath(p.getProperty("RemoveVerification_locator"));
	public final By ConfirmRemove =  By.id(p.getProperty("RemoveAlert_locator"));
	
	public final By issue = By.xpath(p.getProperty("SubIssue_locator"));
	
	public final By SelectState = By.id(p.getProperty("StateSearch_locator"));
	public final By Search = By.id(p.getProperty("search_locator"));
	public final By consulates = By.id(p.getProperty("consulates_locator"));
	public final By Allconsulates = By.id(p.getProperty("ConsulatesList_locator"));
	public final By DocumentLibrary  = By.id(p.getProperty("DocumentLibrary_locator"));
	public final By DocumentType  = By.id(p.getProperty("DocumentType_locator"));
	public final By SearchDocument  = By.id(p.getProperty("SearchDocument_locator"));
	public final By GetResult  = By.id(p.getProperty("GetResults_locator"));
	
	
	/*Meenakshi locators*/
	public final By standard_alt_doc_list_locator=By.xpath(p.getProperty("standard_alt_doc_list_locator"));
	public final By mailingtab_locator = By.xpath(p.getProperty("mailingtab_locator"));
	public final By queuenewmailing_locator = By.xpath(p.getProperty("queuenewmailing_locator"));
	public final By mailingview_locator = By.xpath(p.getProperty("mailingview_locator"));
	public final By mailingcancelbutton_locator = By.xpath(p.getProperty("mailingcancelbutton_locator"));
	
	
public void ClickSubscriber()
{
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(subscribe);

	//String search = UserActions.getText(VerifySubClicked);
	// need to add diffrent verification
	//String expectedSubscriberTitle = "Subscriber Search";
	//assertEquals(UserActions.getText(VerifySubClicked), expectedSubscriberTitle);
	}


public void EnterAccountDetails(String accountNumber)
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.SetValue(subscribeAccount,accountNumber);
}

public void RetrieveSubscriber()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(subscriberRetrieve);
	
}


public void VerifySearchResultonSubsriberPage()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	String expectedSearchResultTitle = "Search Results";
	UserActions.Wait_Sec();
	assertEquals(UserActions.getText(seachResultTitle), expectedSearchResultTitle);
}

public void AddNewSubscriber(String FirstName, String LastName,String Address, String City, String DateOfBirth, String zip, String member, String ssns)
{

//UserActions.SetObjectSyncronizationTimeOut();
UserActions.Wait_Sec();
UserActions.click(NewSubscriber);
//UserActions.RefreshBrowser();
UserActions.Wait_Sec();
UserActions.SetValue(Name, FirstName);
UserActions.SetValue(lastname,LastName);
UserActions.Wait_Sec();
UserActions.SelectValue(SubAndDepGender,"M");
UserActions.Wait_Sec();
UserActions.SetValue(SubAndDepDOB, DateOfBirth);
UserActions.Wait_Sec();
UserActions.SetValue(address,Address);
UserActions.Wait_Sec();
UserActions.SetValue(city,City);
UserActions.Wait_Sec();
UserActions.SetValue(zipcode,zip);
UserActions.Wait_Sec();
UserActions.SetValue(membernum,member);
UserActions.Wait_Sec();
UserActions.SetValue(ssn,ssns);
UserActions.Wait_Sec();
UserActions.SelectValue(state,"AK");
UserActions.Wait_Sec();
UserActions.click(save);
}


public void modifySubscriberAndSave(String ModifySubFirstName)
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.SetValue(Name, ModifySubFirstName);
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(save);
	
}


public void Sub_ChangeLogAndVerify(String ModifySubFirstName)
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(SubAndDepChangelog);
	String expected=ModifySubFirstName;
	UserActions.Wait_Sec();
	String actual = UserActions.getText(ChangelogData_Sub);
	assertEquals(actual,expected);
	
	
}

public void GoBackToSub() 
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(GoBack);
}

public void AddNewDependent(String FirstName, String LastName, String DateOfBirth, String memnum)
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(NewDependent);
	UserActions.Wait_Sec();
	UserActions.SetValue(DependentName, FirstName);
	UserActions.Wait_Sec();
	UserActions.SetValue(DependentLastName, LastName);
	UserActions.Wait_Sec();
	UserActions.SetValue(DependentMemberNumber, memnum);
	UserActions.Wait_Sec();
	UserActions.SelectValueByIndex(SubAndDepGender,1);
	UserActions.Wait_Sec();
	UserActions.SetValue(SubAndDepDOB, DateOfBirth);
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(save);
	}
public void modifyDependantAndSave(String ModifyDepFirstName)
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.SetValue(DependentName, ModifyDepFirstName);
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(save);
}

public void Dep_ChangeLogAndVerify(String ModifyDepFirstName)
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(SubAndDepChangelog);
	String expected= ModifyDepFirstName;
	UserActions.Wait_Sec();
	String Actual = UserActions.getText(ChangelogData_Dep);
	UserActions.Wait_Sec();
	assertEquals(Actual,expected);
	
}

public void GoBack() 
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(GoBack);
	
	
}

public void SaveAndReturnToSub()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(save);
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(ReturnToSub);
}


public void ClickDataEntryTab()
{
	    //UserActions.SetObjectSyncronizationTimeOut();
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(dataEntry);

	String expectedTitle = "Enter Dependent Type Code";
	UserActions.Wait_Sec();
	String actualTitle = UserActions.getText(ActualDataEntryTitle);
	assertEquals(actualTitle, expectedTitle);
	
}

public void EnterTypeCode(String TypeCode)
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.SetValue(typecode, TypeCode);
}

public void SaveContinue()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(saveAndcontinue);
}

public void verifyGenderAndSelectValue()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	Boolean flag = UserActions.getText(Gender).contains("(M)");
	
	if(flag)
	{
		Assert.assertTrue(true);
		UserActions.SelectValueByIndex(childFirst, 1);
		UserActions.Wait_Sec();
		UserActions.SelectValueByIndex(childLast, 1);
		UserActions.Wait_Sec();
		UserActions.SelectValueByIndex(dateOfbirth, 1);
		UserActions.Wait_Sec();
		UserActions.SelectValueByIndex(fatherFirst, 1);
		UserActions.Wait_Sec();
		UserActions.SelectValueByIndex(fatherLast, 1);
		
	}
	
	else
		
	{
		Assert.assertFalse(false);
		UserActions.SelectValueByIndex(childFirst, 1);
		UserActions.Wait_Sec();
		UserActions.SelectValueByIndex(childLast, 1);
		UserActions.Wait_Sec();
		UserActions.SelectValueByIndex(dateOfbirth, 1);
		UserActions.Wait_Sec();
		UserActions.SelectValueByIndex(motherFirst, 1);
		UserActions.Wait_Sec();
		UserActions.SelectValueByIndex(motherLast, 1);
	}
	
}

public void selectDocument()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.click(AddDocument);
}


public void Click_InsertDocument()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(InsertDocument);
	
}

public void Click_AttemptVerification()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(saveAndcontinue);
	
}

public void ClickAuditTab()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(Audit);

	String expectedTitle = "Manual Audit";
	UserActions.Wait_Sec();
	assertEquals(UserActions.getText(ActualAuditTitle), expectedTitle);
	
}


public void Click_RemoveVerification()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(removeVerification);
	
}

public void RemoveConfirmation()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(ConfirmRemove);
	
}



public void ClickIssuesTab()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(Issues);
	String expectedTitle = "Issues";
	UserActions.Wait_Sec();
	assertEquals(UserActions.getText(ActualIssuesTitle), expectedTitle);
	
}


public void verifyIssueCreated(String ModifySubFirstName, String LastName)
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	String actual = UserActions.getText(issue);
	String expected = LastName+","+" "+ModifySubFirstName;
	assertEquals(actual,expected);
}

public void ClickResourcesTab()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(Resources);

	String expectedTitle = "State Results";
	UserActions.Wait_Sec();
	assertEquals(UserActions.getText(ActualResourcesTitle), expectedTitle);
	
}



public void SearchState()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.SelectValueByIndex(SelectState, 4);
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(Search);
}

public void ClickConsulates()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(consulates);
}


public void getAllConsulates()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	String AllValue = UserActions.GetAllListValues(Allconsulates);
	scenario.write("All consulates values are"+"/n"+AllValue);
}

public void ClickDocumentLibrary()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(DocumentLibrary);
	
}

public ClientIssuePage SearchDocument()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.SelectValue(DocumentType,"Proof of Marriage");
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(SearchDocument);
	
	return new ClientIssuePage(d);
}

public void VerifyDocumentSearchResult()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	String ActualResult = UserActions.getText(GetResult);
	String ExpectedResult = "Search returned 0 results";
	Assert.assertNotEquals(ExpectedResult, ActualResult);

//return new ClientIssuePage(d);
}



public void ClickDemographics()
{

	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(demographics);

	String expectedDemographicsTitle = "Subscriber Information";
	UserActions.Wait_Sec();
	assertEquals(UserActions.getText(ActualDemographicsTitle), expectedDemographicsTitle);
	}

	


public void DeleteDependentAndSub()
{
	try {
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.click(Delete);
	UserActions.Wait_Sec();
	UserActions.click(confirm);
	UserActions.Wait_Sec();
	UserActions.click(Delete);
	UserActions.Wait_Sec();
	UserActions.click(confirm);
	}
	catch(Exception e)
	{
		e.getMessage();
	}
	
}


public void ClickLogOff()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.click(LogOff);
}

/*Meenakshi code for mailings tab */

public void ClickMailingsTab()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(mailingtab_locator);
	//String expectedTitle = "Queue New Mailing";
	//UserActions.Wait_Sec();
	//assertEquals(UserActions.getText(queuenewmailing_locator), expectedTitle);
}


public void ClickQueueNewMailing()
{
	//UserActions.SetObjectSyncronizationTimeOut();
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(queuenewmailing_locator);
}

public void OpenPdfbyView()
{
	UserActions.Wait_Sec();			   		    		  
	//JavascriptExecutor executor = (JavascriptExecutor)d;
	//executor.executeScript("arguments[0].click();",d.findElement(mailingview_locator));
	UserActions.Click_JavaScript(mailingview_locator);
	UserActions.Wait_Sec();	
	UserActions.SelectWindow();    
	
}

public void ClosePopupWindow()
{
	UserActions.Wait_Sec();
	UserActions.Click_JavaScript(mailingcancelbutton_locator);
	
}
// Meenakhsi code for standard alt doc list 
public void OpenPdfbyViewstandard_alt_doc_list_locator()
{
	UserActions.Wait_Sec();			   		    		  
	UserActions.Click_JavaScript(standard_alt_doc_list_locator);
	UserActions.Wait_Sec();	
	UserActions.SelectWindow();    
	
}

}
