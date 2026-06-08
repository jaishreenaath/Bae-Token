package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageObjects {
	
	WebDriver driver;
	
	public RegisterPageObjects(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "name")
	private  WebElement name ;
	
	@FindBy(id = "email")
	private  static WebElement email ;
	
	@FindBy(id = "password")
	private static WebElement password;
	
	@FindBy(id = "password-confirm")
	private static WebElement confirmpass;
	
	@FindBy(id = "referral-code")
	private static WebElement referral;
	
	@FindBy(id = "terms-agreement")
	private static WebElement termscondition;
	
	@FindBy(id = "submit")
	private static WebElement registersubmit;
	

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpass() {
		return confirmpass;
	}

	public WebElement getReferral() {
		return referral;
	}

	public WebElement getTermscondition() {
		return termscondition;
	}

	public WebElement getRegistersubmit() {
		return registersubmit;
	}

}
