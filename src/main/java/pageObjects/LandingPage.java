package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {

	public WebDriver driver;

	By signin = By.partialLinkText("Sign");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getLogin() {
		return driver.findElement(signin);
	}

	

}
