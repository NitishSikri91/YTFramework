package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testing.Pages.Login;
import org.testing.Pages.VideoPlay;
import org.testing.base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseThree extends Base {
	
	@Test
	public void Test() throws InterruptedException
	{
		Login l = new Login(driver, pr);
		l.SignIn("dummyonebeingcreated@gmail.com", "9582148809");
		Thread.sleep(2000);
		VideoPlay play = new VideoPlay(driver, pr);
		play.videoSearchPlay();
		Thread.sleep(2000);
		WebElement like_btn = driver.findElement(By.xpath(pr.getProperty("Video_like_btn")));
			//WebElement like_btn=driver.findElementByXPath("//*[@id=\"top-level-buttons\"]/ytd-toggle-button-renderer[1]/a");
	
	like_btn.click();
	}
	
	
		
}
