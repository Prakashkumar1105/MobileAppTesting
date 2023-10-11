package org.aapium;


import java.io.IOException;
import org.appium.pageobjct.android.AssignToServiceCenterFromTD;
import org.appium.pageobjct.android.EditServiceEvent;
import org.appium.pageobjct.android.LoginAndEventCreation;
import org.appium.pageobjct.android.ServiceEventCreation;
import org.appium.utils.StoreProperties;
import org.testng.annotations.Test;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TDActions extends BasicCodesToStartApp  {
	
	@Test 

	public void TDflow() throws InterruptedException, IOException  {


		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("TD_User"));                                                       //	prakash+tdadmin@reach24.net , prakash+stgadd+drv@reach24.net, prakash+tdadmin@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(4000);
		
		//String name = driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm this address']")).getText();
		//Assert.assertEquals(name, "Confirm this address");
		LoginAndEventCreation.confirmlocation();

			
		ServiceEventCreation EventCreation = new ServiceEventCreation(driver);
		EventCreation.clickservicerequest();
		EventCreation.SelectEquipmentType();
		EventCreation.EnterEquipmentnumber(StoreProperties.get("Equipment_Number"));
		EventCreation.SetEP(StoreProperties.get("Equipment_Provider"));
		EventCreation.SelectLocationType();
		//EventCreation.SelectNotLoaded();
		//EventCreation.Slect_driverOut();
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
			
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		EditTheEvent.ClickserviceAndInspection();
		EditTheEvent.OpenNewEvent();
		EditTheEvent.Clickediticon();
		EditTheEvent.ChangeReportedLocation();
		EditTheEvent.EnterAssosiatedpowerunit(StoreProperties.get("Assosiatedpowerunit"));
		EditTheEvent.EnterAssociatedcontainer(StoreProperties.get("Associatedcontainer"));
		EditTheEvent.Clicknotloaded();
		EditTheEvent.EnterBreakdownnotes(StoreProperties.get("Breakdownnotes"));
		EditTheEvent.ClickFleetinstruction();
		EditTheEvent.EnterPOdetail(StoreProperties.get("Po_Number"));
		EditTheEvent.EnterLicensePlate(StoreProperties.get("License_Plate"));
		EditTheEvent.EnterDOT(StoreProperties.get("Dot_Number"));
		EditTheEvent.EnterODOmeter(StoreProperties.get("Odometer_Reading"));
		EditTheEvent.EnterHubometer(StoreProperties.get("Hubometer_Reading"));
		EditTheEvent.EnterVechilemodel(StoreProperties.get("Vehicle_Mode"));
		EditTheEvent.ClickNextbutton();
		EditTheEvent.ClickAddserviceline();
		EditTheEvent.Addserviceline();
		//EditTheEvent.AddimageFromGallery();
		EditTheEvent.ClickNextbutton2();
		EditTheEvent.ClickDone();  
		Thread.sleep(3000);
	
	// test
		AssignToServiceCenterFromTD FSC = new AssignToServiceCenterFromTD(driver);
		FSC.ClickAssignToServiceCenter();
		Thread.sleep(11000);
		FSC.ClickAssignButton();
		Thread.sleep(3000);
		FSC.Close_EventdetailScreen();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		FSC.Click_usersetting();
		FSC.Click_logouticon();
		FSC.Click_yesButton();
		Thread.sleep(3000);
	
	}	  
	
	
	}
