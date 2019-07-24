package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCapture {

	public static void ScreenCapture(ChromeDriver driver,String path) throws IOException
	{
		File output = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(output, new File(path));
		
		 
		
	}
	
}
