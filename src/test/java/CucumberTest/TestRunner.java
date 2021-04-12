package CucumberTest;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import base.TestSetup;


@RunWith(Cucumber.class)   
@CucumberOptions(
            features = "Feature",
            glue={"stepDefinition","base"},
            monochrome = true,
            dryRun=false,
            plugin = {"pretty","html:target","json:target/cucumber.json","junit:target/cucumber.xml"}
           
            
            )

public class TestRunner extends TestSetup {
	
	
	
	 @AfterClass
	    public static void teardown() {
		 
		 d.quit();
	        
	    }

}