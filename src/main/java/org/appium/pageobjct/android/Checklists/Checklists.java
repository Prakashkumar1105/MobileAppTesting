package org.appium.pageobjct.android.Checklists;

import java.util.List;

import org.appium.utils.AndroidActions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Checklists extends AndroidActions {
AndroidDriver driver;
	
	public Checklists (AndroidDriver driver) 
	
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	// Add plt from Event details page
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='MAT SP2 - tech1']")
	private WebElement tech ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='In Process']")
	private WebElement inprocess ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Tech Accept']")
	private WebElement TechAccept ;
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.widget.TextView"))
	private WebElement ClickEPdropdown;
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[1]/android.widget.TextView"))
	private WebElement ClickTDdropdown;
	
//	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[16]/android.widget.TextView
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Departed']"))
	private WebElement departed;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Please select a date and time']")
	private WebElement Datefield ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='option2']")
	private WebElement Dropdown ;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	private WebElement Numberfield ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Please enter a value']")
	private WebElement Namefield ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='+  Click here to add your image']")
	private WebElement Addimage ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Yes, change the status ']")
	private WebElement allow ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Arrived']")
	private WebElement Arrived ;
	
	///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[13]
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Reject']")                        
	private WebElement rejectaction;
	
	
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[6]")                        
	private WebElement rejectReason;
	
	
	
	
	
	
	
	 public void Select_Tech() {
		 tech.click(); 
	 }
	 public void Click_Inprocess() {
		 inprocess.click();
	 }
	 public void Click_TechAccept() {
		 TechAccept.click();
	 }
	 public void SetEP(String EPname) throws InterruptedException {
			ClickEPdropdown.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text='Search Equipment Provider']")).sendKeys(EPname);
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//android.widget.EditText[@text='prakash test ep']")).sendKeys("prakash test ep");
			
			//driver.pressKey(new KeyEvent(AndroidKey.ENTER));
			//Thread.sleep(2000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")).click();
			}
	 public void SetFleet(String fleetname) throws InterruptedException {
		 
		 try 
		 {
			 ClickTDdropdown.click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//android.widget.EditText[@text='Search Truck dispatch']")).sendKeys(fleetname);
			 Thread.sleep(3000);
//			 driver.findElement(By.xpath("//android.widget.EditText[@text='prakash test fleet']")).sendKeys("prakash test fleet ");
//				driver.pressKey(new KeyEvent(AndroidKey.ENTER));	
//			 Thread.sleep(2000);
			 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")).click();
				
			 
		/*
			 List <WebElement> findfleet = (List<WebElement>) driver.findElement(By.xpath("//android.widget.TextView[@text='prakash test fleet']"));
				
			 int count = findfleet.size();
			for (int i=0; i<count; i++) {
			String name = findfleet.get(i).getText();
					Assert.assertEquals(name, "prakash test fleet");		 
			}	
			 
			if (
			 String name = driver.findElement(By.xpath("//android.widget.TextView[@text='prakash test fleet']")).getText();
			Assert.assertEquals(name, "prakash test fleet");
			)
			else if ()
				
			 */
			 
			 
			 
			 
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Yard check\"));"));
				
		 }catch(StaleElementReferenceException t) {
			 t.printStackTrace();
		 }
			}
	 public void Click_Deparure_button() {
		 departed.click();
	 }
	 
	 public void Enter_Name(String name) {
			try { 
				Namefield.click();	
				Namefield.sendKeys(name);
				driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
			
			}catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}
			}
		public void Enter_Number(String number) {
			try { 
				Numberfield.click();
				Numberfield.sendKeys(number);
				driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
			
			}catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}
			}
		public void Select_Date() {
			Datefield.click();
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
			
		}

		public void Select_Dropdown() {
			Dropdown.click();
		}
		public void AddImage() throws InterruptedException {
			Addimage.click();
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
			driver.findElement(By.id("android:id/button2")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.android.camera2:id/done_button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
	
		}
		public void AttachImage() throws InterruptedException {
			Addimage.click();
			driver.findElement(By.id("android:id/button2")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.android.camera2:id/shutter_button")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.android.camera2:id/done_button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
	
		}
	 public void Click_allow() {
		 allow.click();
	 }
	 public void Click_Arrived_button(){
		 Arrived.click();
	 }
	 public void Click_Reject_Bitton() {
		 rejectaction.click();
	 }
	 public void Select_rejectReason() {
		 rejectReason.click();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
	 }
	 
		
	 
	 
}



