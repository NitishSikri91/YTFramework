package org.testing.TestScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testing.Pages.Login;
import org.testing.Pages.VideoPlay;
import org.testing.base.Base;
import org.testng.annotations.Test;

public class TestCaseFive extends Base{

	@Test
	public void test() throws InterruptedException
	{
		Login l = new Login(driver, pr);
		l.SignIn("dummyonebeingcreated@gmail.com", "9582148809");
		Thread.sleep(2000);
		VideoPlay play = new VideoPlay(driver, pr);
		play.videoSearchPlay();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("Channel_page"))).click();	

		
		
	}
	
}
