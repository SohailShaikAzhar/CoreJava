package com.tnsif.str;

import java.util.ArrayList;

public class Arraylistdemo 
{
    public static void main(String[] args) 
    {
    	ArrayList al=new ArrayList();
		System.out.println("size "+al.size());
		al.add(3);
		al.add(9.0);
		al.add("sohail");
		al.add('q');
		
		System.out.println(al);
		
		System.out.println("size "+al.size());
		
		System.out.println(al.contains(55));
		
		System.out.println(al.isEmpty());
		System.out.println(al.get(3));
		System.out.println(al.remove(0));
		
		System.out.println(al);
	}
}