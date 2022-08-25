package TestNGPackage;

import org.testng.annotations.Test;

public class day1 {
	
	//TestNG does not require "main" method as it acts as a Java compiler to execute test cases.
	//Without "main", we cannot execute test cases unless we are talking about TestNG framework.
	//Tests are written as methods/functions, and inside these, we write the code.
	//To write tests. annotations are important to write above the method:
	
	@Test
	public void Demo()
	{
		System.out.println("Hello");
	}
	
	

}
