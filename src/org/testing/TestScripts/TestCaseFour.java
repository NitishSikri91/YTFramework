package org.testing.TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Pages.Login;
import org.testing.base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseFour extends Base {

	@Test
	public void Test() throws InterruptedException 
	{
		Login l = new Login(driver, pr);
		// Creating an object of Login call , we are passing the current instance of Chrome driver and Properties file to the Login class
		//to access them
		l.SignIn("dummyonebeingcreated@gmail.com", "9582148809");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("Subscriptions"))).click();
		
	}
	

	
}
