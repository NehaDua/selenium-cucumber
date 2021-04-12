package com.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.utility.UserActions;

import base.TestSetup;

public class DependentTypesPage extends TestSetup {

	public DependentTypesPage(WebDriver d) {
		this.d = d;

	}

	/* Author: Pawan Dubey */
	public final By depType = By.xpath(p.getProperty("depType_locator"));
	public final By addLink = By.xpath(p.getProperty("addLink_locator"));
	public final By detailType = By.xpath(p.getProperty("detailType_locator"));
	public final By gridIntableRows = By.xpath(p.getProperty("gridIntableRows_locators"));
	public final By saveButton = By.id(p.getProperty("saveButton_locator"));
	public final By bottomDateDiv = By.id(p.getProperty("bottomDateDivID_locator"));
	public final By previewButton = By.id(p.getProperty("previewButton_locator"));
	public final By deppdf = By.xpath(p.getProperty("deptype_pdf"));

	public static String lastRow1 = p.getProperty("lastRow1_locator");
	public static String lastCol2 = p.getProperty("lastCol2_locator");
	public static String detailtype;

	public static int sizebefore;
	public static int sizeafter;

	public void click_and_verify_dep_types_page() {

		UserActions.Click_JavaScript(depType);
		UserActions.Wait_Sec();
		UserActions.Wait_Sec();
		if (UserActions.getElement(detailType).isDisplayed()) {
			Assert.assertTrue(true);
			scenario.write("Navigation to Dependent Types page verified successfully");
		} else {
			Assert.assertFalse(false);
			scenario.write("Navigation to Dependent Types page could not be verified");
		}

	}

	public void click_add_button() {
		UserActions.Wait_Sec();
		sizebefore = UserActions.GetElementsSize(gridIntableRows);
		UserActions.Wait_Sec();
		detailtype = UserActions.getText(detailType);
		scenario.write(detailtype + " is to be added to allowed dep type grid");
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(addLink);
		UserActions.Wait_Sec();

	}

	public void verify_addition_to_allowed_dep_type_grid() {

		sizeafter = UserActions.GetElementsSize(gridIntableRows);

		if (sizeafter == sizebefore) {
			scenario.write(detailtype + " added to allowed dependent type grid successfully.");
		} else {
			scenario.write(detailtype + " not added to allowed dependent type grid.");

		}
	}

	public void remove_from_allowed_dep_type_grid() {

		String xpathexp = lastRow1 + sizeafter + lastCol2;
		UserActions.click_by_xpath(xpathexp);
		scenario.write(detailtype + " clicked to remove from allowed dep grid successfully.");
		UserActions.Wait_Sec();
	}

	public void verify_removal_from_allowed_dep_type_grid() {

		int rowcount = UserActions.GetElementsSize(gridIntableRows);

		if (rowcount == sizebefore) {
			scenario.write(detailtype + " removed from allowed dependent type grid successfully.");
		} else {
			scenario.write(detailtype + " not removed from allowed dependent type grid.");

		}

	}

	public void verify_addition_back_to_dep_not_allowed_grid() {
		if (UserActions.getElement(detailType).isDisplayed()) {
			scenario.write(detailtype + " added back to not allowed dependent type grid successfully.");
		} else {
			scenario.write(detailtype + " not added to not allowed dependent type grid.");

		}

	}

	public void verify_preview_button_functionality() {
		UserActions.Wait_Sec();
		UserActions.Wait_Sec();
		//UserActions.Click_JavaScript(previewButton);
	}

	public void click_save_and_verify_latest_update_text() {
		UserActions.Wait_Sec();
		UserActions.Click_JavaScript(saveButton);
		UserActions.Wait_Sec();
		scenario.write(UserActions.getText(bottomDateDiv));

	}
	public void OpensAndClosedeppdf()
	{
		
		           
	UserActions.Wait_Sec();		
	UserActions.Wait_Sec();
	//JavascriptExecutor executor = (JavascriptExecutor)d;
	//executor.executeScript("arguments[0].click();",d.findElement(deppdf));
	UserActions.Click_JavaScript(deppdf);
	UserActions.Wait_Sec();
	UserActions.Wait_Sec();
	UserActions.SelectWindow();    				
	                
	} 

}
