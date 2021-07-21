package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForURL {

public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("Aishwaryaautomation@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Automation@100");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//Boolean b = wait.until(ExpectedConditions.urlContains("route=account/account")); //part of the url
		if(waitForURLFraction("route=account/account", 10)){
			System.out.println("We have landed into Account page successfully");
		}
		
	}
	
	public static boolean waitForURLFraction(String urlFraction, int timeout){// substring of the url
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.urlContains(urlFraction));
	}
	
	public static boolean waitForURLToBe(String urlname, int timeout){// full name of the url
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.urlToBe(urlname));
	}

}
