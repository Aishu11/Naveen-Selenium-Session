package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForTitle {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("Aishwaryaautomation@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Automation@100");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// boolean b = wait.until(ExpectedConditions.titleIs("My Account"));
		// if(b){
		// System.out.println("Account page is loaded successfully");
		// }
		//
		String title = waitForTitleIs("My Account", 10);
		System.out.println(title);
	}

	public static String waitForTitleIs(String expectedtitle, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		boolean flag = wait.until(ExpectedConditions.titleIs(expectedtitle));

		if (flag) {
			return driver.getTitle();
		}
		return null;
	}

	public static String waitForTitleContains(String titlefraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		boolean flag = wait.until(ExpectedConditions.titleContains(titlefraction));

		if (flag) {
			return driver.getTitle();
		}
		return null;
	}

}
