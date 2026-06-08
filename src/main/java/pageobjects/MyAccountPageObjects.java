package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageObjects {
	
WebDriver driver;
	
	public MyAccountPageObjects(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);		
	}

	
	@FindBy(id = "profileimg")
	private WebElement profileicon;
	
	@FindBy(id = "profilelink")
	private WebElement profilelink;
	
	@FindBy(xpath = "//label[@class='prediticon form-label']//following-sibling::input[@id='profile_input_file' and @type='file']")
	private WebElement imagepath;
		
	@FindBy(id = "lastname")
	private WebElement lastname;
	
	@FindBy(id = "country")
	private WebElement country;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "submit")
	private WebElement submit;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProfileicon() {
		return profileicon;
	}

	public WebElement getProfilelink() {
		return profilelink;
	}

	public WebElement getImagepath() {
		return imagepath;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getSubmit() {
		return submit;
	}
	



}
