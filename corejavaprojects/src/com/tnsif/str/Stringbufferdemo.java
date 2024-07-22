package com.tnsif.str;

public class Stringbufferdemo 
{
    public static void main(String[] args) 
    {
	    StringBuffer b = new StringBuffer("Hello");	
	    b.append(" World!");
	    
	    System.out.println(b);
	    
	    b.insert(1, "AI");
	    
	    System.out.println(b);
	    
	    b.delete(1, 3);
	    System.out.println(b);
	    
	    System.out.println(b.reverse());
	}
}
