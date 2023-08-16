package FleetAndTech_Checklist;
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
import org.appium.pageobjct.android.Checklists.Checklists;
import org.appium.pageobjct.android.PLT.PartsAndLabor;
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

public class FC_TC_Complete_Reject extends BasicCodesToStartApp  {
	
	@Test 
	public void PLT_in_EventDetailsPage() throws InterruptedException, IOException  {

		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		ServiceEventCreation EventCreation = new ServiceEventCreation(driver);
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		TechnicianActions TechAction = new TechnicianActions(driver);
		PartsAndLabor PLT = new PartsAndLabor(driver);
		AcceptAndAssignToTech SP_Admin_Action = new AcceptAndAssignToTech(driver);
		AssignToServiceCenterFromTD FSC = new AssignToServiceCenterFromTD(driver);
		Checklists checklist = new Checklists(driver);
		SP_AdminCompleteTheEvent SP_Admin_Complete_Action = new SP_AdminCompleteTheEvent(driver);
		
	
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("SP2_admin_User"));    //	prakash+addsp2@reach24.net     , prakash+spadmin@reach24.net                                              //	prakash+tdadmin@reach24.net , prakash+stgadd+drv@reach24.net, prakash+tdadmin@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(3000);
		LoginAndEventCreation.confirmlocation();

		EditTheEvent.ClickserviceAndInspection();
		Thread.sleep(3000);
		TechAction.Clickassignedevent();
		Thread.sleep(2000);
		
	// For Complete action
		
		SP_Admin_Complete_Action.Click_complete_Button();
		SP_Admin_Complete_Action.complete_The_event();
		
		checklist.Select_Date();
		checklist.Select_Dropdown();
		checklist.Enter_Number(StoreProperties.get("Number"));
		checklist.Enter_Name(StoreProperties.get("Text"));
		checklist.AddImage();
		
		
		checklist.Select_Date();
		checklist.Enter_Name(StoreProperties.get("Text"));
		checklist.AttachImage();
		checklist.Enter_Number(StoreProperties.get("Number"));
		checklist.Select_Dropdown();
		Thread.sleep(4000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(4000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		// For Reject action
	
		EventCreation.clickservicerequest();
		EventCreation.SelectEquipmentType();
		EventCreation.EnterEquipmentnumber(StoreProperties.get("Equipment_Number"));
		checklist.SetEP(StoreProperties.get("Equipment_Provider"));
		checklist.SetFleet(StoreProperties.get("Fleet"));
		EventCreation.SelectLocationType();
		EventCreation.ClickNextButton();
		EventCreation.ClickAddservicelineitem();
		EventCreation.SelectSystem();
		EventCreation.SelectSubsystem();
		EventCreation.Selectservice();
		EventCreation.SelectDefect();
		EventCreation.SelectLocation();		
		EventCreation.ClickServicelineNextbutton();
		EventCreation.ClickDonebutton();             
		Thread.sleep(3000);
	
		EditTheEvent.ClickserviceAndInspection();
		Thread.sleep(3000);
		TechAction.Clickassignedevent();
		Thread.sleep(2000);
		SP_Admin_Action.ClickMoreAcion();
		checklist.Click_Reject_Bitton();
		
		checklist.Select_Date();
		checklist.Select_Dropdown();
		checklist.Enter_Number(StoreProperties.get("Number"));
		checklist.Enter_Name(StoreProperties.get("Text"));
		checklist.AddImage();
		
		checklist.Select_Date();
		checklist.Enter_Name(StoreProperties.get("Text"));
		checklist.AttachImage();
		checklist.Enter_Number(StoreProperties.get("Number"));
		checklist.Select_Dropdown();
		Thread.sleep(3000);
		checklist.Select_rejectReason();

	}	  
	}	
	