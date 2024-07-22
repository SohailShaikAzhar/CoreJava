package com.tnsif.str;

public class Stringexample 
{
    public static void main(String[] args) 
    {
    	
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
