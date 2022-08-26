package TestNGPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void ploan()
	{
		System.out.println("good");
	}
	
	@BeforeTest //@BeforeTest means that this test will be on priority (for this class), and will run first of all other tests
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
	

}
