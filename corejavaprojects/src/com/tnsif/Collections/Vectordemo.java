package com.tnsif.Collections;

import java.util.Iterator;
import java.util.Vector;

public class Vectordemo 
{
    public static void main(String[] args) 
    {
	    Vector<String>  v = new Vector<String>();	
	    System.out.println("Size of the vector "+v.size());
	    v.add("red");
	    v.add("blue");
	    v.add("green");
	    v.add("orgnge");
		v.add("black");
	    int capacity = v.capacity();
	    System.out.println(capacity);
	    v.add(3, "yellow");
	    System.out.println(v);
	    v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		
		int capacity1 = v.capacity();
		System.out.println(capacity1);
		
		v.add("red");
		v.add("red");
		v.add("red");	
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		
		int capacity2 = v.capacity();
		System.out.println(capacity2);
		
		System.out.println(v);
		
		Iterator<String> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
    }
}
