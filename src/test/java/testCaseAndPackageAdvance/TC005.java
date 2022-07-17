package testCaseAndPackageAdvance;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageobject.TC0005;
import webdriver.Basedriver;

public class TC005 extends Basedriver {
	
	public static String baseUrl = "https://jqueryui.com/checkboxradio";

	@Test
	public static void checkRadioandBox() throws InterruptedException {
		TC0005 radio = new TC0005(driver);
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame(0);	
		radio.RadioCheck();;
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	}
}
