package com.tnsif.sort;

public class Insertion_logic 
{
    public static void insertion_alg(int arr[],int n)
    {
    	for(int i = 0 ; i < n ; i++ )
    	{
    		int key = arr[i];
    		int j = i - 1;
    		
    		while(j>=0 && arr[j] > key)
    		{
    			arr[j+1] = arr[j];
    			j= j-1;
    		}
    		arr[j + 1] = key;
    	}
    	Output_Insertion.display(arr, n);
    }
}
