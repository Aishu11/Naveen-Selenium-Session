package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;



public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// imp wait --- 10
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By emailID = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");

		// WebDriverWait: -- Class
		// can be aplied for any web elements
		// not a global wait
		// wont be applied for all the webelements
		// can be applied for non web elements: title, url, alert

		// An expectation for checking that an element is present on the DOM of
		// a page.
		// This does not necessarily mean that the element is visible.

		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(Is True)
		
	}

}
