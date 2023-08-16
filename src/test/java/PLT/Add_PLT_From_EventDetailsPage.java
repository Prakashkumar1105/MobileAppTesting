package PLT;
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

public class Add_PLT_From_EventDetailsPage extends BasicCodesToStartApp  {
	
	@Test 
	public void PLT_in_EventDetailsPage() throws InterruptedException, IOException  {

		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		ServiceEventCreation EventCreation = new ServiceEventCreation(driver);
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		TechnicianActions TechAction = new TechnicianActions(driver);
		PartsAndLabor PLT = new PartsAndLabor(driver);
		
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("SP2_Tech2_User"));    //	prakash+addsp2@reach24.net     , prakash+spadmin@reach24.net                                              //	prakash+tdadmin@reach24.net , prakash+stgadd+drv@reach24.net, prakash+tdadmin@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));  
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(3000);
		LoginAndEventCreation.confirmlocation();

		EventCreation.clickservicerequest();
		EventCreation.SelectEquipmentType();
		EventCreation.EnterEquipmentnumber(StoreProperties.get("Equipment_Number"));
		EventCreation.SetEP(StoreProperties.get("Equipment_Provider"));
		EventCreation.SelectLocationType();
		EventCreation.ClickNextButton();
		EventCreation.ClickAddservicelineitem();
		EventCreation.SelectSystem();
		EventCreation.SelectSubsystem();
		EventCreation.Selectservice();
		EventCreation.SelectDefect();
		EventCreation.SelectLocation();
		EditTheEvent.ClickNextbutton();
		EditTheEvent.ClickAddserviceline();
		EditTheEvent.Addserviceline();
		EventCreation.ClickServicelineNextbutton();
		EventCreation.ClickDonebutton();             
		Thread.sleep(3000);
		
		EditTheEvent.ClickserviceAndInspection();
		Thread.sleep(3000);
		TechAction.ClickFilter();
		TechAction.Click_submitted();
		Thread.sleep(2000);
		TechAction.Clickassignedevent();
		Thread.sleep(2000);
		TechAction.ClickAcceptButton();
		TechAction.GiveETA();
		TechAction.ClickConfrimETAButton();
		Thread.sleep(3000);
		
		//Add Default Part
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TechAction.ClickServiceline();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TechAction.SelectServiceLine();
		Thread.sleep(2000);
		TechAction.ClickAddPLT();
		Thread.sleep(2000);
		TechAction.Click_AddPart_Button();
		TechAction.Click_AddDefaultPart_Button();
		Thread.sleep(2000);
		TechAction.Select_DefaultPart();
		TechAction.Click_Addselected_Button();
		Thread.sleep(2000);
		
		// Search part
		
		TechAction.Click_AddPart_Button();
		PLT.Enter_Partcode("02");
		PLT.Click_Search_part_Button();
		Thread.sleep(2000);
		TechAction.Select_DefaultPart();
		TechAction.Click_Addselected_Button();
		Thread.sleep(2000);
		
		// Add Custom part
		
		TechAction.Click_AddPart_Button();
		PLT.Click_Add_Custom_Button();
		PLT.Enter_PartLabor_code(StoreProperties.get("PartLabor_code"));
		PLT.Enter_discription(StoreProperties.get("discription"));
		PLT.Enter_Groupcode(StoreProperties.get("Groupcode"));
		PLT.Click_done_Button();
		
		// Add labor
		
		TechAction.Click_Addlabor();
		Thread.sleep(2000);
		TechAction.Click_SpecialService();
		Thread.sleep(2000);
		TechAction.Click_Regularhours();
		Thread.sleep(2000);
		TechAction.Enter_hoursWorked("2");
		TechAction.Click_AddLabor_Button();
		Thread.sleep(3000);
		TechAction.Click_Savechanges_Button();
		
		// Change QTY and Delete one part Detail
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='2.0']")).clear();
		Thread.sleep(2000);
		PLT.Edit_workingHours("3");
		Thread.sleep(3000);
		PLT.Delete_PartDetail();
		Thread.sleep(3000);
		TechAction.Click_Savechanges_Button();
		Thread.sleep(3000);
		TechAction.ClickBackButton();
		TechAction.Close_EventDetailsPage();
	
	}	  
	}	
	