package TestNGSessions;

import org.testng.annotations.Test;


public class ExpectedExceptionConcept {
	
	int age = 20;

	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class}) // we are saying that we would be getting this exception and make the test case pass
	public void loginTest(){
		System.out.println("Do Login");
		int i = 9/0; // Artithmetic Exception
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null; // Null pointer Exception
		System.out.println(obj.age);
		
		
	}
}
