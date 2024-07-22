package com.tnsif.str;

import java.util.LinkedList;

public class LinkedListdemo 
{
    public static void main(String[] args) 
    {
	    LinkedList l = new LinkedList();
	    l.add("ra");
	    l.add(2);
	    l.add("hjgs");
	    l.add(8.9);
	    System.out.println("After invoking add() "+l);
	    l.add(1, "apple");
	    System.out.println(1);
	    
	    LinkedList l1 = new LinkedList();
	    l1.add(l1);
	    l1.add("ds");
	    
	    l.remove(0);
	    
	    l1.addLast("me");
	    l1.addFirst("hello");
	    
	    l1.add(0, "ghee");
	    System.out.println(l1);
	}
}
