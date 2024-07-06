package com.tnsif.search;
import java.util.Scanner;

public class linear_input 
{
    public static void main(String[] args) 
    {
	    try(Scanner sc = new Scanner(System.in))
	    {
	    	System.out.println("Enter the array size = ");
	    	int n = sc.nextInt();
	    	System.out.println("Enter "+n+" elements = ");
	    	int arr[] = new int[100];
	    	for(int i = 0 ; i < n ; i++)
	    	{
	    		arr[i]= sc.nextInt();
	    	}
	    	System.out.println("Enter the key element = ");
	    	int key = sc.nextInt();
	    	Linear_logic.linear_alg(arr, n, key);
	    }
	}
}
