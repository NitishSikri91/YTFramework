package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver , Properties pr )
	{
		//Creating a constructor to have Chromedriver  object and Properties file object
		//Giving values in construction would use same instance 
		//Who so ever will create an object of Login in the TC will pass the their instance of Chrome driver and Properties
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void SignIn(String user , String Password) throws InterruptedException
	{
		
		WebElement Login_button= driver.findElement(By.xpath(pr.getProperty("Login_button")));
		Login_button.click();

		Thread.sleep(2000);
		
		WebElement Email = driver.findElement(By.xpath(pr.getProperty("Login_Email")));
		//Email.sendKeys("dummyonebeingcreated@gmail.com");
		Email.sendKeys(user);
		WebElement Login_next = driver.findElement(By.xpath("//span[text()='Next']"));
		Login_next.click();
		
		Thread.sleep(5000);
		
		WebElement Login_password = driver.findElement(By.xpath(pr.getProperty("Login_Password")));
		//Login_password.sendKeys("9582148809");
		Login_password.sendKeys(Password);
		Thread.sleep(5000);
		//ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		WebElement Psw_next = driver.findElement(By.xpath("//span[text()='Next']"));
		Psw_next.click();
	
	}
	
}
