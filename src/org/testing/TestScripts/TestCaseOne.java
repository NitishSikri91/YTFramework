package org.testing.TestScripts;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseOne {

	WebDriver driver;
	
	@BeforeMethod
	public void bmethod()
	{
	
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver Cdriver = new ChromeDriver(options);
	System.setProperty("system.chrome.driver", "C:\\\\SeleniumDrivers\\\\chromedriver.exe");
	
	Cdriver.get("https://youtube.com");
	Cdriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	Cdriver.manage().window().maximize();
	driver=Cdriver;
	
	}
	
	@Test
	public void test() throws InterruptedException
	{
	Actions ac = new Actions(driver);
		
	WebElement Login_button= driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
	Login_button.click();
	WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
	Email.sendKeys("dummyonebeingcreated@gmail.com");
	
	WebElement Login_next = driver.findElement(By.xpath("//span[text()='Next']"));
	Login_next.click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement Login_password = driver.findElement(By.xpath("//input[@name='password']"));
	Login_password.sendKeys("9582148809");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	WebElement Psw_next = driver.findElement(By.xpath("//span[text()='Next']"));
	Psw_next.click();
	
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	//WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
	//search.click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement Home_Trending = driver.findElement(By.xpath("//*[@id=\"endpoint\"]/paper-item/span[1]"));
	Home_Trending.click();
	}
	
	@AfterMethod
	public void AfterM()
	{
		driver.close();
	}
	
	
}
	
	
	
	/*@AfterMethod
	public void after()
	{
		driver.close();
	}
	}*/
	
	
