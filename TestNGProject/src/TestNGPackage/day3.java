package TestNGPackage;

import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("webLoginCarLoan");
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("WobileLoginCarLoan");
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
	
	
	

}