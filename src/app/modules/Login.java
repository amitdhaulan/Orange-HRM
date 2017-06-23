package app.modules;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.LoginPOM;

public class Login {
	LoginPOM loginpom;

	/* get login instance */
	@BeforeTest
	public void startUp() {
		loginpom = new LoginPOM();
	}

	/* set user name and password to do login */
	@Test
	public void login() {
		loginpom.setUserName("admin");
		loginpom.setPassword("admin");
		loginpom.clickLoginButton();
	}
}
