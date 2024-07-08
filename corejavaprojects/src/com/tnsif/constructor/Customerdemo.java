package com.tnsif.constructor;
import java.util.Scanner;

public class Customerdemo 
{
    public static void main(String[] args) 
    {
	    try(Scanner sc = new Scanner(System.in))
	    {
	    	System.out.println("Enter your name ");
	    	String name = sc.nextLine();
	    	
	    	System.out.println("Enter your roll ");
	    	int rollno = sc.nextInt();
	    	
	    	System.out.println("Enter your adress ");
	    	String address = sc.nextLine();
	    	
	    	Customer cd= new Customer();
		    cd.setName(name);
		    cd.setCid(rollno);
		    cd.setCadress(address);
		    	
	    }
	}
}
