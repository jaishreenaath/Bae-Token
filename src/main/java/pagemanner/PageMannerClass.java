package pagemanner;

import org.openqa.selenium.WebDriver;

import pageobjects.KYCPageObjects;
import pageobjects.LoginPageObjects;
import pageobjects.MyAccountPageObjects;
import pageobjects.RegisterPageObjects;
import pageobjects.SecuritySettingsPageObjects;

public class PageMannerClass {
	
	WebDriver driver;
	
	public PageMannerClass(WebDriver driver)
	{
		
		this.driver = driver;
		
	}
	
	
	public RegisterPageObjects RegisterPageObjects()
	{
		
		return new RegisterPageObjects(driver);
		
	}
	
	public LoginPageObjects LoginPageObjects()
	{
		
		return new LoginPageObjects(driver);
		
	}
	
	public MyAccountPageObjects MyAccountPageObjects()
	{
		return new MyAccountPageObjects(driver);
	}
	
	public SecuritySettingsPageObjects securitypageobjects() {
		
		return new SecuritySettingsPageObjects(driver);
	}

	public KYCPageObjects kycpageobjects()
	{
		return new KYCPageObjects(driver);
	}
	
}
