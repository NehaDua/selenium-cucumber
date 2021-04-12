package com.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.utility.UserActions;

import base.TestSetup;

public class AdminPage extends TestSetup {

	public AdminPage (WebDriver d) 
	{
		this.d = d;

	}
	   
    /* Author: Pawan Dubey */
   	public final By admin = By.xpath(p.getProperty("admin_locator"));
   	public final By homelink = By.xpath(p.getProperty("home_locator"));
   	public final By maingrid = By.xpath(p.getProperty("maingrid_locator"));
   	public final By clientlink = By.xpath(p.getProperty("client_locator"));
  	public final By clientsubtab = By.id(p.getProperty("clientsubtab_locator"));
   	public final By divisionssubtab = By.id(p.getProperty("divisionssubtab_locator"));
   	public final By phasessubtab = By.id(p.getProperty("phasessubtab_locator"));
    public final By closesubtab = By.id(p.getProperty("closesubtab_locator"));
    public final By librarysubtab = By.id(p.getProperty("librarysubtab_locator"));
    public final By clientportalsubtab = By.id(p.getProperty("clientportalsubtab_locator"));
    public final By planhierarchysubtab = By.id(p.getProperty("planhierarchysubtab_locator"));
    public final By verificationretentionsubtab = By.id(p.getProperty("verificationretentionsubtab_locator"));
    public final By clientGrid = By.id(p.getProperty("clientGrid_locator"));
    public final By clientPeriod = By.xpath(p.getProperty("clientPeriod_locator"));
	public final By clientperiodsubtab = By.id(p.getProperty("clientperiodsubtab_locator"));
	public final By periodinfosubtab = By.id(p.getProperty("periodinfosubtab_locator"));
	public final By periodalertssubtab = By.id(p.getProperty("periodalertssubtab_locator"));
	public final By planguardsubtab = By.id(p.getProperty("planguardsubtab_locator"));
	public final By portalsubtab = By.id(p.getProperty("portalsubtab_locator"));
	public final By participantwebsitesubtab = By.id(p.getProperty("participantwebsitesubtab_locator"));
	public final By affidavitssubtab = By.id(p.getProperty("affidavitssubtab_locator"));
	public final By customtextsubtab = By.id(p.getProperty("customtextsubtab_locator"));
	public final By reportssubtab = By.id(p.getProperty("reportssubtab_locator"));
	public final By overridessubtab = By.id(p.getProperty("overridessubtab_locator"));
	public final By emailoverridessubtab = By.id(p.getProperty("emailoverridessubtab_locator"));
   	public final By periodanalysisssubtab = By.linkText(p.getProperty("periodanalysisssubtab_locator"));
   	public final By periodcopy = By.linkText(p.getProperty("periodcopy_locator"));
   	public final By qcscorecard = By.linkText(p.getProperty("qcscorecard_locator"));
    public final By commonperiodGrid = By.id(p.getProperty("commonperiodGrid_locator"));
  	public final By periodGridportal = By.id(p.getProperty("periodGridportal_locator"));
   	public final By cancelbutton = By.id(p.getProperty("cancelbutton_locator"));
   	public final By creatlink = By.linkText(p.getProperty("creatlink_locator"));
    public final By closebutton = By.id(p.getProperty("closebutton_locator"));
    public final By detailtype = By.xpath(p.getProperty("detailtype_locator"));
   	public final By detailtypegrid = By.id(p.getProperty("detailtypegrid_locator"));
   	public final By assignsetstotype = By.id(p.getProperty("assignsetstotype_locator"));
    public final By assignsetstotypegrid = By.id(p.getProperty("assignsetstotypegrid_locator"));
  	public final By overrideauthoring = By.id(p.getProperty("overrideauthoring_locator"));
   	public final By overrideauthoringdrid = By.id(p.getProperty("overrideauthoringdrid_locator"));
    public final By documents = By.xpath(p.getProperty("documents_locator"));
   	public final By showall = By.id(p.getProperty("showall_locator"));
   	public final By documentsgrid = By.id(p.getProperty("documentsgrid_locator"));
    public final By docsets = By.id(p.getProperty("docsets_locator"));
  	public final By docsetsgrid = By.id(p.getProperty("docsetsgrid_locator"));
   	public final By assigndoctosets = By.id(p.getProperty("assigndoctosets_locator"));
   	public final By assigndoctosetsgrid = By.id(p.getProperty("assigndoctosetsgrid_locator"));
   	public final By documentswap = By.id(p.getProperty("documentswap_locator"));
    public final By documentswapgrid = By.id(p.getProperty("documentswapgrid_locator"));
  	public final By standardaltdoclist = By.id(p.getProperty("standardaltdoclist_locator"));
   	public final By standardaltdoclistupload = By.id(p.getProperty("standardaltdoclistupload_locator"));
    public final By dearsetup = By.xpath(p.getProperty("dearsetup_locator"));
   	public final By dearsetupgrid = By.id(p.getProperty("dearsetupgrid_locator"));
   	public final By deartemplate = By.id(p.getProperty("deartemplate_locator"));
    public final By deartemplategrid = By.id(p.getProperty("deartemplategrid_locator"));
   	public final By dearcat = By.id(p.getProperty("dearcat_locator"));
   	public final By dearcatgridr = By.id(p.getProperty("dearcatgrid_locator"));
   	public final By permission = By.xpath(p.getProperty("permission_locator"));
   	public final By permissiongrid = By.id(p.getProperty("permissiongrid_locator"));
   	public final By users = By.xpath(p.getProperty("users_locator"));
   	public final By assignclients = By.id(p.getProperty("assignclients_locator"));
   	public final By assigndeps = By.id(p.getProperty("assigndeps_locator"));
    public final By usersgrid = By.id(p.getProperty("usersgrid_locator"));
   	public final By assignworkqueue = By.id(p.getProperty("assignworkqueue_locator"));
   	public final By assignworkqueuegrid = By.id(p.getProperty("assignworkqueuegrid_locator"));
    public final By reporting = By.xpath(p.getProperty("reporting_locator"));
   	public final By reportinggrid = By.id(p.getProperty("reportinggrid_locator"));
    public final By bos = By.xpath(p.getProperty("bos_locator"));
    public final By stoprefresh = By.id(p.getProperty("stoprefresh_locator"));
    public final By currentjobs = By.xpath(p.getProperty("currentjobs_locator"));
    public final By currentjobGrid = By.id(p.getProperty("currentjobGrid_locator"));
    public final By archievedjobs = By.xpath(p.getProperty("archievedjobs_locator"));
	public final By retrievebutton = By.id(p.getProperty("retrievebutton_locator"));
	public final By archieveGrid = By.id(p.getProperty("archieveGrid_locator"));
	public final By jobsshedular = By.xpath(p.getProperty("jobsshedular_locator"));
	public final By scheduleGrid = By.id(p.getProperty("scheduleGrid_locator"));
	public final By monitoring = By.xpath(p.getProperty("monitoring_locator"));
	public final By moniteringGrid = By.xpath(p.getProperty("moniteringGrid_locator"));
	public final By sqlizer = By.xpath(p.getProperty("sqlizer_locator"));
	public final By userselect = By.id(p.getProperty("userselect_locator"));
	public final By inputnamesearch = By.id(p.getProperty("inputnamesearch_locator"));
	public final By searchbutton = By.id(p.getProperty("searchbutton_locator"));
	public final By select = By.xpath(p.getProperty("select_locator"));
	public final By dateparam = By.id(p.getProperty("dateparam_locator"));
	public final By runquerybutton = By.id(p.getProperty("runquerybutton_locator"));
	public final By resulttable = By.className(p.getProperty("resulttableclassname_locator"));
	public final By exportexcelbutton = By.id(p.getProperty("exportexcelbutton_locator"));
	public final By setupquery = By.id(p.getProperty("setupquery_locator"));
	public final By savequery = By.id(p.getProperty("savequery_locator"));
	public final By misc = By.xpath(p.getProperty("misc_locator"));
    public final By miscgrid = By.id(p.getProperty("miscgrid_locator"));
    public final By infoscriptingitem = By.xpath(p.getProperty("infoscriptingitem_locator"));
	public final By infoscriptingitemgrid = By.id(p.getProperty("infoscriptingitemgrid_locator"));
    public final By issuedetailreason = By.xpath(p.getProperty("issuedetailreason_locator"));
	public final By issuedetailreasongrid = By.id(p.getProperty("issuedetailreasongrid_locator"));
    public final By issuedetailresults = By.xpath(p.getProperty("issuedetailresults_locator"));
	public final By issuedetailresultsgrid = By.id(p.getProperty("issuedetailresultsgrid_locator"));
    public final By overridereasons = By.xpath(p.getProperty("overridereasons_locator"));
	public final By overridereasonsgrid = By.id(p.getProperty("overridereasonsgrid_locator"));
	public final By logogg = By.xpath(p.getProperty("LogOff_locator")); 
 
/*  Author: Pawan Dubey */
    

    
    public void click_and_verify_Admin_page() {
	   
    	UserActions.Click_JavaScript(admin);
    	UserActions.Wait_Sec();
    	UserActions.Wait_Sec();
		verifyPageNavigation(homelink,"Admin page");
   }
    
