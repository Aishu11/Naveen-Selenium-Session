package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupHandle {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			//Alert is not a webelement it is a JS poopup 
			// It has 4 methods
			//ALERT API
			// we will be using Alert API in selenium by Switch To, get Text, Accept and then send keys
			
			driver.findElement(By.name("proceed")).click();
			Thread.sleep(2000);
			
			Alert alert = driver.switchTo().alert(); // kind of API to get switch to pop up
			
			String text = alert.getText();
			System.out.println(text);
			
			alert.accept(); // To click ok - for accepting
			//alert.dismiss(); // Just like esc - just ignoring the pop up
			//alert.sendKeys(""); // To enter some value in the pop up
			
			driver.switchTo().defaultContent(); // To get back the driver to the web page from the pop up
		
			
	}

}
