package com.tnsif.search;

class Linear_logic 
{
    public static void linear_alg(int arr[], int n, int key)
    {
        boolean found = false;
    	for(int i= 0 ; i< n ; i++)
    	{
    		if(arr[i] == key)
    		{
    			Output_linear.display(i, key);
    			found = true;
    		}
    	}
    	if(found == false)
    	{
    	    Output_linear.fail(key);
    	}
    }
}