package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC0005 {
	WebDriver driver = null;

	public TC0005(WebDriver driver) {
		this.driver = driver;

	}
	//variables
	By checkbox =By.cssSelector("body:nth-child(2) div.widget fieldset:nth-child(5) > label.ui-checkboxradio-label.ui-corner-all.ui-button.ui-widget:nth-child(2)");
	By radio =By.cssSelector("body:nth-child(2) div.widget fieldset:nth-child(3) > label.ui-checkboxradio-label.ui-corner-all.ui-button.ui-widget.ui-checkboxradio-radio-label:nth-child(4)");
	
	public void RadioCheck() {
		driver.findElement(checkbox).click();
		driver.findElement(radio).click();
	}
}
