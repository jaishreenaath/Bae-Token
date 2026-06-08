package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagemanner.PageMannerClass;
import utilities.ChromeDriverManager;
import utilities.ExtentReportClass;

public class Task {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--start-maximized");
		
		driver = new ChromeDriver(opt);
		
		driver.get("http://139.59.10.10:3018");
		 
		WebElement login = driver.findElement(By.id("login"));
 
		Thread.sleep(5000);
 
		login.click();
 
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("email"));
 
		email.sendKeys("testweb@mailinator.com");
 
		WebElement password = driver.findElement(By.id("password"));
 
		password.sendKeys("Test@123");
 
		WebElement signin = driver.findElement(By.id("submit"));
 
		signin.click();
 
		Thread.sleep(30000);
 
		driver.findElement(By.id("assetsdrp")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("transferlink")).click();
		
		Thread.sleep(3000);
		
		WebElement fromBox = driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
		
		Thread.sleep(1000);
		
		fromBox.click();
		
		Thread.sleep(1000);
		
		fromBox.sendKeys("Business");
		
		fromBox.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
//		WebElement fromBox1 = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
//		
//		fromBox1.click();
//		
//		Thread.sleep(1000);
//		
//		fromBox1.sendKeys("Business");
//		
//		fromBox1.sendKeys(Keys.ENTER);
		
		
		
//		driver = new ChromeDriver(opt);
//		
//		driver.get("https://new.demozab.com/waltex/admin/public/");
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("admin@waltex.com");
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("User1@123");
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//			
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//ul//li//a[.='Users']")).click();
//			
//		Thread.sleep(1500);
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		// Locate the input field (the one that has the "Please fill out this field" requirement)
//		WebElement inputField = driver.findElement(By.xpath("//input[@placeholder='Search for Username']"));
//
//		// Optionally clear any text (ensure empty)
//		inputField.clear();
//
//		// Locate and click the search button to trigger validation
//		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
//		searchButton.click();
//
//		// Small wait to let browser show validation message
//		Thread.sleep(1500);
//
//		// Now get validation message from the INPUT FIELD (not the button)
//		String validationMessage = (String) js.executeScript("return arguments[0].validationMessage;", inputField);
//
//		System.out.println("Validation message: " + validationMessage);
//		
	}

}
