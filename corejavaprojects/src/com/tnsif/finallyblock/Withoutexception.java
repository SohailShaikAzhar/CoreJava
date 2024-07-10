package com.tnsif.finallyblock;

public class Withoutexception 
{
    public static void main(String[] args) 
    {
	    int i = 10;
	    try
	    {
	    	System.out.println("value "+ i/0);
	    }
	    catch(NullPointerException e)
	    {
	    	System.out.println("exception handling ");
	    }
	    finally
	    {
	    	System.out.println("Wellcome to java");
	    }
	}
}
