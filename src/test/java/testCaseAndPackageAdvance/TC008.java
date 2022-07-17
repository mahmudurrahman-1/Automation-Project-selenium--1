package testCaseAndPackageAdvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageobject.TC0008;
import webdriver.Basedriver;

public class TC008 extends Basedriver {
	public static String url ="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test
	public void ActionSelection() throws InterruptedException {
		TC0008 actions = new TC0008(driver);
		driver.get(url);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		/* open url with browser */
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		Thread.sleep(2000);
		actions.SelectCars();
		Thread.sleep(2000);

	}
}
