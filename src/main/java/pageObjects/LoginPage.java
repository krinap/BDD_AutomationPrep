package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By email = By.id("email");
	By password = By.id("passwd");
	By login = By.id("SubmitLogin");
	By wrongEmailMsg = By.xpath("//li[contains(text(),'Authentication failed.')]");
	By invalidErrMsg = By.xpath("//li[contains(text(),'Invalid email address.')]");
	By wrongPwdMsg = By.xpath("//li[contains(text(),'Invalid password.')]");
	By forgotPwdlink = By.partialLinkText("Forgot your passwor");
	
	

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public WebElement getEmailErrMsg() {
		return driver.findElement(wrongEmailMsg);
	}
	
	public WebElement getInvalidEmail() {
		return driver.findElement(invalidErrMsg);
	}

	public WebElement getWrongPwdErrMsg() {
		return driver.findElement(wrongPwdMsg);
	}
	
	public WebElement getforgotPwdLink() {
		
		
		return driver.findElement(forgotPwdlink);
	}

	
}
