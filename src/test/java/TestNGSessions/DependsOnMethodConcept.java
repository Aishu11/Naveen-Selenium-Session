package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	//AAA
	
	//1. Make your test independent - Best Practise
	
	@Test
	public void loginTest(){
		System.out.println("Do Login");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest(){
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void cartPageTest(){
		System.out.println("cart Page Test");
	}
	
	//If the result are in green - passed
	//Red- failed
	//Yellow - Skipped
	
	// When Login Test fails, the other two test cases will be skipped
	//Hence it is important to ensure that our test cases are independent

}
