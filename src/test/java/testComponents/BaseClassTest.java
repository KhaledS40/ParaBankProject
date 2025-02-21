package testComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClassTest {

	public static WebDriver driver;
	public WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();

		FileInputStream file = new FileInputStream(
				"C:\\Users\\Khaled\\IdeaProjects\\ParaBankCucumber\\src\\main\\resources\\resources\\config.properties");
		prop.load(file);
		String browsername = prop.getProperty("browser");

		switch (browsername) {
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}

		driver.manage().window().maximize();
		driver.navigate().to(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

//	@BeforeTest(alwaysRun = true)
//	public void launchApplication() throws IOException {
//
//		driver = initializeDriver();
//		Registration reg = new Registration(driver);
//	}

	public static String getScreenshot(String testCaseName) throws IOException {

		//TakesScreenshot ts = (TakesScreenshot) driver;
		//File source = ts.getScreenshotAs(OutputType.FILE);
		//File file = new File(System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png");
		//FileUtils.copyFile(source, file);
		//return System.getProperty("user.dir") + "//reports" + testCaseName + ".png";

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

		System.out.println("this is inside screenshot method");
		// Save the screenshot to a file
		File destinationFile = new File(System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png");
		FileUtils.copyFile(sourceFile, destinationFile);
		return System.getProperty("user.dir") + "//reports" + testCaseName + ".png";

	}
	public void tearDown() {

		driver.quit();
	}
}
