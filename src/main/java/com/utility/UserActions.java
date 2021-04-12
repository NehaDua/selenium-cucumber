package com.utility;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;
import base.TestSetup;

public class UserActions extends TestSetup {


	    public static String url = null;
	    static long l = Long.parseLong(p.getProperty("ExplicitWait"));
        public static WebDriverWait wait = new WebDriverWait(d,l);
        /* Added by Pawan  */
        public static final By body = By.tagName(p.getProperty("body_locator"));
        public static Keys enter = Keys.ENTER;


        /* Added by Pawan  */
    	public static void pressENTER() {
    		d.findElement(body).sendKeys(Keys.ENTER);
    		
    	}
    	
    	  public static WebElement getElement(By locator) {
              return d.findElement(locator);
        		
        	}
          
    	  
          public static int GetElementsSize(By locator)
          {
             return d.findElements(locator).size();
      		
      	  }
          
  	
  		 public static void click_by_xpath(String xpathexp) {

          	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathexp)));
      		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathexp)));
      		d.findElement(By.xpath(xpathexp)).click();
          }
    	
        
	    public static void click(By locator) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		d.findElement(locator).click();
		
		
	/*	catch(Exception e)
		{
			scenario.write(e.getMessage());
		}*/

	}

	
	public static void SetValue(By locator, String input) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		d.findElement(locator).click();
		d.findElement(locator).clear();
		d.findElement(locator).sendKeys(input);
		
	
	}
	
	//Added by satya
	
	public static void SetValueClear(By locator) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		d.findElement(locator).clear();
	}
	
	
	//Added by satya
	public static void SetValueWOClear(By locator, String input) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		d.findElement(locator).click();
		d.findElement(locator).sendKeys(input);
	}
	
	
	
	
	
	

	public static void acceptAlert() {
		Alert alert = d.switchTo().alert();
		alert.accept();
	}

	public static void dismissAlert() {
		Alert alert = d.switchTo().alert();
		alert.dismiss();
	}

	public static String getTextOfAlert() {
		Alert alert = d.switchTo().alert();
		return alert.getText();
	}

	public static String getText(By locator) {
	
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return d.findElement(locator).getText();
	}

	public static void dragAndDrop(By drag, By drop) {
		Actions action = new Actions(d);
		WebElement draggable = d.findElement(drag);
		WebElement dropable = d.findElement(drop);
		action.dragAndDrop(draggable, dropable).build().perform();

	}

	public static String getTitle() {
		return d.getTitle();
	}

	public static void navigateBack() {
		d.navigate().back();
	}

	public static void navigateForward() {
		d.navigate().forward();
	}

	public static void doubleClick(By locator) {
		Actions action = new Actions(d);
		action.doubleClick(d.findElement(locator)).build()
				.perform();
	}

	public static void rightClick(By locator) {
		Actions action = new Actions(d);
		action.contextClick(d.findElement(locator)).build()
				.perform();
	}

	public static void mouseHover(By locator) {
		Actions action = new Actions(d);
		action.moveToElement(d.findElement(locator)).build()
				.perform();
	}

	public static boolean selectOption(WebDriver driver, String id,
			String optionName) {
		//highlight(d,d.findElement(By.id(id)));
		boolean val = false;

		WebElement select = driver.findElement(By.id(id));

		Select dropdown = new Select(select);

		List<WebElement> Options = dropdown.getOptions();

		for (WebElement option : Options) {

			if (option.getText().trim().equals(optionName)) {

				option.click();
				val = true;
				break;
			}

		}

		if (val == false) {

			throw new NoSuchElementException(
					"Could not locate the passed in <select> option value with the name: "
							+ optionName + " Selection of <option>: "
							+ optionName + " failed.");
		}
		return val;
	}
	
	public static void SelectValue(By locator, String optionName) {

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	Boolean flag = d.findElement(locator).isDisplayed();
	if(flag)
	{
    WebElement mySelectElement = d.findElement(locator);

    Select dropdown= new Select(mySelectElement);

    dropdown.selectByVisibleText(optionName);
	}

}
	
	public static void SelectValueByIndex(By locator, int optionIdex) 
	
	{

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    WebElement mySelectElement = d.findElement(locator);

    Select dropdown= new Select(mySelectElement);
    dropdown.selectByIndex(optionIdex);

    }

	
	public void Linkclick(String arg)
			throws Exception {
		
		List<WebElement> linkElements = d.findElements(
				By.tagName("a"));
		for (WebElement e : linkElements) {
			if (e.getText().trim().equals(arg)) {

				e.click();		

				break;
			}

		}

	}

	public static boolean selectOptionbyXpath(WebDriver driver,
			By dropdownselector, String optionName) {

		boolean val = false;

		Select dropdown = new Select(driver.findElement(dropdownselector));

		List<WebElement> Options = dropdown.getOptions();

		for (WebElement option : Options) {

			if (option.getText().trim().equals(optionName)) {

				option.click();
				val = true;
				break;
			}

		}

		if (val == false) {

			throw new NoSuchElementException(
					"Could not locate the passed in <select> option value with the name: "
							+ optionName + " Selection of <option>: "
							+ optionName + " failed.");
		}
		return val;
	}

	public static void SelectAllCheckboxes(By locator) throws Exception {
		
		List<WebElement> checkboxes = d.findElements(locator);
		
		
		for (WebElement checkbox : checkboxes) {
			if (checkbox.isDisplayed() && !checkbox.isSelected()
					&& checkbox.isEnabled()) {
				//waitForPageLoad(d);
				checkbox.click();
			}
		}

	}

	public static void SelectCheckboxesWithLabelName(String label) {
		By labelLocator = By.xpath("//input[@id=//label[text()='" + label
				+ "']/@for]");


		WebElement labelElement = d
				.findElement(labelLocator);

		if (labelElement.isDisplayed() && !labelElement.isSelected()
				&& labelElement.isEnabled()) {

			labelElement.click();
		}

	}

