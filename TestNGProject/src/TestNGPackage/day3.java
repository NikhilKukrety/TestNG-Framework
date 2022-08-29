package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Parameters({"URL","APIKey/username"}) //Basically, we are driving data from xml file. We are getting the value of url from xml file, putting it in "urlName" and then printing it. Parameterization can be suite level or test level.
	@Test
	public void WebLoginCarLoan(String urlname, String key)
	{
		System.out.println("webLoginCarLoan");
		System.out.println(urlname);
		System.out.println(key);//123456 will be printed
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
	
	@Test(dataProvider = "getData") //By doing this, we are catching the 3 sets of test data from getData() method on this method
	public void MobileSignOutCarloan(String username, String password)
	{
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
	}
	
	//VERY IMPORTANT:
	//Now, let's say I want to send three sets of data to the above test case and run it with these 3 sets of test data. Use below:
	
	@DataProvider
	public Object[][] getData()
	{
		//Let's say, we want 3 sets of data, and each set contains 2 test data, username and password:
		//1. User with good credit score - username and password
		//2. User with no credit score - username and password
		//3. Fraud user - username and password
		
		//So, 3 sets of data and each set has 2 test data, So matrix will be like below:
		Object[][] data = new Object[3][2];
		
		//Now, using the object "data", we will assign the values:
		//1st set:
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		
		//2nd set:
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3rd set:
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
		
		
		
		
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
