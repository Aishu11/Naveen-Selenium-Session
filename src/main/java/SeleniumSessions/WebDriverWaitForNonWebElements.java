package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForNonWebElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();

//		WebDriverWait wait = new WebDriverWait(driver, 10); // wait for 10 seconds till the alert is visible
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent()); // It will wait for alert and it will automaticaly get switched to alert
//		// We dont need to give driver.switchto
//		//Above method will take care
//		
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
//		driver.switchTo().defaultContent();
		
		System.out.println(alertGetText(5));
		acceptAlert(5);
		driver.switchTo().defaultContent();
		
		
	}
	
	//Private method is called by public method - Encapsulation
	// In this same class we could access this private method but not when moved to Element util
	private static Alert waitForAlert(int timeout){ // we dont use this method from main functin as internally it is being called.
		WebDriverWait wait = new WebDriverWait(driver, timeout); 
		return wait.until(ExpectedConditions.alertIsPresent()); // return type of this statement is Alert 
		// No need to give switch to
	}
	
	public static void acceptAlert(int timeout){
		waitForAlert(timeout).accept(); // just calling the above method for alert.accept
	}
	
	public static void dismissAlert(int timeout){
		waitForAlert(timeout).dismiss(); // just calling the above method for alert.dismiss
	}
	
	public static String alertGetText(int timeout){
		return waitForAlert(timeout).getText(); // just calling the above method for alert.getText
	}
	
	public static void alertSendKeys(int timeout, String value){
		waitForAlert(timeout).sendKeys(value); // just calling the above method for alert.getText
	}
}

