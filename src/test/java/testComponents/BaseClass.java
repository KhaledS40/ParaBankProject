package testComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();

		FileInputStream file = new FileInputStream(
				"C:\\Users\\Khaled\\IdeaProjects\\ParaBankCucumber\\src\\main\\java\\resources\\config.properties");
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

	public void tearDown() {

		driver.quit();
	}
}