    public void click_Home() {
	    UserActions.click(homelink);
	    UserActions.Wait_Sec();
	    UserActions.Wait_Sec();
   }
    
    public void verifies_Home() {
    	verifyPageNavigation(maingrid,"Home page");
    }
    
    public void click_client() {
	    UserActions.Click_JavaScript(clientlink);
   }
    
    public void verifies_client() {
    	verifyPageNavigation(clientGrid,"Client page");
    	
    }
    
    public void click_division_list() {
	    UserActions.click(divisionssubtab);
	    UserActions.Wait_Sec();
   }
    
    public void verifies_division_list() {
    	verifyPageNavigation(clientGrid,"Division List page");
    	
    }
    
    public void click_client_phases() {
	    UserActions.click(phasessubtab);
   }
    
    public void verifies_client_phases() {
    	verifyPageNavigation(clientGrid,"Client Phases page");
   }
    
    public void click_project_close() {
	    UserActions.click(closesubtab);
   }
    
    public void verifies_project_close() {
    	verifyPageNavigation(clientGrid,"Project Close page");
    }
    
    public void click_document_library() {
	    UserActions.click(librarysubtab);
   }
    
    public void verifies_document_library() {
    	verifyPageNavigation(clientGrid,"Document Library page");
   }
    
    public void click_portal_interface() {
	    UserActions.click(clientportalsubtab);
	    UserActions.Wait_Sec();
   }
    
