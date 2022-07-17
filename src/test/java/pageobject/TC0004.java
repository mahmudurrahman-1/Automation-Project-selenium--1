package pageobject;

import org.openqa.selenium.WebDriver;

public class TC0004 {
	WebDriver driver = null;

	public TC0004(WebDriver driver) {
		this.driver = driver;

	}

	public void getAllResources() {
		driver.getTitle();
		driver.getPageSource();
		driver.getCurrentUrl();
	}
}
