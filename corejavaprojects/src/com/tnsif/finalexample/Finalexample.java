package com.tnsif.finalexample;

public final class Finalexample 
{
    final float PI = 3.142f;
    static final int val;
    
    static
    {
    	val = 100;
    }
    
    final void demo()
    {
    	System.out.println("Final method");
    }
}
