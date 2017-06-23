package app.modules;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.LoginPOM;
import pom.UserManagementPOM;

public class Admin {
	UserManagementPOM managementPOM = new UserManagementPOM();

	/* perform login */
	@BeforeTest
	public void startUp() {
		Login login = new Login();
		login.startUp();
		login.login();
	}

	/* click admin tab */
	@Test(priority = 0, enabled = true)
	public void clickAdmin() throws InterruptedException {
		LoginPOM.conditionalWait("linktext", "Admin").click();
	}

	/* click user management */
	@Test(priority = 1, enabled = true)
	public void clickUserManagement() {
		managementPOM.clickAdminsTab("User Management");
		managementPOM.clickAdminsTab("Users");
		managementPOM.searchUsersEnterUserName("searchSystemUser_userName", "amitk");
		managementPOM.clickSearchButton();
		managementPOM.getUserManagementSearchedData();
	}

	/* click Job */
	@Test(priority = 2, enabled = true)
	public void clickJob() {
		managementPOM.clickAdminsTab("Job");
		managementPOM.clickAdminsTab("Job Titles");
		managementPOM.getJobTitleSearchedData();
	}

	/* click pay grades */
	@Test(priority = 3, enabled = true)
	public void clickPayGrades() {
		managementPOM.clickAdminsTab("Job");
		managementPOM.clickAdminsTab("Pay Grades");
		managementPOM.getJobTitleSearchedData();
	}
}
