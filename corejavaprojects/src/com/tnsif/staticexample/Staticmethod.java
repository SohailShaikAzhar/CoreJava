package com.tnsif.staticexample;

public class Staticmethod 
{
    public static void main(String[] args) 
    {
//    	to change the static variable in the static method
//	    Student.change();  //Its optional 
	    
	    Student a1 = new Student(01, "Shaik");
	    Student a2 = new Student(02, "Azhar");
	    Student a3 = new Student(03, "Sohail");
	    
	    a1.display();
	    a2.display();
	    a3.display();
	}
}
