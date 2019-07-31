package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

//The class which will capture the logs
public class CaptureLogs {

	public static void Takelogs(String Classname,String message)
	{
		DOMConfigurator.configure("C:\\Users\\Nitish\\Desktop\\Workspace\\YTFramework\\src\\layout.xml");
		Logger l = Logger.getLogger(Classname);
		l.info(message);
		
		
	}
	
}
