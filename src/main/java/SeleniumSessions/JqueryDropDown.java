package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDown {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();

		By optionlist = By.cssSelector("span.comboTreeItemTitle");

		// List<WebElement> optionlist =
		// driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		//
		// for (int i = 0; i < optionlist.size(); i++) {
		// String text = optionlist.get(i).getText();
		// System.out.println(text);
		// if (text.equals("choice 6 1")) {
		// optionlist.get(i).click();
		// break;
		// }
		// }

		// TC 01: Single Selection:
		selectChoice(optionlist, "choice 3");

		// TC 02: Multiple Selection:
		selectChoice(optionlist, "choice 1", "choice 2 1", "choice 7");

		// TC 03: All Selection:
		selectChoice(optionlist, "Automation_All");
		
		/*
		 * TC 01 - Single Selection
		 * TC 02 - Multiple Selection
		 * TC 03 - All selection - Add and identifier 'Automation_All' to select all values
		 */

	}

	public static List<WebElement> doGetElements(By locator) {
		return driver.findElements(locator);
	}

	public static void selectChoice(By locator, String... value) { // String...
																	// behave
																	// like
																	// Array
																	// (can have
																	// multiple
																	// values)
		List<WebElement> optionlist = doGetElements(locator);

		if (!(value[0].equalsIgnoreCase("automation_all"))) {
			for (int i = 0; i < optionlist.size(); i++) {
				String text = optionlist.get(i).getText();
				System.out.println(text);

				for (int j = 0; j < value.length; j++) {// inner loop for array
														// of values
					if (text.equals(value[j])) {
						optionlist.get(i).click();
						break;
					}
				}
			}
		}
		
		else{
			//select all
			try{
			for(WebElement e : optionlist){
				e.click();
			}
			}
			catch (Exception e) {
				System.out.println("All choices are over");
			}
		}
	}
}

//Element not interactable exception hence we are using try and catch block
