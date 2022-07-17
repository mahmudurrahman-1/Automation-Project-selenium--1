package testCaseAndPackageAdvance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageobject.TC0007;
import webdriver.Basedriver;

public class TC007 extends Basedriver {
	
	public static String url ="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select";
	@Test

	public void Dropdown() throws InterruptedException {
		TC0007 Selecting =new TC0007(driver);
		driver.get(url);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		Thread.sleep(2000);
		Selecting.SelectCars();
		Thread.sleep(3000);
	}
}
