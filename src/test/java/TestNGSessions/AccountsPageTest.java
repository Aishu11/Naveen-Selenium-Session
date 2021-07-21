package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountsPageTest extends BaseTest{
	
   public WebDriver driver;
	
	public void doLogin(){
		driver.findElement(By.id("input-email")).sendKeys("Aishwaryaautomation@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Automation@100");
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
	}
	
	@BeforeTest
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		doLogin();
	}
	
	@Test
	public void accountsPageTitleTest(){ // good practise to write alone with Test
		System.out.println("Test 1");
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		Assert.assertEquals(title, "My Account"); // Assert is a Class and AssertEquals is a Static method as it is referred by class name
	}
	
	@Test
	public void logoutlinkTest(){
		System.out.println("Test 2");
		Assert.assertEquals(driver.findElement(By.linkText("Logout")).isDisplayed(),true);// we shall write this
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed()); // or we could write in this way
		
	}
	
	@Test
	public void searchBarTest(){
		System.out.println("Test 3");
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
