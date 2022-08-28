package TestNGPackage;

import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan");
	}
	
	@Test(groups = {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeLoan");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("LoginAPIHomeLoan");
	}
	

}
