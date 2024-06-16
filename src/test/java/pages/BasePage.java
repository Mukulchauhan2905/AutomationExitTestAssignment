package pages;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import fileReaderUtils.ExcelSheetReader;
import fileReaderUtils.FileReader;
import webdriverUtils.WebDriverManager;

//@Listeners(Listeners.class)
@org.testng.annotations.Listeners(Listeners.class)
public class BasePage {
	
	public static WebDriver driver;
	protected static Logger log = LogManager.getLogger();;
	protected static WebDriverListener eventListener;
	protected static ExtentReports extent;
	protected static ExtentTest extentTest;
	protected static Properties config;
	protected static List<String[]> testData;

	public void logSeparator() {
		log.info("############################ ----NEW LOG BEGINS HERE---- ############################");
	}
	public void setupReporter() {
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("report/TestReport.html");
		extent = new ExtentReports();
		sparkReporter.config().setDocumentTitle("Simple Automation Report");
		sparkReporter.config().setReportName("Exit Test Report");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setCss(".badge{font-size:100%}");
		sparkReporter.config().setTimeStampFormat("EEEE, dd MMMM, yyyy, hh:mm a '('zzz')'");
		extent.attachReporter(sparkReporter);
	}
	
	
	@BeforeSuite
	public void setup() {
		logSeparator();
		setupReporter();
		try {
			config = FileReader.readFile("src\\test\\resources\\config.properties");
			testData = ExcelSheetReader.readExcelData("src\\test\\resources\\TestData.xlsx", "Sheet1");
		} catch (IOException e) {
			log.info("Unable to read file!");
		}
	}
	
	
	@AfterSuite
	public void finishReport() {
		extent.flush();
	}
	
	@BeforeMethod
	public void setup(Method method) throws IOException {
		
		try {
			extentTest = extent.createTest(method.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("********************TESTING FOR "+method.getName()+" *********************");
		String browser = config.getProperty("Browser");
		boolean headless = Boolean.parseBoolean(config.getProperty("Headless-mode"));
		int seconds = Integer.parseInt(config.getProperty("Wait-Time"));
		
		driver = WebDriverManager.initializeDriver(browser, headless);
		
		log.info("Driver created according to the properties file.");
		extentTest.info("Driver created according to the properties file.");
		
		// Maximize the browser window
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		
		String url = config.getProperty("URL");
		driver.get(url);
		
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			extentTest.fail(result.getThrowable());
		}
		WebDriverManager.quitDriver();
		extent.removeTest(result.getTestName());
	}
	
	// Switch to the new tab
	public void switchToNewTab(String currentWindowHandle) {
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                log.info("driver control on new tab");
                break;
            }
        }
	}

}
