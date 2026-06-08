package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	WebDriver driver;
	
	public LoginPageObjects(WebDriver driver)
	{
	
		this.driver = driver;
		
	}
	
	@FindBy(id = "email")
	private static WebElement emailaddres;
	
	@FindBy(id = "password")
	private static WebElement password;
	
	@FindBy(id = "submit")
	private static WebElement loginsubmit;
	

	public static WebElement getEmailaddres() {
		return emailaddres;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getLoginsubmit() {
		return loginsubmit;
	}

}
