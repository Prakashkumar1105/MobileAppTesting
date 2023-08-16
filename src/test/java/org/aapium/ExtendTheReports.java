package org.aapium;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtendTheReports {
	
	
	static ExtentSparkReporter reporter;
	
	@BeforeTest
	public static ExtentReports getthereport() {
		
		
		//ExtentReports, ExtentSparkReporter 
		
		String path = System.getProperty("user.dir")+"\\reports.index.html";
		reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Mobile test results");
		reporter.config().setDocumentTitle("test results");
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "prakash");
		return extent;
		

	}
	
	
}
