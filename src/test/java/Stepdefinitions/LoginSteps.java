package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.fbHomepage;
import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Browserfactory;

public class LoginSteps {
	WebDriver driver;
	loginPage login;
	fbHomepage fbhompg;
	String title;

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {

		String url = "https://www.facebook.com/";
		driver = Browserfactory.startBrowser(driver, "Chrome", url);
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		login = PageFactory.initElements(driver, loginPage.class);
		title = login.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
		Browserfactory.quitBrowser(driver);
	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username1, String password1) throws Throwable {
		login = PageFactory.initElements(driver, loginPage.class);
		login.enterUsername(username1);
		login.enterPassword(password1);
	}

	@And("^click on signin button$")
	public void click_on_signin_button() throws Throwable {
		login.clickSignin();
	}

	@Then("user navigated to homepage and title should be {string}")
	public void user_navigated_to_homepageand_title_should_be(String expectedTitleName) throws Throwable {
		fbhompg = PageFactory.initElements(driver, fbHomepage.class);
		title = fbhompg.getFBhomePageTitle();
		Assert.assertTrue(title.contains(expectedTitleName));// Validate Title
	}

	@And("post status message {string}")
	public void post_status_message(String message) throws Throwable {
		fbhompg.messageboxClick(); // To open the messgebox pop-up
		fbhompg.enterStatusMessage(message);// Enter Status message
		fbhompg.postButtonclick(); // Post The Message
		Browserfactory.quitBrowser(driver);
	}

	@Then("^verify the status message$")
	public void verify_the_status_message() throws Throwable {
		Assert.assertTrue(fbhompg.postMsgVerify());// Validate the posted message
	}

}
