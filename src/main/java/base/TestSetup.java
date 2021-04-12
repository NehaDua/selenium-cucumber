package base;


import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageObjects.AdminPage;
import com.pageObjects.ClientIssuePage;
import com.pageObjects.Communications;
import com.pageObjects.DependentTypesPage;
import com.pageObjects.FileTransfer;
import com.pageObjects.Login_AdminPortal;
import com.pageObjects.Mailings;
import com.pageObjects.SelectCompany;
import com.pageObjects.SelectPeriod;
import com.pageObjects.SubscriberPage;
import com.pageObjects.SubscriberQuickSearch;
import com.pageObjects.SubscriberSearch;
import com.pageObjects.VerificationPage;
import com.pageObjects.QualityControl;
import cucumber.api.Scenario;
import gherkin.formatter.model.Feature;
import com.pageObjects.Reports;


public class TestSetup  {
	
	
	public static DesiredCapabilities caps;  
	public static WebDriver d;
	public static Properties p;
	public static WebDriverWait wait;
	public static Feature feature;
	public static Scenario scenario;
	public static Login_AdminPortal Login_Admin;
	public static SelectCompany sc;
	public static SelectPeriod sp;
	public static SubscriberPage sup;
	public static ClientIssuePage cip; 
	public static Mailings mal;
	public static SubscriberQuickSearch sqs;
	public static DependentTypesPage dtp;
	public static VerificationPage vrp;
	public static QualityControl qc;
	public static FileTransfer ftrs;
	public static SubscriberSearch ss;
	public static AdminPage adm;
	public static Communications com;
	public static Reports rpt;
	public static long l;

}
