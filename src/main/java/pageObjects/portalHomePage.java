package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class portalHomePage {

	public WebDriver driver;

	By signOutLink = By.partialLinkText("Sign out");

	public portalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getSignoutLink() {
		return driver.findElement(signOutLink);
	}

}
