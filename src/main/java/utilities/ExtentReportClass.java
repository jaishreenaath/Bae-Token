package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportClass {
	
	public static ExtentSparkReporter spark;
	
	public static ExtentReports extent;
	
	public static void startreport()
	{
		
		spark = new ExtentSparkReporter("./Report//Basic.html");
		
		extent = new ExtentReports();
		
		extent.attachReporter(spark);
		
		extent.setSystemInfo("Project Name", "Bae Token");
		
		extent.setSystemInfo("Framework", "TestNG");
		
		extent.setSystemInfo("Tester Name", "Jaishreenaatth");
		
	}
	
	public static void stopreport()
	{
		
		extent.flush();
		
	}

}
