package org.testing.assertions;

public class Assertt {

	
public static boolean AssertCompString(String actual , String expected)
{
	if(actual.equals(expected))
	{
		System.out.println("Assertion Pass");
		return true;
	}
	else 
		{
		System.out.println("Assertion fail");
		return false;
		}
	}



}
