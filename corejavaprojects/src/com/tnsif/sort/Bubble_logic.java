package com.tnsif.sort;

public class Bubble_logic 
{
    public static void bubble_alg(int arr[], int n)
    {
    	int temp = 0;
    	for(int i= 0; i< n; i++)
    	{
    		for(int j= 0; j< n; j++)
    		{
    			if(arr[i]<arr[j])
    			{
    				temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    	Output_bubble.display(arr, n);
    }
}
