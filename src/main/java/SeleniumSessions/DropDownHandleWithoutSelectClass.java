package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By indusoption = By.xpath("//select[@id='Form_submitForm_Industry']/option");

		doSelectDropDownWithoutSelect(indusoption, "Travel");

		// X- Path = //select[@id='Form_submitForm_Industry']/option
		// select for select tag
		// id - Attribute used
		// '/' - direct child '//' - indirect child
//
//		List<WebElement> list = driver.findElements(By.xpath("//select[@id='Form_submitForm_Industry']/option"));
//		for (WebElement e : list) {
//			System.out.println(e.getText());
//			if (e.getText().equals("Electronics")) {
//				e.click();
//			}
//		}

	}

	public static void doSelectDropDownWithoutSelect(By locator, String value) {
		List<WebElement> list = driver.findElements(locator);
		for (WebElement e : list) {
			System.out.println(e.getText());
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}

}