/*	public static void waitForPageLoad(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		Predicate<WebDriver> pageLoaded = new Predicate<WebDriver>() {

			public boolean apply(WebDriver input) {
				return ((JavascriptExecutor) input).executeScript(
						"return document.readyState").equals("complete");
			}

		};
		//System.out.println(pageLoaded);
		wait.until((Function<? super WebDriver, V>) pageLoaded);
	}*/

	public static void visibilityOfElementLocated(WebDriver driver, By Locator) {
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
}
	
	
	public static void invisibilityOfElementLocated(WebDriver driver, By Locator) {
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(Locator));
}
	
	
	public static void visibilityOfAllElementsLocated(WebDriver driver, List<WebElement> Locator)
	{
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElements(Locator));

    }

	public static void clicklink(String client_name) {
		List<WebElement> linkElements = d.findElements(By.tagName("a"));								
		for (WebElement e : linkElements) {		
			if (e.getText().trim().equals(client_name)) {
				
				e.click();
				
				break;
			}
					
    }		
	}

	public static void WaitforDivToLoad() throws Exception {
		Thread.sleep(5000);
		
	}
	


public static WebElement fluentWaitforElement(WebElement element, int timoutSec, int pollingSec) {

    FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(d).withTimeout(timoutSec, TimeUnit.SECONDS)
        .pollingEvery(pollingSec, TimeUnit.SECONDS)
        .ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);

    for (int i = 0; i < 3; i++) {
        try {
           
        fWait.until(ExpectedConditions.visibilityOf(element));
        fWait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {

        System.out.println("Element Not found trying again - " + element.toString().substring(70));
        e.printStackTrace();

        }
    }

    return element;

    }

public static void SetObjectSyncronizationTimeOut() 
{
	long time = Long.parseLong(p.getProperty("implicitWait"));
	d.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);  
} 


public static void WaitPageToLoad()
{
	
	long time = Long.parseLong(p.getProperty("PageLoadWait"));	
	d.manage().timeouts().pageLoadTimeout(time,TimeUnit.SECONDS);
}


public static void highlight(WebDriver driver,WebElement webElement){
	

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: #ffff99; border: 2px solid #333300;');", webElement);
}

//Added by satya
public static void ElementClick(By locator,WebElement element)
	{
		
			try {
            ((JavascriptExecutor)d).executeScript(
                    "arguments[0].scrollIntoView(true);",locator);
        } catch (Exception e) {

        }
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
			Actions builder= new Actions(d);
			builder.click(element).build().perform();
			}
          
        catch (Exception e){
           System.out.println("Exception occured in  Clicking the object");
         
       }
		
	}

