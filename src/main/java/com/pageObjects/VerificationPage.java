package com.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.utility.UserActions;

import base.TestSetup;
import cucumber.api.Scenario;

public class VerificationPage extends TestSetup {

	public VerificationPage (WebDriver d) 
	{
		this.d = d;

	}
	   

  	public final By verfication = By.xpath(p.getProperty("verfication_locator"));
   	public final By gridSelect = By.xpath(p.getProperty("gridSelect_locator"));
   	public final By gridEdit = By.xpath(p.getProperty("gridEdit_locator"));
   	public final By cancelButton = By.id(p.getProperty("cancelButton_locator"));
  	public final By checklistSetup = By.linkText(p.getProperty("checklistSetup_locator"));
   	public final By checklist1 = By.id(p.getProperty("checklist1_locator"));
   	public final By checklist2 = By.id(p.getProperty("checklist2_locator"));
    public final By checklist3 = By.id(p.getProperty("checklist3_locator"));
    public final By grid11Chklist = By.id(p.getProperty("grid1Chklist1_locator"));
    public final By grid12Chklist = By.id(p.getProperty("grid1Chklist2_locator"));
    public final By grid13Chklist = By.id(p.getProperty("grid1Chklist3_locator"));
    public final By grid2Chklist = By.id(p.getProperty("grid2Chklist_locator"));
	public final By letterSetup = By.linkText(p.getProperty("letterSetup_locator"));
	public final By gridLettersetup = By.id(p.getProperty("gridLettersetup_locator"));
	public final By VerificationLIstPdf = By.xpath(p.getProperty("verficationpdf_locator"));
	
	
	public void click_and_verify_verications_page() {

		UserActions.Click_JavaScript(verfication);
		UserActions.Wait_Sec();
		if (UserActions.getElement(gridSelect).isDisplayed()) {
			Assert.assertTrue(true);
			scenario.write("Navigation to Verifications page verified successfully");
		} else {
			Assert.assertFalse(false);
			scenario.write("Navigation to Verifications page could not be verified");
		}

	}

	public void click_select_and_edit_button() {
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(gridSelect);
		scenario.write("Select link clicked on Verifications Page successfully");
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(gridEdit);
		scenario.write("Edit link clicked on Verifications Page successfully");
		UserActions.Wait_Sec();
        
	}
	
	public boolean verify_window_presence_status() {
		return UserActions.getElement(cancelButton).isDisplayed();
        
	}
	
	public void click_cancel_button_of_window() {
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(cancelButton);
		UserActions.Wait_Sec();

    }
	
	public void click_checklist_setup_link() {
	 UserActions.Click_JavaScript(checklistSetup);
	}
	
	public void verifies_grids_on_Checklist_setup_page() {
		
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(checklist1);
		scenario.write("Checklist1 clicked successfully.");
		UserActions.Wait_Sec();
		if(UserActions.getElement(grid11Chklist).isDisplayed()==true & UserActions.getElement(grid2Chklist).isDisplayed()==true) {
			scenario.write("Grid1 and Grid2 on Checklist1 populated successfully.");
		} 
		else {
			scenario.write("Grid1 and Grid2 on Checklist1 not populated successfully.");
		}
		
		UserActions.Wait_Sec();
        UserActions.Click_JavaScript(checklist2);
		scenario.write("Checklist2 clicked successfully.");
		UserActions.Wait_Sec();
		if(UserActions.getElement(grid12Chklist).isDisplayed()==true & UserActions.getElement(grid2Chklist).isDisplayed()==true) {
			scenario.write("Grid1 and Grid2 on Checklist2 populated successfully.");
		} 
		else {
			scenario.write("Grid1 and Grid2 on Checklist2 not populated successfully.");
		}
		UserActions.Wait_Sec();
        UserActions.Click_JavaScript(checklist3);
		scenario.write("Checklist3 Clicked successfully.");
		UserActions.Wait_Sec();
        if(UserActions.getElement(grid13Chklist).isDisplayed() & UserActions.getElement(grid2Chklist).isDisplayed()) {
			scenario.write("Grid1 and Grid2 on Checklist3 populated successfully.");
		} 
		else {
			scenario.write("Grid1 and Grid2 on Checklist3 not populated successfully.");
		}
	}

	public void click_letter_setup_and_verify_grid() {
		
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(letterSetup);
		scenario.write("Letter setup tab clicked successfully.");
		UserActions.Wait_Sec();
		if(UserActions.getElement(gridLettersetup).isDisplayed()) {
		   scenario.write("Grid on Letter Setup page populated successfully.");
		}else {
		   scenario.write("Grid on Letter Setup page not populated.");
		}

    }
	
	/*Meenakhsi verificatio list pdf preview function*/
	public void OpenAndCloseVerificationPreviewList()
	{	           
		UserActions.Wait_Sec();
		UserActions.Wait_Sec();
		JavascriptExecutor executor = (JavascriptExecutor)d;
		executor.executeScript("arguments[0].click();",d.findElement(VerificationLIstPdf));
		UserActions.Wait_Sec();
		UserActions.Wait_Sec();
	    UserActions.SelectWindow();                 
	}

	
}
