package TestNGPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String urlname)
	{
		System.out.println("WebLoginHomeLoan");
		System.out.println(urlname); //carloan.com will be printed
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