//Added by Satya
public static void Click_JavaScript(By locator)
{
	//wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	//wait.until(ExpectedConditions.elementToBeClickable(locator));
	WebElement element = d.findElement(locator);
	JavascriptExecutor executor = (JavascriptExecutor)d;
	executor.executeScript("arguments[0].click();",element);  
}


public static void ElementClick(By locator)

	   {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	  wait.until(ExpectedConditions.elementToBeClickable(locator));
		WebElement w = d.findElement(locator);
		Actions builder= new Actions(d);
		builder.click(w).build().perform();
         
       }
		
//  Added by Satya
public static void Wait_Sec()
{		
	try {
            long time = Long.parseLong(p.getProperty("wait"));	
		Thread.sleep(time);	
	} catch (Exception e) {
		  e.getMessage();              
		
	}
}

//public static void Wait_Sec()
//{	
//	try {
//	 Wait<WebDriver> wait = new WebDriverWait(d, 100);
//	    wait.until(new Function<WebDriver, Boolean>() {
//	        public Boolean apply(WebDriver driver) {
//	            System.out.println("Current Window State       : "
//	                + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
//	            return String
//	                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
//	                .equals("complete");
//	        }
//	    });
//	}catch (Exception e) {
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e1) {
//			
//			e1.printStackTrace();
//		}
//	}
//}

public static void waitForGivenMillSecs() {
	try {
         long time = Long.parseLong(p.getProperty("wait"));	
		Thread.sleep(time);	
	} catch (Exception e) {
		  e.getMessage();              
	}

	
}

//Added by satya
public static void Close()
{
	if (d != null)
	{
		d.close();
	}
	else
	{
		System.out.println("driver is null");
	}    
	
}

//Added by satya
public static void  CloseAllBrowsers()
{

	try{
	    	if (d != null)
	    	{  	    
	    		d.quit();	
	    	}
	    	
	}catch(Exception e){
		
		e.getMessage();
	}

}

//Added by satya
public static void SelectDefaultContent()
{
	try
	{			
		d.switchTo().defaultContent();
		 
	}
	catch(Exception e)
	{
	e.getMessage();
	}	
}

//Added by satya
public static void SwitchTab(int TabId)
{
        try{
        
   ArrayList<String>tabs = new ArrayList<String>(d.getWindowHandles());
   int intIndex= tabs.size();
   System.out.println(intIndex);
  //(this.strLocator.split("=")[1]).equalsIgnoreCase("TabId");
   //int TabId = Integer.parseInt(this.strLocator.split("=")[1]);
   //System.out.println(TabId);
   d.switchTo().window(tabs.get(TabId));
   d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"/t");
 

        }
        catch(Exception e)
        {
             e.getMessage();
        }
              
}

//Added by satya
 public static void OpenNewTab()

 {
		try {
		//this.objWebDriver.findElement(By.cssSelector("body")).sendKeys(
		//Keys.CONTROL + "t");
		
		((JavascriptExecutor)d).executeScript("window.open();");
		
	} catch (Exception e) {
	     e.getMessage();
	}
	    
 }
 
/* public static void SelectWindow()
 
 {
	 
	 String parent = d.getWindowHandle();
	 Set<String> availableWindows = d.getWindowHandles();
	    Iterator<String> w1 = availableWindows.iterator();
	    
	    while(w1.hasNext())
	    {
	    	String childWindow = w1.next();
	    	if(!parent.equals(childWindow))
	    	{
	    	d.switchTo().window(childWindow);
           System.out.println(d.getCurrentUrl());
	    	}
	    	
		}   */ 	
	
	  //  UserActions.Wait_Sec();	  	
	  // d.switchTo().window(parent);
	 
		
	//}
	
 public static void SelectWindow()
 {
	
	 String parent=d.getWindowHandle();
	 
	 UserActions.Wait_Sec();
	// This will return the number of windows opened by Webdriver and will return Set of St//rings
	Set<String>s1=d.getWindowHandles();
	 
	// Now we will iterate using Iterator
	Iterator<String> I1= s1.iterator();
	 
	while(I1.hasNext())
	{
	 
	   String child_window=I1.next();
	 
	// Here we will compare if parent window is not equal to child window then we            will close
	 
	if(!parent.equals(child_window))
	{
	
	wait.until(ExpectedConditions.numberOfwindowsToBe(2));
	d.switchTo().window(child_window);
	
	UserActions.Wait_Sec();
	
	scenario.write(d.switchTo().window(child_window).getCurrentUrl());
	
	UserActions.Wait_Sec();
	UserActions.Wait_Sec();
	
	d.close();
	
	UserActions.Wait_Sec();
	
	d.switchTo().window(parent);
	 
	}
	 
	}
	// once all pop up closed now switch to parent window
			
	}

 
