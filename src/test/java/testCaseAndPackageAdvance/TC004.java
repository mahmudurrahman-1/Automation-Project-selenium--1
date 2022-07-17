package testCaseAndPackageAdvance;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageobject.TC0004;
import webdriver.Basedriver;

public class TC004 extends Basedriver {
	@Test
	public void GetTitleAndSecurity() throws InterruptedException {
		TC0004 GTAS = new TC0004(driver);
		driver.get("https://rahulshettyacademy.com");
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		/* open url with browser */
		GTAS.getAllResources();
		Thread.sleep(3000);

	}
}
