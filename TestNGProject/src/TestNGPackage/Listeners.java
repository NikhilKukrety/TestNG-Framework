package TestNGPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListenser - It is an interface which has all the methods for the TestNG Listeners (or implements TestNG interface)
//We also need to tell the testng file, where the listeners are located

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) { //ITestResult is a class
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override //Basically, it means if any test passes, then below method will be executed. This is how it "Listens"
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("I successfully passed");
		
		
		ITestListener.super.onTestSuccess(result);
	}

	@Override //Basically, it means if any test fails, then below method will be executed. This is how it "Listens"
	public void onTestFailure(ITestResult result) {
		
		System.out.println("This testcase/method got failed - "+result.getName() ); //basically, object.method() is used. Here, getname() will return the name of the testcase/method failed
		
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	
	
}
