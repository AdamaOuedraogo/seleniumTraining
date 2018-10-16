package seleniumUnitTest;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Atagtestngunittest {
	
	
	WebDriver driver;

	
	
	@Test
	public void AtaElementTest() {
	
			driver = utilities.DriverFactory.open("chrome");
		
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		List<WebElement> atagElements= driver.findElements(By.tagName("a"));
		
		
		System.out.println(atagElements.size());
		
		for(WebElement atagelement : atagElements ) {
			
			if(atagelement.getText().equals("CREATE ACCOUNT")) {
				System.out.print("Bienvenue sur la page de login");
			}
	
	
		}
		
	}
		
	    @BeforeMethod
		public void setUp()  {
			
			driver = utilities.DriverFactory.open("chrome");
			driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
			
		}
		
		
	    @AfterMethod
		public void tearDown() {
			
			driver.quit();
		
		
	
		
		
		
	}

}
