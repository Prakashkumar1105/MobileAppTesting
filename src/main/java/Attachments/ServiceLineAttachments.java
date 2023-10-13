package Attachments;

import org.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ServiceLineAttachments extends AndroidActions {
AndroidDriver driver;
	
	public ServiceLineAttachments (AndroidDriver driver) 
	
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Filters']")
	private WebElement fliteroption ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Submitted']")
	private WebElement submitted  ;
	
	///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup
	///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
	@AndroidFindBy(xpath="//android.view.ViewGroup")
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement assignedevent  ;
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Accept']")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Accept']")
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[12]/android.widget.TextView")
	private WebElement AcceptTheEvent ;
			
			
	//driver.findElement(By.xpath("//android.widget.TextView[@text='60 min']")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@text='60 min']")
	private WebElement ETA ;
			
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm']")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Confirm']")
	private WebElement ConfrimETA;
		
	@AndroidFindBy(xpath="//android.widget.TextView[@text=' 2 Service Line Items 0']")
	private WebElement servicelinklink;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[5]")
	//@AndroidFindBy(xpath="(//android.widget.TextView)[10]")
	private WebElement clickserviceline;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add']")
	//@AndroidFindBy(xpath="//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView")
	private WebElement PLT_AddButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add part']")
	private WebElement AddPartButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Default parts']")
	private WebElement AddDefaultPartButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='']")
	private WebElement clickdefaultPart;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add Selected']")
	private WebElement Addselected;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add labor']")
	private WebElement AddLabor ;
	

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Special Service']")
	private WebElement Special_Service ;
	
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement regular ;
	
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement Regular ;
	
	
	
	///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText
	@AndroidFindBy(xpath="//android.widget.EditText[@class='android.widget.EditText']")
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText")
	private WebElement addtime ;
	
	///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")
	//@AndroidFindBy(xpath="//android.widget.TextView[@text='Add Labor']")
	private WebElement AddlaborButton ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Save Changes']")
	private WebElement Savechanges ;
	
	///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement Clickbackbutton ;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView")
	private WebElement close_Eventdetails ;
	
	

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Mark as Repaired']")
	private WebElement Markasrepaired ;
	
	///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[2]
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement edit_tire ;
	
	
	//@AndroidFindBy(xpath="(//android.view.ViewGroup)[5]")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]")
	private WebElement edit_defect ;
	
	//@AndroidFindBy(xpath="//android.widget.TextView[@text='Slick Tread']")
	//private WebElement edit_defect_value ;
	
	//@AndroidFindBy(xpath="(//android.view.ViewGroup)[6]")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]")
	private WebElement edit_location ;
	
	//@AndroidFindBy(xpath="//android.widget.TextView[@text='LIF']")
	//private WebElement edit_location_value ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Done']")
	private WebElement done1 ;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement MarkAsRepaired ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Please select a date and time']")
	private WebElement FC_Datefield ;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	private WebElement FC_Numberfield ;
	
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	private WebElement FC_Namefield ;
	
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Please enter a value']")
	private WebElement Namefield ;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	private WebElement Numberfield ;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement Datefield ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='option2']")
	private WebElement Dropdown ;
	
	
//	//driver.findElement(By.xpath("//android.widget.TextView[@text='Accept']")).click();
//	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView")
//	private WebElement clicksearchevent ;
//	
//	//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]
//	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
//	@AndroidFindBy(xpath="//android.widget.EditText[@text='  Service Events']")
//	private WebElement clicksearch ;
//	
//	
//	//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup
//	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
//	private WebElement Search_assigned_event;
//
//	//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup
//	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
//	private WebElement clickassignedevent ;
	
	
	
	
	

//	@AndroidFindBy(xpath="//android.widget.TextView[@text='Tech Accept']")
//	private WebElement techaccept ;
//
//	
//	
//	public void ClickSearchicon() {
//		clicksearchevent.click();
//	}
//	public void SearchAssignedevent(String eventid) {
//		clicksearch.sendKeys(eventid);
//				
//	}
//	public void clickassignedevent() {
//	
//	
//		Search_assigned_event.click();
//	}
//	public void selectevent() {
//		clickassignedevent.click();
//		
//	}
//	
//	public void click_TechAccept() {
//		techaccept.click();
//	}

	public void ClickFilter() {
		fliteroption.click();
	}
	public void Click_submitted()  {
		try {
			submitted.click();
		}catch(StaleElementReferenceException e) {
			e.printStackTrace();
		}
		
		
	}
	public void Clickassignedevent() {
		assignedevent.click();
	}

	public void ClickAcceptButton() {
		AcceptTheEvent.click();
	}
	
	public void GiveETA() {
		ETA.click();
	}
	
	public void ClickConfrimETAButton() {
		ConfrimETA.click();
		
	}
	public void ClickServiceline() {
		servicelinklink.click();
	}
	public void SelectServiceLine() throws InterruptedException {
		clickserviceline.click();
		//Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Add\"));"));
	}
	public void ClickAddPLT() throws InterruptedException {
		PLT_AddButton.click();
	
	}
	public void Click_AddPart_Button () {
		AddPartButton.click();
		
	}
	public void Click_AddDefaultPart_Button () {
		AddDefaultPartButton.click();
	}
	public void Select_DefaultPart () {
		clickdefaultPart.click();
	}
	public void Click_Addselected_Button () {
		Addselected.click();
	}
	public void Click_Addlabor() {
		AddLabor.click();
	}
	public void Click_SpecialService() {
		Special_Service.click();
	}
	public void Select_Regularhours() {
		try {
			regular.click();
		}catch(StaleElementReferenceException e) {
			e.printStackTrace();
		}
	
	}
	
	public void Click_Regularhours() {
		Regular.click();
	}
	public void Enter_hoursWorked(String num) {

		try {
			addtime.sendKeys(num);
		}
		catch (StaleElementReferenceException e) {
			
		}
		
	}
	public void Click_AddLabor_Button() {
		AddlaborButton.click();
	}
	public void Click_Savechanges_Button() {
		Savechanges.click();
	}
	public void ClickBackButton () {
		Clickbackbutton.click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brakes\"));"));
	}
	public void Close_EventDetailsPage() {
		close_Eventdetails.click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Mark as Repaired\"));"));
		
	}
	public void Click_MarkAsRepair_button() {
		Markasrepaired.click();
	}
	public void Click_editfor_serviceline() {
		edit_tire.click();
	}
	public void Click_edit_defect() {
		edit_defect.click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Associated With Repairs']")).click();
		
	}

	public void Click_edit_location() {
		edit_location.click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Front']")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")).click();	

	}
	
	public void Clickdone1() {
		done1.click();
	}
	public void Click_MarkAsRepaired_Button() {
		try {
			MarkAsRepaired.click();
		}
		catch(StaleElementReferenceException e) {
			
		}
	}
	
	
	public void select_FC_Datefield() throws InterruptedException {
		Thread.sleep(2000);
		FC_Datefield.click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
		
	}
	public void Enter_FC_Number (String FC_Number) {
		FC_Numberfield.sendKeys(FC_Number);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
		
	}
	
	
	public void Enter_FC_Name(String FC_Name) {
		try
		{
			FC_Namefield.sendKeys(FC_Name);
		}catch(StaleElementReferenceException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
		
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

	
	


}



