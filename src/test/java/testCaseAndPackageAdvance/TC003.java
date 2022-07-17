package testCaseAndPackageAdvance;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageobject.TC0003;
import webdriver.Basedriver;

public class TC003 extends Basedriver {
	@Test
	public void ForgetandSignin() throws InterruptedException {
		TC0003 forgetPassword = new TC0003(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		/* open url with browser */
		forgetPassword.clickonForgetpass();
		Thread.sleep(2000);
		forgetPassword.clickOnReset("Jawad", "mahmudurrahman.sqa@gmail.com", "01974267935");
		Thread.sleep(3000);
        forgetPassword.reSingin("Mahmudur");
		Thread.sleep(3000);
		forgetPassword.signout();
		Thread.sleep(2000);

	}
}
