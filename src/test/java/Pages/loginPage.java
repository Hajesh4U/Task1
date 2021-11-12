package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {
	WebDriver driver;

	public loginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id = "email")
	WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@id='pass']")
	// @FindBy(xpath = "//input[@id='pass']")
	WebElement password;

	@FindBy(name = "login")
	WebElement signin;

	public void enterUsername(String user) {
		username.sendKeys(user);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	public void enterPassword(String passw) {
		password.sendKeys(passw);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	public void clickSignin() {
		signin.click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	//

}
