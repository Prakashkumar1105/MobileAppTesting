package org.aapium;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.appium.utils.StoreProperties;
import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BasicCodesToStartApp {
	
	public AppiumDriverLocalService servcie;
	public AndroidDriver driver;
	
	@BeforeClass
	public void configuration() throws IOException {

		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\91934\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		//To run apk in emulator
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("Android Emulator"); // for emulator
		//option.setDeviceName("Android device"); //for real device
		
		option.setApp(StoreProperties.get("testing_apk"));
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	
	
	
public String getScreenshotPath(String tesCaseName, AppiumDriver driver) throws IOException {
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		String DestinationFile = System.getProperty("user.dir")+"//reports"+tesCaseName+".png";
		FileUtils.copyFile(source, new File(DestinationFile));
		return DestinationFile;
		
	
	}
	/*@AfterClass
	public void close ()
	{
		driver.quit();
		servcie.stop();
		
	}*/
	
	
	
}
