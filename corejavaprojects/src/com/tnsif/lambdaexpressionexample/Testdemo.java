package com.tnsif.lambdaexpressionexample;

public class Testdemo 
{
    public static void main(String[] args) 
    {
	    Runnable basic = () ->{String Threadname=Thread.currentThread().getName();
	    System.out.println("Threadname "+Threadname);};
    
        Thread th1 = new Thread(basic);
        Thread th2 = new Thread(basic);
        Thread th3 = new Thread(basic);
        
        th1.start();
        th2.start();
        th3.start();
	}
}
