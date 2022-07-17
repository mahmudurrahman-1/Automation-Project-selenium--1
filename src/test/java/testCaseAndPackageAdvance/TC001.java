package testCaseAndPackageAdvance;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageobject.TC0001;
import webdriver.Basedriver;

public class TC001 extends Basedriver{
	String BaseUrl = "https://rahulshettyacademy.com/locatorspractice/";
   
	// now write the test annotation to start the test
	@Test
	public void SignIn() throws InterruptedException {
		TC0001 Signing = new TC0001(driver);
		driver.get(BaseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		// maximizing window
		driver.manage().window().maximize();
		Signing.signin("Jawad", "rahulshettyacademy");
		Thread.sleep(5000);
        Signing.signout();
        Thread.sleep(2000);
	}

}

