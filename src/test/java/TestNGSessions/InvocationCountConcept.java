package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test(invocationCount = 10) // To run the test for 10 tmes
	public void registerTest() {
		System.out.println("Register Test");

	}
	
	@Test(invocationCount = 10, priority = 1, expectedExceptions = ArithmeticException.class) // To run the test for 10 tmes
	public void loginTest() {
		System.out.println("Login Test"); // can include multiple conditions inside test

	}
}
