package test;

import java.sql.Driver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import page.DashbordPage;
import page.LoginPage;
import utilities.CSTtest;

public class LoginTest {

	WebDriver  driver;
	String url = CSTtest.URL;
	String email = CSTtest.EMAIL;
	String password = CSTtest.PASSWORD;
	String Browser = CSTtest.BROWSER;

	@Test
	public void logionTest() {

		//renseigner les champs
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setEmail(email);
		loginpage.setPassord(password);
		loginpage.clickSubmit();


		//obtenir la confirmation

		DashbordPage dashbord = new DashbordPage(driver);
		String message = dashbord.getConfirmationMessage();
		Assert.assertEquals(message, "Logged in successfully");

	}


	@Before
	public void setUp() {

		//obtenir le driver
		driver = utilities.DriverFactory.open(Browser,true);
		//lancer le navigateur
		driver.get(url);

	}


	@After
	public void tearDown() {
		//fermer le navigateur
		driver.quit();

	}











}
