package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPage extends BaseTest{
	
	@Test(priority = 1)
	public void doClickRegister(){
		driver.findElement(By.linkText("Register")).click();
	}
	
	
	@DataProvider
	public Object[][] Registerdata(){
		return new Object[] [] {
			{"Aish", "Balu", "aishu123@gmail.com", "12345", "sairam@100"},
			{"Harish", "siva", "harish123@outlook.com", "787432", "Harish123"},
			{"Kanish", "123", "1456789@yoio.com", "", "null"}
		};
	}
	
	@Test(dataProvider = "Registerdata" , priority = 2)
	public void RegisterPageMethod(String firstname, String lastname, String email, String tel, String pass){
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(tel);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pass);
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(pass);
	}

}
