package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinkNavigation {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		List<WebElement> footerlinks = driver.findElements(By.xpath("//ul[@class='footer-nav']//a"));
		
		for(int i = 1; i<footerlinks.size(); i++){ // i = 1 here to avoid freshworks page
			System.out.println(footerlinks.get(i).getText());
			footerlinks.get(i).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			footerlinks = driver.findElements(By.xpath("//ul[@class='footer-nav']//a")); // to re-initialise the web element to avoid statle exception
		}
		
	}

}

