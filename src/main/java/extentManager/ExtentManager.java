package extentManager;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentManager {
	
	public  WebDriver driver;
	public static ExtentSparkReporter htmlReporter;   // repsosnible for look
	 public  static ExtentReports extent; //  Resposnisble for entries
	 public  static ExtentTest test; // Respossible for test status pass/fail
		
		 
		 
		 public static void setup() {
		 
		  htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
		  htmlReporter.config().setDocumentTitle("Automation Report"); //Tiltle of the report
		  htmlReporter.config().setReportName("Functional Report"); //Nameof the report
		  htmlReporter.config().setTheme(Theme.DARK); //theme of the report

		  extent = new ExtentReports();
		  extent.attachReporter(htmlReporter);
		  extent.setSystemInfo("hostname", "Kundan");
		  extent.setSystemInfo("os", "windows10");
		  extent.setSystemInfo("testerName", "kundan");
		  extent.setSystemInfo("Browser", "Chrome");
		 }
		  public static void endReport() {
		  extent.flush();
		  
		}
	}



