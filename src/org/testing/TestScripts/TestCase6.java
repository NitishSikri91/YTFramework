package org.testing.TestScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.assertions.Assertt;
import org.testing.base.Base;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestCase6 extends Base{
	

	
	@Test(dataProvider = "DP1")
	public void TC6(String usr_name , String pass) throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement Login_button= driver.findElement(By.xpath(pr.getProperty("Login_button")));
		Login_button.click();
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.xpath(pr.getProperty("Login_Email")));
		Email.sendKeys(usr_name);
		WebElement Login_next = driver.findElement(By.xpath("//span[text()='Next']"));
		Login_next.click();	
		Thread.sleep(5000);
		
		WebElement Login_password = driver.findElement(By.xpath(pr.getProperty("Login_Password")));
		Login_password.sendKeys(pass);
		Thread.sleep(5000);
		//ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		WebElement Psw_next = driver.findElement(By.xpath("//span[text()='Next']"));
		Psw_next.click();
	
		Thread.sleep(5000);
		
		String expected ="https://www.youtube.com/";
		Assert.assertTrue(Assertt.AssertCompString(driver.getCurrentUrl(), expected));
		System.out.println("Assertion pass");
	}
	
	
	@DataProvider
	public Object[][] DP1() throws BiffException, IOException
	{
		File fi = new File("C:\\Users\\Nitish\\Desktop\\Workspace\\Learning Tracker\\InputYTcred.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet ws = wb.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		Object [][] ob = new Object[r][c];
		for(int i=0;i<r;i++)
		{for(int j=0;j<c;j++)
		{
			Cell C1 = ws.getCell(j, i);
			ob[i][j]= C1.getContents();
		}
		}
		return ob;
	}
	
	

}
