package com.tnsif.Throwsdemo;

import java.util.Scanner;

public class Userdefined 
{
    public static int age;
    
	static void validate() throws Age
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your age ");
	    int age = sc.nextInt();
	    if(age < 18)
	    	throw new Age ("invalid age , you are not eligible ");
	    else
	    	System.out.println("You are eligible to vote");
    }
	
	public static void main(String[] args) 
	{
	    try
	    {
	    	Userdefined.validate();
	    }
	    catch(Age e)
	    {
	    	System.out.println("Caught exception "+e.getMessage());
	    }
	}
}