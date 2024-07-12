package com.tnsif.practice1;

import java.util.Scanner;

public class Practice_1_3 
{
    public static void main(String[] args) 
    {
    	try(Scanner sc = new Scanner(System.in))
	    {
    		System.out.println("Enter the number ");
    		int number = sc.nextInt();
    		if(number == 0)
    		{
    			System.out.println("number is zero");
    		}
    		else
    		{
    			System.out.println("number is not zero");
    		}
    	}
    	catch(Exception e)
		{
			System.out.println("Error \nEnter a number ");
		}

	}
}
