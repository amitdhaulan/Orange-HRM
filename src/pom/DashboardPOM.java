package pom;

import org.openqa.selenium.By;

public class DashboardPOM {

	/*click assign leave*/
	public void clickAssignLeave() throws InterruptedException {
		clickSpanText("/webres_5786257bd7c8a5.72130757/orangehrmLeavePlugin/images/MyLeave.png");
	}

	/*click span text*/
	public void clickSpanText(String imagePath) throws InterruptedException{
		Thread.sleep(3000);
		LoginPOM.driver.findElement(By.xpath("//img[@src='" + imagePath + "']")).click();
	}
}
