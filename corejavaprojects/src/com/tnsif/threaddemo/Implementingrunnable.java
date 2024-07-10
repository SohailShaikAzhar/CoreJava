package com.tnsif.threaddemo;

public class Implementingrunnable implements Runnable
{
    public static void main(String[] args) 
    {
	    Implementingrunnable r = new Implementingrunnable();
	    
	    Thread t1 = new Thread(r);
	    t1.start();
	}
    
	@Override
	synchronized public void run()
	{
		System.out.println("runnable");
	}
}
