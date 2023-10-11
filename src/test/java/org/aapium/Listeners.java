package org.aapium;
import java.io.IOException;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import io.appium.java_client.AppiumDriver;

public class Listeners extends BasicCodesToStartApp  implements ITestListener  {
	
	AppiumDriver driver;
	

	ExtentTest test;
	ExtentReports extent = ExtendTheReports.getthereport();
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		 test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	
		test.fail(result.getThrowable());
		
		try {
			driver = (AppiumDriver) result.getTestClass().getRealClass().getField("driver").
					get(result.getInstance());
			}
			catch (Exception el) {
				el.printStackTrace();
				
			}
			
			try {
				test.addScreenCaptureFromPath(getScreenshotPath(result.getMethod().getMethodName(),driver), result.getMethod().getMethodName());
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}


	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest("Test case Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}



}










