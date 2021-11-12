package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class fbHomepage {
	WebDriver driver;

	public fbHomepage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),\"What's on your mind,\")]")
	WebElement statusTextbox;

	@FindBy(how = How.XPATH, using = "//div[@class='_1mf _1mj']")
	WebElement popTextbox;

	@FindBy(how = How.XPATH, using = "//div[@aria-label='Post']")
	WebElement postButton;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Hello World')]")
	WebElement postMsg;

	public void messageboxClick() {
		statusTextbox.click();// it will open status box pop-up Click
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	public void enterStatusMessage(String message) {
		popTextbox.sendKeys(message);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	public void postButtonclick() {
		postButton.click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	}

	public Boolean postMsgVerify() {
		return postMsg.isDisplayed();
	}

	public String getFBhomePageTitle() {
		return driver.getTitle();
	}

}
