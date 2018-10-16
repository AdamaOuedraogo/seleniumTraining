package smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) {
		//1. acceder au driver
		
		System.setProperty("webdriver.chrome.driver", "/Users/nehemiecreation/Documents/Formation Selenium Webdriver/formation selenium webdriver/Librairie/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//2. acceder a l'application
		
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		
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
		
		String confirmation = driver.findElement(By.id("conf_message")).getText();
		
		//7. capturer le titre du navigateur
		String browserTitle = driver.getTitle();
		System.out.println(browserTitle);
		
		if(confirmation.equals("Logged in successfully")) {
			System.out.println("je suis bien connecte" + confirmation);
		}
		
		//Fermer le navigateur
		driver.quit();
		
	}

}
