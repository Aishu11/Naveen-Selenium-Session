package SeleniumSessions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementExceptionConcept {
	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, IOException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By emaillist = By.id("input-email");
		verifyElementPresent(emaillist);
		getElement(emaillist).sendKeys("aishu@gmail.com");
	}
	
	public static List<WebElement> doGetElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void verifyElementPresent(By locator){
		List<WebElement> emaillist = doGetElements(locator);
		System.out.println(emaillist.size());
		try {
			if (emaillist.size() == 0) {
				System.out.println("Element not present");
				throw new Exception("ELEMENTNOTPRESENTEXCEPTION");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
