package TestNGPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups = {"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
	
	@BeforeTest //@BeforeTest means that this test will be on priority (for this class), and will run first of all other tests
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before all the methods in the class");
	}
	
	//IMPORTANT:
	/*Let's say client says I want to pick these test cases and test them as "smoke", of his choice from each class.
	 * Then, we will be picking up these test cases by assigning them to "GROUPS".
	 * We will do this by using below syntax:
	 * Syntax: @Test(groups = {"Smoke"})
	 *And in the xml file, give below to run them:
	 *<groups>
  		<run>
  		<include name="Smoke"/> or we can use "exclude" to avoid only these test cases to run.
  		</run>
  	</groups>
	*/
	
	
	/* To run 2 tests at suite level in parallel, give below:
	 * <suite name="Loan Department" parallel = "tests" thread-count = "2"> 
	 */
}
