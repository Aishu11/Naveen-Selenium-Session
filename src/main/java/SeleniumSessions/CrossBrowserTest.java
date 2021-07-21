package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {
	  static WebDriver driver;
	 
	public static void main(String[] args) {
		String browser = "firefox";
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\abalas01\\Software\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\abalas01\\Software\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Please pass the correct browser");
			break;
		}

		driver.get("https://www.google.com"); 
		String title = driver.getTitle(); 
		
		System.out.println("Page title is:" + title);
		if (title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect title");
		}

		System.out.println(driver.getCurrentUrl()); // To get current url

		//System.out.println(driver.getPageSource());// To get page source

		// driver.close(); // close the browser
		driver.quit();
	}

}