    public void verifies_portal_interface() {
    	verifyPageNavigation(clientGrid,"Portal Interface page");
    }
    
    public void click_plan_hierarchy() {
	    UserActions.click(planhierarchysubtab);
   }
    
    public void verifies_plan_hierarchy() {
    	verifyPageNavigation(clientGrid,"Plan Hierarchy page");
   }
    
    public void click_verification_retention() {
	    UserActions.click(verificationretentionsubtab);
	    
   }
    
    public void verifies_verification_retention() {
    	UserActions.Wait_Sec();
    	verifyPageNavigation(clientGrid,"Verification Retention page");
    }
    
    // Client Period
    public void click_client_period_link() {
	    UserActions.Click_JavaScript(clientPeriod);
	    
   }
    
    public void verifies_client_period_link() {
    	verifyPageNavigation(commonperiodGrid,"Client Portal page");
    }
    
    
    public void click_client_period() {
	    UserActions.click(clientperiodsubtab);
   }
    
    public void verifies_client_period() {
    	verifyPageNavigation(commonperiodGrid,"Client Period sub page");
    }
    
    public void click_period_info() {
	    UserActions.click(periodinfosubtab);
	    UserActions.Wait_Sec();
   }
    
    public void verifies_period_info() {
    	verifyPageNavigation(commonperiodGrid,"Period info page");
    }
   
