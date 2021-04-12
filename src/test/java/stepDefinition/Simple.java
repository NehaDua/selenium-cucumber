package stepDefinition;





import com.pageObjects.AdminPage;
import com.pageObjects.ClientIssuePage;
import com.pageObjects.Communications;
import com.pageObjects.DependentTypesPage;
import com.pageObjects.FileTransfer;
import com.pageObjects.Login_AdminPortal;
import com.pageObjects.Mailings;
import com.pageObjects.QualityControl;
import com.pageObjects.Reports;
import com.pageObjects.SubscriberQuickSearch;
import com.pageObjects.SubscriberSearch;
import com.pageObjects.VerificationPage;
import com.utility.UserActions;
import base.TestBase;
import base.TestSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Simple extends TestSetup {
	
	
	
	

	
	@Given("^Plan Smart Administrative Portal Login Screen$")
	public void plan_Smart_Administrative_Portal_Login_Screen() throws Exception
	{
		  try {
			  TestBase.loadProperty();
			  TestBase.setWebdriver();
			  Login_Admin = new Login_AdminPortal(d);
			  //Login_Admin.GetAppUrl();
			  scenario.write("Application launched successfully.");
			  
			  }
			  catch(Exception e)
			  {
				  throw new Exception("User is successfully redirect to the Plan Smart Administrative Portal Login Screen. See below error message for more details."+"\n"+toString());
				 //scenario.write("Application is not loaded. See below error message for more details."+"\n"+toString());
			  } 
		
	}
	  
	@Then("^Verify url of Plan Smart Administrative Portal Login Screen$")
	public void verify_url_of_Plan_Smart_Administrative_Portal_Login_Screen() throws Exception
	{
		  try {
			  Login_Admin = new Login_AdminPortal(d);
			  Login_Admin.VerifyUrl();
		      }
			  catch(Exception e)
			  {
				  //scenario.write("Application URL verification is not successfull.See below message for more details."+"\n"+e.toString());
				  throw new Exception("User is not redirected to the Plan Smart Administrative Portal Login Screen.See below message for more details."+"\n"+e.toString());
			  }	
	
	}
	    
	  @Given("^\"([^\"]*)\" \"([^\"]*)\" and login button$")
	  public void and_login_button(String username , String password) throws Exception
	  {
	
		  try {
			
			Login_Admin = new Login_AdminPortal(d);
			sc =Login_Admin.login(username,password);
			 scenario.write("user logged in  and successfully redirected to select company page");
	    	
	          }
	      catch(Exception e)
		  {
	    	  //scenario.write("Application is not logged in.See below message for more details."+"\n"+e.toString());
	    	  throw new Exception("Application is not logged in.See below message for more details."+"\n"+e.toString());
		  }
	  }
	  
	  
  @Given("^User is on selectClient Page$")
	  public void user_is_on_selectClient_Page() throws Exception {
		  try {
				 sp = sc.VerifySelectClientPage();
				 scenario.write("System successfully redirected the user to Select Company page displaying a list of all clients.");
			     }
			     catch(Exception e){
			    	 throw new Exception("System doesn not redirected the user to Select Company page displaying a list of all clients.See below message for more details."+"\n"+e.toString());
	  }
	  }
	  
	  
	 @When("^Select clientName$")
	 public void select_clientName() throws Exception {
	     try {
		 sp = sc.SelectClient();
		 scenario.write("Client selected successfully from select client page.");
	     }
	     catch(Exception e){
	    	 
	    	//scenario.write("Unable to select client.See below message for more details."+"\n"+e.toString());
	    	 throw new Exception("Unable to select client.See below message for more details."+"\n"+e.toString());
	     }
		 
	 }
	 
	 @Then("^Verify select period page$")
	 public void Verify_select_period_page() throws Exception
	 {
		 try {
		 sp.VerifySelectPeriodPage();
		scenario.write("System is navigated successfully to the Select Period screen");
		 }
		 catch(Exception e)
		 {
			 //scenario.write("Select period page verification is unsuccessfull.See below message for more details."+"\n"+e.toString());
			 throw new Exception("Select period page verification is unsuccessfull.See below message for more details."+"\n"+e.toString());
		 }
	 }
	 
	 @When("^Select ProjectName$")
	 public void select_ProjectName() throws Exception
	 {
		 try {
	     sup = sp.SelectProject();
	     scenario.write("Project selected successfully from select period page");
	   
		 }
		 catch(Exception e)
		 {
			// scenario.write("Project is not selected successfully.See below message for more details."+"\n"+e.toString());
			 throw new Exception("Project is not selected successfully.See below message for more details."+"\n"+e.toString());
			
		 }
	    
	 }
	 
	 @Then("^verify home stats page selectedClient$")
	 public void verify_home_stats_page_selectedClient() throws Exception 
	 {
		 try {
		 sp.verifyNavigateToHomePage();
		 scenario.write("System is navigated successfully to the Home stats page of the selected client");
		 }
		 catch(Exception e)
		 {
			 //scenario.write("Home page verification is not successfull.See below message for more details"+"\n"+e.toString());
			 throw new Exception("System is not navigated to the Home stats page of the selected client.See below message for more details"+"\n"+e.toString());
		 }
	 }
	 
	 @Then("^Get statistics data from home page$")
	 public void GetData() throws Exception
	 {
		 try {
		 sp.GetStatisticsData();
		 
		 
		 scenario.write("Statistics data fetched successfully");
		 }
		 catch(Exception e){
			 //scenario.write("Unable to get data.See below message for more details."+"\n"+e.toString());
			 throw new Exception("Unable to fetch Statistics data.See below message for more details."+"\n"+e.toString());
		 }
		 
	 }
	 
	 
	 @Then("^Open pdf and close it$")
	 public void open_pdf_and_close_it() throws Exception {
		 
		 try {
			 
			 sp.OpenAndCloseAllPDF();
		 }
		 
		 catch(Exception e)
		 {
			 
			 throw new Exception("Unable to open PDF.See below message for more details."+"\n"+e.toString());  
		 }   
	 } 
	 
	 

	 @Then("^click and verify  subscriber menu$")
	 public void click_and_verify_subscriber_menu() throws Exception {
	 
		 try {
	     sup.ClickSubscriber();
	     scenario.write("System successfully redirected to Subscriber - Search screen");
		 }
		 catch(Exception e)
		 {
			// scenario.write("Unable to click on Subscriber.See below message for more details."+"\n"+e.toString());
			 throw new Exception("System does not redirected to Subscriber - Search screen.See below message for more details."+"\n"+e.toString());
		 }
	   
	 }
	 
	// Meenakshi code for standard alt doc list
	 @Then("^click on standard alt doc list to open pdf$")
	 public void click_on_standard_alt_doc_list_to_open_pdf() throws Exception {
 try {
			 
			 sup.OpenPdfbyViewstandard_alt_doc_list_locator();
		 }
		 
		 catch(Exception e)
		 {
			 
			 throw new Exception("Unable to open standard alt doc list PDF.See below message for more details."+"\n"+e.toString());  
		 }   
	     
	 }
// end of meenakshi code 
	 
	 
	 @Then("^search subscriber using \"([^\"]*)\"$")
	 public void search_subscriber_using(String AccountNumber) throws Exception
	 {
		 try {
	     sup.EnterAccountDetails(AccountNumber);
	     scenario.write("Subscriber account number entered successfully.");
	    
		 }
		 catch(Exception e)
		 {
			//scenario.write(e.toString());
			 throw new Exception("Unable to enter account number.See below message."+"\n"+e.toString());
			 
		 }
	     
	 }
	 
	 @Then("^click on retrieve button$")
	 public void click_on_retrieve_button() throws Exception
     {
	    try {
		 sup.RetrieveSubscriber();
		 scenario.write("Retrieve button is clicked successfully.");
//		 sup.ClickDemographics();
//		 scenario.write("Demographics button clicked successfully");
//		 
	    }
	    catch(Exception e)
	    {
	    	//scenario.write(e.toString());
	    	throw new Exception("Unable to click retrieve button.See below message."+"\n"+e.toString());
	    }
	     
	 }
	 
	 
	 
	 @Then("^verify search results are displayed$")
	 public void verify_search_results_are_displayed() throws Exception {
		 try{
			 
			 sup.VerifySearchResultonSubsriberPage();
			 scenario.write("Search results are displayed successfully.");

	     // Write code here that turns the phrase above into concrete actions
	 } catch(Exception e)
		    {
		    	//scenario.write(e.toString());
		    	throw new Exception("Search results are not displayed.See below message."+"\n"+e.toString());
		    }	 
		 }

	 
	 @Then("^add new subscriber using \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	 public void add_new_subscriber_using(String FirstName, String LastName, String Address, String City, String DateOfBirth, String zip, String member, String ssns) throws Exception
	 {
	 	try {
	 	//UserActions.RefreshBrowser();
	 	sup.AddNewSubscriber(FirstName, LastName, Address, City, DateOfBirth, zip, member, ssns );
	 	scenario.write("New subscriber added successfully.");
	 	}
	 	catch(Exception e)
	 	{
	 		//scenario.write(e.toString());
	 		throw new Exception("Unable to add new subscriber.See below message."+"\n"+e.toString());
	 	}
	     
	 }
	 
	 @Then("^modify sub \"([^\"]*)\"  and save$")
	 public void modify_sub_and_save(String ModifySubFirstName) throws Throwable {
		 try {
	    sup.modifySubscriberAndSave(ModifySubFirstName);
	    scenario.write("subscriber first name modified successfully");
		 }
		 catch(Exception e)
		 {
	     throw new Exception("Unable to modify subscriber first name.See below message."+"\n"+e.toString());
		 }
	 }
	 
	 @Then("^click on sub view changelog and Verify \"([^\"]*)\"$")
	 public void click_on_sub_view_changelog_and_Verify(String ModifySubFirstName) throws Throwable {
       try {
       sup.Sub_ChangeLogAndVerify(ModifySubFirstName);
       scenario.write("Successfully clicked and verified changelog of subscriber");
       }
       catch(Exception e)
       {
	     throw new Exception("unable to view and verify sub changelog.See below message."+"\n"+e.toString());
       }
	 }
	 
	 @Then("^click on GoBack button to return$")
	 public void click_on_GoBack_button_to_return() throws Throwable {
	     try {
	    	 sup.GoBackToSub();
	    	 scenario.write("Successfully clicked on GoBack button");
	     }
	     catch(Exception e)
	     {
	    	 throw new Exception("unable to click on go back button.See below message."+"\n"+e.toString());
	     }
	    		 
	 }
	 
	 	  

     @Then("^add new dependent using \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	 public void add_new_dependent_using(String FirstName, String LastName, String DateOfBirth, String memnum) throws Exception
	 {
	 	try {
	        sup.AddNewDependent(FirstName, LastName, DateOfBirth, memnum);
	        scenario.write("New dependant added successfully.");
	 	}
	 	catch(Exception e)
	 	{
	 		throw new Exception("Unable to add new dependant.See below message."+"\n"+e.toString());
	 	}	
	 	
	 } 

	 @Then("^modify dep \"([^\"]*)\" and save$")
	 public void modify_dep_and_save(String ModifyDepFirstName) throws Throwable {
	     try {
		 sup.modifyDependantAndSave(ModifyDepFirstName);
		 scenario.write("Dependant first name modified successfully");
	     }
	     catch(Exception e)
	     {
	    	 throw new Exception("Unable to modify dependant first name.See below message."+"\n"+e.toString());
	     }
	 }

	 @Then("^click on dep view changelog and Verify\"([^\"]*)\"$")
	 public void click_on_dep_view_changelog_and_Verify(String ModifyDepFirstName) throws Throwable {
	     try {
	    	 sup.Dep_ChangeLogAndVerify(ModifyDepFirstName);
	    	 scenario.write("Successfully clicked and verified dependant first name");
	     }
	     catch(Exception e)
	     {
	    	 throw new Exception("unable to view and verify dep changelog.See below message."+"\n"+e.toString());
	     }
	 }
	 

	 @Then("^click on GoBack button$")
	 public void click_on_GoBack_button() throws Throwable {
	     try {
	    	 sup.GoBack();
	    	 scenario.write("Go back button clicked successfully");
	     }
	     catch(Exception e)
	     {
	    	 throw new Exception("unable to click on Go back button.See below message."+"\n"+e.toString());
	     }
	 }

	 @Then("^click on save and return to subscriber button$")
	 public void click_on_save_and_return_to_subscriber_button() throws Throwable {
	     try {
	    	 sup.SaveAndReturnToSub();
	    	 scenario.write("Successfully saved and clicked on return to subscriber.");
	     }
	     catch(Exception e)
	     {
	    	 throw new Exception("Unable to save and return to subscriber.See below message."+"\n"+e.toString()); 
	     }
	    
	 }
	 
	 @Then("^click and verify  DataEntry tab$")
	 public void click_and_verify_DataEntry_tab() throws Throwable {
		 try {
		     sup.ClickDataEntryTab();
		     scenario.write("DataEntry tab has been opened without any error");
			 }
			 catch(Exception e)
			 {
				// scenario.write("Unable to click on Subscriber.See below message for more details."+"\n"+e.toString());
				 throw new Exception("Something went wrong with DataEntry tab.See below message for more details."+"\n"+e.toString());
			 }
	 }  
	 
	 
	 @Then("^write typecode \"([^\"]*)\" in dependant type code$")
	 public void write_typecode_in_dependant_type_code(String TypeCode) throws Throwable {
	     
		 try {
			 sup.EnterTypeCode(TypeCode);
			 scenario.write("Type code entered successfully");
		 }
		 catch(Exception e)
		 {
			 throw new Exception("Unable to enter type code.See below message for more details."+"\n"+e.toString());
		 }
	     
	 }

	 @Then("^Click on save and continue$")
	 public void click_on_save_and_continue() throws Throwable {
	     try {
	    	 sup.SaveContinue();
	    	 scenario.write("Successfully clicked on save and continue");
	     }
	     catch(Exception e)
	     {
	    	 throw new Exception("Unable to click on save and continue.See below message for more details."+"\n"+e.toString()); 
	     }
	  
	 }
	 
	 @Then("^insert document$")
	 public void insert_document() throws Throwable {
	  try {
		  sup.selectDocument();
		  scenario.write("document selected successfully.");
	  }
	  catch(Exception e)
	  {
		  throw new Exception("Unable to select document.See below message for more details."+"\n"+e.toString());
	  }
	 } 
	 
	 @Then("^Click on insert documents button$")
	 public void click_on_insert_documents_button() throws Throwable {
	  try {
		  sup.Click_InsertDocument();
		  scenario.write("insert document button clicked successfully");
	  }
	  catch(Exception e)
	  {
		  throw new Exception("Unable to click on insert document button.See below message for more details."+"\n"+e.toString());
	  }
	 } 
	 
	 
	 
	 @Then("^verify the dependant gender and select child first name,child last name,date of birth,father first name,father last name if dependant is male\\.If female then select child first name, child last name, date of birth, mother first name,mother last name$")
	 public void verify_the_dependant_gender_and_select_child_first_name_child_last_name_date_of_birth_father_first_name_father_last_name_if_dependant_is_male_If_female_then_select_child_first_name_child_last_name_date_of_birth_mother_first_name_mother_last_name() throws Throwable
	 {
	     try {
	    	 sup.verifyGenderAndSelectValue();
	    	 scenario.write("Gender verified successfully and corresponding data selected from dropdown.");
	     }
	     catch(Exception e){
	    	 throw new Exception("Unable to verify gender and data are not selected from dropdown.See below message for more details."+"\n"+e.toString()); 
	     }
	    
	 } 

	 @Then("^click on attempt verification$")
	 public void click_on_attempt_verification() throws Throwable {
	  
		 try {
			 sup.Click_AttemptVerification();
			 scenario.write("Successfully clicked on attempt verification");
		 }
		 catch(Exception e)
		 {
			 throw new Exception("Unable to click on attempt verification.See below message for more details."+"\n"+e.toString());  
		 }
	 }


	 @Then("^click and verify  Audit tab$")
	 public void click_and_verify_Audit_tab() throws Throwable {
		 try {
		     sup.ClickAuditTab();
		     scenario.write("Audit tab has been opened without any error");
			 }
			 catch(Exception e)
			 {
				// scenario.write("Unable to click on Subscriber.See below message for more details."+"\n"+e.toString());
				 throw new Exception("Something went wrong with Audit tab.See below message for more details."+"\n"+e.toString());
			 }
	 }
	 
	 
	 @Then("^click on the cross icon to remove verification for the dependent$")
	 public void click_on_the_cross_icon_to_remove_verification_for_the_dependent() throws Throwable {
	     try {
	    	 sup.Click_RemoveVerification();
	    	 scenario.write("Successfully clicked on the cross icon.");
	     }
	     catch(Exception e)
	     {
	    	 throw new Exception("Unable to click on the cross icon.See below message for more details."+"\n"+e.toString());
	     }
	 }
	 

	 @Then("^click on yes from remove verification dialog$")
	 public void click_on_yes_from_remove_verification_dialog() throws Throwable {
	  try {
		  sup.RemoveConfirmation();
		  scenario.write("Successfully clicked on yes");
	  }
	  
	  catch(Exception e)
	  {
		  throw new Exception("Yes is not clicked.See below message for more details."+"\n"+e.toString());  
	  }
	 }
	 
	 @Then("^click and verify Issues tab$")
	 public void click_and_verify_Issues_tab() throws Throwable {
		 try {
		     sup.ClickIssuesTab();
		     scenario.write("Issues tab has been opened without any error");
			 }
			 catch(Exception e)
			 {
				 throw new Exception("Something went wrong with Issues tab.See below message for more details."+"\n"+e.toString());
			 }
	 }
	 
	 @Then("^verify that issue is created \"([^\"]*)\" \"([^\"]*)\"$")
	 public void verify_that_issue_is_created(String ModifySubFirstName, String LastName) throws Throwable {
	     
		 try {
			 sup.verifyIssueCreated(ModifySubFirstName, LastName);
			 scenario.write("created issue verified successfully.");
		 }
		 catch(Exception e)
		 {
			 throw new Exception("Something went wrong in verifying issue.See below message for more details."+"\n"+e.toString());
		 }
		 
	 }
	 
	 // Meenakshi code for subscriber mailings tab start 
	 
	 @Then("^click and verify  subscriber mailings tab$")
	 public void click_and_verify_subscriber_mailings_tab() throws Exception {

		 try {
			 sup.ClickMailingsTab();
			 scenario.write("mailings tab clicked and verified successfully.");
		 }
		 catch(Exception e)
		 {
			 throw new Exception("Something went wrong in mailings tab.See below message for more details."+"\n"+e.toString());
		 }
	 }

	 @Then("^click on queue new mailings button$")
	 public void click_on_queue_new_mailings_button() throws Exception {
		 try {
			 sup.ClickQueueNewMailing();
			 scenario.write("Queue new mailings button clicked successfully.");
		 }
		 catch(Exception e)
		 {
			 throw new Exception("Something went wrong in clicking on queue new button.See below message for more details."+"\n"+e.toString());
		 }
	     
	 }

	 @Then("^open and close view mailings link$")
	 public void open_and_close_view_mailings_link() throws Exception {
		 try {
			 sup.OpenPdfbyView();
			 scenario.write("PDF opened successfully");
		 }
		 catch(Exception e)
		 {
			 throw new Exception("Something went wrong in opening up pdf.See below message for more details."+"\n"+e.toString());
		 }
	 }

	 @Then("^close the pop up$")
	 public void close_the_pop_up() throws Exception {
		 try {
			 sup.ClosePopupWindow();
			 scenario.write("popup closed successfully");
		 }
		 catch(Exception e)
		 {
			 throw new Exception("Something went wrong in closing window.See below message for more details."+"\n"+e.toString());
		 }
	 }

	  //Meenakshi code for subscriber mailings tab end 
	 
	 
	 @Then("^click and verify Resources tab$")
	 public void click_and_verify_Resources_tab() throws Throwable {
		 try {
		     sup.ClickResourcesTab();
		     scenario.write("Resouces tab has been opened without any error");
			 }
			 catch(Exception e)
			 {
				 throw new Exception("Something went wrong with Resouces tab.See below message for more details."+"\n"+e.toString());
			 }
	
	 }

	 @Then("^select and search state$")
	 public void select_and_search_state() throws Throwable {
		 try {
	     sup.SearchState();
	     scenario.write("state searched successfully");
		 }
		 catch(Exception e)
		 {
			 throw new Exception("Unable to search state.See below message for more details."+"\n"+e.toString()); 
		 }
	 }

	 @Then("^click on consulates$")
	 public void click_on_consulates() throws Throwable {
	    try {
	    	sup.ClickConsulates();
	    }
	    catch(Exception e)
	    {
	    	throw new Exception("Unable to click consulates.See below message for more details."+"\n"+e.toString()); 
	    }
	 }

	 @Then("^get all the consulates values from the list$")
	 public void get_all_the_consulates_values_from_the_list() throws Throwable {
	    try {
	    	sup.getAllConsulates();
	    	scenario.write("All consulates values are fetched successfully");
	    }
	    catch(Exception e)
	    {
	    	throw new Exception("Unable to get all consulates.See below message for more details."+"\n"+e.toString()); 
	    }
	 }

	 @Then("^click on document library$")
	 public void click_on_document_library() throws Throwable {
	 try {
		 sup.ClickDocumentLibrary();
		 scenario.write("Successfully clicked on document library");
	 }
	 catch(Exception e)
	 {
		 throw new Exception("Unable to click on document library.See below message for more details."+"\n"+e.toString());  
	 }
	 }

	 @Then("^select document type and search$")
	 public void select_document_type_and_search() throws Throwable {
          try {
        	  sup.SearchDocument();
        	  scenario.write("Document searched successfully");
          }
          
          catch(Exception e)
          {
        	  throw new Exception("Unable to search document. See below message for more details."+"\n"+e.toString());  
          }

	 }

	 @Then("^Verify returned search results$")
	 public void verify_returned_search_results() throws Throwable {
	    try {
	    	sup.VerifyDocumentSearchResult();
	    	scenario.write("Search result verified successfully");
	    }
	    catch(Exception e)
	    {
	    	throw new Exception("Zero results found for this document type. See below message for more details."+"\n"+e.toString());  
	    }
	 }
	
	
	 // Start of MEENAKSHI Issue Tab

	 @When("^click and verify Client Issues Menu$")
	 public void click_and_verify_Client_Issues_Menu() throws Exception {
	        try {
	            cip = new ClientIssuePage(d);
	        	cip.ClickClientISsue();
	        scenario.write("System successfully redirected to client Issue tab- Search screen");
	     }
	     catch(Exception e) {
	        throw new Exception("System does not redirected to client issue tab - Search screen.See below message for more details."+"\n"+e.toString());
	     }
	     //throw new PendingException();
	 }
	 
	 
	 
	 @Then("^search using \"([^\"]*)\"$")
	 public void search_using(String From) throws Exception {
		 
               try {
             UserActions.Wait_Sec();
             UserActions.Wait_Sec();
			 cip.EnterRetrieveDetails(From);
		     scenario.write("Details has been enetered successfully");
		            
		          }
		      catch(Exception e){
		         throw new Exception("Unable to enter details.See below message."+"\n"+e.toString());
		         }
	     
	 }


	 @Then("^verify search result are displayed$")
	 public void verify_search_result_are_displayed() throws Exception {
	        try {
	        	cip.VerifySearchResultonClientIssuePage();
	        scenario.write("Data fetched successfully.");
	     }
	     catch(Exception e) {
	        throw new Exception("Unable to click retrieve button.See below message."+"\n"+e.toString());
	     }
	     //throw new PendingException();
	 }
	 // End of meenakshi issue tab  
	 
   //Author:  Pawan Dubey  
	 @Given("^User is on issue Page$")
		 public void user_is_on_issue_Page() throws Throwable {
		 	try{
		 		cip=new ClientIssuePage(d);
		 		cip.click_and_verify_client_issue_page();
		 		scenario.write("User redirected to Client issue page successfully.");
		 	}catch(Exception e){
		 		throw new Exception("Client issue page not appeared on click of Client Issue"+"\n"+e.toString());
		 	   }
		 }

		 @When("^user insert a new issue$")
		 public void user_insert_a_new_issue() throws Throwable {
		     try{
			 	cip.insert_new_issue();
		     	scenario.write("issue inserted and verified successfully.");
		     }catch(Exception e)
		 	     {
		     	throw new Exception("User failed to insert and verify issue. Something went wrong."+"\n"+e.toString());
		 		 }
		 }


		 @Then("^user clicks issue schedular tab and verifies the navigation$")
		 public void user_clicks_issue_schedular_tab_and_verifies_the_navigation() throws Throwable {
		 	   try{

		 			cip.verify_issue_schedular_tab();
		 			scenario.write("User verified issue schedular tab successfully.");

		 	    }catch(Exception e)
		 		     {
		 				 throw new Exception("Issue schedular tab failed to navigate"+"\n"+e.toString());
		 			 }
		 }

		 @Then("^user clicks issue events tab and verifies the navigation$")
		 public void user_clicks_issue_events_tab_and_verifies_the_navigation() throws Throwable {
		 	try{

		 		cip.verify_issue_events_tab();
		 		scenario.write("User verified issue event tab successfully.");

		     }catch(Exception e)
		 	     {
		 			 throw new Exception("Issue event tab failed to navigate"+"\n"+e.toString());
		 		 }
		 }

		 @Then("^user clicks issue templates tab and verifies the navigation$")
		 public void user_clicks_issue_templates_tab_and_verifies_the_navigation() throws Throwable {
		 	try{

		 		cip.verify_issue_templates_tab();
		 		scenario.write("User verified issue templates tab successfully.");

		     }catch(Exception e)
		 	     {
		 			 throw new Exception("Issue templates tab failed to navigate"+"\n"+e.toString());
		 		 }
		 }

		 @Then("^user clicks template catagories tab and verifies the navigation$")
		 public void user_clicks_template_catagories_tab_and_verifies_the_navigation() throws Throwable {
		 	try{

		 		cip.verify_template_catagories_tab();
		 		scenario.write("User verified template catagories tab successfully.");

		     }catch(Exception e)
		 	     {
		 			 throw new Exception("Template catagories tab failed to navigate"+"\n"+e.toString());
		 		 }
		 }
		 
		 //Author: Pawan DUbey

		 @Given("^user is on verification page$")
		 public void user_is_on_verification_page() throws Throwable {
		     try {
		 	 vrp=new VerificationPage(d);
		      vrp.click_and_verify_verications_page();
		     } catch (Exception e) {
		     	throw new Exception("Vavigation to Verifications page could not be verified. Something went wrong" + "\n" + e.toString());
		 	}
		 }

		 @Then("^user clicks select and then edit$")
		 public void user_clicks_select_and_then_edit() throws Throwable {
		     try {
		 		 vrp.click_select_and_edit_button();
		 	    } catch (Exception e) {
		 	    	throw new Exception("Either Select or Edit Link could not be clicked. Something went wrong" + "\n" + e.toString());
		 		}
		 }

		 @Then("^user verifies appeared window$")
		 public void user_verifies_appeared_window() throws Throwable {
		   
		        try {
		 	   boolean status=vrp.verify_window_presence_status();
		 	   if(status) {
		 		   scenario.write("Window on click of Edit link on Verifications page populated successfully.");
		 	   }
		 	    } catch (Exception e) {
		 	    	throw new Exception("Window on click of Edit link on Verifications page could not be populated. Something went wrong." + "\n" + e.toString());
		 		}
		 }

		 @Then("^user clicks cancel button of window$")
		 public void user_clicks_cancel_button_of_window() throws Throwable {
		   
		 		try {
		 			vrp.click_cancel_button_of_window();
		 			scenario.write("Cancel button of window clicked successfully.");
		 		} catch (Exception e) {
		 			throw new Exception("Cancel button of window could not be clicked. Something went wrong."+ "\n" + e.toString());
		 		}
		 	}

		 	 //Meenakshi code for verification list pdf preview
		 @Then("^user click on verification list pdf preview and close it$")
		 public void user_click_on_verification_list_pdf_preview_and_close_it() throws Exception{
			 try {
				 
				 vrp.OpenAndCloseVerificationPreviewList();
			 }
			 
			 catch(Exception e)
			 {
				 
				 throw new Exception("Unable to open PDF.See below message for more details."+"\n"+e.toString());  
			 }   
		     
		 }

		  //Meenakshi code for verification list pdf preview ends
		 @Then("^user clicks Checklist Setup link of top options$")
		 public void user_clicks_Checklist_Setup_link_of_top_options() throws Throwable {
		 	try {
		 		vrp.click_checklist_setup_link();
		 		scenario.write("Checklist Setup tab clicked successfully.");
		 	} catch (Exception e) {
		 		throw new Exception("Checklist Setup tab could not be clicked. Something went wrong."+ "\n" + e.toString());
		 	}	
		    
		 }

		 @Then("^user verifies grids on Checklist setup page$")
		 public void user_verifies_grids_on_Checklist_setup_page() throws Throwable {
		 	
		 	try {
		 		vrp.verifies_grids_on_Checklist_setup_page();;
		 	} catch (Exception e) {
		 		throw new Exception("Grids on Checklist Setup page could not be verfied. Something went wrong."+ "\n" + e.toString());
		 	}
		    
		 }

		 @Then("^user clicks on Letter Setup link and verifies grid$")
		 public void user_clicks_on_Letter_Setup_link_and_verifies_grid() throws Throwable {
		 	try {
		 		vrp.click_letter_setup_and_verify_grid();
		 	} catch (Exception e) {
		 		throw new Exception("Either Letter setup not clicked or its grid could be be populated. Something went wrong."+ "\n" + e.toString());
		 	}
		 }		 
		 
//ABHISHEK BHAMBRI MAILING TAB CODE
	 
	 @When("^click and verify  Mailings menu$")
	 public void click_and_verify_Mailings_menu() throws Throwable {
		 try {
		    mal = new Mailings(d);
			 mal.ClickMailings();
		     scenario.write("Mailing tab has been opened without any error");
			 }
			 catch(Exception e)
			 {
				// scenario.write("Unable to click on Subscriber.See below message for more details."+"\n"+e.toString());
				 throw new Exception("Something went wrong with Mailing tab.See below message for more details."+"\n"+e.toString());
			 }
	 }


@Then("^search subscriberids using \"([^\"]*)\"$")
public void search_subscriberids_using(String subids) throws Throwable {
	try {
	     mal.Entersubscriberid(subids);
	     scenario.write("Subscriber account number entered successfully.");
	    
	 	 }
	 	 catch(Exception e)
	 	 {
	 		//scenario.write(e.toString());
	 		 throw new Exception("Unable to enter account number.See below message."+"\n"+e.toString());
	 		 
	 	 }
}

	 @Then("^click on Retrieve Mailings button$")
	 public void click_on_Retrieve_Mailings_button() throws Throwable {
	 	try {
	 		 mal.RetrieveMailings();
	 		 scenario.write("Retrieve button is clicked successfully.");
	 	 
	 	    }
	 	    catch(Exception e)
	 	    {
	 	    	//scenario.write(e.toString());
	 	    	throw new Exception("Unable to click retrieve button.See below message."+"\n"+e.toString());
	 	    }
	 }

	 @Then("^verify mailing search results are displayed$")
	 public void verify_mailing_search_results_are_displayed() throws Exception {
	 	 try{
	 		 
	 		mal.GetSearchResultonMailingPage();
	 		 scenario.write("Search results are displayed successfully.");

	      // Write code here that turns the phrase above into concrete actions
	  } catch(Exception e)
	 	    {
	 	    	//scenario.write(e.toString());
	 	    	throw new Exception("Search results are not displayed.See below message."+"\n"+e.toString());
	 	    }	 
	 }
	 @Then("^user click on view button and pdf open$")
	 public void user_click_on_view_button_and_pdf_open() throws Exception {
		 try {
 			 
 			 mal.OpensAndClosemailpdf();
 		 }
 		 
 		 catch(Exception e)
 		 {
 			 
 			 throw new Exception("Unable to open PDF.See below message for more details."+"\n"+e.toString());  
 		 }   
 	}

	 @Then("^user verify by click on test vendor button$")
	 public void user_verify_by_click_on_test_vendor_button() throws Exception {
		 try {
	 		 mal.clkmailVendor();
	 		 scenario.write("Mail Vendor button is clicked successfully.");
	 	 
	 	    }
	 	    catch(Exception e)
	 	    {
	 	    	//scenario.write(e.toString());
	 	    	throw new Exception("Unable to click Mail Vendor button.See below message."+"\n"+e.toString());
	 	    }
	 }
	// END OF ABHISHEK BHAMBRI CODE 
	 
	 
	  @Given("^user clicks Reports and redirects to Reports page$")
		 public void user_clicks_Reports_and_redirects_to_Reports_page() throws Throwable {
				try {
			 		rpt=new Reports(d);
			 		rpt.click_and_verify_reports_page();
			 	} catch (Exception e) {
			 		throw new Exception("Navigation to Reports page could not be verified. Something went wrong."+ "\n" + e.toString());
			 	}
		 }

		 @Then("^user clicks Run link from Select version grid$")
		 public void user_clicks_Run_link_from_Select_version_grid() throws Throwable {
			 try {
			 	rpt.click_Run();
			 	rpt.verifies_navigation_on_run();
			 	
			 	} catch (Exception e) {
			 		throw new Exception("Navigation on click of Run could not be verified. Something went wrong."+ "\n" + e.toString());
			 	}
		 }

		 @Then("^user clicks Retrieve button and verifies opening of PDF in new tab$")
		 public void user_clicks_Retrieve_button_and_verifies_opening_of_PDF_in_new_tab() throws Throwable {
			      try {
				 	rpt.click_retrieve();
				 	rpt.verifies_PDF_in_new_tab();
				  } catch (Exception e) {
				 	throw new Exception("Retrieve clicked and PDF could not be verified. Something went wrong."+ "\n" + e.toString());
				 }
		 }

		 @Then("^user clicks Go back button and return to Reports main page$")
		 public void user_clicks_Go_back_button_and_return_to_Reports_main_page() throws Throwable {
			   try {
				 	rpt.click_go_back();
			 		rpt.verifies_go_back();
				  } catch (Exception e) {
				 	throw new Exception("Go Back could not be verified. Something went wrong."+ "\n" + e.toString());
				 }
		 }

     @Then("^user selects Internal Reports and clicks Run link of first option from version grid$")
		 public void user_selects_Internal_Reports_and_clicks_Run_link_of_first_option_from_version_grid() throws Throwable {
		      try {
			 	rpt.click_internal_reporting_cam_open_audit();
		 		scenario.write("Run link for Internal Reportings > CAM > Open Audits clicked successfully.");
		 		rpt.verifies_navigation_on_cam_run();
			  } catch (Exception e) {
			 	throw new Exception("Page on run click for  Internal Repotings > CAM > Open Audits could not be verified. Something went wrong."+ "\n" + e.toString());
			 }
		 }

		 @Then("^user clicks Report Schedular and verifies page$")
		 public void user_clicks_Report_Schedular_and_verifies_page() throws Throwable {
			 try {
				 	rpt.click_report_schedular();
			 		rpt.verifies_report_schedular();
				  } catch (Exception e) {
				 	throw new Exception("Navigation to Report Schedular could not be verified. Something went wrong."+ "\n" + e.toString());
				 }
		 }

		 @Then("^user clicks Report History and verifies page$")
		 public void user_clicks_Report_History_and_verifies_page() throws Throwable {
			 try {
				 	rpt.click_reporting_history();
			 		rpt.verifies_reporting_history();
				  } catch (Exception e) {
				 	throw new Exception("Navigation to Reporting History could not be verified. Something went wrong."+ "\n" + e.toString());
				 }
		 }

		 
	 
	 @When("^clicked on received document from left navigation panel$")
	 public void clicked_on_received_document_from_left_navigation_panel() throws Throwable {
	     try {
		 sqs= new SubscriberQuickSearch(d);
	     sqs.ClickReceivedDocument();
	     scenario.write("Successfully clicked on received documents");
	     }
	     catch(Exception e)
	     {
	    	 throw new Exception("Unable to click on received documents.See below message."+"\n"+e.toString());
	     }
	     
	     
	 }

	 @Then("^click on mail prep button$")
	 public void click_on_mail_prep_button() throws Throwable {
		 
		 try {
			 sqs.ClickMailPrep();
			 scenario.write("Successfully clicked on mail prep");
		 }
		 catch(Exception e)
		 {
			 throw new Exception("Unable to click on mail prep.See below message."+"\n"+e.toString());
		 }
	    
	 }

	 @Then("^click on the search icon from record info section$")
	 public void click_on_the_search_icon_from_record_info_section() throws Throwable {
	   try {
		   sqs.ClickRecordInfo();
	   }
	 catch(Exception e)
	 {
		 throw new Exception("Unable to click on record info.See below message."+"\n"+e.toString()); 
	 }
	 }
	 
	 
	 @Then("^verify that user is on quick search page$")
	 public void verify_that_user_is_on_quick_search_page() throws Throwable {
	   try {
		   sqs.VerifyQuickSearchPage();
		   scenario.write("Search screen verified successfully");
	   }
	   catch(Exception e)
	   {
		   throw new Exception("Search screen not verified successfully.See below message."+"\n"+e.toString());  
	   }
	 }

	 @Then("^enter first name \"([^\"]*)\" for subscriber and retrieve exact match$")
	 public void enter_first_name_for_subscriber_and_retrieve_exact_match(String FirstName) throws Throwable {
	  try {
		  sqs.RetrieveSubscriber_ExactMatch(FirstName);
	  }
	  catch(Exception e)
	  {
		  throw new Exception("Unable to retrieve subscriber using exact match.See below message."+"\n"+e.toString());   
	  }
	 }

	 @Then("^Get the grid result for exact match$")
	 public void get_the_grid_result_for_exact_match() throws Throwable {
	  try {
		  sqs.GetGridResult_Sub();
		  scenario.write("Successfully get grid result for exact match");
	  }
	  catch(Exception e)
	  {
		  //throw new Exception("Unable to fetch results for subscriber.See below message."+"\n"+e.toString());   
	      	 try {
	    		 sqs.GetGridError();
	    		 scenario.write("You are returning more than 20 records. Please alter your criteria to limit the records returned or select 100 and search again");
	    	 }
	    	 catch(Exception ee){
	    		 throw new Exception("Unable to get result.See below message."+"\n"+ee.toString());
	    	 }   
		  
	  }
	  
	 }

	 @Then("^Click on partial match radio button and retrieve partial match$")
	 public void click_on_partial_match_radio_button_and_retrieve_partial_match() throws Throwable {
	   try {
		   sqs.RetrieveSubscriber_PartialMatch();
		   scenario.write("Successfully retrieved subscriber for partial match");
	   }
	   catch(Exception e)
	   {
		   throw new Exception("Unable to retrieve subscriber for partial match.See below message."+"\n"+e.toString());  
	   }
	 }
	

	 @Then("^Get the grid result for partial match$")
	 public void get_the_grid_result_for_partial_match() throws Throwable {
	     try {
	    	 sqs.GetGridResult_Sub();
	    	 scenario.write("Successfully get result for partial match");
	  
	     
	     }
	     catch(Exception e)
	     {
	    	 //throw new Exception("Unable to get result.See below message."+"\n"+e.toString());
	      	 try {
	    		 sqs.GetGridError();
	    		 scenario.write("You are returning more than 20 records. Please alter your criteria to limit the records returned or select 100 and search again");
	    	 }
	    	 
	    	 catch(Exception ee){
	    		 throw new Exception("Unable to get result.See below message."+"\n"+ee.toString());
	    	 }
	    	 
	     }
	     
	     
	 }

	 @Then("^click on dependent radio button$")
	 public void click_on_dependent_radio_button() throws Throwable {
	    try {
	    	sqs.ClickDepRadioButton();
	    	scenario.write("Successfully clicked on dependent radio button");
	    }
	    catch(Exception e)
	    {
	    	throw new Exception("Unable to click on dependent radio button."+"\n"+e.toString());  	
	    }
	 }

	 @Then("^click on exact match radio button$")
	 public void click_on_exact_match_radio_button() throws Throwable {
	 try {
		 
		 sqs.ClickExactMatch_Dep();
		 scenario.write("Successfully clicked on exact match radio button");
	 }
	 catch(Exception e)
	 {
		 throw new Exception("Unable to click on exact match radio button"+"\n"+e.toString());   
	 }
	 }

	 @Then("^enter last name \"([^\"]*)\" for dependent and retrieve exact match$")
	 public void enter_last_name_for_dependent_and_retrieve_exact_match(String LastName) throws Throwable {
	   try {
		   sqs.RetrieveDependent_ExactMatch(LastName);
		   scenario.write("Successfully retrieved dependent using exact match");
	   }
	   catch(Exception e)
	   { 
		   throw new Exception("Unable to retrieve dependent using exact match"+"\n"+e.toString());      
	   }
	   
	 }	

	 @Then("^Get the exact match result for dependent$")
	 public void get_the_exact_match_result_for_dependent() throws Throwable {
	 try
	 {
		 sqs.GetGridResult_Dep();
		 scenario.write("Successfully get exact match result for dependent");
	 }
	 catch(Exception e)
	 {
		 //throw new Exception("Unable to get exact match result for dependent."+"\n"+e.toString());
		   try {
			   sqs.GetGridError();
			   scenario.write("You are returning more than 20 records. Please alter your criteria to limit the records returned or select 100 and search again");
			   
		   }
		   
		   catch(Exception ee)
		   {
			   throw new Exception("Unable to get exact match result for dependent."+"\n"+ee.toString());   
		   } 
		 	 
	 }
	 }

	 @Then("^Click on partial match radio button for dependent and retrieve partial match$")
	 public void click_on_partial_match_radio_button_for_dependent_and_retrieve_partial_match() throws Throwable {
	   try {
		   sqs.RetrieveDependent_PartialMatch();
		   scenario.write("Successfully retrieved dependent using partial match");
	   }
	   catch(Exception e)
	   {
		   throw new Exception("Unable to retrieve dependent using partial match."+"\n"+e.toString()); 
	   }
	 }

	 @Then("^Get the partial match result for dependent$")
	 public void get_the_partial_match_result_for_dependent() throws Throwable {
	    try
	    {
	    	sqs.GetGridResult_Dep();
	    	scenario.write("Successfully get partial match result");
	    }
	    catch(Exception e)
	    {
	    	//throw new Exception("Unable to get partial match result."+"\n"+e.toString()); 
	 	   try {
			   sqs.GetGridError();
			   scenario.write("You are returning more than 20 records. Please alter your criteria to limit the records returned or select 100 and search again");
			   
		   }
		   
		   catch(Exception ee)
		   {
			   throw new Exception("Unable to get partial match result."+"\n"+ee.toString());   
		   } 
	    }
	 } 

@Then("^delete dependant and subscriber$")
public void delete_dependant_and_subscriber()
{
	try {
	  // sup.DeleteDependentAndSub();
	   scenario.write("Both dependant and subscriber deleted successfully.");
	    }
	catch(Exception e)
	   {
		//scenario.write(e.toString());
	   }
	
}

 //Author: Pawan Dubey

@Given("^user is on Dependent types page$")
public void user_is_on_Dependent_types_page() throws Throwable {
	try {
		dtp = new DependentTypesPage(d);
		dtp.click_and_verify_dep_types_page();
	} catch (Exception e) {
		throw new Exception("Something went wrong while redirecting to Dependent types page" + "\n" + e.toString());
	}
}

@Then("^user clicks Add button from Dependent Types Not Allowed grid$")
public void user_clicks_Add_button_from_Dependent_Types_Not_Allowed_grid() throws Throwable {
	try {
		dtp.click_add_button();
		scenario.write("Add button of Dependent not allowed grid clicked successfully");
	} catch (Exception e) {
		throw new Exception(
				"Add button of Dependent not allowed grid not clicked successfully." + "\n" + e.toString());
	}
}

@Then("^user verifies addition to Dependent Types Allowed grid$")
public void user_verifies_addition_to_Dependent_Types_Allowed_grid() throws Throwable {
	try {
		dtp.verify_addition_to_allowed_dep_type_grid();
	} catch (Exception e) {
		throw new Exception("Added option could not be found in dep allowed grid" + "\n" + e.toString());
	}
}

@Then("^user clicks cross icon to remove the added option$")
public void user_clicks_cross_icon_to_remove_the_added_option() throws Throwable {
	try {
		dtp.remove_from_allowed_dep_type_grid();
   } catch (Exception e) {
		throw new Exception("Option to be removed could not be clicked" + "\n" + e.toString());
	}
}

@Then("^user verifies the removal of option from dep allowed grid$")
public void user_verifies_the_removal_of_option_from_dep_allowed_grid() throws Throwable {

	try {
		dtp.verify_removal_from_allowed_dep_type_grid();
	} catch (Exception e) {
		throw new Exception("Option could not be removed from dep allowed grid successfully or Something went wrong" + "\n" + e.toString());
	}
}

@Then("^user verifies the addition to dep not allowed grid$")
public void user_verifies_the_addition_to_dep_not_allowed_grid() throws Throwable {
	try {
		dtp.verify_addition_back_to_dep_not_allowed_grid();
	} catch (Exception e) {
		throw new Exception("Option could not be added back to  dep not allowed grid  or Something went wrong" + "\n" + e.toString());
	}
}

@Then("^user clicks preview button and verifies opening of PDF in new browser tab$")
public void user_clicks_preview_button_and_verifies_opening_of_PDF_in_new_browser_tab() throws Throwable {
	try {
		dtp.verify_preview_button_functionality();
		scenario.write("Preview button clicked successfully");

	} catch (Exception e) {
		throw new Exception("Preview button could not be clicked." + "\n" + e.toString());
	}
}

@Then("^user clicks save button and capture update text of bottom$")
public void user_clicks_save_button_and_capture_update_text_of_bottom() throws Throwable {
	try {
		dtp.click_save_and_verify_latest_update_text();
		scenario.write("Save button clicked and latest update date fetched successfully.");


	} catch (Exception e) {
		throw new Exception("Something went wrong in save button click and in latest date update at bottom of the page." + "\n" + e.toString());
	}
}

@Then("^Open Dependent type pdf and close it$")
public void open_Dependent_type_pdf_and_close_it() throws Exception {
	try {
		 
		 dtp.OpensAndClosedeppdf();
	 }
	 
	 catch(Exception e)
	 {
		 
		 throw new Exception("Unable to open PDF.See below message for more details."+"\n"+e.toString());  
	 }   
}   

 //Start of Meenakshi code on Quality Control 
@When("^click and verify Quality Control Menu$")
public void click_and_verify_Quality_Control_Menu() throws Throwable {
	 try {
		 	qc= new QualityControl(d);
		 	qc.QualityControlClick();
     scenario.write("System successfully redirected to Quality Control tab");
  }
  catch(Exception e) {
     throw new Exception("System does not redirected to Quality Control tab.See below message for more details."+"\n"+e.toString());
  }
}

@Then("^search using \"([^\"]*)\" date$")
public void search_using_date(String From) throws Throwable {
    try {
        
		 qc.EnterRetrieveDetails(From);
	     scenario.write("Details has been enetered successfully");
	            
	          }
	      catch(Exception e){
	         throw new Exception("Unable to enter details.See below message."+"\n"+e.toString());
	         }
}

@Then("^click on filter button$")
public void click_on_filter_button() throws Throwable {
	try {
        
		 qc.RetrieveQualityDetails();
	     scenario.write("Filter button clicked");
	            
	          }
	      catch(Exception e){
	         throw new Exception("Unable to click ilter button.See below message."+"\n"+e.toString());
	         }
}

@Then("^verify search results are displayed for quality control$")
public void verify_search_results_are_displayed_for_quality_control() throws Throwable {
	try {
        
		 qc.VerifySearchResultonQualityControlPage();
	     scenario.write("Quality control data fetched successfully");
	            
	          }
	      catch(Exception e){
	         throw new Exception("Unable to fetch data.See below message."+"\n"+e.toString());
	         }
}

 //End of Meenakshi code on Quality Control 

//#Abhishek Bhambri Start of FIle Transfer EDI Part 


@When("^Click and verify File Transfer Menu$")
public void click_and_verify_File_Transfer_Menu() throws Exception {
try {
	    ftrs = new FileTransfer(d);
		 ftrs.ClickFileTransfer();
	     scenario.write("File Transfer tab has been opened without any error");
		 }
		 catch(Exception e)
		 {
			// scenario.write("Unable to click on Subscriber.See below message for more details."+"\n"+e.toString());
			 throw new Exception("Something went wrong with File Transfer tab.See below message for more details."+"\n"+e.toString());
		 }
}
@Then("^Filter using \"([^\"]*)\"$")
public void filter_using(String Froms) throws Exception {
	try {
	    ftrs.enterdetils(Froms);
	    scenario.write("Cleint and Froms Date ");	     
		 }
		 catch(Exception e)
		 {
			//scenario.write(e.toString());
			 throw new Exception("Unable to enter account number.See below message."+"\n"+e.toString());
			 
		 }
}

@Then("^Click on Filter button$")
public void click_on_Filter_button() throws Throwable {
try {
	ftrs.RetrieFiletransfer();
	 scenario.write("Filter button is clicked successfully.");

   }
   catch(Exception e)
   {
   	//scenario.write(e.toString());
   	throw new Exception("Unable to click retrieve button.See below message."+"\n"+e.toString());
   }	
}
@Then("^verify result are displayed$")
public void verify_result_are_displayed() throws Exception {
try{
	 
	ftrs.GetSearchResultonFileTrasnferPage();
	 scenario.write("Search results are displayed successfully.");

 // Write code here that turns the phrase above into concrete actions
} 
catch(Exception e)
    {
    	//scenario.write(e.toString());
    	throw new Exception("Search results are not displayed.See below message."+"\n"+e.toString());
    }	 
}
@Then("^click on File Imports tab$")
public void click_on_File_Imports_tab() throws Exception {
try {
	   // ftrs = new FileTransfer(d);
		 ftrs.ClickFileImport();
	     scenario.write("File Import tab has been opened without any error");
		 }
		 catch(Exception e)
		 {
			// scenario.write("Unable to click on Subscriber.See below message for more details."+"\n"+e.toString());
			 throw new Exception("Something went wrong with File Import tab.See below message for more details."+"\n"+e.toString());
		 }

}

@Then("^verify the result on File Import screen$")
public void verify_the_result_on_File_Import_screen() throws Exception {
try{
	 
	ftrs.GetSearchFileImport();
	 scenario.write("Search results are displayed successfully.");

 // Write code here that turns the phrase above into concrete actions
} 
catch(Exception e)
    {
    	//scenario.write(e.toString());
    	throw new Exception("Search results are not displayed.See below message."+"\n"+e.toString());
    }	 

} 


//End of Abhishek Bhambri FIle Transfer Code

//Start of Abhishek Bhambri -- Received Document - Scan Queue Code
@When("^clicked on received document from left panel$")
public void clicked_on_received_document_from_left_panel() throws Exception {
	try {
		 sqs= new SubscriberQuickSearch(d);
	     sqs.ClickReceivedDocument();
	     scenario.write("Successfully clicked on received documents");
	     }
	     catch(Exception e)
	     {
	    	 throw new Exception("Unable to click on received documents.See below message."+"\n"+e.toString());
	     }
}

@Then("^click on scan queue button$")
public void click_on_scan_queue_button() throws Exception {
	try {
		   // ftrs = new FileTransfer(d);
			 sqs.ClickScanQueue();
		     scenario.write("Scan Queue  tab has been opened without any error");
			 }
			 catch(Exception e)
			 {
				// scenario.write("Unable to click on Subscriber.See below message for more details."+"\n"+e.toString());
				 throw new Exception("Something went wrong with Scan Queue tab.See below message for more details."+"\n"+e.toString());
			 }   
}
@Then("^user enter values \"([^\"]*)\"$")
public void user_enter_values(String ScanDate) throws Exception {
	try {
	    sqs.EnterScanQueuDetail(ScanDate);
	    scenario.write("Scan Date ");	     
		 }
		 catch(Exception e)
		 {
			//scenario.write(e.toString());
			 throw new Exception("Unable to enter date.See below message."+"\n"+e.toString());
		 }
		 }    

@Then("^click on Retreive button$")
public void click_on_Retreive_button() throws Exception {
	try {
		sqs.RetrveScan();
		 scenario.write("Retrieve button is clicked successfully.");

	   }
	   catch(Exception e)
	   {
	   	//scenario.write(e.toString());
	   	throw new Exception("Unable to click retrieve button.See below message."+"\n"+e.toString());
	   }	   
}

@Then("^verify the result on scan queue page$")
public void verify_the_result_on_scan_queue_page() throws Exception {
	try{
		 
		sqs.GetScanQueueResult();
		 scenario.write("Search results are displayed successfully.");

	 // Write code here that turns the phrase above into concrete actions
	} 
	catch(Exception e)
	    {
	    	//scenario.write(e.toString());
	    	throw new Exception("Search results are not displayed.See below message."+"\n"+e.toString());
	    }	 
   
}
@Then("^Click on View button and verify open and close pdf$")
public void click_on_View_button_and_verify_open_and_close_pdf() throws Exception {
	 try {
		 
		 sqs.OpensAndCloseAllPDF();
	 }
	 
	 catch(Exception e)
	 {
		 
		 throw new Exception("Unable to open PDF.See below message for more details."+"\n"+e.toString());  
	 }   
 }  

 //Meenakshi Fax queue code start 
@Then("^click on fax queue tab$")
public void click_on_fax_queue_tab() throws Throwable {
	try {
	 	
	 	sqs.FaxQueueClick();
	 	scenario.write("System successfully redirected to fax queue tab");
	}
	catch(Exception e) {
		throw new Exception("System does not redirected to fax queue tab.See below message for more details."+"\n"+e.toString());
	}
}


@Then("^user enter values for fax date \"([^\"]*)\"$")
public void user_enter_values_for_fax_date(String From) throws Throwable {
	try {
        
		 sqs.Enterdetails(From);
	     scenario.write("Details has been enetered successfully");
	          }
	      catch(Exception e){
	         throw new Exception("Unable to enter details.See below message."+"\n"+e.toString());
	         }
}

@Then("^click on fax Retreive button$")
public void click_on_fax_Retreive_button() throws Throwable {
	try {
        
		 sqs.RetrieveFaxQueue();
	     scenario.write("Retrieve button clicked");
	            
	          }
	      catch(Exception e){
	         throw new Exception("Unable to click retrieve button.See below message."+"\n"+e.toString());
	         }
}

@Then("^verify the result on fax queue page$")
public void verify_the_result_on_fax_queue_page() throws Throwable {
	try {
        
		 sqs.VerifySearchResultonFaxqueue();
	     scenario.write("Fax queue data fetched successfully");
	            
	          }
	      catch(Exception e){
	         throw new Exception("Unable to fetch data.See below message."+"\n"+e.toString());
	         }
}

@Then("^open fax pdf and close it$")
public void open_fax_pdf_and_close_it() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	try {
		 
		 sqs.OpenAndCloseFaxPDF();
	 }
	 
	 catch(Exception e)
	 {
		 
		 throw new Exception("Unable to open PDF.See below message for more details."+"\n"+e.toString());  
	 }   
}

 //Meenakshi Fax queue code end 



@When("^click on subscriber Menu$")
public void click_on_subscriber_Menu() throws Exception {
	try {
	ss= new SubscriberSearch(d);
	ss.ClickSubscriber();
	scenario.write("Subscriber button clicked.");
	}
	
	catch(Exception e)
	{
		throw new Exception("Subscriber button is not clicked."+"\n"+e.toString());
	}
	

}

@Then("^enter firstname \"([^\"]*)\" and retrieve data$")
public void enter_firstname_and_retrieve_data(String FirstName) throws Exception {
	
	try {
		
		ss.EnterNameAndRetrieveSub(FirstName);
		scenario.write("FirstName entered successfully and clicked on retrieve button");
		
	}
	
	catch(Exception e)
	{
		throw new Exception("firstname not entered and retrieve button is not clicked "+"\n"+e.toString());
	}
    
}

@Then("^verify search result of grid$")
public void verify_search_result_of_grid() throws Exception 
{
	try {
		ss.VerifySearchResultSub();
		scenario.write("Subscriber exact match result verified successfully");
	}
	
	catch(Exception e)
	{
		try {
			ss.VerifySearchResultErrorSub();
			scenario.write("You are returning more than 20 records. Please alter your criteria to limit the records returned or select 100 and search again.");
		}
		
		catch(Exception ex)
		{
			throw new Exception("Unable to verify exact match result of sub."+"\n"+ex.toString());
		}
	}

}

@Then("^click on partial match$")
public void click_on_partial_match() throws Exception {
	
	try {
		ss.ClickPartialMatchSub();
		scenario.write("Partial match clicked successfully for sub.");
	}
	
	catch(Exception e)
	{
		throw new Exception("Partial match not clicked for sub."+"\n"+e.toString());
	}
  
}

@Then("^Retrieve data for partial match$")
public void retrieve_data_for_partial_match() throws Exception {
 
	try {
		ss.RetrievePartialMatchSub();
		scenario.write("partial match data retrieved successfully for sub");
	}
	
	catch(Exception e)
	{
		throw new Exception("data not retrieved for partial match sub."+"\n"+e.toString());
	}
	
}

@Then("^verify partial match grid result$")
public void verify_partial_match_grid_result() throws Exception {
	
	try {
		ss.VerifyPartialMatchResultSub();
		scenario.write("partial match result of sub verified");
	}
	catch(Exception e)
	{
		try {
			ss.VerifyPartialSearchErrorSub();
			scenario.write("You are returning more than 20 records. Please alter your criteria to limit the records returned or select 100 and search again.");
		}
		catch(Exception ex)
		{
			throw new Exception("Unable to verify partial match result sub."+"\n"+ex.toString());
		}
		
	}

}

@Then("^click on dependent$")
public void click_on_dependent() throws Exception {
	try {
		ss.ClickOnDependent();
		scenario.write("Dependent clicked");
	}
	catch(Exception e)
	{
		throw new Exception("Unable to click dependent."+"\n"+e.toString());
	}
 
}

@Then("^retrieve result for dependent exact match$")
public void retrieve_result_for_dependent_exact_match() throws Exception {
    
	try {
		ss.RetrieveExactMatchOfDep();
		scenario.write("retrieved button clicked for exact match dep.");
	}
	catch(Exception e)
	{
		throw new Exception("Retrieve button is not clicked for exact match dep."+"\n"+e.toString());
	}
}

@Then("^verify grid of dependent$")
public void verify_grid_of_dependent() throws Exception {
	
	try {
		ss.VerifyExactSearchResultofDep();
		scenario.write("grid verified for exact match dep.");
	}
	catch(Exception e)
	{
		try {
			ss.VerifyExactSearchErrorDep();
			scenario.write("You are returning more than 20 records. Please alter your criteria to limit the records returned or select 100 and search again.");
		}
		catch(Exception ex)
		{
			throw new Exception("result not verified for exact match dep."+"\n"+ex.toString());
		}
	}
 
}

@Then("^click on dependent partial match$")
public void click_on_dependent_partial_match() throws Exception {
   
	try {
		ss.ClickOnPartialMatchDep();
		scenario.write("Partial match dep clicked.");
		
	}
	catch(Exception e)
	{
		throw new Exception("partial match not clicked for dep."+"\n"+e.toString());
	}
}

@Then("^retrieve result for dependent partial match$")
public void retrieve_result_for_dependent_partial_match() throws Exception {
  try {
	  ss.RetrievePartialMatchOfDep();
	  scenario.write("retrieve button clicked for partial match dep");
  }
  
  catch(Exception e)
  {
	  throw new Exception("retrieve button not clicked for partial match dep."+"\n"+e.toString());
  }
	
}

@Then("^verify grid$")
public void verify_grid() throws Exception {
	
	try {
		ss.VerifyPartialSearchResultofDep();
		scenario.write("partial search result verified for dep.");
		
	}
	catch(Exception e)
	{
		try {
			ss.VerifyPartialSearchErrorDep();
			scenario.write("You are returning more than 20 records. Please alter your criteria to limit the records returned or select 100 and search again.");
		}
		
		catch(Exception ex)
		{
			 throw new Exception("partial search result not verified for dep."+"\n"+ex.toString());
		}
	}
   
}

 //Author: Pawan Dubey
@Given("^user is on Admin page$")
public void user_is_on_Admin_page() throws Throwable {
	try{
		adm=new AdminPage(d);
		adm.click_and_verify_Admin_page();
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Admin page could not be verified. Something went wrong"+"\n"+e.toString());
	    }	
}

@Then("^user clicks Home link from header section and verifies Grid present on Home$")
public void user_clicks_Home_link_from_header_section_and_verifies_Grid_present_on_Home() throws Throwable {
	 try{
		adm.click_Home();
		scenario.write("Home button clicked successfully.");
		adm.verifies_Home();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Home could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Clients link from header section and verifies Grid on Clients$")
public void user_clicks_Clients_link_from_header_section_and_verifies_Grid_on_Clients() throws Throwable {
	try{
		adm.click_client();
		scenario.write("Client clicked successfully.");
		adm.verifies_client();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Client could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Division List and verifies Grid present on Division List$")
public void user_clicks_Division_List_and_verifies_Grid_present_on_Division_List() throws Throwable {
	try{
		adm.click_division_list();
		scenario.write("Division List clicked successfully.");
		adm.verifies_division_list();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Division List could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Client Phases and verifies Grid present on Client Phases$")
public void user_clicks_Client_Phases_and_verifies_Grid_present_on_Client_Phases() throws Throwable {
	try{
		adm.click_client_phases();
		scenario.write("Client Phases clicked successfully.");
		adm.verifies_client_phases();
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Client Phases could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Project Close and verifies Grid on Project Close$")
public void user_clicks_Project_Close_and_verifies_Grid_on_Project_Close() throws Throwable {
	try{
		adm.click_project_close();
		scenario.write("Project Close clicked successfully.");
		adm.verifies_project_close();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Project Close could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Documentary Library and verifies Grid present on Documentary Library$")
public void user_clicks_Documentary_Library_and_verifies_Grid_present_on_Documentary_Library() throws Throwable {
	try{
		adm.click_document_library();
		scenario.write("Documentary Library clicked successfully.");
		adm.verifies_document_library();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Documentary Library could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Portal Interface and verifies Grid present on Portal Interface$")
public void user_clicks_Portal_Interface_and_verifies_Grid_present_on_Portal_Interface() throws Throwable {
	try{
		adm.click_portal_interface();
		scenario.write("Portal Interface clicked successfully.");
		adm.verifies_portal_interface();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Portal Interface could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Plan Hierarchy and verifies Grid present on Plan Hierarchy$")
public void user_clicks_Plan_Hierarchy_and_verifies_Grid_present_on_Plan_Hierarchy() throws Throwable {
	try{
		adm.click_plan_hierarchy();
		scenario.write("Plan Hierarchy clicked successfully.");
		adm.verifies_plan_hierarchy();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Plan Hierarchy could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Verification Retention and verifies Grid present on Verification Retention$")
public void user_clicks_Verification_Retention_and_verifies_Grid_present_on_Verification_Retention() throws Throwable {
	try{
		adm.click_verification_retention();
		scenario.write("Verification Retention clicked successfully.");
		adm.verifies_verification_retention();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Verification Retention could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Client Period link from header section and verifies Grid on Client Period$")
public void user_clicks_Client_Period_link_from_header_section_and_verifies_Grid_on_Client_Period() throws Throwable {
	try{
		adm.click_client_period_link();
		scenario.write("Client Period clicked successfully.");
		adm.verifies_client_period();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Client_Period could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Period Info and verifies Grid present on Period Info$")
public void user_clicks_Period_Info_and_verifies_Grid_present_on_Period_Info() throws Throwable {
	try{
		adm.click_period_info();
		scenario.write("Period Info clicked successfully.");
		adm.verifies_period_info();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Period Info could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Period Alerts and verifies Grid present on Period Alerts$")
public void user_clicks_Period_Alerts_and_verifies_Grid_present_on_Period_Alerts() throws Throwable {
	try{
		adm.click_period_alerts();
		scenario.write("Period Alerts clicked successfully.");
		adm.verifies_period_alerts();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Period Alerts could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}	

@Then("^user clicks Plan-Guard and verifies Grid on Plan-Guard$")
public void user_clicks_Plan_Guard_and_verifies_Grid_on_Plan_Guard() throws Throwable {
	try{
		adm.click_plan_guard();
		scenario.write("Plan Guard clicked successfully.");
		adm.verifies_plan_guard();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Plan Guard could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Portal and verifies Grid present on Portal$")
public void user_clicks_Portal_and_verifies_Grid_present_on_Portal() throws Throwable {
	try{
		adm.click_portals();
		scenario.write("Portal clicked successfully.");
		adm.verifies_portals();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Portal could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Participant Website and verifies Grid present on Participant Website$")
public void user_clicks_Participant_Website_and_verifies_Grid_present_on_Participant_Website() throws Throwable {
	try{
		adm.click_participant_website();
		scenario.write("Participant Website clicked successfully.");
		adm.verifies_participant_website();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Participant Website could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Affidavits and verifies Grid present on Affidavits$")
public void user_clicks_Affidavits_and_verifies_Grid_present_on_Affidavits() throws Throwable {
	try{
		adm.click_affidevits();
		scenario.write("Affidavits clicked successfully.");
		adm.verifies_affidevits();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Affidavits Website could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Custom Text and verifies Grid present on Custom Text$")
public void user_clicks_Custom_Text_and_verifies_Grid_present_on_Custom_Text() throws Throwable {
	try{
		adm.click_custom_text();
		scenario.write("Custom Text clicked successfully.");
		adm.verifies_custom_text();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Custom Text could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Reports and verifies Grid present on Reports$")
public void user_clicks_Reports_and_verifies_Grid_present_on_Reports() throws Throwable {
	try{
		adm.click_reports();
		scenario.write("Reports clicked successfully.");
		adm.verifies_reports();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Reports could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Override Authoring and verifies Grid present on Override Authoring$")
public void user_clicks_Override_Authoring_and_verifies_Grid_present_on_Override_Authoring() throws Throwable {
	try{
		adm.click_override_authoring();
		scenario.write("Override Authoring clicked successfully.");
		adm.verifies_override_authoring();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Override Authoring could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Email Override and verifies Grid present on clicks Email Override$")
public void user_clicks_Email_Override_and_verifies_Grid_present_on_clicks_Email_Override() throws Throwable {
	try{
		adm.click_email_override();
		scenario.write("Email Override clicked successfully.");
		adm.verifies_email_override();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Email Override could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Details Type link from header section and verifies Grid on Details Type page$")
public void user_clicks_Details_Type_link_from_header_section_and_verifies_Grid_on_Details_Type_page() throws Throwable {
	try{
		adm.click_detailtypes();
		scenario.write("Details Type clicked successfully.");
		adm.verifies_detailtypes();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Details Type could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Assign Sets To Type verifies Assign Sets To Type$")
public void user_clicks_Assign_Sets_To_Type_verifies_Assign_Sets_To_Type() throws Throwable {
	try{
		adm.click_assign_sets_to_type();
		scenario.write("Assign Sets To Types clicked successfully.");
		adm.verifies_assign_sets_to_type();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Assign Sets To Type could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Override Authoring and verifies Grid on Override Authoring$")
public void user_clicks_Override_Authoring_and_verifies_Grid_on_Override_Authoring() throws Throwable {
	try{
		adm.click_override_author();
		scenario.write("Override Authoring clicked successfully.");
		adm.verifies_override_author();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Override Authoring could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Documents link from header section and verifies Grid on Documents$")
public void user_clicks_Documents_link_from_header_section_and_verifies_Grid_on_Documents() throws Throwable {
	try{
		adm.click_documents();
		scenario.write("Documents clicked successfully.");
		adm.verifies_documents();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Documents could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Doc Sets and verifies Doc Sets$")
public void user_clicks_Doc_Sets_and_verifies_Doc_Sets() throws Throwable {
	try{
		adm.click_document_sets();
		scenario.write("Document Sets clicked successfully.");
		adm.verifies_document_sets();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Document Sets could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Document Swap and verifies Grid on Document Swap$")
public void user_clicks_Document_Swap_and_verifies_Grid_on_Document_Swap() throws Throwable {
	try{
		adm.click_doc_swap();
		scenario.write("Document Swap clicked successfully.");
		adm.verifies_doc_swap();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Document Swap could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Standard Alt Doc List and verifies Grid on Standard Alt Doc List$")
public void user_clicks_Standard_Alt_Doc_List_and_verifies_Grid_on_Standard_Alt_Doc_List() throws Throwable {
	try{
		adm.click_standard_alt_doc_list();
		scenario.write("Standard Alt Document List clicked successfully.");
		adm.verifies_standard_alt_doc_list();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Standard Alt Document List could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Assign Docs To Set and verifies Grid on Assign Docs To Set$")
public void user_clicks_Assign_Docs_To_Set_and_verifies_Grid_on_Assign_Docs_To_Set() throws Throwable {
	try{
		adm.click_assign_doc_to_sets();
		scenario.write("Assign Docs To Set clicked successfully.");
		adm.verifies_assign_doc_to_sets();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Assign Docs To Set could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks DEAR Setup link from header section and verifies Grid on Dear Setup$")
public void user_clicks_DEAR_Setup_link_from_header_section_and_verifies_Grid_on_Dear_Setup() throws Throwable {
	try{
		adm.click_dear_setup();
		scenario.write("DEAR Setup clicked successfully.");
		adm.verifies_dear_setup();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to DEAR Setup could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks DEAR Templates and verifies Dear Templates$")
public void user_clicks_DEAR_Templates_and_verifies_Dear_Templates() throws Throwable {
	try{
		adm.click_dear_template();
		scenario.write("DEAR Template clicked successfully.");
		adm.verifies_dear_template();
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to DEAR Template could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks DEAR Catagories and verifies Dear Templates$")
public void user_clicks_DEAR_Catagories_and_verifies_Dear_Templates() throws Throwable {
	try{
		adm.click_cat();
		scenario.write("DEAR Catagory clicked successfully.");
		adm.verifies_cat();
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to DEAR Catagory could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Permissions link from header section and verifies Grid on Permissions$")
public void user_clicks_Permissions_link_from_header_section_and_verifies_Grid_on_Permissions() throws Throwable {
	try{
		adm.click_permission();
		scenario.write("Permission clicked successfully.");
		adm.verifies_permission();
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Permission could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Users Setup link from header section and verifies Grid on Users$")
public void user_clicks_Users_Setup_link_from_header_section_and_verifies_Grid_on_Users() throws Throwable {
	try{
		adm.click_users();
		scenario.write("Users clicked successfully.");
		adm.verifies_users();
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Users could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Assign Clients and verifies Assign Clients$")
public void user_clicks_Assign_Clients_and_verifies_Assign_Clients() throws Throwable {
	try{
		adm.click_assign_clients();
		scenario.write("Assign Clients successfully.");
		adm.verifies_assign_clients();
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Assign Clients could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Assign Depts and verifies Assign Depts$")
public void user_clicks_Assign_Depts_and_verifies_Assign_Depts() throws Throwable {
	try{
		adm.click_assign_dep();
		scenario.write("Assign Depts successfully.");
		adm.verifies_assign_dep();
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Assign Depts could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Assign Work Queues and verifies Assign Work Queues$")
public void user_clicks_Assign_Work_Queues_and_verifies_Assign_Work_Queues() throws Throwable {

  try{
	adm.click_assign_work_queue();
	scenario.write("Assign Work Queue successfully.");
	adm.verifies_assign_work_queue();
	} 
catch(Exception e)
    {
    	throw new Exception("Navigation to Assign Work Queue could not be verified. Something went wrong"+"\n"+e.toString());
    }

}

@Then("^user clicks Reporting link from header section and verifies Grid on Reporting$")
public void user_clicks_Reporting_link_from_header_section_and_verifies_Grid_on_Reporting() throws Throwable {
	  try{
			adm.click_reporting();
			scenario.write("Reporting clicked successfully.");
			adm.verifies_repoting();
			} 
		catch(Exception e)
		    {
		    	throw new Exception("Navigation to Reporting could not be verified. Something went wrong"+"\n"+e.toString());
		    }
}


@Then("^user clicks BOS link from header section, clicks Stop Refresh button and verifies Grid on BOS$")
public void user_clicks_BOS_link_from_header_section_clicks_Stop_Refresh_button_and_verifies_Grid_on_BOS() throws Throwable {
	try{
		adm.click_bos();
		scenario.write("BOS clicked successfully.");
		adm.verifies_bos();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to BOS could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Current Jobs, clicks Stop Refresh button and verifies Grid on Current Jobs$")
public void user_clicks_Current_Jobs_clicks_Stop_Refresh_button_and_verifies_Grid_on_Current_Jobs() throws Throwable {
	try{
		adm.click_current_jobs();
		scenario.write("Current Jobs clicked successfully.");
		adm.verifies_current_jobs();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Current Jobs could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Archieved Jobs, retrieve and verifies Grid present on Archieved Jobs$")
public void user_clicks_Archieved_Jobs_retrieve_and_verifies_Grid_present_on_Archieved_Jobs() throws Throwable {
	try{
		adm.click_archieved_jobs();
		scenario.write("Archieved Jobs clicked successfully.");
		//adm.verifies_archieved_jobs();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Archieved Jobs could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Job Schedular and verifies Grid on Job Schedular$")
public void user_clicks_Job_Schedular_and_verifies_Grid_on_Job_Schedular() throws Throwable {
	try{
		adm.click_job_schedular();
		scenario.write("Job Schedular clicked successfully.");
		adm.verifies_job_schedular();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Archieved Jobs could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Monitering and verifies Grid on Monitering$")
public void user_clicks_Monitering_and_verifies_Grid_on_Monitering() throws Throwable {
	try{
		adm.click_monitoring();
		scenario.write("Monitering clicked successfully.");
		adm.verifies_monitoring();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Monitering could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks SQLizers link from header section and verifies navigation to SQLizers$")
public void user_clicks_SQLizers_link_from_header_section_and_verifies_navigation_to_SQLizers() throws Throwable {
	try{
		adm.click_sqlizer();
		scenario.write("SQLizers clicked successfully.");
		adm.verifies_sqlizer();
		
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to SQLizers could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user searches a query using \"([^\"]*)\"$")
public void user_searches_a_query_using(String queryname) throws Throwable {
	try{
		adm.search_queries_on_sqlizer(queryname);
		scenario.write("Query searched with query name "+queryname+" successfully.");
	} 
	catch(Exception e)
	    {
	    	throw new Exception("Query with query name "+queryname+" could not be searched. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user runs a query by date as param \"([^\"]*)\"$")
public void user_runs_a_query_by_date_as_param(String dateparameter) throws Throwable {
	try{
		adm.run_query_from_searched_results(dateparameter);
		scenario.write("Query ran with date parameter '"+dateparameter+"' successfully.");
	} 
	catch(Exception e)
	    {
	    	throw new Exception("Query ran with date parameter '"+dateparameter+"' could not be run. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user verifies query result grid$")
public void user_verifies_query_result_grid() throws Throwable {
	   try{
		adm.verifies_result_grid();
     	} 
	   catch(Exception e)
	    {
	    	throw new Exception("Results grid on Run query could not be verified. Something went wrong ."+"\n"+e.toString());
	    }
}

@Then("^user clicks Setup Queries and searches queries and saves parameter$")
public void user_clicks_Setup_Queries_and_searches_queries_and_saves_parameter() throws Throwable {
	try{
		adm.click_setup_query();
		scenario.write("Setup Queries clicked successfully.");
		adm.verifies_setup_query();
		} 
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Setup Queries could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Misc link from header section and verifies navigation to Misc$")
public void user_clicks_Misc_link_from_header_section_and_verifies_navigation_to_Misc() throws Throwable {
	try{
		adm.click_misc();
		scenario.write("Misc clicked successfully.");
		adm.verifies_misc();
	}
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Misc could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^User clicks Info / Scripting Items and verifies element on Info / Scripting Items$")
public void user_clicks_Info_Scripting_Items_and_verifies_element_on_Info_Scripting_Items() throws Throwable {
	try{
		adm.click_info_scripting();
		scenario.write("Info Scripting Items clicked successfully.");
		adm.verifies_info_scripting();
	}
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Info Scripting Items could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Issue Detail Reasons and verifies element on Issue Detail Reasons$")
public void user_clicks_Issue_Detail_Reasons_and_verifies_element_on_Issue_Detail_Reasons() throws Throwable {
	try{
		adm.click_issue_details_reason();
		scenario.write("Issue Detail Reasons clicked successfully.");
		adm.verifies_issue_details_reason();
	}
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Issue Detail Reasons could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}

@Then("^user clicks Issue Detail Results and verifies element on Issue Detail Results$")
public void user_clicks_Issue_Detail_Results_and_verifies_element_on_Issue_Detail_Results() throws Throwable {
	try{
		adm.click_issue_details_results();
		scenario.write("Issue Detail Results clicked successfully.");
		adm.verifies_issue_details_results();
	}
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Issue Detail Results could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}


@Then("^user clicks Override reasons and verifies element on Override reasons$")
public void user_clicks_Override_reasons_and_verifies_element_on_Override_reasons() throws Throwable {
	try{
		adm.click_override_reasons();
		scenario.write("Override Reasons clicked successfully.");
		adm.verifies_override_reasons();;
	}
	catch(Exception e)
	    {
	    	throw new Exception("Navigation to Override Reasons could not be verified. Something went wrong"+"\n"+e.toString());
	    }
}



@When("^click and verify communications menu$")
public void click_and_verify_communications_menu() throws Exception {
 try {
	 com = new Communications(d);
	 com.ClickCommunicationAndVerify();
	 scenario.write("Communication menu clicked and verified");
	 
 }
 
 catch(Exception e)
 {
	 throw new Exception("Communications menu is not clicked and verified."+"\n"+e.toString()); 
 }
	
}

@Then("^edit currently configured letters$")
public void edit_currently_configured_letters() throws Exception {
	try {
	com.ClickEdit();
	scenario.write("Edit link clicked successfully");
	}
	catch(Exception e)
	{
		throw new Exception("Edit link is not clicked."+"\n"+e.toString()); 
	}
    
}

@Then("^click on additional options button and close the dialog$")
public void click_on_additional_options_button_and_close_the_dialog() throws Exception {
	
	try {
		com.ClickAdditionalOptionsAndClose();
		scenario.write("Successfully clicked and closed the additional options");
	}
	
	catch(Exception e)
	{
		throw new Exception("Unable to click and close additional options."+"\n"+e.toString()); 
		
	}

}

@Then("^click on pdf preview button and close the window$")
public void click_on_pdf_preview_button_and_close_the_window() throws Exception {
	
	try {
		com.ClickPdfPreviewAndClose();
		scenario.write("successfully clicked and closed pdf preview.");
	}
	
	catch(Exception e)
	{
		throw new Exception("Unable to click and close pdf preview."+"\n"+e.toString()); 
	}
    
}

@Then("^click on html preview button and close the window$")
public void click_on_html_preview_button_and_close_the_window() throws Exception {
	
	try {
		com.ClickHtmlPreviewAndClose();
		scenario.write("Successfully clicked and closed html preview.");
	}
	catch(Exception e)
	{
		throw new Exception("Unable to click and close html preview."+"\n"+e.toString()); 
		
	}
   
}

@Then("^click and verify issue tab$")
public void click_and_verify_issue_tab() throws Exception {
	try {
	com.ClickIssueTabAndVerify();
	scenario.write("Successfully clicked and verified issue tab");
	}
	catch(Exception e)
	{
		throw new Exception("Unable to click and verify issue tab."+"\n"+e.toString());
	}
   
}

@Then("^click and verify emails tab$")
public void click_and_verify_emails_tab() throws Exception {
	
	try {
		com.ClickEmailTabAndVerify();
		scenario.write("Successfully clicked and verified emails tab");
	}
	catch(Exception e)
	{
		throw new Exception("Unable to click and verify emails tab."+"\n"+e.toString());
	}
   
}

@Then("^click and verify SMS tab$")
public void click_and_verify_SMS_tab() throws Exception {
	
	try {
		com.ClickSMSTabAndVerify();
		scenario.write("Successfully clicked and verified SMS tab");
	}
	catch(Exception e)
	{
		throw new Exception("Unable to click and verify SMS tab."+"\n"+e.toString());
	}
  
}


 //Meenakhsi logoff functionality 

@Then("^user clicks logoff$")
public void user_clicks_logoff() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	try{
		sup.ClickLogOff();
		scenario.write("System is successfully Loggged off");


		} catch(Exception e)
			 {
				 //scenario.write(e.toString());
				 throw new Exception("Something went wrong ,unable to Logoff.See below message."+"\n"+e.toString());
			 }
}

}