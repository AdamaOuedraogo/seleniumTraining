package seleniumUnitTest;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class loginwithJunit {
	
	WebDriver driver;
	String Weburl = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";


	@Test
	public void loginjunitTest() {

		//4. renseigner le login
		driver.findElement(By.name("ctl00$MainContent$txtUserName")).sendKeys("adama692@gmail.com");

		//1 trouver l'element
		//2. effectuer une action sur l'element
		//3. renseigner une valeur

		//Renseigner le mot de pass

		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("adama");
		//6. cliquer sur le bouton login

		driver.findElement(By.name("ctl00$MainContent$btnLogin")).click();
		//7. obtenir les confirmation

		boolean confirmation = driver.findElement(By.id("conf_message")).isDisplayed();
		assertTrue(confirmation);

		//7. capturer le titre du navigateur
		String ActualbrowserTitle = driver.getTitle();
		String expectedBrowsertitle = "SDET Trainging | Account Mannagement";

		//Assert.assertEquals(expectedBrowsertitle, ActualbrowserTitle);

	}

	@Before
	public void setUp() throws MalformedURLException {
		System.out.println("debut du test");
		//1. acceder au driver

		driver = utilities.DriverFactory.open("firefox",false);

		//2. acceder a l'application

		driver.get(Weburl);
	}

    @After
	public void tearDown() {

		System.out.println("fin du test");

		//Fermer le navigateur
		driver.quit();



	}




}
