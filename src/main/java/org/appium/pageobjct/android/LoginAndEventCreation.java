package org.appium.pageobjct.android;



import org.appium.utils.AndroidActions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginAndEventCreation extends AndroidActions  {

	
	
	AndroidDriver driver;
	
	public LoginAndEventCreation (AndroidDriver driver) 
	
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"start_button\"]")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"start_button\"]")
	private WebElement start ;
	
	//driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"reach_email\"]/android.widget.EditText")).sendKeys("prakash+add+driver@reach24.net");
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"reach_email\"]/android.widget.EditText")
	private WebElement username;
	
	//driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"reach_password\"]/android.widget.EditText")).sendKeys("welcome123");
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"reach_password\"]/android.widget.EditText")
	private WebElement password;
	
	//driver.findElement(AppiumBy.accessibilityId("login_button")).click();
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"login_container\"]/android.view.ViewGroup[2]")
	private WebElement clicklogin;
	
	//driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
	@AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement permissionpopup;
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	private WebElement confrimlocation;
	
	
	
	
		public void clickstart() {
			start.click();
		}
	
	public void setusername (String name ) {
		username.sendKeys(name);
		//username.sendKeys(ReadProperties.TD_Username);
		
		
	}
	public void setpassword (String userpassword ) {
		password.sendKeys(userpassword);
		//password.sendKeys(StoreProperties.Password);
	}
	public void login() {
		clicklogin.click();
		
	}
	public void allowlocationpermission()
	{
		permissionpopup.click();
	}
	public void confirmlocation() {
		confrimlocation.click();
	}

	

}
