package ReportedByUser;


import java.util.concurrent.TimeUnit;


import org.aapium.BasicCodesToStartApp;

import org.appium.pageobjct.android.AssignToServiceCenterFromTD;
import org.appium.pageobjct.android.EditServiceEvent;
import org.appium.pageobjct.android.LoginAndEventCreation;
import org.appium.pageobjct.android.ServiceEventCreation;
import org.appium.pageobjct.android.ReportedByUser.ReportedbyUser;
import org.appium.utils.StoreProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.AppiumBy;

import io.appium.java_client.android.AndroidDriver;

public class Reported_by extends BasicCodesToStartApp {
	
	
	
	@Test 

	public void ReportedByUser_flow() throws InterruptedException  {
	
		ReportedbyUser ReportedBy = new ReportedbyUser(driver);
		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("TD_User"));    //		prakash+addsp5@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(3000);
		String name = driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm this address']")).getText();
		Assert.assertEquals(name, "Confirm this address");
		LoginAndEventCreation.confirmlocation();
		
		ServiceEventCreation EventCreation = new ServiceEventCreation(driver);
		EventCreation.clickservicerequest();
		EventCreation.SelectEquipmentType();
		EventCreation.EnterEquipmentnumber(StoreProperties.get("Equipment_Number"));
		EventCreation.SetEP(StoreProperties.get("Equipment_Provider")); 
		
		
		ReportedBy.Click_ReportedBy();
		ReportedBy.Enter_ReportedByName(StoreProperties.get("ReportedByName"));
		ReportedBy.EnableCheckbox();
		ReportedBy.clicknext();
	
		//String toastmessage = driver.findElement(By.xpath("(/hierarchy/android.widget.Toast)[1]")).getText();
		//Assert.assertEquals(toastmessage, "Please enter reported by user email or phone number");
		//System.out.println(toastmessage);
		
		ReportedBy.Enter_invaild_ph(StoreProperties.get("invaild_ph"));
		ReportedBy.Enter_vaild_phone(StoreProperties.get("vaild_phone"));
		
		ReportedBy.Enter_invaild_email(StoreProperties.get("invaild_email"));
		ReportedBy.Enter_vaild_email(StoreProperties.get("vaild_email"));
		ReportedBy.Click_ReportedBy();
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
		
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		EditTheEvent.ClickserviceAndInspection();
		EditTheEvent.OpenNewEvent();
		ReportedBy.Click_Seemore();
		
		//Validation in event details page
		
		String name1 = driver.findElement(By.xpath("(//android.widget.TextView)[@text='Prakash']")).getText();
		Assert.assertEquals(name1, "Prakash");
		
		String email = driver.findElement(By.xpath("(//android.widget.TextView)[@text='prakash@reach24.net']")).getText();
		Assert.assertEquals(email, "prakash@reach24.net");
		
		String phnum = driver.findElement(By.xpath("(//android.widget.TextView)[@text='2546389456']")).getText();
		Assert.assertEquals(phnum, "2546389456");
		
		ReportedBy.click_threedots();
		ReportedBy.Click_share_button();
		ReportedBy.Click_SharedWith();
	
		//Validation in SharedWith tab
		
		String sharedname = driver.findElement(By.xpath("(//android.widget.TextView)[@text='Prakash']")).getText();
		Assert.assertEquals(sharedname, "Prakash");
				
		String sharedemail = driver.findElement(By.xpath("(//android.widget.TextView)[@text='prakash@reach24.net']")).getText();
		Assert.assertEquals(sharedemail, "prakash@reach24.net");
				
		String sharedphnum = driver.findElement(By.xpath("(//android.widget.TextView)[@text='+1(254) 638-9456']")).getText();
		Assert.assertEquals(sharedphnum, "+1(254) 638-9456");
		
		ReportedBy.Click_backbutton();
		EditTheEvent.Clickediticon();
		EditTheEvent.ChangeReportedLocation();
		EditTheEvent.EnterAssosiatedpowerunit(StoreProperties.get("Assosiatedpowerunit"));
		EditTheEvent.EnterAssociatedcontainer(StoreProperties.get("Associatedcontainer"));
		ReportedBy.Click_ReportedBy();
		ReportedBy.Rename_the_ReportedName(StoreProperties.get("ReportedByName2"));	
		EditTheEvent.ClickNextbutton();
		EditTheEvent.ClickAddserviceline();
		EditTheEvent.Addserviceline();
		EditTheEvent.ClickNextbutton2();
		EditTheEvent.ClickDone();  
		Thread.sleep(3000);
		
		
		//Validation the Rename for ReportedUserName in event details page
		
		String Rename = driver.findElement(By.xpath("(//android.widget.TextView)[@text='Reach']")).getText();
		Assert.assertEquals(Rename, "Reach");
		
		String email2 = driver.findElement(By.xpath("(//android.widget.TextView)[@text='prakash@reach24.net']")).getText();
		Assert.assertEquals(email2, "prakash@reach24.net");
		
		String phnum2 = driver.findElement(By.xpath("(//android.widget.TextView)[@text='2546389456']")).getText();
		Assert.assertEquals(phnum2, "2546389456");
		
		
	
	
	}	
}	
		
		
		
	