//Added by satya
	public static void SelectFrame(WebElement element, int intIndex)
	{
		try {
			//this.objWebElement = new AFTWebElement(objWebDriver).getTargetObject(this.strLocator,this.intIndex);
			Integer index = intIndex;
	
			if(element != null) {
				d.switchTo().frame(element);
		
			}else if(index!=null){
				d.switchTo().frame(index);
	            }		
		} catch(Exception e) {
			e.getMessage();
		}		
		
	}
	
	public static void GetValue(WebElement element ,String storeValue)
	{
		try {
			//this.objWebElement = new AFTWebElement(objWebDriver).getTargetObject(this.strLocator,this.intIndex);
            storeValue = element.getAttribute("value");
          
        } catch (Exception e) {
            e.getMessage();
        }	
		
	}
//Added by satya	
	
    public static void DoubleClick(WebElement element)
   	{
   		try {
   		
   			Actions builder= new Actions(d);
   			builder.doubleClick(element).build().perform();
               
           } catch (Exception e){
               System.out.println("Exception occured in Right Clicking the object");
               System.out.println(e.getMessage());
           }
   		
   	}
    
    
 //Added by satya
	public static String getCurrentUrl() {
		
		d.getCurrentUrl();
		
	
		
		return d.getCurrentUrl();
	}
	
	
	
	
	
    public static String GetAllListValues(By locator)
    {
   	 String strAllItems = "";
   	 
    	 wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
   		 WebElement element = d.findElement(locator);
   		if(element.getTagName().trim().equalsIgnoreCase("UL"))
   		{
   			List<WebElement> objListItems = element.findElements(By.xpath("./li"));
   			for(WebElement item : objListItems)
   			{
   				strAllItems = item.getText() + ";" + strAllItems ;
   			}
   		}
   		else if(element.getTagName().trim().equalsIgnoreCase("Select"))
   		{
   			List<WebElement> objListItems = element.findElements(By.xpath("./option"));
   			for(WebElement item : objListItems)
   			{
   				strAllItems = item.getText() + ";" + strAllItems ;
   				
   			}
   		}
   		else if(element.getTagName().trim().equalsIgnoreCase("div"))
      		{
      			List<WebElement> objListItems = element.findElements(By.xpath("./div"));
      			for(WebElement item : objListItems)
      			{
      				strAllItems = item.getText() + ";" + strAllItems ;
      				
      			}
      		}
   		
   		else
   		{
               
   		}
   		
   		return strAllItems;  

    }
   
    
 //Added by satya
    public static void RefreshBrowser()
    {	   
			d.navigate().refresh();   	
    }  
    
    
    public static String GetText_JavaScript(By locator)
    {	   
    	if(d.findElement(locator).getAttribute("innerText") != null)
    	{
    		return d.findElement(locator).getAttribute("innerText").trim();
    	}
    	else {
    		return d.findElement(locator).getText().trim();
    	}
    } 
    
    
    
    
    
    
    public static void SetValue_JavaScript(By locator, String input)
    {
    			
    	    WebElement w = d.findElement(locator);
    	    WrapsDriver we = (WrapsDriver)w;		
    		d = we.getWrappedDriver();
    	    JavascriptExecutor javascript = (JavascriptExecutor)d;   
    	    javascript.executeScript("arguments[0].innerHTML= '"+input+"'",w);
    	   // javascript.executeScript(script,w)
    	    
    }
    	  
    
	public static void  ClickAndGetHyperlinks(By locator) throws Exception 
	{
		String sValue = "";
		String value = "";
		ArrayList<String>tabs= null;
		
	    List<WebElement> pdf = d.findElements(locator);
			
		int linkCount=pdf.size();
		System.out.println("Total number of pdf on the webpage:"+ linkCount);
		for (WebElement element:pdf)
		
		           {
				    UserActions.WaitforDivToLoad();
				    if(element.isDisplayed())
				    {
					element.click();
				    }
					
				   } 
				  
					 
	
          }
	
	
	
	
	public static void KeyboardInputForSingleKey(Object KeyValue) throws AWTException {

		
		    Robot r = new Robot();
	
			if (KeyValue.equals("A") || KeyValue.equals("a")) {
				r.keyPress(KeyEvent.VK_A);
			} else if (KeyValue.equals("B") || KeyValue.equals("b")) {
				r.keyPress(KeyEvent.VK_B);
			} else if (KeyValue.equals("C") || KeyValue.equals("c")) {
				r.keyPress(KeyEvent.VK_C);
			} else if (KeyValue.equals("D") || KeyValue.equals("d")) {
				r.keyPress(KeyEvent.VK_D);
			} else if (KeyValue.equals("E") || KeyValue.equals("e")) {
				r.keyPress(KeyEvent.VK_E);
			} else if (KeyValue.equals("F") || KeyValue.equals("f")) {
				r.keyPress(KeyEvent.VK_F);
			} else if (KeyValue.equals("G") || KeyValue.equals("g")) {
				r.keyPress(KeyEvent.VK_G);
			} else if (KeyValue.equals("H") || KeyValue.equals("h")) {
				r.keyPress(KeyEvent.VK_H);
			} else if (KeyValue.equals("I") || KeyValue.equals("i")) {
				r.keyPress(KeyEvent.VK_I);
			} else if (KeyValue.equals("J") || KeyValue.equals("j")) {
				r.keyPress(KeyEvent.VK_J);
			} else if (KeyValue.equals("K") || KeyValue.equals("k")) {
				r.keyPress(KeyEvent.VK_K);
			} else if (KeyValue.equals("L") || KeyValue.equals("l")) {
				r.keyPress(KeyEvent.VK_L);
			} else if (KeyValue.equals("M") || KeyValue.equals("m")){
				r.keyPress(KeyEvent.VK_M);
			} else if (KeyValue.equals("N") || KeyValue.equals("n")){
				r.keyPress(KeyEvent.VK_N);
			} else if (KeyValue.equals("O") || KeyValue.equals("o")){
				r.keyPress(KeyEvent.VK_O);
			} else if (KeyValue.equals("P") || KeyValue.equals("p")) {
				r.keyPress(KeyEvent.VK_P);
			} else if (KeyValue.equals("Q") || KeyValue.equals("q")) {
				r.keyPress(KeyEvent.VK_Q);
			} else if (KeyValue.equals("R") || KeyValue.equals("r")) {
				r.keyPress(KeyEvent.VK_R);
			} else if (KeyValue.equals("S") || KeyValue.equals("s")) {
				r.keyPress(KeyEvent.VK_S);
			} else if (KeyValue.equals("T") || KeyValue.equals("t")){
				r.keyPress(KeyEvent.VK_T);
			} else if (KeyValue.equals("U") || KeyValue.equals("u")) {
				r.keyPress(KeyEvent.VK_U);
			} else if (KeyValue.equals("V") || KeyValue.equals("v")){
				r.keyPress(KeyEvent.VK_V);
			} else if (KeyValue.equals("W") || KeyValue.equals("w")) {
				r.keyPress(KeyEvent.VK_W);
			} else if (KeyValue.equals("X") || KeyValue.equals("x")) {
				r.keyPress(KeyEvent.VK_X);
			} else if (KeyValue.equals("Y") || KeyValue.equals("y")) {
				r.keyPress(KeyEvent.VK_Y);
			} else if (KeyValue.equals("Z") || KeyValue.equals("z")) {
				r.keyPress(KeyEvent.VK_Z);
			} else if (KeyValue.equals("0")) {
				r.keyPress(KeyEvent.VK_0);
			} else if (KeyValue.equals("1")) {
				r.keyPress(KeyEvent.VK_1);
			} else if (KeyValue.equals("2")) {
				r.keyPress(KeyEvent.VK_2);
			} else if (KeyValue.equals("3")) {
				r.keyPress(KeyEvent.VK_3);
			} else if (KeyValue.equals("4")) {
				r.keyPress(KeyEvent.VK_4);
			} else if (KeyValue.equals("5")) {
				r.keyPress(KeyEvent.VK_5);
			} else if (KeyValue.equals("6")) {
				r.keyPress(KeyEvent.VK_6);
			} else if (KeyValue.equals("7")) {
				r.keyPress(KeyEvent.VK_7);
			} else if (KeyValue.equals("8")) {
				r.keyPress(KeyEvent.VK_8);
			} else if (KeyValue.equals("9")) {
				r.keyPress(KeyEvent.VK_9);
			} else if (KeyValue.equals("*")) {
				r.keyPress(KeyEvent.VK_ASTERISK);
			} else if (KeyValue.equals("&")) {
				r.keyPress(KeyEvent.VK_AMPERSAND);
			} else if (KeyValue.equals("BACKSLASH")||KeyValue.equals("backslash")) {
				r.keyPress(KeyEvent.VK_BACK_SLASH);
			} else if (KeyValue.equals("BACKSPACE")|| KeyValue.equals("backspace")) {				r.keyPress(KeyEvent.VK_BACK_SPACE);			} else if (KeyValue.equals("CAPSLOCK")|| KeyValue.equals("capslock")) {
				r.keyPress(KeyEvent.VK_CAPS_LOCK);
			} else if (KeyValue.equals(":")) {
				r.keyPress(KeyEvent.VK_COLON);
			} else if (KeyValue.equals("ESCAPE")|| KeyValue.equals("escape")) {
				r.keyPress(KeyEvent.VK_ESCAPE);
			} else if(KeyValue.equals("CONTROL")){
                    r.keyPress(KeyEvent.VK_CONTROL);
            } else if(KeyValue.equals("ALT")){
                    r.keyPress(KeyEvent.VK_ALT);
		    } else if(KeyValue.equals("ENTER")){
            	    r.keyPress(KeyEvent.VK_ENTER);
            } else if (KeyValue.equals("TAB")|| KeyValue.equals("tab")){
                    r.keyPress(KeyEvent.VK_TAB);
			} else if (KeyValue.equals("EURO")|| KeyValue.equals("euro")) {
				r.keyPress(KeyEvent.VK_EURO_SIGN);
			} else if (KeyValue.equals("!")) {
				r.keyPress(KeyEvent.VK_EXCLAMATION_MARK);
			} else if (KeyValue.equals("F1")|| KeyValue.equals("f1")) {
				r.keyPress(KeyEvent.VK_F1);
			} else if (KeyValue.equals("F2")|| KeyValue.equals("f2")) {
				r.keyPress(KeyEvent.VK_F2);
			} else if (KeyValue.equals("F3")|| KeyValue.equals("f3")) {
				r.keyPress(KeyEvent.VK_F3);
			} else if (KeyValue.equals("F4")|| KeyValue.equals("f4")) {
				r.keyPress(KeyEvent.VK_F4);
			} else if (KeyValue.equals("F5")|| KeyValue.equals("f5")) {
				r.keyPress(KeyEvent.VK_F5);
			} else if (KeyValue.equals("F6")|| KeyValue.equals("f6")) {
				r.keyPress(KeyEvent.VK_F6);
			} else if (KeyValue.equals("F7")|| KeyValue.equals("f7")) {
				r.keyPress(KeyEvent.VK_F7);
			} else if (KeyValue.equals("F8")|| KeyValue.equals("f8")) {
				r.keyPress(KeyEvent.VK_F8);
			} else if (KeyValue.equals("F9")|| KeyValue.equals("f9")) {
				r.keyPress(KeyEvent.VK_F9);
			} else if (KeyValue.equals("F10")|| KeyValue.equals("f10")) {
				r.keyPress(KeyEvent.VK_F10);
			} else if (KeyValue.equals("F11")|| KeyValue.equals("f11")){
				r.keyPress(KeyEvent.VK_F11);
			} else if (KeyValue.equals("F12")|| KeyValue.equals("f12")) {
				r.keyPress(KeyEvent.VK_F12);
			} 
			
		
	}	

}


