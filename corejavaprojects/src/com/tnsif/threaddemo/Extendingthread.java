package com.tnsif.threaddemo;

public class Extendingthread extends Thread
{
	public void run()
	{
		System.out.println("New");
	}
	
    public static void main(String[] args) 
    {
    	Extendingthread e = new Extendingthread();
    	
    	e.start();
	}
}
