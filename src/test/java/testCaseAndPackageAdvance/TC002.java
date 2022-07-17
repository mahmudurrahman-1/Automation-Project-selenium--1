package testCaseAndPackageAdvance;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageobject.TC0002;
import webdriver.Basedriver;

public class TC002 extends Basedriver {
	@Test
	public void VisitButton() throws InterruptedException {
		TC0002 visiting = new TC0002(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		visiting.visit();
		Thread.sleep(3000);

	}
}
