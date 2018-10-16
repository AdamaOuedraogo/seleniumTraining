package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xpath.operations.Bool;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	
	
	static String browsertype = CSTtest.BROWSER_TYPE;
	static boolean remote = CSTtest.IS_REMOTE;
	static String remote_hub = CSTtest.REMOTE_HUB;
	
	
	
	public static WebDriver open(String browsertype, Boolean remote)  {
		
		WebDriver driver = null;
		
		
		// recuperer le driver
		
	if(browsertype.equalsIgnoreCase("firefox")&& remote == false) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/nehemiecreation/Documents/Formation Selenium Webdriver/formation selenium webdriver/Librairie/geckodriver");
		 driver = new FirefoxDriver();
		 return driver;
		
	} else if(browsertype.equalsIgnoreCase("chrome")&& remote == false) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nehemiecreation/Documents/Formation Selenium Webdriver/formation selenium webdriver/Librairie/chromedriver");
		 driver = new ChromeDriver();
		 return driver;
		 
		
	}else if(browsertype.equalsIgnoreCase("firefox") && remote == true) {
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
		capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
		URL url = null;
		try {
			url = new URL(remote_hub);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new RemoteWebDriver(url, capabilities);
		driver.manage().window().maximize();
		return driver;
		
		
	}
	
	else {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nehemiecreation/Documents/Formation Selenium Webdriver/formation selenium webdriver/Librairie/chromedriver");
		 driver = new ChromeDriver();
		 return driver;
		
		
	}
		
		
		
		
		
		
		
		
	}
	
	
	
	

  	
}