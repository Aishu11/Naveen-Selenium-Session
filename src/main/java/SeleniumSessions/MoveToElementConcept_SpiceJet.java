package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept_SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement loginmenu =  driver.findElement(By.xpath("//a[@id = 'ctl00_HyperLinkLogin']"));
		Actions act = new Actions(driver);
		act.moveToElement(loginmenu);
		System.out.println(driver.getCurrentUrl());
		//Thread.sleep(2000);
		
		//driver.findElement(By.linkText("SpiceClub Members")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.presenceOfElementLocated(hyperloginmenu));
		
		//WebElement  spicemembersmenu = driver.findElement(hyperloginmenu);
		
		//act.moveToElement(spicemembersmenu);
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Member Login")).click();
	}

}
