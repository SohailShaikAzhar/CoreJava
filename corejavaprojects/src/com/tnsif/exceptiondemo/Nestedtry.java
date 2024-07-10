package com.tnsif.exceptiondemo;

public class Nestedtry 
{
    private static String anotherstring;

	public static void check()
    {
    	String str = "TNS";
    	
    	int slength = str.length();
    	
    	System.out.println("string length "+slength);
    	
    	anotherstring = null;
    	int y = 6;
    	try
    	{
    		try 
    		{
    			System.out.println(str.charAt(y));
    		}
    		catch(StringIndexOutOfBoundsException ex)
    		{
    			System.out.println("index ot of bound exception "+ex.getMessage());
    		}
    		System.out.println("string length "+anotherstring.length());
    	}
    	catch(NullPointerException npe)
    	{
    		System.out.println("exception is thrown "+npe.getMessage());
    	}
    }
}
