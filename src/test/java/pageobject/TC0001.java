package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC0001 {

	WebDriver driver =null;
	public TC0001(WebDriver driver) {
		this.driver = driver;
	}
	By username = By.id("inputUsername");
	By password = By.name("inputPassword");
	By checkbox = By.id("chkboxTwo");
	By button = By.className("signInBtn");
	By signout = By.className("logout-btn");

	public void signin(String name, String pass) {
		driver.findElement(username).sendKeys(name);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(checkbox).click();
		driver.findElement(button).click();
		
	}
	public void signout() {
		driver.findElement(signout).click();
	}
}
