package com.tnsif.practice1;

public class Practice_1_5 extends Practice_1_4
{
	int a = 20;
    @Override
    void printing()
    {
    	System.out.println("Printing value of a after overriding "+a);
    }
    void printingparent()
    {
    	super.printing();
    }
    public static void main(String[] args) 
    {
	    Practice_1_5 Object = new Practice_1_5();
	    Object.printing();	
	    Object.printingparent();
	}
}
