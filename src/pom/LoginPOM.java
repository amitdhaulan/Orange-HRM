package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPOM {
	public static WebDriver driver;
	public static WebElement element;

	/* launch browser and URL */
	public LoginPOM() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\amit\\testing_git\\soft\\selenium_accessories\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	}

	/* close browser */
	public void closeBrowser() {
		driver.close();
	}

	/* set user name */
	public void setUserName(String username) {
		LoginPOM.conditionalWait("id", "txtUsername").sendKeys(username);
	}

	/* set password */
	public void setPassword(String password) {
		LoginPOM.conditionalWait("id", "txtPassword").sendKeys(password);
	}

	/* click login button */
	public void clickLoginButton() {
		LoginPOM.conditionalWait("id", "btnLogin").click();
	}

	/* conditional wait */
	public static WebElement conditionalWait(String elementName, String identifier) {
		if (elementName.equals("linktext")) {
			return new WebDriverWait(LoginPOM.driver, 40, 40)
					.until(ExpectedConditions.presenceOfElementLocated(By.linkText(identifier)));
		} else if (elementName.equals("id")) {
			return new WebDriverWait(LoginPOM.driver, 40, 40)
					.until(ExpectedConditions.presenceOfElementLocated(By.id(identifier)));
		} else if (elementName.equals("name")) {
			return new WebDriverWait(LoginPOM.driver, 40, 40)
					.until(ExpectedConditions.presenceOfElementLocated(By.name(identifier)));
		} else {
			return new WebDriverWait(LoginPOM.driver, 40)
					.until(ExpectedConditions.presenceOfElementLocated(By.tagName(identifier)));
		}
	}
}
