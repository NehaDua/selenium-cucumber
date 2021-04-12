package com.pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.UserActions;

import base.TestSetup;

public class SubscriberSearch extends TestSetup {
	
	
	public WebDriver d;
	
	
	public SubscriberSearch(WebDriver d)
	{
		this.d = d;
	}
	
	public final By subscribe = By.xpath(p.getProperty("ClickSubscriber_locator"));
	public final By SubFirstName = By.id(p.getProperty("SubFirstName_locator"));
	public final By seachResultTitle  = By.xpath(p.getProperty("SearchGrid_locator"));
	public final By subscriberRetrieve = By.id(p.getProperty("SubscriberRetrieve_locator"));
	public final By ErrorMessage = By.id(p.getProperty("SearchError_locator"));
	public final By PartialMatch =  By.id(p.getProperty("Partial_locator"));
	public final By dependent = By.id(p.getProperty("dependent_locator"));
	
	
	
	
	
	
	
	
	public void ClickSubscriber()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(subscribe);

		}
	
	public void EnterNameAndRetrieveSub(String FirstName)
	{
		UserActions.Wait_Sec();
		UserActions.SetValue(SubFirstName, FirstName);
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(subscriberRetrieve);
		
	}
	
	public void VerifySearchResultSub()
	{
		UserActions.Wait_Sec();
		String expectedSearchResultTitle = "Search Results";
		UserActions.Wait_Sec();
		assertEquals(UserActions.getText(seachResultTitle), expectedSearchResultTitle);
	}
	
	public void VerifySearchResultErrorSub()
	{
		UserActions.Wait_Sec();
		UserActions.getText(ErrorMessage);
		
		
	}
	
	public void ClickPartialMatchSub()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(PartialMatch);
		
		
	}
	
	public void RetrievePartialMatchSub()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(subscriberRetrieve);
	}
	
	public void VerifyPartialMatchResultSub()
	{
		
		UserActions.Wait_Sec();
		String expectedSearchResult = "Search Results";
		UserActions.Wait_Sec();
		assertEquals(UserActions.getText(seachResultTitle), expectedSearchResult);
		
	}
	
	public void VerifyPartialSearchErrorSub()
	{
		UserActions.Wait_Sec();
		UserActions.getText(ErrorMessage);
		
	}
	
	public void ClickOnDependent()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(dependent);
	}
	
	public void RetrieveExactMatchOfDep()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(subscriberRetrieve);
	}
	
	public void VerifyExactSearchResultofDep()
	{
		UserActions.Wait_Sec();
		String expectedResult = "Search Results";
		UserActions.Wait_Sec();
		assertEquals(UserActions.getText(seachResultTitle), expectedResult);
	}
	
	public void VerifyExactSearchErrorDep()
	{
		UserActions.Wait_Sec();
		UserActions.getText(ErrorMessage);
		
	}
	
	public void ClickOnPartialMatchDep()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(PartialMatch);
		
	}
	
	public void RetrievePartialMatchOfDep()
	{
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(subscriberRetrieve);
	}
	
	public void VerifyPartialSearchResultofDep()
	{
		UserActions.Wait_Sec();
		String expected = "Search Results";
		UserActions.Wait_Sec();
		assertEquals(UserActions.getText(seachResultTitle), expected);
	}
	
	public void VerifyPartialSearchErrorDep()
	{
		UserActions.Wait_Sec();
		UserActions.getText(ErrorMessage);
		
	}
	
	

}
