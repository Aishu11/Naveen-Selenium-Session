package TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCartTest {
	
	//No main method - Test NG will start execution with @Test
	
	//global pre-conditions
	//Pre-conditions
	//test steps + validations (actual vs expected)
	// Post validation
	// @Before Suite - Highest Annotation (Super Precondition wil be given here)
	//@Before Test
	//@Before Class
	//@Before Method
	//@Test
	//After Method
	//After Class
	//After Test
	//After Suite
	
	// Before - BS, BT, BC, BM 
	//We can write this in any order
	
	// global pre conditions
	// pre conditions
	// TC01- test steps + validations (act vs exp)
	// TC02- test steps + validations (act vs exp)
	// TC03- test steps + validations (act vs exp)
	// post steps

	// before -- BS, BT, BC, BM
	
	/*
	BS - setupDB
	BT -- create user
	BC -- launch browser
	
		BM -- Login to app
		T1 --logoutLinkTest 
		page title is : My Account
		AM -- logout

		BM -- Login to app
		T2 --logoutLinkTest 
		AM -- logout
		
		BM -- Login to app
		T3 --searchBarTest 
		AM -- logout
		
	AC -- close browser
	AT -- delete user
	AS -- disconnect DB */
	
	public WebDriver driver;
	
	@BeforeSuite
	public void setupDB(){
		System.out.println("Before Suite -- setupDB");
	}
	
	@BeforeTest
	public void createUser(){
		System.out.println("Before Test -- create user");
	}
	
	@BeforeClass
	public void launchBrowser(){
		System.out.println("Before Class -- launch browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void loginApp(){
		System.out.println("Before Method -- Login Application");
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("Aishwaryaautomation@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Automation@100");
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
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
	
	@AfterMethod
	public void logoutApp(){
		System.out.println("After Method -- Logout Application");
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("After Class -- Close Browser");
		driver.quit();
	}
	
	@AfterTest
	public void deleteUser(){
		System.out.println("After Test -- Delete user");
	}
	
	@AfterSuite
	public void disconnectWithDB(){
		System.out.println("After Suite -- Disconnect DB");
	}
}
