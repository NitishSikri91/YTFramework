package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VideoPlay {

	ChromeDriver driver;
	Properties pr;
	
	
	public VideoPlay(ChromeDriver driver, Properties pr)
	{
	this.driver=driver;
	this.pr=pr;
	}
	
	public void videoSearchPlay() throws InterruptedException
	{
		
		Actions ac = new Actions(driver);
		Thread.sleep(5000);		
		ac.sendKeys(driver.findElement(By.xpath("//input[@id='search']")),"Sidhu dollar").sendKeys(Keys.ENTER).build().perform();;
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("Video_click"))).click();
		Thread.sleep(5000);
		

	}
	
	
}
