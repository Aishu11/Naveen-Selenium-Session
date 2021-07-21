package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAllOptionsHandle {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");

		Select selindus = new Select(driver.findElement(industry));
		List<WebElement> indusoptions = selindus.getOptions();
		

		// Selecting the value without Select methods i.e Select by value
		// for (WebElement e : indusoptions) {
		// String text = e.getText();
		// System.out.println(text);
		// if (text.equals("Education")) {
		// e.click();
		// break;
		// }
		// }
		
		// We also have options like 
		//selindus.isMultiple() - will return true if the dropdown is a multi selected dropdown
		//selindus.deselectByValue(arg0); - reverse of select
		//selindus.getAllSelectedOptions() - To get all selected options.

		doSelectDropDownValue(industry, "Electronics");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionslist = select.getOptions();
		System.out.println(optionslist.size());
		for (WebElement e : optionslist) {
			String textval = e.getText();

			if (textval.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
