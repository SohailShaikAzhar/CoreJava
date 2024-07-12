package com.tnsif.practice1;

import java.util.Scanner;

public class Practice_1_2 
{
    public static void main(String[] args) 
    {
	    try(Scanner sc = new Scanner(System.in))
	    {
	    	System.out.println("Enter the number to check it's even or odd");
	    	int number = sc.nextInt();
	    	if(number%2 == 0)
	    	{
	    		System.out.println("even number");
	    	}
	    	else
	    	{
	    		System.out.println("odd number");
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Enter a number \nError");
	    }
	}
}
