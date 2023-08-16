package Walkin_Fleet;


import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.aapium.BasicCodesToStartApp;
import org.appium.pageobjct.android.AcceptAndAssignToTech;
import org.appium.pageobjct.android.ApproveTheEventByTD;
import org.appium.pageobjct.android.AssignToServiceCenterFromTD;
import org.appium.pageobjct.android.EditServiceEvent;
import org.appium.pageobjct.android.LoginAndEventCreation;
import org.appium.pageobjct.android.SP_AdminCompleteTheEvent;
import org.appium.pageobjct.android.ServiceEventCreation;
import org.appium.pageobjct.android.TechnicianActions;
import org.appium.pageobjct.android.walkin_fleet.SE_Creationwith_WalkinFleet;
import org.appium.pageobjct.android.walkin_fleet.SE_Edit_WalkinFleet;

import org.appium.utils.StoreProperties;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Edit_SE_With_WailkinFleet extends BasicCodesToStartApp  {
	
	@Test 

	public void Edit_walkinfleet() throws InterruptedException, IOException  {

		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("SP2_admin_User"));    //	prakash+addsp2@reach24.net     , prakash+spadmin@reach24.net                                              //	prakash+tdadmin@reach24.net , prakash+stgadd+drv@reach24.net, prakash+tdadmin@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(3000);
		//String name = driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm this address']")).getText();
		//Assert.assertEquals(name, "Confirm this address");
		LoginAndEventCreation.confirmlocation();

	
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		SE_Edit_WalkinFleet Edit_Walikin_Fleet = new SE_Edit_WalkinFleet(driver);
		
		EditTheEvent.ClickserviceAndInspection();
		EditTheEvent.OpenNewEvent();
		Edit_Walikin_Fleet.Click_eventdetail();
		EditTheEvent.Clickediticon();
		ServiceEventCreation EventCreation = new ServiceEventCreation(driver);
		SE_Creationwith_WalkinFleet Walikin_Fleet = new SE_Creationwith_WalkinFleet(driver);
		driver.findElement(By.xpath("//android.widget.EditText[@text='ABCD123456']")).clear();
		EventCreation.EnterEquipmentnumber(StoreProperties.get("New_Equipment_Number"));
		Walikin_Fleet.Click_UseWalkinCustomer();
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Walkin Fleet1']")).clear();
		Walikin_Fleet.Enter_TDEP_Name(StoreProperties.get("New_WalkinFleet_name"));
		//Walikin_Fleet.Select_WF_Location();
		driver.findElement(By.xpath("//android.widget.EditText[@text='9884562340']")).clear();
		Walikin_Fleet.Enter_phnuber(StoreProperties.get("New_WalkinFleet_PhoneNumber"));
		Walikin_Fleet.Click_AddFleet_button();
		Edit_Walikin_Fleet.Select_ETA();
		EventCreation.ClickNextButton();
		EventCreation.ClickDonebutton();             
		Thread.sleep(3000);
		
		String Verify_WF_Name = driver.findElement(By.xpath("(//android.widget.TextView)[@text='Walkin tenant']")).getText();
		Assert.assertEquals(Verify_WF_Name, "Walkin tenant");
		
		String Verify_WF_phnumber = driver.findElement(By.xpath("(//android.widget.TextView)[@text='(934) 232-6678']")).getText();
		Assert.assertEquals(Verify_WF_phnumber, "(934) 232-6678");
		
		String Verify_WF_location = driver.findElement(By.xpath("(//android.widget.TextView)[@text='Haywards Heath, UK']")).getText();
		Assert.assertEquals(Verify_WF_location, "Haywards Heath, UK");
		
	}	  
	}	
	