package com.tnsif.interfaceexample;

import com.tnsif.interfaceexample.Myinterface.Myinnerinterface;

public class Demomain 
{
    public static void main(String[] args) 
    {
	    Nestedinterface n = new Nestedinterface();
	    
	    n.print();
	    
	    System.out.println("id "+Myinnerinterface.id);
	}
}
