package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		
		List<WebElement>linkslist = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links:" + linkslist.size());
		
		for(WebElement e: linkslist){
			if((e.getAttribute("href") != null) && (!e.getAttribute("href").isEmpty()) && (e.getAttribute("href") != "javascript:void(0"))
			System.out.println(e.getAttribute("href"));
		}

	}

}
