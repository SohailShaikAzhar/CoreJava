package com.tnsif.polymorphism;

public class Polymorphism_compiletime 
{
    void display()
    {
    	System.out.println("no parameters");
    }
    void display(int a)
    {
    	System.out.println("With variable a = "+a);
    }
    void display(int a, int b)
    {
    	System.out.println("with 2 variables a = "+a+" and b = "+b);
    }
    public static void main(String[] args) 
    {
	    Polymorphism_compiletime pc = new Polymorphism_compiletime();
	    pc.display();
	    pc.display(10);
	    pc.display(10, 20);
	}
}
