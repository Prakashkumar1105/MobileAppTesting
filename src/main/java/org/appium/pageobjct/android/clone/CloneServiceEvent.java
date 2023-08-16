package org.appium.pageobjct.android.clone;

import org.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CloneServiceEvent extends AndroidActions {
AndroidDriver driver;
	
	public CloneServiceEvent (AndroidDriver driver) 
	
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Services and Inspections']")).click();
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.TextView"))
	private WebElement serviceAndInspection;
	
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Accept']")).click();
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView")
	private WebElement clicksearchevent ;
	
	//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	@AndroidFindBy(xpath="//android.widget.EditText[@text='  Service Events']")
	private WebElement clicksearch ;
	
	
	//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement Search_assigned_event;

	//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement clickassignedevent ;
	
	//@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.TextView"))
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='󰇙']"))
	private WebElement threedots;
	
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Clone']"))
	private WebElement clone;
	
		
		//driver.findElement(By.xpath("//android.widget.EditText[@text='Enter the number']")).sendKeys("ABCD123456");
		@AndroidFindBy(xpath=("//android.widget.EditText[@text='Enter the number']"))
		private WebElement Equipmentnumber;
		
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.widget.TextView"))
		private WebElement ClickEPdropdown;

		//driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
		@AndroidFindBy(xpath=("//android.widget.TextView[@text='Next']"))
		private WebElement Nextbutton ;
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='+Add']")).click();
		@AndroidFindBy(xpath=("//android.widget.TextView[@text='+Add']"))
		private WebElement Addserviceline ;
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]")).click();
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[2]"))
		private WebElement Addservice ;
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup"))
		private WebElement Done ;
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")).click();
		@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup"))
		private WebElement openevent;
		
		@AndroidFindBy(xpath=("//android.widget.TextView[@text='See more']"))
		private WebElement seemore;
		
		@AndroidFindBy(xpath=("//android.widget.TextView[@text='']"))
		private WebElement Click_close_icon;
		
		@AndroidFindBy(xpath=("//android.widget.TextView[@text='Event Details']"))
		private WebElement Eventdetails;
		
//Add walkin details cloned page		

		@AndroidFindBy(xpath=("//android.widget.TextView[@text='Use Walk-in Customer']"))
		private WebElement UseWalkinCustomer;
		

		@AndroidFindBy(xpath=("//android.widget.TextView[@text='Add Fleet']"))
		private WebElement AddFleet;
		
		
		

	
	
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup")).click();
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.ViewGroup"))
	private WebElement Clickedit;
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='CHANGE']")).click();
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='CHANGE']"))
	private WebElement changelocation;
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText")).sendKeys("AAAA112233");
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText"))
	private WebElement Assosiatedpowerunit;
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText")).sendKeys("BBBB332211");
	@AndroidFindBy(xpath=("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText"))
	private WebElement Associatedcontainer ;
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup[3]/android.view.ViewGroup")).click();
	//driver.findelement(By.xpath("//android.view.ViewGroup[@class='android.view.ViewGroup']"));
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup")) //5, 3
	//@AndroidFindBy(xpath=("//android.view.ViewGroup[@class='android.view.ViewGroup']"))
	//@AndroidFindBy(xpath=("(//android.view.ViewGroup)[3]"))
	private WebElement notloaded;
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText")).sendKeys("Brake plate damage");
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.EditText")) //8 //6
	//@AndroidFindBy(xpath=("//android.widget.EditText[text='Enter breakdown notes here']"))
	private WebElement Breakdownnotes;
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.widget.TextView")).click();
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.widget.TextView"))  //11 9
	//@AndroidFindBy(xpath=("//android.widget.TextView[@text='Add fleet profile']"))
	//@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText"))
	private WebElement Fleetinstruction ;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='PO #']")).sendKeys("11111");
	@AndroidFindBy(xpath=("//android.widget.EditText[@text='PO #']"))
	private WebElement POdetail ;
	
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='License Plate']")).sendKeys("22222");
	@AndroidFindBy(xpath=("//android.widget.EditText[@text='License Plate']"))
	private WebElement LicensePlate ;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Dot Number']")).sendKeys("33333");
	@AndroidFindBy(xpath=("//android.widget.EditText[@text='Dot Number']"))
	private WebElement DOT ;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Odometer Reading']")).sendKeys("44444");
	@AndroidFindBy(xpath=("//android.widget.EditText[@text='Odometer Reading']"))
	private WebElement ODOmeter ;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Hubometer Reading']")).sendKeys("55555");
	@AndroidFindBy(xpath=("//android.widget.EditText[@text='Hubometer Reading']"))
	private WebElement Hubometer ;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Vehicle Model']")).sendKeys("66666");
	@AndroidFindBy(xpath=("//android.widget.EditText[@text='Vehicle Model']"))
	private WebElement Vechilemodel ;
	
	

	
	
	

	
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Photo or Video from gallery']")).click();
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Photo or Video from gallery']"))
	private WebElement Addimage ;
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Next']"))
	private WebElement Nextbutton2 ;
	
	
	
	
	
	public void ClickserviceAndInspection() {
		serviceAndInspection.click();
	}
	
	public void ClickSearchicon() {
	clicksearchevent.click();
}
public void SearchAssignedevent(String eventid) {
	clicksearch.sendKeys(eventid);
			
}
public void clickassignedevent() {


	Search_assigned_event.click();
}
public void selectevent() {
	clickassignedevent.click();
	
}

