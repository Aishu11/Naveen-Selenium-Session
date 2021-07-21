package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandle {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//Rule - Select tag should be used with SElect Class
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		//Select select_indus = new Select(driver.findElement(industry));
		//select.selectByIndex(3); // pass the index
		//select.selectByVisibleText("Electronics"); // pass the text visible in between tags - It is case sensitive
		//select_indus.selectByValue("Transportation/Distribution"); // pass the text displayed beside 'Value' attribute
		
		//Select sel_country = new Select(driver.findElement(country));
		//sel_country.selectByVisibleText("India");
		
		//doSelectDropDownValueByIndex(industry, 5);
		//doSelectDropDownValueByIndex(country, 4);
		
		doSelectDropDownValueByVisibleText(industry, "Education");
		doSelectDropDownValueByValue(country, "India");
	}
	
	public static WebElement doGetElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownValueByIndex(By locator, int index){
		Select select = new Select(doGetElement( locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownValueByVisibleText(By locator, String text){
		Select select = new Select(doGetElement( locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectDropDownValueByValue(By locator, String value){
		Select select = new Select(doGetElement( locator));
		select.selectByValue(value);
	}

}
