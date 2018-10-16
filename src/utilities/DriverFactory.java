package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	
	
	String browsertype = CSTtest.BROWSER_TYPE;
	boolean remote = CSTtest.IS_REMOTE;
	static String remote_hub = CSTtest.REMOTE_HUB;
	
	
	
	public static WebDriver open(String browsertype)  {
		
		WebDriver driver;
		
		
		// recuperer le driver
		
	if(browsertype.equalsIgnoreCase("firefox")) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/nehemiecreation/Documents/Formation Selenium Webdriver/formation selenium webdriver/Librairie/geckodriver");
		 driver = new FirefoxDriver();
		 return driver;
		
	} else if(browsertype.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nehemiecreation/Documents/Formation Selenium Webdriver/formation selenium webdriver/Librairie/chromedriver");
		 driver = new ChromeDriver();
		 return driver;
		 
		
	}
	
	else {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nehemiecreation/Documents/Formation Selenium Webdriver/formation selenium webdriver/Librairie/chromedriver");
		 driver = new ChromeDriver();
		 return driver;
		
		
	}
		
		
		
		
		
		
		
		
	}
	
	
	
	

  	
}