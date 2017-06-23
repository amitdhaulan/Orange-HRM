package pom;

public class AboutPOM {

	/* click user name of the application */
	public void clickUserName() {
		LoginPOM.conditionalWait("id", "welcome").click();

	}

	/* click about */
	public void clickAbout() {
		LoginPOM.conditionalWait("id", "aboutDisplayLink").click();
	}

}
