package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecuritySettingsPageObjects {
	
	WebDriver driver;
	
	public SecuritySettingsPageObjects(WebDriver driver)
	{
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id = "securitylink")
	private WebElement securitylink;
	
	@FindBy(id = "authbtn")
	private WebElement googleauthbtn;
	
	@FindBy(xpath = "//div//h5")
	private WebElement secretkey;
	
	@FindBy(id = "otpverify")
	private WebElement otpenter;
	
	@FindBy(id = "otpsubmit")
	private WebElement submit;

	

	public WebElement getSecuritylink() {
		return securitylink;
	}

	public WebElement getGoogleauthbtn() {
		return googleauthbtn;
	}

	public WebElement getSecretkey() {
		return secretkey;
	}

	public WebElement getOtpenter() {
		return otpenter;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	@FindBy(id = "emailauth")
	private WebElement emailenablebtn;
	
	@FindBy(id = "getcode")
	private WebElement getcode;
	
	@FindBy(xpath = "//div//div[.='OTP sent to your Email ID.']")
	private WebElement otpsentmailtext;
	
	@FindBy(id = "emailverify")
	private WebElement emailotpenter;
	
	@FindBy(id = "confirm")
	private WebElement confirm;
	


	public WebElement getEmailenablebtn() {
		return emailenablebtn;
	}

	public WebElement getGetcode() {
		return getcode;
	}

	public WebElement getOtpsentmailtext() {
		return otpsentmailtext;
	}

	public WebElement getEmailotpenter() {
		return emailotpenter;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	
}
