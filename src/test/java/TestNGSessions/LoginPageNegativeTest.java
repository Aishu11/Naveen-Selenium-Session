package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest extends BaseTest{
	
	
	@DataProvider
	public Object[][] negativeTestData(){
		return new Object [] []{
			{"test@12mgmail.com" , "abc"},
			{"aishu111@gmail.com", ""},
			{"null", "null"},
			{"", "abc123"}
		};
	}
	
	@Test(dataProvider = "negativeTestData")
	public void doLogin(String username, String password){
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed());
	}

}
