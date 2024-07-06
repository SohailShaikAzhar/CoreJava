package com.tnsif.search;

public class Output_linear 
{
    public static void display(int i, int key)
    {
    	System.out.println(key+" element found at "+i+1+" position :)");
    }
    public static void fail(int key)
    {
    	System.out.println( key + "is not in the data set :(");
    }
}
