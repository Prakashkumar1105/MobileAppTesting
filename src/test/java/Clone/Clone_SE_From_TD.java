package Clone;


import java.util.concurrent.TimeUnit;

import org.aapium.BasicCodesToStartApp;
import org.appium.pageobjct.android.AssignToServiceCenterFromTD;
import org.appium.pageobjct.android.EditServiceEvent;
import org.appium.pageobjct.android.LoginAndEventCreation;
import org.appium.pageobjct.android.clone.CloneServiceEvent;
import org.appium.utils.StoreProperties;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Clone_SE_From_TD extends BasicCodesToStartApp {

	@Test 

	public void Clone_WithOut_Walkin() throws InterruptedException  {
	
		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("TD_User")); //	prakash+stgadd+drv@reach24.net, prakash+tdadmin@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));  
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(3000);
		//String name = driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm this address']")).getText();
		//Assert.assertEquals(name, "Confirm this address");
		LoginAndEventCreation.confirmlocation();
		
		CloneServiceEvent CloneTheEvent = new CloneServiceEvent(driver);
		CloneTheEvent.ClickserviceAndInspection();
		CloneTheEvent.ClickSearchicon();
		CloneTheEvent.SearchAssignedevent("AA021750");
		Thread.sleep(3000);
		CloneTheEvent.clickassignedevent();
		CloneTheEvent.selectevent();
		CloneTheEvent.ClickThreeDots();
		CloneTheEvent.Click_cloneButton();
		
		// Valiadte Reported loaction
		String SEC_RL1 = driver.findElement(By.xpath("(//android.widget.TextView)[@text='San Francisco, CA, USA']")).getText();
		Assert.assertEquals(SEC_RL1, "San Francisco, CA, USA");
		
		String SEC_EQ_Type1 = driver.findElement(By.xpath("(//android.widget.TextView)[@text='Chassis']")).getText();
		Assert.assertEquals(SEC_EQ_Type1, "Chassis");
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Loaded?\").instance(0))"));
		
		String SEC_DN1 = driver.findElement(By.xpath("(//android.widget.EditText)[@text='TD2 test - admin+driver']")).getText();
		Assert.assertEquals(SEC_DN1, "TD2 test - admin+driver");
		
		String SEC_DPN1 = driver.findElement(By.xpath("(//android.widget.EditText)[@text='2222222222']")).getText();
		Assert.assertEquals(SEC_DPN1, "2222222222");
		/*
		String SEC_LOADED1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.ViewGroup")).getText();
		Assert.assertEquals(SEC_LOADED1, "LOADED");
		
		String SEC_DRIVER1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[3]/android.view.ViewGroup")).getText();
		Assert.assertEquals(SEC_DRIVER1, "OUT");
		
		String SEC_LT1 = driver.findElement(By.xpath("(//android.widget.TextView)[@text='In bay']")).getText();
		Assert.assertEquals(SEC_LT1, "In bay");
		*/
		String SEC_BN1 = driver.findElement(By.xpath("(//android.widget.EditText)[@text='break broken']")).getText();
		Assert.assertEquals(SEC_BN1, "break broken");
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Chassis\"));"));
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Chassis\").instance(0))"));
		
		CloneTheEvent.Enter_Equipmentnumber("PQRS123456");
		CloneTheEvent.SetEP("Prakash test ");
		CloneTheEvent.ClickNextbutton();
		CloneTheEvent.ClickAddserviceline();
		CloneTheEvent.Addserviceline();
		CloneTheEvent.ClickNextbutton();
		CloneTheEvent.ClickDone();
		Thread.sleep(3000);
		CloneTheEvent.ClickserviceAndInspection();
		CloneTheEvent.OpenNewEvent();
		CloneTheEvent.Click_seemore();
		
		String ASS_EVENT = driver.findElement(By.xpath("//android.widget.TextView[@text='Associated Events']")).getText();
		Assert.assertEquals(ASS_EVENT, "Associated Events");
		
		CloneTheEvent.Close_child_event();
		CloneTheEvent.ClickSearchicon();
		CloneTheEvent.SearchAssignedevent("AA021750");
		Thread.sleep(3000);
		CloneTheEvent.clickassignedevent();
		CloneTheEvent.selectevent();
		CloneTheEvent.Click_seemore();
		
		String ASS_EVENT2 = driver.findElement(By.xpath("//android.widget.TextView[@text='Associated Events']")).getText();
		Assert.assertEquals(ASS_EVENT2, "Associated Events");
		
//		AssignToServiceCenterFromTD FSC = new AssignToServiceCenterFromTD(driver);
//		FSC.Close_EventdetailScreen();
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		FSC.Click_usersetting();
//		FSC.Click_logouticon();
//		FSC.Click_yesButton();
//		Thread.sleep(3000);
		

	}	
	

	}
		
		
		
		
		
		
	
