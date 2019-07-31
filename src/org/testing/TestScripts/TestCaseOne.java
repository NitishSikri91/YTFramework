package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testing.Pages.Login;
import org.testing.assertions.Assertt;
import org.testing.base.Base;
import org.testing.utilities.CaptureLogs;
import org.testing.utilities.ScreenShotCapture;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseOne extends Base{

		
	
	@Test
	public void test() throws InterruptedException, IOException
	{
	Thread.sleep(3000);
	
	Login l = new Login(driver, pr);
	// Creating an object of Login call , we are passing the current instance of Chrome driver and Properties file to the Login class
	//to access them
	l.SignIn("dummyonebeingcreated@gmail.com", "9582148809");
	Thread.sleep(3000);
	CaptureLogs.Takelogs("TestCaseOne", "Login Success");
	WebElement Home_Trending = driver.findElement(By.xpath(pr.getProperty("Trending")));
	Home_Trending.click();
	CaptureLogs.Takelogs("TestCaseOne", "Clicked on Trending");
	Thread.sleep(3000);
	ScreenShotCapture.ScreenCapture(driver, "C:\\Users\\Nitish\\Desktop\\Workspace\\Outpuit\\ScreenShots\\TC1.png");
	CaptureLogs.Takelogs("TestCaseOne", "Screnshot Captured");

	String expected_URL = "https://www.youtube.com/feed/trending";
	Assert.assertEquals(driver.getCurrentUrl(), expected_URL);
	CaptureLogs.Takelogs("TestCaseOne", "Assetion Passed with Hard Assertion");

	
	Assert.assertTrue(Assertt.AssertCompString(driver.getCurrentUrl(),expected_URL));
	CaptureLogs.Takelogs("TestCaseOne", "Assetion Passed with soft Assertion");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='avatar-btn']")).click();
	String email_id = driver.findElement(By.xpath("//yt-formatted-string[@id='email']")).getText();
	ScreenShotCapture.ScreenCapture(driver, "C:\\Users\\Nitish\\Desktop\\Workspace\\Outpuit\\ScreenShots\\TC2.png");
	
	String expected_user="dummyonebeingcreated@gmail.com";
	Assert.assertTrue(Assertt.AssertCompString(email_id, expected_user));
	CaptureLogs.Takelogs("TestCaseOne", "Email id matches");
	
	}
	
}
	
	
