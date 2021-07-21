package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{	
	
	@Test
	public void accountsPageTitleTest(){ // good practise to write alone with Test
		System.out.println("Test 1");
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		Assert.assertEquals(title, "Account Login"); // Assert is a Class and AssertEquals is a Static method as it is referred by class name
	}

	@Test
	public void logoutlinkTest(){
		System.out.println("Test 2");
		Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed()); // or we could write in this way
	}
}
