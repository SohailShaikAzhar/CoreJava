package com.tnsif.sort;
import java.util.Scanner;

public class Bubble_input 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of values to sort = ");
	    int n = sc.nextInt();
	    System.out.println("Enter the numbers you want to sort = ");
	    int arr[] = new int[100];
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]= sc.nextInt();
	    }
	     Bubble_logic.bubble_alg(arr, n);
	}
}
