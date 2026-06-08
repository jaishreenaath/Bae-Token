package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager implements DriverManager
{

	WebDriver driver;
	
	public WebDriver createdriver() {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--start-maximized");
		
		driver = new ChromeDriver(option);
		
		return driver;
				
	}

	public void closedriver(WebDriver driver) {
		
		driver.close();
		
	}
	
	

}
