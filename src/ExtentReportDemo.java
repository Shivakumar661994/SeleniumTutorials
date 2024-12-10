import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	ExtentReports extent;
	public void config() {
		// ExtentReports , ExtentSparkReporter
	String path = 	"C:\\Users\\Sankeerthana M\\OneDrive\\eclipse-workspace\\Selenium\\reports\\.html";
//	System.getProperty("user.dir")+""
//	String path = 	System.getProperty("user.dir")+ "index.html";
//String path = 	"index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation Results");
	reporter.config().setDocumentTitle("Test Results");
	
	extent= new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Shiva Kumar");
	extent.flush();
	}
	
	
	
	
	@Test
	public void initailDemo() {
//		extent.createTest(path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());	
		
		
	}
}
