package app.modules;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.DashboardPOM;

public class Dashboard {
	DashboardPOM dashboardpom;

	/* perform login */
	@BeforeClass
	public void doLogin() {
		Login login = new Login();
		login.startUp();
		login.login();
	}

	/* click assign leave */
	@Test
	public void assignLeave() {
		dashboardpom = new DashboardPOM();
		try {
			dashboardpom.clickAssignLeave();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
