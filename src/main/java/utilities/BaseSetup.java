package utilities;

import java.util.ArrayList;
import java.util.Set;
import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;




import constants.ConstantClass;

public class BaseSetup {
	
	public static WebDriver driver;
	
	public static void startdriver(DriverManager d)
	{
		
		if (driver==null)
		{
			driver = d.createdriver();
		}
		
	}
	
	public static void stopdriver(DriverManager d)
	{
		
		if (driver!=null)
		{
			d.closedriver(driver);
			
			driver=null;
			
		}
	}
	
	public static void hold(int a)
	{
		
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
	}
	
	public static void js(WebElement ele) {  ////div//p[contains(.,' Bae Token. All rights reserved.')]
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
	}
	
	public static void jsscroll(int a, int b) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    js.executeScript("window.scrollBy(" + a + "," + b + ")");
	    
	}
	
	public static void newtab() {
	    
		driver.switchTo().newWindow(WindowType.TAB);
	    
	}

	public static void url(String url)
	{
		driver.get(url);
	}
	
	public static WebElement id(String t)
	{
		return driver.findElement(By.id(t));
	}
	
	public static WebElement name(String n)
	{
		return driver.findElement(By.name(n));
	}
	
	public static WebElement xpath(String x)
	{
		return driver.findElement(By.xpath(x));
	}
	
	public static void refresh()
	{
		driver.navigate().refresh();
	}
	
	public static String screenshot()
	{
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		return tk.getScreenshotAs(OutputType.BASE64);
	}
	
	public static void sendkey(WebElement ele , String a)
	{
		ele.sendKeys(a);
		
	}
	
	public static void cli(WebElement ele)
	{
		ele.click();
	}
	
	public static String mailinator()
	{
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 js.executeScript("window.open()");
		
		hold(1000);
		
		Set<String> all = driver.getWindowHandles();
		
		List<String> li = new ArrayList<String>(all);
		
		driver.switchTo().window(li.get(1));
		
		hold(1000);
		
		url("https://www.mailinator.com");
		
		hold(2000);

		name("search").sendKeys(ConstantClass.email);
		
		hold(1000);
		
		cli(xpath("//button[.='GO']"));
		
		hold(4000);
		
		xpath("(//table)[3]//tr//td[contains(.,'BaeToken')]//following-sibling::td[contains(.,'Verification')]").click();
		
		hold(3000);
		
		driver.switchTo().frame("html_msg_body");
		
		hold(1000);
		
		String otp = xpath("//tr[@class='regimgbox']//td//following-sibling::span//b").getText();
		
		driver.switchTo().window(li.get(0));
		
		hold(1500);
		
		return otp;
		
	}
	
	public static void dropdown(WebElement ele, String value)
	{
		Select s = new Select(ele);
		
		java.util.List<WebElement> all = s.getOptions();
		
		for (WebElement a : all) {
			
			if (a.getText().equalsIgnoreCase(value)) 
			{
				
				a.click();
				
				break;
				
			}
			
		}
		
		
	}
	
	public static String generateOTP(String base32Secret) throws Exception {
        
		Totp totp=new Totp(base32Secret);
		
		return totp.now();
    }
	

}
