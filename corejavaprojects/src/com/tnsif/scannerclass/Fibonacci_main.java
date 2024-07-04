package com.tnsif.scannerclass;
import java.util.Scanner;

public interface Fibonacci_main 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of Fibonacci numbers you want = ");
	    int num = sc.nextInt();
	    
	    Fibonacci f = new Fibonacci();
	
	    for(int i = 0; i< num; i++)
	    {
	    	System.out.println(f.fibonacci_method(i) + " "); 
	    }
	}
}