package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserfactory {

	public static WebDriver startBrowser(WebDriver driver, String browser, String baseUrl) {
		if (browser.equals("Chrome")) {
			String projPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projPath + "/src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			// need to implement Firefox driver
		}

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}
