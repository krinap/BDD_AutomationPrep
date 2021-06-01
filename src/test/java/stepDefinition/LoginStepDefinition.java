package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	public WebDriver driver;
	// WebDriverWait wait = new WebDriverWait(driver, 50);
	/*
	 * @FindBy(partialLinkText = "Sign") WebElement signInLink;
	 */

	WebElement signInLink;
	WebElement signOutLink;

	// @FindBy(id = "email")
	WebElement emailId;

	// @FindBy(id = "passwd")
	WebElement passwd;

	// @FindBy(id = "SubmitLogin")
	WebElement btnSubmit;

	@Before()
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Learning_Selenium\\Selenium_Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Given("^User want to click on SignInlink$")
	public void user_want_to_click_on_signinlink() throws InterruptedException {

		signInLink = driver.findElement(By.partialLinkText("Sign"));
		signInLink.click();

		System.out.println("click on sign in");
	}

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2)
			throws InterruptedException {

		System.out.println(strArg1);
		System.out.println(strArg2);

		emailId = driver.findElement(By.id("email"));
		passwd = driver.findElement(By.id("passwd"));
		btnSubmit = driver.findElement(By.id("SubmitLogin"));

		emailId.sendKeys(strArg1);

		passwd.sendKeys(strArg1);
		
		Thread.sleep(2000);

		btnSubmit.click();
		
		Thread.sleep(2000);

	}

	@Then("^Home page is poupulated \"([^\"]*)\"$")
	public void home_page_is_poupulated_something(String strArg1) throws InterruptedException {

		
			
			signOutLink = driver.findElement(By.partialLinkText("Sign out"));

			String expectedtitle = signOutLink.getText();
			String actualTitle = "Sign out";

			Assert.assertEquals(actualTitle, expectedtitle);
		
		//System.out.println(strArg1);

	}

	

	@And("^Login is \"([^\"]*)\"$")
	public void login_is_something(String strArg1) throws InterruptedException {

		if (strArg1.equals("true")){

			System.out.println("Authentication successfull");
		} else {

			System.out.println("Authentication failed");

		}

	}

	@After()
	public void tearDown() {

		System.out.println("Browser closed");
		driver.close();
	}

}
