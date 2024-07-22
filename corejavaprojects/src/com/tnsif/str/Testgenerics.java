package com.tnsif.str;

import java.util.ArrayList;
import java.util.Iterator;

public class Testgenerics 
{
    public static void main(String[] args) 
    {
	    ArrayList<String> al = new ArrayList<String>();
	    al.add("Shaik ");
	    al.add("Azhar ");
	    al.add("Sohail ");
	    
	    System.out.println(al);
	    
	    Iterator<String> itr = al.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	}
}
