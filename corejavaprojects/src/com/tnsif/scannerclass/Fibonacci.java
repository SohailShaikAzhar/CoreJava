package com.tnsif.scannerclass;

public class Fibonacci 
{
    static int fibonacci_method(int num)
    {
    	if(num <=1 )
    	{
    		return num;
    	}
    	
    	return fibonacci_method(num-1)+fibonacci_method(num-2);
    }
}