package test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.DashbordPage;
import page.LoginPage;

public class LoginTest {

	WebDriver  driver;

	@Test
	public void logionTest() {

		//obtenir le driver
		driver = utilities.DriverFactory.open("firefox");

		//lancer le navigateur
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		//renseigner les champs
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setEmail("adama692@gmail.com");
		loginpage.setPassord("adama");
		loginpage.clickSubmit();
		
		
		//obtenir la confirmation
		
		DashbordPage dashbord = new DashbordPage(driver);
		String message = dashbord.getConfirmationMessage();
		Assert.assertTrue(message.contains("successfully"));

		//fermer le navigateur

		driver.quit();




	}











}
