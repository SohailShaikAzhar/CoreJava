package com.tnsif.polymorphism;

public class Polymorphism_compiletime 
{
    int a;
    void display()
    {
    	System.out.println("no parameters");
    }
    void display(int a)
    {
    	System.out.println("With variable a = "+a);
    }
    public static void main(String[] args) 
    {
	    Polymorphism_compiletime pc = new Polymorphism_compiletime();
	    pc.display();
	    pc.display(10);
	}
}
