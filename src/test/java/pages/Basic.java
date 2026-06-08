package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.sun.org.apache.bcel.internal.generic.Select;

import pagemanner.PageMannerClass;
import pageobjects.KYCPageObjects;
import pageobjects.MyAccountPageObjects;
import pageobjects.RegisterPageObjects;
import pageobjects.SecuritySettingsPageObjects;
import utilities.BaseSetup;
import utilities.ChromeDriverManager;

import utilities.ExtentReportClass;
import static utilities.ExtentReportClass.extent;

import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static constants.ConstantClass.*;


public class Basic extends BaseSetup
{
	
	PageMannerClass pm;
	
	public static  WebDriverWait wait;
	
	@BeforeClass
	public void start()
	{
		
		startdriver(new ChromeDriverManager());

		pm = new PageMannerClass(driver);
		
		ExtentReportClass.startreport();
		
		
	}
	
//	@AfterClass
//	public void end()
//	{
//		
//		ExtentReportClass.stopreport();
//		
//		stopdriver(new ChromeDriverManager());
//		
//	}
//	
	
	
	@Test(priority = 0, enabled = false)
	public void register()
	{
		
		ExtentTest test = extent.createTest("Register");
		
		url(registerurl);
		
		hold(2000);
		
		RegisterPageObjects r = pm.RegisterPageObjects();
		
		sendkey(r.getName(), name);
		
		hold(1000);
		
		sendkey(r.getEmail(), email);
		
		hold(1000);
		
		sendkey(r.getPassword(), password);
		
		hold(1000);
		
		sendkey(r.getConfirmpass(), password);
		
		hold(000);
		
		cli(r.getTermscondition());
		
		hold(1000);
		
		cli(r.getRegistersubmit());
		
		hold(1000);
		
		mailinator();
		
		test.addScreenCaptureFromBase64String(screenshot());
		
		hold(2000);
		
		sendkey(r.getEmail(), email);
		
		hold(1000);
		
		sendkey(r.getPassword(), password);
		
		hold(1000);
		
		cli(r.getRegistersubmit());
		
		hold(1000);
		
		test.addScreenCaptureFromBase64String(screenshot());
		
		hold(1000);
	}
	
	@Test(priority = 1, enabled = false)
	public void login()
	{
		
		ExtentTest test = extent.createTest("Login");
		
		RegisterPageObjects r = pm.RegisterPageObjects();
		
		url(loginurl);
		
		hold(2000);
		
		sendkey(r.getEmail(), email);
		
		hold(1000);
		
		sendkey(r.getPassword(), password);
		
		hold(1000);
		
		cli(r.getRegistersubmit());
		
		hold(1000);
		
	}
	
	@Test(priority = 2, enabled = false)
	public void myaccount()
	{
		
		login();
		
		hold(2000);
		
		ExtentTest test = extent.createTest("My Profile");
		
		MyAccountPageObjects m = pm.MyAccountPageObjects();
		
		cli(m.getProfileicon());
		
		hold(1500);
		
		cli(m.getProfilelink());
		
		hold(2000);
		
		sendkey(m.getImagepath(), "D:\\Jai\\Test Data\\Validation Images\\Images\\istockphoto-1309328823-612x612.jpg");
		
		hold(2500);
		
		cli(xpath("//label//span[@class='pfup']"));
		
		hold(1500);
		
		test.addScreenCaptureFromBase64String(screenshot());
		
		hold(1500);
		
		sendkey(m.getLastname(), "kumar");
		
		hold(1000);
		
		dropdown(m.getCountry(), "india");
		
		hold(1000);
		
		sendkey(m.getAddress(), "This is test address - 625002");
		
		hold(1000);
		
		cli(id("submit"));
		
		hold(1000);
		
		test.addScreenCaptureFromBase64String(screenshot());
		
		hold(2000);
		
	}

