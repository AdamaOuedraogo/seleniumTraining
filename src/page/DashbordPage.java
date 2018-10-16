package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashbordPage {
	
	WebDriver driver;
	
	
	public DashbordPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void changePassword() {
		
		driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[2]/div/div[2]/ul/li[1]/a")).click();;
	
   }
	
	public void updateSubscription() {
	
	}
	
	public void cancelAccount() {
		
		
	}
	
	public String getConfirmationMessage() {
		
		return driver.findElement(By.id("conf_message")).getText();
	}
}