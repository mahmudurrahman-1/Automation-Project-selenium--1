package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TC0007 {
	WebDriver driver = null;

	public TC0007(WebDriver driver) {
		this.driver = driver;
	}
	By cars = By.id("cars");
	public void SelectCars() {
		driver.findElement(cars).click();
		Select s = new Select(driver.findElement(cars));
		s.selectByIndex(2);
	}
}