public void ClickThreeDots() {
	try {
		threedots.click();
	}catch (StaleElementReferenceException e) {
		e.printStackTrace();
	}
	
}

public void Click_cloneButton() {
	clone.click();
}
public void Enter_Equipmentnumber(String number) {
	Equipmentnumber.sendKeys(number);
}
public void SetEP(String EPname) throws InterruptedException {
	ClickEPdropdown.click();
	driver.findElement(By.xpath("//android.widget.EditText[@text='Search Equipment Provider']")).sendKeys(EPname);
	Thread.sleep(2000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")).click();
	}
public void ClickNextbutton() {
	Nextbutton.click();
}
public void ClickAddserviceline() {
	Addserviceline.click();
}
public void Addserviceline() {
	Addservice.click();			
	driver.findElement(By.xpath("//android.widget.TextView[@text='1000X20 Bias Tire - Replace w/new']")).click();
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Open Camera\"));"));
}

public void ClickDone() {
	Done.click();
}
	public void OpenNewEvent() {
		openevent.click();
	}
	public void Click_seemore() {
		seemore.click();
	}
	public void Close_child_event() {
		Click_close_icon.click();
	}
public void Click_EventDetails() {
	Eventdetails.click();
}
public void Click_UseWalkinCustomer() {
	UseWalkinCustomer.click();
}
public void Click_AddFleet() {
	AddFleet.click();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		public void Clickediticon() {
		Clickedit.click();
	}
		public void ChangeReportedLocation() {
			changelocation.click();
			driver.findElement(By.xpath("//android.widget.EditText[@text='Type to search a location']")).click();
			driver.findElement(By.xpath("//android.widget.EditText[@text='Type to search a location']")).sendKeys("San Francisco");
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup")).click();
			
		}
		public void EnterAssosiatedpowerunit(String Assosiatedpowerunitvalue) {
			Assosiatedpowerunit.sendKeys(Assosiatedpowerunitvalue);
		}
		public void EnterAssociatedcontainer(String value) {
			Associatedcontainer.sendKeys(value);
		}
		public void Clicknotloaded() {
			
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Add fleet profile\"));"));
			notloaded.click();
		}
		
		public void EnterBreakdownnotes(String notes) {
			Breakdownnotes.sendKeys(notes);
		}
		public void ClickFleetinstruction() {
			Fleetinstruction.click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Vehicle Model\"));"));
		}
		
		public void EnterPOdetail(String po) {
			POdetail.sendKeys(po);
		}
		public void EnterLicensePlate(String LicensePlatevalue) {
			LicensePlate.sendKeys(LicensePlatevalue);
		}
		public void EnterDOT (String DOTnumber) {
			DOT.sendKeys(DOTnumber);
		}
		public void EnterODOmeter(String ODOvalue) {
			ODOmeter.sendKeys(ODOvalue);
		}
		public void EnterHubometer (String Hoboreading) {
			Hubometer.sendKeys(Hoboreading);
		}
		public void EnterVechilemodel(String Vechilvalue) {
			Vechilemodel.sendKeys(Vechilvalue);
		}
		
		
		
		
		
		public void AddimageFromGallery(){
			Addimage.click();
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
			driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"IMG_20221109_133709.jpg, 145 kB, Nov 9\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
			//driver.findElement(By.id("com.google.android.documentsui:id/icon_thumb")).click();
			
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"System\"));"));
			
		}
		public void ClickNextbutton2() {
			Nextbutton2.click();
		}
		
		{

}
}

