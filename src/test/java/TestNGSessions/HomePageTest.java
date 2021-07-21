package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
	
	public void doLogin(){
		driver.findElement(By.id("input-email")).sendKeys("Aishwaryaautomation@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Automation@100");
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
	}
	

	@Test
	public void homePageTitleTest(){ // good practise to write alone with Test
		doLogin();
		System.out.println("Test 3");
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		Assert.assertEquals(title, "My Account"); // Assert is a Class and AssertEquals is a Static method as it is referred by class name
		
	}
	

}
