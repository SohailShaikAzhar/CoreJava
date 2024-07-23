package com.tnsif.lambdaexpressionexample;

public class Parameterdemo 
{
    public static void main(String[] args) 
    {
	    Cube c = (a) -> {return a*a*a;};
	    System.out.println("Cube of a number "+c.square(10));
	}
}
