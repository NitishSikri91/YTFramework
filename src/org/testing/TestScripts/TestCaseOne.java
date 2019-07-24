package org.testing.TestScripts;

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
import org.testing.base.Base;
import org.testing.utilities.ScreenShotCapture;
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
	WebElement Home_Trending = driver.findElement(By.xpath(pr.getProperty("Trending")));
	Home_Trending.click();
	Thread.sleep(3000);
	ScreenShotCapture.ScreenCapture(driver, "C:\\Users\\Nitish\\Desktop\\Workspace\\Outpuit\\ScreenShots\\TC1.png");
		
	}
	
}
	
	
