package com.tnsif.constructor;

public class Paracon 
{
    Paracon()
    {
    	System.out.println("Default constructor ");
    }
    Paracon(int i)
    {
    	System.out.println("parameterised constructor "+i);
    }
    public static void main(String[] args) 
    {
	    Paracon dc = new Paracon();	
	    Paracon pc = new Paracon(0);
	}
}
