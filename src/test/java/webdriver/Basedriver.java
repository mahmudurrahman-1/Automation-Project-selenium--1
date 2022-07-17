package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basedriver {
//Create a public static WebDriver value is null
	public static WebDriver driver = null;
//Before Suite annotation run before all the test case execution
	@BeforeSuite
	//setup Web drivers
	public void setup() {
		String browser =System.getProperty("browser", "chrome");
		if(browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
	}
	@AfterSuite
	public void tearDown() {
		driver.quit();
		
	}
}
