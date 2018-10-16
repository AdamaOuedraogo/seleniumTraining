package seleniumUnitTest;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Logintestinput {
	
	WebDriver driver ;
	
  @Test
  public void loinputTest() {
	  
	 
	  
	  boolean emailinput = driver.findElement(By.id("MainContent_txtUserName")).isDisplayed();
	  boolean passwordInput = driver.findElement(By.id("MainContent_txtPassword")).isDisplayed();
	  
	  assertTrue(emailinput);
	  assertTrue(passwordInput);
	  
	  
	  
	  
  }
  
  @BeforeMethod
  public void setUp()  {
      driver = utilities.DriverFactory.open("chrome",false);
	  driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	  
	  
  }
  
  @AfterMethod
  public void tearDown() {
	  
	  driver.quit();
	  
	  
  }
}
