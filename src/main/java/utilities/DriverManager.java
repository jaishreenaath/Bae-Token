package utilities;

import org.openqa.selenium.WebDriver;

public interface DriverManager {
	
	public WebDriver createdriver();
	
	public void closedriver(WebDriver driver);

}
