package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("webLoginCarLoan");
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
	
	@Test
	public void LoginAPICarLoan()
	{
		System.out.println("LoginAPICarLoan");
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
	
	
	
	

}
