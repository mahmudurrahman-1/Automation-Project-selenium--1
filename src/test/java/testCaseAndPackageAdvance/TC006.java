package testCaseAndPackageAdvance;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageobject.TC0006;
import webdriver.Basedriver;

public class TC006 extends Basedriver {
	@Test
	public void ScrollandRefresh() throws InterruptedException {
		TC0006 ScronRefre = new TC0006(driver);
		driver.get("https://rahulshettyacademy.com/");
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		/* open url with browser */
		ScronRefre.Sn();
		Thread.sleep(2000);
		ScronRefre.nR();
		Thread.sleep(3000);
       

	}
}
