package app.modules;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.AboutPOM;

public class About {
	AboutPOM aboutPOM = new AboutPOM();

	/*perform login*/
	@BeforeTest
	public void doLogin() {
		Login login = new Login();
		login.startUp();
		login.login();
	}

	/*display about of the application*/
	@Test
	public void getAbout() {
		aboutPOM.clickUserName();
		aboutPOM.clickAbout();
	}
}
