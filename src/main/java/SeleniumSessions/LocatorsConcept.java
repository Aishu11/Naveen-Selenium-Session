package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//1. using id locator 
		//1st Approach - creating webelement and perfomring action in the same line
		
		//driver.findElement(By.id("input-email")).sendKeys("aishuk@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("test");
		
		//2. 2nd Approach - Creating webElements as a collection and then performing action later
		
		//WebElement email = driver.findElement(By.id("input-email"));
		//WebElement password = driver.findElement(By.id("input-password"));
		
		//email.sendKeys("abc@gmail.com");
		//password.sendKeys("test121");
		
		//Adv of 2nd Approach - can use the webelement variable multiple times
		
		//3. 3rd Approach - By locator strategy
		//By email = By.id("input-email");
		//By password = By.id("input-password");
		//driver.findElement(email).sendKeys("aish123@gmail.com");
		//driver.findElement(password).sendKeys("11abctest");		
		
		//Adv of 3rd over 2nd is - not hitting server (driver) each and every time) 29 and 38
		//Maintaing By locator and whenever needed using the driver.
		
		//4th Approach - By locator with some generic function
		//By email = By.id("input-email");
		//By password = By.id("input-password");
		//getElement(email).sendKeys("aish123@gmail.com");
		//getElement(password).sendKeys("test123");
		
		//5th Approach - By locator generic method get Element + generic method Send Keys
		//By email = By.id("input-email");
		//By password = By.id("input-password");
		//doSendKeys(email, "aish456@gmail.com");
		//doSendKeys(password, "reat122");
		
		//6th Approach
		//Maintain the util class
		//Move all the functions to that class
	}
	
	//Wrapper Methods:
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value){
		getElement(locator).sendKeys(value);
	}

}
