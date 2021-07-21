package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForElementList {

	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");
		
		//List<WebElement> footerlinks = driver.findElements(By.xpath("//div[@class = 'col-sm-6']//a"));
		//Driver.findelements will not wait
		// Instead we need to use Webdriver wait.
		// Hence just getting the By locator alone
		
		By footerlinks = By.xpath("//div[@class = 'col-sm-6']//a");
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		List<WebElement>footerlinklist = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerlinks));
//		
//		for(WebElement e: footerlinklist){
//			System.out.println(e.getText());
//		}
//		
		//calling the element util method using object creation
		ElementUtil ob = new ElementUtil(driver);
		ob.printAllElementsTextUsingForEachWithWait(footerlinks, 10);
		
		
	}

}
