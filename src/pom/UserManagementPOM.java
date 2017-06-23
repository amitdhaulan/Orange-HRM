package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UserManagementPOM {
	String name = "";

	/*click admin tab*/
	public void clickAdminsTab(String string) {
		LoginPOM.conditionalWait("linktext", string).click();
	}

	/*Enter user name to search*/
	public void searchUsersEnterUserName(String userName, String name) {
		this.name = name;
		LoginPOM.conditionalWait("id", userName).sendKeys(name);
	}

	/*click search button*/
	public void clickSearchButton() {
		LoginPOM.conditionalWait("id", "searchBtn").click();
	}

	/* User management data */
	public void getUserManagementSearchedData() {
		List<WebElement> elements = LoginPOM.driver.findElements(By.tagName("td"));
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().equals(name)) {
				Assert.assertEquals(elements.get(i).getText(), name);
			}
			System.out.println(elements.get(i).getText());
		}
	}

	/* job title data */
	public void getJobTitleSearchedData() {
		List<WebElement> elements = LoginPOM.driver.findElements(By.tagName("th"));
		for (int i = 0; i < elements.size(); i++) {
			if (i != 0) {
				System.out.print(elements.get(i).getText());
				System.out.print("\t\t\t");
			}

		}

		System.out.println();
		List<WebElement> data = LoginPOM.driver.findElements(By.tagName("td"));
		for (int row = 0; row < data.size(); row++) {
			if (row != 0) {
				System.out.print(data.get(row).getText());
			}
			System.out.println();
		}
	}
}
