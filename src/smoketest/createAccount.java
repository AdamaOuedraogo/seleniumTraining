package smoketest;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class createAccount {
	

	public static void main(String[] args) {
		
		String name = "adama";
		String Email = "adama692@gmail.com";
		String phone = "08976567";
		String password = "adama";
		String country = "Germany";
		String Url ="http://sdettraining.com/trguitransactions/AccountManagement.aspx"; 
		String browserType = "firefox";
		WebDriver driver;
		
	
		
          driver = utilities.DriverFactory.open("firefox");
          driver.get(Url);
          
          
      	// cliquer sur le bouton create account
          
          WebElement createAccountElement = driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a"));
  		
  		createAccountElement.click();
  		//driver.findElement(By.linkText("Create Account")).click();
          
          //webelement
         
          WebElement nameElement = driver.findElement(By.id("MainContent_txtFirstName"));
          WebElement emailElement = driver.findElement(By.id("MainContent_txtEmail"));
          WebElement phoneElement = driver.findElement(By.id("MainContent_txtHomePhone"));
          WebElement submitElement = driver.findElement(By.xpath("//*[@id=\"MainContent_btnSubmit\"]"));
          WebElement passwordElement = driver.findElement(By.name("ctl00$MainContent$txtPassword"));
          WebElement veryPasswordElement = driver.findElement(By.name("ctl00$MainContent$txtPassword"));
          
         
		
	

		// renseigner le name 
		nameElement.sendKeys(name);
		
		// renseigner le email
		emailElement.sendKeys(Email);
		
		// renseigner le phone
		
		phoneElement.sendKeys(phone);
		
		// cliquer sur le gender
		
		driver.findElement(By.cssSelector("input[value='Female'][type = 'radio']")).click();
		
		//renseigner le password
		
		passwordElement.sendKeys(password);
		
		//renseigner le Verify Password
		
		veryPasswordElement.sendKeys(password);
		
		// renseigner la dropDown
		
		new Select(driver.findElement(By.id("MainContent_menuCountry"))).selectByValue(country);
		
		// renseigne le checkBox
		
		driver.findElement(By.id("MainContent_checkWeeklyEmail")).click();
		
		// cliquer sur le bouton create account xpath
		
		submitElement.click();
		
		//Get confirmation 
		
		String confirmation = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		
	    if(confirmation.equalsIgnoreCase("Customer information added successfully")) {
	    	
	    	
	    	System.out.println("j' ai crée mon compte");
	    }
		
	    
	    //  quiter le driver 
	    
	    driver.quit();
		
		

	}

}
