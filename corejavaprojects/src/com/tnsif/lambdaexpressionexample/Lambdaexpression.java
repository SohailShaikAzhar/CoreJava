package com.tnsif.lambdaexpressionexample;

import java.util.ArrayList;

public class Lambdaexpression 
{
	public static void main(String[] args) 
	{
	    ArrayList<Integer> li = new ArrayList<Integer>();
	    li.add(3);
	    li.add(4);
	    li.add(9);
	    li.add(1);
	    
	    li.forEach(ele->System.out.println(ele));
	}
}
