package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.UserActions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestBase extends TestSetup {
	

		
	  // @Before
	
		public static void loadProperty()
		{
			p = new Properties();
			try {
				
				File ff = new File(System.getProperty("user.dir")+"//Config//config.properties");
				System.out.println(ff);
				FileInputStream f = new FileInputStream(ff);
				p.load(f);
				//System.out.println("properties loaded");
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		} 
	   
	 //  @Before
		public static void setWebdriver()
		{
			//System.out.println("getting property"+ p.getProperty("browser"));
			String b = p.getProperty("browser");
			
			if(b.equalsIgnoreCase("chrome"))
			{
				
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Config//chromedriver.exe");
				String downloadFilepath = "config\\data_reports";
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadFilepath);
				ChromeOptions options = new ChromeOptions();
				HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--test-type");
				options.addArguments("--disable-extensions");
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
						UnexpectedAlertBehaviour.IGNORE);
				cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
				cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				cap.setCapability(ChromeOptions.CAPABILITY, options);
				d = new ChromeDriver(cap);
				d.get(p.getProperty("url"));
			}
			else if(b.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Config//geckodriver.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        		capabilities.setCapability("acceptInsecureCerts", true);
        		capabilities.setJavascriptEnabled(true);
        		capabilities.setCapability("marionette", true);
        		d = new FirefoxDriver(capabilities);
        		d.get(p.getProperty("url"));
			}
			else if(b.equalsIgnoreCase("internet explorer"))
			{
				
        		caps = DesiredCapabilities.internetExplorer();

               // caps.setCapability("nativeEvents",true);    
                //caps.setCapability("unexpectedAlertBehaviour", "accept");
                caps.setCapability("ignoreProtectedModeSettings", true);
                //caps.setCapability("disable-popup-blocking", true);
                 //caps.setCapability("enablePersistentHover", true);
              	caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS , true);
              	caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
              	caps.setCapability("ignoreZoomSetting", true);
              	caps.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, org.openqa.selenium.UnexpectedAlertBehaviour.IGNORE);
              	System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Config//IEDriverServer.exe");
				d=new InternetExplorerDriver(caps);
				if(p.getProperty("url").contains("https"))
				{
				d.get(p.getProperty("url"));
				d.navigate().to("javascript:document.getElementById('overridelink').click()");
				}
				else {
					d.get(p.getProperty("url"));
				}
				
			}
			
			d.manage().window().maximize();
			//Resize the current window to the given dimension
			//d.manage().timeouts().setScriptTimeout(400,TimeUnit.SECONDS);
			l = Long.parseLong(p.getProperty("implicitWait"));
			d.manage().timeouts().implicitlyWait(l, TimeUnit.SECONDS);
			
		}	    
     
		@Before
		public void keepScenario(Scenario scenario) {
			this.scenario = scenario;
		
			//System.out.println("scenario called");

		}
		//@Before
		public static WebDriver getWebdriver() {
			return d;

		}
		

/*
		public static WebDriver getWebdriver() {
			return driver;

		}*/
	    
	@After
		public void embedScreenshot(Scenario scenario) throws Exception {
			
			
				try {
					byte[] screenshot = ((TakesScreenshot) d).getScreenshotAs(OutputType.BYTES);
					scenario.embed(screenshot, "image/png");
				} catch (WebDriverException wde) {
					System.err.println(wde.getMessage());

				}	
				
				//Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
				
			  // d.quit();
			
		}  
	    
	    
	    
	}
