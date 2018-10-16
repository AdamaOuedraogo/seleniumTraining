package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		
	}
	
	public void setEmail(String email) {
		
		driver.findElement(By.name("ctl00$MainContent$txtUserName")).sendKeys(email);
		
	}
	
	public void setPassord(String password) {
		
		
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys(password);
		
		
	}
	
	public void clickSubmit() {
		
		driver.findElement(By.name("ctl00$MainContent$btnLogin")).click();
		
		
	}
	
	public void createAccount() {
		
		driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/a")).click();
		
		
	}
	
	

}
