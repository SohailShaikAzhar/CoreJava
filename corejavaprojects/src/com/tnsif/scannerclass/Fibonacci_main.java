package com.tnsif.scannerclass;
import java.util.Scanner;

public interface Fibonacci_main 
{
    public static void main(String[] args) 
    {
    	try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of Fibonacci numbers you want = ");
			int num = sc.nextInt();

			for(int i = 0; i< num; i++)
			{
				System.out.println(Fibonacci.fibonacci_method(i) + " "); 
			}
		}
	}
}