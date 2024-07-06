package com.tnsif.search;

public class Linear_logic 
{
    public static void linear_alg(int arr[], int n, int key)
    {
    	for(int i= 0 ; i< n ; i++)
    	{
    		if(arr[i] == key)
    		{
    			Output_linear.display(i, key); 
    			break;
    		}
    		else
    		{
    			Output_linear.fail(key);
    		}
    	}
    }
}
