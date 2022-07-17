package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC0008 {
	WebDriver driver = null;

	public TC0008(WebDriver driver) {
		this.driver = driver;
	}
	By cars = By.id("cars");
	public void SelectCars() {
		driver.findElement(cars).click();
		Select s = new Select(driver.findElement(cars));
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(2)).build().perform();
	}
}


/*
Actions a = new Actions(driver);
    a.keyDown(Keys.CONTROL).click(s.getOptions().get(3)).click(s.getOptions().get(1)).keyUp(Keys.CONTROL).build().perform();
   
*/