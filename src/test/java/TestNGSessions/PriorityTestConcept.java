package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityTestConcept {
	
	@Test(priority = 2)
	public void a_Test(){
		System.out.println("a test");
	}
	
	@Test(priority = 1)
	public void b_Test(){
		System.out.println("b test");
	}
	
	@Test(priority = 3)
	public void c_Test(){
		System.out.println("c test");
	}
	
	@Test(priority = 4)
	public void d_Test(){
		System.out.println("d test");
	}
	
	@Test(enabled = false) // To disable the execution. without commenting we could disable the function for execution
	public void e_Test(){
		System.out.println("e test");
	}
	
	@Test(priority = 5)
	public void f_Test(){
		System.out.println("f test");
	}
	
	// When priority is given, it will execute based on the priority
	//When we have 0 as number, it will start from 0
	//When we have priority and non-priority items, it will executed non priority items first then the priority items later
	//When we have same priority then priority will be nullified, then in that case it will execute based on alphabetical order
}
