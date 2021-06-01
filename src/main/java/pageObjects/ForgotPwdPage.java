package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPwdPage {

	public WebDriver driver;


	By fgtPwd = By.xpath("//h1[contains(text(),'Forgot your password?')]");
	
	public ForgotPwdPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}
	
	public WebElement getFwdText() {
		return driver.findElement(fgtPwd);
	}

	

	
}
