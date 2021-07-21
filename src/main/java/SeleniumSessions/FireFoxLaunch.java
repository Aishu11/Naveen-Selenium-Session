package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\abalas01\\Software\\geckodriver\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver(); //constructor will be called to launch firefox
	
	driver.get("https://www.google.com");

	}

}
