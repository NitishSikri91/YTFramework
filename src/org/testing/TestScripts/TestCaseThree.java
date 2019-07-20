package org.testing.TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseThree {
	ChromeDriver driver;

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
	driver=Cdriver;	}

	@Test
	public void Test() throws InterruptedException
	{
		WebElement Login_button= driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		Login_button.click();
		WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		Email.sendKeys("dummyonebeingcreated@gmail.com");
		
		WebElement Login_next = driver.findElement(By.xpath("//span[text()='Next']"));
		Login_next.click();
		Thread.sleep(5000);
		
		WebElement Login_password = driver.findElement(By.xpath("//input[@name='password']"));
		Login_password.sendKeys("9582148809");
		Thread.sleep(5000);
		//ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		WebElement Psw_next = driver.findElement(By.xpath("//span[text()='Next']"));
		Psw_next.click();
		
	
	List<WebElement> VideoList1 = driver.findElementsByXPath("//*[@id='video-title']");
	List<WebElement> VideoList2 = driver.findElementsById("video-title");
	
	System.out.println("Total no of videos listed " +VideoList1.size()+" "+VideoList2.size());
	
	VideoList2.get(1).click();
	
	
	Thread.sleep(5000);

	WebElement like_btn=driver.findElementByXPath("//*[@id=\"top-level-buttons\"]/ytd-toggle-button-renderer[1]/a");
	
	
	like_btn.click();
	}
	
	
		
}