    public void click_period_alerts() {
	    UserActions.click(periodalertssubtab);
   }
    
    public void verifies_period_alerts() {
    	verifyPageNavigation(commonperiodGrid,"Period Alerts page");
    }
    
    public void click_plan_guard() {
	    UserActions.click(planguardsubtab);
	    UserActions.Wait_Sec();
	 }
    
    public void verifies_plan_guard() {
    	verifyPageNavigation(commonperiodGrid,"Plan Guard page");
    }
   
    public void click_portals() {
	    UserActions.click(portalsubtab);
	    UserActions.Wait_Sec();
   }
    
    public void verifies_portals() {
    	verifyPageNavigation(periodGridportal,"Portals page");
    }
  
    
    public void click_participant_website() {
	    UserActions.click(participantwebsitesubtab);
   }
    
    public void verifies_participant_website() {
    	verifyPageNavigation(commonperiodGrid,"Participant Website page");
    }
    
    public void click_affidevits() {
	    UserActions.click(affidavitssubtab);
   }
    
    public void verifies_affidevits() {
    	verifyPageNavigation(commonperiodGrid,"Affidevits page");
    }
    
    public void click_custom_text() {
	    UserActions.click(customtextsubtab);
    }
    
    public void verifies_custom_text() {
    	verifyPageNavigation(commonperiodGrid,"Custom Text page");
    }
    
    public void click_reports() {
	    UserActions.click(reportssubtab);
    }
    
    public void verifies_reports() {
    	verifyPageNavigation(commonperiodGrid,"Reports page");
    }
    
    public void click_override_authoring() {
	    UserActions.Click_JavaScript(overridessubtab);
    }
    
    public void verifies_override_authoring() {
    	verifyPageNavigation(commonperiodGrid,"Override Authoring page");
    }
    
    public void click_email_override() {
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(emailoverridessubtab);
    }
    
    public void verifies_email_override() {
    	UserActions.Wait_Sec();
    	verifyPageNavigation(commonperiodGrid,"Email Override page");
    }
    
    public void click_period_analysis() {
	    UserActions.Click_JavaScript(periodanalysisssubtab);
    }
    
    public void verifies_period_analysis() {
    	verifyPageNavigation(commonperiodGrid,"Period Analysis page");
    }
    
    public void click_period_copy() {
	    UserActions.Click_JavaScript(periodcopy);
    }
    
    public void verifies_period_copy() {
    	verifyPageNavigation(cancelbutton,"Period Copy page");
    }
    
    public void click_qc_scorecard() {
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(qcscorecard);
    }
    
    public void verifies_qc_scorecard() {
    	verifyPageNavigation(creatlink,"QC Scorecard page");
    	UserActions.Wait_Sec();
    	UserActions.click(creatlink);
    	UserActions.Wait_Sec();
    	UserActions.click(closebutton);
     }
    
    public void click_detailtypes() {
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(detailtype);
    }
    
    public void verifies_detailtypes() {
    	verifyPageNavigation(detailtypegrid,"Detail Type page");
    }
    
    public void click_assign_sets_to_type() {
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(assignsetstotype);
    }
    
    public void verifies_assign_sets_to_type() {
    	verifyPageNavigation(assignsetstotypegrid,"Assign Sets To Type page");
    }
    
    public void click_override_author() {
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(overrideauthoring);
    }
    
