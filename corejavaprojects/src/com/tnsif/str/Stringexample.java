package com.tnsif.str;

import java.util.Arrays;

public class Stringexample 
{
    public static void main(String[] args) 
    {
    	
    	int[] array = new int[5];
    	for(int i= 5; i>0 ; i--)
    	{
    		array[5-i] = i;
    	}
    	Arrays.fill(array, 1, 4, 8);
    	for(int i = 0; i< 5; i++)
    	{
    		System.out.println(array[i]);
    	}
    	
    	int[] abc = {1, 2, 3, 4};
    	
    	System.out.println(abc.length);
    	
        String stri = null;
        System.out.println(stri.valueOf(10));
    	
    	int[] arr = new int[5];
    	System.out.println(arr[3]);
    	
    	String country = "India";
    	System.out.println(country.charAt(2));
    	
    	String str = "Hello World";
    	System.out.println(str.substring(6));
    	
    	String str1="sachin";
		String str2=str1;
		String str3=str2;
		
		System.out.println("before modification");
		System.out.println("str1 "+ str1);
		System.out.println("str2 "+ str2);
		System.out.println("str3 "+ str3);
		
		str1="tendulkar";
		
		System.out.println("after modification");
		System.out.println("str1 "+ str1);
		System.out.println("str2 "+ str2);
		System.out.println("str3 "+ str3);
		
		System.out.println(str2);
		str2=str2.concat(str1);
		System.out.println(str2);
		
	    String s1 = "Hello";
	    String s2 = "World!";
	    String s3 = new String("Hello");
	    String s4 = "Hell";
	    
	    System.out.println(s1.equals(s2));
	    System.out.println(s1.equals(s3));
	    System.out.println(s1.equals(s4));
	    
	    System.out.println(s1==s2);
	    System.out.println(s1==s3);
	    System.out.println(s1==s4);
	    
	    System.out.println(s1.compareTo(s2));
	    System.out.println(s1.compareTo(s3));
	    System.out.println(s1.compareTo(s4));
	    
	    System.out.println(s1);
	    s1 = s1.concat(" World");
	    System.out.println(s1);
	    System.out.println(s1.length());
	    System.out.println(s1.indexOf("o"));
	    System.out.println(s1.charAt(4));
	    System.out.println(s1.toUpperCase());
	    System.out.println(s1.toLowerCase());
	    
	}
}
