package stepDefinition;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.ForgotPwdPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;

public class StepDefination extends base {

	public LoginPage lp;

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@When("^User enters (.+) and (.+) and logs in$")
	public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		lp = new LoginPage(driver);
		//LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();

	}

	@Given("^Click on Sign link in home page to land on Secure sign in Page$")
	public void click_on_Sign_link_in_home_page_to_land_on_Secure_sign_in_Page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		LandingPage l = new LandingPage(driver);
		l.getLogin().click(); // driver.findElement(By.css()
	}

	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		portalHomePage p = new portalHomePage(driver);
		Assert.assertTrue(p.getSignoutLink().isDisplayed());

	}

	@Then("^Verify that user is getting authentication error message$")
	public void verify_that_user_is_getting_authentication_error_message() throws Throwable {
		lp = new LoginPage(driver);
		String text = lp.getEmailErrMsg().getText();
		Assert.assertEquals("Authentication failed.", text);

	}

	@Then("^Verify that user is getting invalid email message$")
	public void verify_that_user_is_getting_invalid_email_message() throws Throwable {
		lp = new LoginPage(driver);
		String text = lp.getInvalidEmail().getText();
		Assert.assertEquals("Invalid email address.", text);

	}

	@Then("^Verify that user is getting wrong password message$")
	public void verify_that_user_is_getting_wrong_password_message() throws Throwable {
		// throw new PendingException();
		lp = new LoginPage(driver);
		String text = lp.getInvalidEmail().getText();
		Assert.assertEquals("Invalid password.", text);
	}
	
	 @When("^User click on forgot password link$")
	    public void user_click_on_forgot_password_link() throws Throwable {
		 lp = new LoginPage(driver);
		 lp.getforgotPwdLink().click();
		 
	    }

	    @Then("^verify new page has forgotpassword$")
	    public void verify_new_page_has_forgotpassword() throws Throwable {
	    	
	    ForgotPwdPage fp  = new ForgotPwdPage(driver);
	    Assert.assertTrue(fp.getFwdText().isDisplayed());
	       
	    }

	@And("^close browsers$")
	public void close_browsers() throws Throwable {
		driver.quit();
	}

}
