package com.tnsif.finallyblock;

public class Funallyblock 
{
	public static void main(String[] args)
	{
		int a = 10;
    	try
    	{
    		int b = a/0;
    		System.out.println("b");
    	}
    	catch(Exception e)
    	{
    		System.out.println("Exception handled "+e.getMessage());
    	}
    	finally
    	{
    		System.out.println("Finally");
    	}
	}
}
