package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchProductTest extends BaseTest{
	
	@Test(priority = 1)
	public void doLogin(){
		driver.findElement(By.id("input-email")).sendKeys("Aishwaryaautomation@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Automation@100");
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
	}
	
	@DataProvider
	public Object[][] SearchProductData(){
		return new Object [] [] {
			{"Mac"},
			{"Apple"},
			{"Windows"}
		};
	}
	
	
	@Test(dataProvider = "SearchProductData", priority = 2)
	public void searchProduct(String prodcut){
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(prodcut);
		System.out.println("Prodct searched is:" + prodcut);
	}

}
