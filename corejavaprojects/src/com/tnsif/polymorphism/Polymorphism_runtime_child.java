package com.tnsif.polymorphism;

public class Polymorphism_runtime_child extends Polymorphism_runtime
{
    @Override
    public void access()
    {
    	System.out.println("hello");
    }
    
    public static void main(String[] args) 
    {
    	Polymorphism_runtime_child prc = new Polymorphism_runtime_child();
    	prc.access();
	}
}