    public void verifies_override_author() {
    	verifyPageNavigation(overrideauthoringdrid,"Override Authoring page");
    }
   	
 
	public void click_documents() {
    	
	    UserActions.Click_JavaScript(documents);
	    UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(showall);
	    
    }
    
    public void verifies_documents() {
    	verifyPageNavigation(documentsgrid,"Documents page");
    }
    
    
	public void click_document_sets() {
    	
	    UserActions.Click_JavaScript(docsets);
    }
    
    public void verifies_document_sets() {
    	verifyPageNavigation(docsetsgrid,"Document Sets page");
    }
    
	public void click_assign_doc_to_sets() {
    	
	    UserActions.Click_JavaScript(assigndoctosets);
    }
    
    public void verifies_assign_doc_to_sets() {
    	verifyPageNavigation(assigndoctosetsgrid,"Assign Doc To Sets page");
    }
    
    public void click_doc_swap() {
    	
	    UserActions.Click_JavaScript(documentswap);
    }
    
    public void verifies_doc_swap() {
    	verifyPageNavigation(documentswapgrid,"Document Swap page");
    }
    
  public void click_standard_alt_doc_list() {
    	
	    UserActions.Click_JavaScript(standardaltdoclist);
    }
    
    public void verifies_standard_alt_doc_list() {
    	verifyPageNavigation(standardaltdoclistupload,"Standard Alt Doc List page");
    }
    
     public void click_dear_setup() {
    	
	    UserActions.Click_JavaScript(dearsetup);
    }
    
    public void verifies_dear_setup() {
    	verifyPageNavigation(dearsetupgrid,"Dear Setup page");
    }
    public void click_dear_template() {
    	
	    UserActions.Click_JavaScript(deartemplate);
    }
    
    public void verifies_dear_template() {
    	verifyPageNavigation(deartemplategrid,"Dear Template page");
    }
    
    public void click_cat() {
    	
	    UserActions.Click_JavaScript(dearcat);
    }
    
    public void verifies_cat() {
    	verifyPageNavigation(dearcatgridr,"Dear Catagory page");
    }

    public void click_permission() {
    	
	    UserActions.Click_JavaScript(permission);
    }
    
    public void verifies_permission() {
    	verifyPageNavigation(permissiongrid,"Permission page");
    }


    public void click_users() {
    	
	    UserActions.Click_JavaScript(users);
    }
    
    public void verifies_users() {
    	verifyPageNavigation(usersgrid,"Users page");
    }
    
    public void click_assign_clients() {
    	
	    UserActions.Click_JavaScript(assignclients);
    }
    
    public void verifies_assign_clients() {
    	verifyPageNavigation(usersgrid,"Assign Clients page");
    }
    
    public void click_assign_dep() {
    	
	    UserActions.Click_JavaScript(assigndeps);
    }
    
    public void verifies_assign_dep() {
    	verifyPageNavigation(usersgrid,"Assign Dep page");
    }
    
    public void click_assign_work_queue() {
    	
	    UserActions.Click_JavaScript(assignworkqueue);
    }
    
    public void verifies_assign_work_queue() {
    	verifyPageNavigation(assignworkqueuegrid,"Assign Work Queue page");
    }
 
   public void click_reporting() {
    	
	    UserActions.Click_JavaScript(reporting);
    }
    
    public void verifies_repoting() {
    	verifyPageNavigation(reportinggrid,"Reporting page");
    }

    
    public void click_bos() {
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(bos);
    }
    
    public void verifies_bos() {
    	verifyPageNavigation(stoprefresh,"BOS page");
    }
    
    public void click_current_jobs() {
    	UserActions.Wait_Sec();
	    UserActions.click(currentjobs);
    }
    
    public void verifies_current_jobs() {
    	UserActions.Wait_Sec();
    	verifyPageNavigation(currentjobGrid,"Current jobs page");
    }
    
    public void click_archieved_jobs() {
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(archievedjobs);
    }
    
