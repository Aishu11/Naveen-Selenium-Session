package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForwardAndBackwardButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://amazon.com"); // To navigate to specific page in browser
		System.out.println(driver.getTitle());
		
		driver.navigate().back(); // to click on back arrow in the browser
		System.out.println(driver.getTitle());
		
		driver.navigate().forward(); // to click on back arrow in the browser
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh(); // to refresh the page
		
		//Navigate methods - 4 methods
		//to();
		//back();
		//forward();
		//refresh();

	}

}
