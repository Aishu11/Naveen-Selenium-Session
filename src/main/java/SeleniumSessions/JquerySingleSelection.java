package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquerySingleSelection {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnotherInputBox")).click();
		
		List<WebElement> optionlist = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		for(WebElement e: optionlist){
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals("choice 6 1")){
				e.click();
				break;
			}
		}
	}

}