    public void verifies_archieved_jobs() {
    	UserActions.Wait_Sec();
    	UserActions.click(retrievebutton);
	    UserActions.Wait_Sec();
	    UserActions.Wait_Sec();
	    UserActions.Wait_Sec();
    	verifyPageNavigation(archieveGrid,"Archieved jobs page and Grid");
   }
    
    public void click_job_schedular() {
	    UserActions.Click_JavaScript(jobsshedular);
    }
    
    public void verifies_job_schedular() {
    	verifyPageNavigation(scheduleGrid,"Job Schedular page");
    }
    
    public void click_monitoring() {
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(monitoring);
    }
    
    public void verifies_monitoring() {
    	verifyPageNavigation(moniteringGrid,"Monitoring page");
    }
    
    
    public void click_sqlizer() {
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(sqlizer);
    }
    
    public void verifies_sqlizer() {
    	verifyPageNavigation(userselect,"SQLizers page");
    }
    
    public void search_queries_on_sqlizer(String queryname) {
	    UserActions.SelectValueByIndex(userselect, 0);
	    UserActions.SetValue(inputnamesearch, queryname);
	    UserActions.click(searchbutton);
    	UserActions.Wait_Sec();
  }
   
    
    public void run_query_from_searched_results(String dateparameter) {
    	UserActions.Wait_Sec();
    	UserActions.click(select);
    	UserActions.Wait_Sec();
    	UserActions.SetValue(dateparam, dateparameter);
    	UserActions.Wait_Sec();
    	UserActions.click(runquerybutton);
   }
    
    
    public void verifies_result_grid() {
    	UserActions.Wait_Sec();
    	if(UserActions.getElement(resulttable).isDisplayed()) {
		   scenario.write("Results Grid on Run query verified successfully.");
	   }
    }
    
    public void click_setup_query() {
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(setupquery);
    }
    
    public void verifies_setup_query() {
    	verifyPageNavigation(savequery,"Setup Query page");
    }
    
    
     // MISC
    public void click_misc() {
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(misc);
    }
    
    public void verifies_misc() {
    	verifyPageNavigation(miscgrid,"MISC and Nickname page");
    }
	
    public void click_info_scripting() {
    
    	UserActions.Click_JavaScript(misc);
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(infoscriptingitem);
    }
    
    public void verifies_info_scripting() {
    	
    	verifyPageNavigation(infoscriptingitemgrid,"Info / Scripting Items page");
    }
    
    public void click_issue_details_reason() {
    	
    	UserActions.Click_JavaScript(misc);
    	UserActions.Wait_Sec();
    	UserActions.Click_JavaScript(issuedetailreason);
    }
    
    public void verifies_issue_details_reason() {
    	verifyPageNavigation(issuedetailreasongrid,"Issue Details Reason page");
    }
    
    public void click_issue_details_results() {
    
    	UserActions.Click_JavaScript(misc);
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(issuedetailresults);
    }
    
    public void verifies_issue_details_results() {
    	UserActions.Wait_Sec();
    	verifyPageNavigation(issuedetailresultsgrid,"Issue Details Results page");
    }
    
    public void click_override_reasons() {
    	UserActions.Click_JavaScript(misc);
    	UserActions.Wait_Sec();
	    UserActions.Click_JavaScript(overridereasons);
    }
    
    public void verifies_override_reasons() {
    	verifyPageNavigation(overridereasonsgrid,"Override Reasons page");
    }
	
	

    public void verifyPageNavigation(By element,String pagename) {
    	
    	UserActions.Wait_Sec();
    	UserActions.Wait_Sec();
    	if(UserActions.getElement(element).isDisplayed()) {
			Assert.assertTrue(true);
			scenario.write("Navigation to "+ pagename +" verified successfully.");
		}else {
			scenario.write("Navigation to "+ pagename +" could not be verified.");
		}
    	
    }
    
    
}
