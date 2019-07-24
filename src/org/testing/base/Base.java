package org.testing.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Base {

	public ChromeDriver driver;
	public Properties pr ;
	@BeforeMethod
	public void bmethod() throws InterruptedException, IOException
	{	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver Cdriver = new ChromeDriver(options);
	System.setProperty("system.chrome.driver", "C:\\\\SeleniumDrivers\\\\chromedriver.exe");
	Cdriver.get("https://youtube.com");
	Thread.sleep(5000);
	Cdriver.manage().window().maximize();
	driver=Cdriver;
	
	java.io.File f = new java.io.File("../YTFramework/src/or.properties");
	FileInputStream fi = new FileInputStream(f);
	 pr = new Properties();
	pr.load(fi);
	
	//WebElement Login_button= driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
	
	}

	
	/*@AfterMethod
	public void AfterM()
	{
		driver.close();
	}*/
	
}
