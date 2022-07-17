package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TC0006 {

	WebDriver driver = null;

	public TC0006(WebDriver driver) {
		this.driver = driver;
	}
	public void Sn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1500)", "");
	}
	public void nR() {
		driver.navigate().refresh();
	}
	
}
