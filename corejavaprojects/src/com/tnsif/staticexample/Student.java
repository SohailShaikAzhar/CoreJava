package com.tnsif.staticexample;

public class Student 
{
    int rollno;
    String name;
    
    static String college="Sri Indu";
    
    static void change()
    {
    	college="SIIET";
    }
    
    Student(int r, String n)
    {
    	rollno=r;
    	name=n;
    }
    
    void display()
    {
    	System.out.println(rollno+ "\t" + name + "\t" +college);
    }
}
