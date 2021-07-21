package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		
		List<WebElement > imglist = driver.findElements(By.tagName("img"));
		
		for(WebElement e: imglist){
			String srclist = e.getAttribute("src");
			String Altlist = e.getAttribute("alt");
			System.out.println(srclist + ":" +  Altlist);
		}

	}

}
