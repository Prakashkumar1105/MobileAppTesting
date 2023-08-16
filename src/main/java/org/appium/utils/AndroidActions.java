package org.appium.utils;



import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions  {

	AndroidDriver driver;
	
	public AndroidActions(AndroidDriver driver) {
		this.driver = driver;
		
	}

	
	
	public void longpress() {
		
		
		WebElement longpress = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='People Names']"));
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",
				((RemoteWebElement)longpress).getId(),
				"duration", 2000));
			
	}
	
	public void scrolltext(String text) {
		//where to scroll is know prior
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
			
		
	}

	
	public void Scrollaction() {
		
	
	boolean canScrollMore;
	do {
		//No prior idea (To scroll at the bottom of the page)
	 canScrollMore = (Boolean)((JavascriptExecutor)driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			"left", 100, "top", 100, "width", 200, "height", 200,
			"direction", "down",
			"percent", 3.0));
	
	
	}while(canScrollMore);
	}
	
	@DataProvider
	public Object[][] Testdata() {
		
		return new Object [][] {{"prakash+tdadmin@reach24.net", "welcome123"}};
		
	}
	
	
}
