package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abalas01\\Software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launch chrome //constructor will be called to launch Chrome
		
		driver.get("https://www.google.com"); //enter url http or https is mandatory
		
		String title = driver.getTitle(); // getting the page title (tab name)
		System.out.println("Page title is:" + title);
		
		//Verification Exp vs Actual
		
		if(title.equals("Google")){
			System.out.println("Correct title");
		}
		else{
			System.out.println("Incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl()); // To get current url
		
		
		System.out.println(driver.getPageSource());//To get page source
		
		//driver.close(); // close the browser
		driver.quit();

	}

}
