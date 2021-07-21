package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	
	public WebDriver driver;
	
	/**
	 * 
	 * @param Broswername
	 * @return This function will return the webdriver based on the given browser name
	 */
	public WebDriver initdriver(String Broswername) {
		switch (Broswername.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
		return driver;
	}
	
	public void launchUrl(String urlname){
		if(urlname.isEmpty()){
			System.out.println("Please pass urlname");
		}
		else if(urlname.contains("http") || urlname.contains ("https")){
			driver.get(urlname);
		}
	}
	
	/*
	 * This function will return the title of the url
	 */
	public String getTitle(){
		return driver.getTitle();
	}
	
	public String getCurrentURL(){
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser(){
		driver.close();
	}
	
	public void quit(){
		driver.quit();
	}
}
