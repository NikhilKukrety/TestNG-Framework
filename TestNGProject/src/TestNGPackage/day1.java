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
	
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
	}
	
	/*testng.xml gives us the information - We have a test suite, inside a test suite there will be different test folders (differemtnt
	functionalities), and inside each test folder, we will have test cases (java files).
	*/
	//From XML File, we can run test cases (java classes) of our choice through a single click.
	
	//Let's say we want to include only Demo in our tests. So we will do like this in xml file:
		/*
		 * <class name = TestNGPackage.day1>
		 * 	<methods>
		 * 		<include name = "Demo"/>
		 *  </methods>
		 *  </class>
		 */

}
