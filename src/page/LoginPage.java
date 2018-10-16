package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class LoginPage {
	
	//propriete
	
	@FindBy(name="ctl00$MainContent$txtUserName")
	WebElement emailElement ;
	@FindBy(name = "ctl00$MainContent$txtPassword")
	WebElement passwordElement ;
	@FindBy(name = "ctl00$MainContent$btnLogin")
	WebElement submitButtonElement ;
	@FindBy(xpath = "//*[@id=\\\"ctl01\\\"]/div[3]/div[2]/div/div[2]/a")
	WebElement CreateAccountElement ;
	WebDriver driver;

	
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
         
	}
	
	
	//les action dans la class
	
	public void setEmail(String email) {	
		emailElement.sendKeys(email);
		
	}
	
	public void setPassord(String password) {	
		passwordElement.sendKeys(password);
		
	}
	
	public void clickSubmit() {	
		submitButtonElement.click();
			
	}
	
	public void createAccount() {
		CreateAccountElement.click();
	}
	
	

}
