package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KYCPageObjects {
	
	WebDriver driver;
	
	public KYCPageObjects(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "securitylink")
	private WebElement securitylink;
	
	@FindBy(id = "kycbtn")
	private WebElement kycviewenable;
	
	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "datepicker")
	private WebElement dob;
	
	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "zipcode")
	private WebElement zipcode;
	
	@FindBy(id = "country")
	private WebElement country;
	
	@FindBy(id = "document1")
	private WebElement doctype;
	
	@FindBy(id = "id_document_number")
	private WebElement docnumber;
	
		@FindBy(id = "eob")
	private WebElement expirydate;

	@FindBy(xpath = "//label[@id='file_input_file1']//following-sibling::input[@type='file']")
	private WebElement frontdoc;

	@FindBy(xpath = "//label[@is='file-upload2']//following-sibling::input[@type='file']")
	private WebElement backdoc;

	@FindBy(id = "submit")
	private WebElement verifynow;


	
	

	public WebElement getSecuritylink() {
		return securitylink;
	}

	public WebElement getKycviewenable() {
		return kycviewenable;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getZipcode() {
		return zipcode;
	}
	
	public WebElement getCountry() {
		return country;
	}
	
	public WebElement getDoctype() {
		return doctype;
	}

	public WebElement getDocnumber() {
		return docnumber;
	}


	public WebElement getExpirydate() {
		return expirydate;
	}

	public WebElement getFrontdoc() {
		return frontdoc;
	}

	public WebElement getBackdoc() {
		return backdoc;
	}

	public WebElement getVerifynow() {
		return verifynow;
	}
	
	

	
	

}
