package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Parameters({"URL"}) //Basically, we are driving data from xml file. We are getting the value of url from xml file, putting it in "urlName" and then printing it. Parameterization can be suite level or test level.
	@Test
	public void WebLoginCarLoan(String urlname)
	{
		System.out.println("webLoginCarLoan");
		System.out.println(urlname); //qaclickacademy.com will be printed
	}
	
	@BeforeMethod //Basically, now this method will be executed before every time the other tests in this class run.
	public void Beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod //Basically, now this method will be executed after every time the other tests in this class run.
	public void Afterevery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.print("After executing all the methods in this class");
	}
	
	@Test(groups = {"Smoke"})
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarLoan");
	}
	
	@BeforeSuite //The scope of it is entire xml file. So this test will be executed very first at project level
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(dependsOnMethods = {"WebLoginCarLoan"}) // So, it means, WebLoginCarLoan will run first, than APICarLoan.
	public void APICarLoan()
	{
		System.out.println("APICarLoan");
	}
	
	//Let's say we want to exclude MobileLoginCarLoan in our tests. So we will do like this in xml file:
	/*
	 * <class name = TestNGPackage.day3>
	 * 	<methods>
	 * 		<exclude name = "MobileLoginCarLoan"/>
	 *  </methods>
	 *  </class>
	 */
	//IMPORTANT (ALL THESE POINTS):
	/*Le'ts say we have 30 test cases which start with "Mobile" word, and we want to exlude them. Then use:
	 * <exclude name = "Mobile.*"/>
	 */
	
	/*To run test cases at package level, use below (check testng2.xml file):
	 * <packages>
	 * 	<package name = "TestNGPackage"/>
	 * </packages>
	 */
	
	//Helper attributes:
	/*Let's say we have 3 methods: a,b and c. So alphatically a will run first. So, if we want to rub b first and c at last, then we will do like this:
	 * @Test(dependsOnMethods = {"b","a"})
	 * public void c(){}
	 */
	
	/*Let's say if any method has a bug and we do not want to run it then use below helper attribute.
	 * @Test(enabled = false)
	 */
	
	//TIMEOUT HELPER ATTRIBUTE - If a method is taking more time than given implicit time, then use below:
	//@Test(timeOut = 40000) //means do not wait until 40 seconds before throwing an error.
	
	
	
	

}