	@Test(priority = 3, enabled = false)
	public void google2fa() throws Exception
	{
		
		login();
		
		hold(2000);
		
		ExtentTest test = extent.createTest("Google 2FA Settings");
		
		SecuritySettingsPageObjects s = pm.securitypageobjects();
		
		cli(s.getSecuritylink());
		
		hold(2000);
		
		cli(s.getGoogleauthbtn());
		
		hold(2000);
		
		WebElement secretkey = s.getSecretkey();
		
		String key = secretkey.getText();
		
		System.out.println(key);
		
		hold(1500);
		
		sendkey(s.getOtpenter(), generateOTP(key));
		
		hold(1500);
		
		js(xpath("//div//p[contains(.,' Bae Token. All rights reserved.')]"));
		
		hold(1500);
		
		cli(s.getSubmit());
		
		hold(1500);
		
		test.addScreenCaptureFromBase64String(screenshot());
		
		hold(500);
		
		test.log(Status.PASS, MarkupHelper.createLabel("Google 2FA Enabled", ExtentColor.GREEN));
			
	}
	
	@Test(priority = 4, enabled = false)
	public void email2fa()
	{
		login();
		
		hold(5000);
		
		ExtentTest test = extent.createTest("Email Verification");
		
		SecuritySettingsPageObjects s = pm.securitypageobjects();
		
		cli(s.getSecuritylink());
		
		hold(2000);
		
		cli(s.getEmailenablebtn());
		
		hold(3000);
		
		cli(s.getGetcode());
		
		hold(2500);
		
		if (s.getOtpsentmailtext().isDisplayed()) {

		hold(1500);

		sendkey(s.getEmailotpenter(), mailinator());
		
		hold(1000);
		
		cli(s.getConfirm());
		
		hold(1000);
		
		}
		
		
	}
	
	@Test(priority = 5)
	public void kyc()
	{
		
		ExtentTest test = extent.createTest("KYC");
		
		KYCPageObjects k = pm.kycpageobjects();
		
		login();
		
		hold(4000);

		id("kyclink").click();
		
		hold(2000);
		
		k.getKycviewenable();
		
		hold(2000);
		
		sendkey(k.getFirstname(), name);
		
		hold(1000);
		
		sendkey(k.getLastname(), sname);
		
		hold(1000);
		
		cli(k.getDob());
		
		hold(1000);
		
		dropdown(xpath("//select[@class='react-datepicker__month-select']"), "5");
		
		hold(1000);
		
		dropdown(xpath("//select[@class='react-datepicker__year-select']"), "1996");
		
		hold(2500);
		
		LocalDate date =  LocalDate.now();
		
		int today = date.getDayOfMonth();
		
		System.out.println(today);
		
		String currentdate = String.valueOf(today);
		
		xpath("(//div[text()='"+currentdate+"'])[1]").click();
		
		hold(1000);
		
		sendkey(k.getAddress(), "This is test address");
		
		hold(1000);
		
		sendkey(k.getCity(), "Madurai");
		
		hold(1000);
		
		sendkey(k.getZipcode(), "625002");
		
		hold(1000);
		
		dropdown(k.getCountry(), "India");
		
		hold(1000);
		
		dropdown(k.getDoctype(), "passport");
		
		hold(1000);
		
		sendkey(k.getDocnumber(), "22696");
		
		hold(1000);
		
		cli(k.getExpirydate());
		
		hold(1000);
		
		cli(xpath("//div[@class='react-datepicker__month']//div[@class='react-datepicker__week'][5]//div[7]"));
		
		hold(1000);
		
		sendkey(k.getFrontdoc(), "D:\\Jai\\Test Data\\Validation Images\\Images\\1.jpg");

		hold(1000);
		
		sendkey(k.getBackdoc(), "D:\\Jai\\Test Data\\Validation Images\\Images\\1.jpg");
		
		hold(1000);
		
		js(xpath("//div//p[text()=' Bae Token. All rights reserved.']"));
		
		hold(2000);
		
		cli(k.getVerifynow());
		
		hold(1500);
		
		test.addScreenCaptureFromBase64String(screenshot());
		
		test.log(Status.PASS, MarkupHelper.createLabel("KYC Submitted successfully", ExtentColor.GREEN));
		
		
		
	}
	
	
	
}
