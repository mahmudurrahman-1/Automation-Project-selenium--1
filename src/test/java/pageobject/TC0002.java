package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC0002 {
	WebDriver driver = null;

	public TC0002(WebDriver driver) {
		this.driver = driver;
	}

	By visit = By.id("visitUsTwo");

	public void visit() {
		driver.findElement(visit).click();

	}
}
