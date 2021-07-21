package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenKartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver =br.initdriver("Chrome"); // getting driver hence we shall transfer it to elelemt util class
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(br.getTitle());
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eu = new ElementUtil(driver); //calling the constructor of elementutil
		eu.doSendKeys(email, "aish@gmail.com");
		eu.doSendKeys(password, "city11");
		
		br.closeBrowser(); // Close Browser
	
	}

}
