package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TC0003 {
	WebDriver driver = null;

	public TC0003(WebDriver driver) {
		this.driver = driver;
	}

//variables
	By forgetPass = By.linkText("Forgot your password?");
	By user = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]");
	By email = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]");
	By Phone = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]");
	By reset = By.className("reset-pwd-btn");
    By message = By.className("infoMsg");
    By login = By.className("go-to-login-btn");
    
    //Sign in
    By username = By.id("inputUsername");
	By password = By.name("inputPassword");
	By checkbox = By.id("chkboxTwo");
	By button = By.className("signInBtn");
//	Signout
	By signout = By.className("logout-btn");

	// methods
	public void clickonForgetpass() {
		driver.findElement(forgetPass).click();
	}

	public void clickOnReset(String name, String mail, String i) {
		driver.findElement(user).sendKeys(name);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(Phone).sendKeys(i);
		
		driver.findElement(reset).click();
		

	}
	
	public void reSingin(String name) {
		String lineText = driver.findElement(message).getText();
		String[] output= lineText.split("'");
		String Password = output[1];
		driver.findElement(login).click();
		
			driver.findElement(username).sendKeys(name);
			driver.findElement(password).sendKeys(Password);
			driver.findElement(checkbox).click();
			driver.findElement(button).click();
		
	
	}
	public void signout() {
		driver.findElement(signout).click();
	}
	
}
