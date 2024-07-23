package com.tnsif.SteamAPI;

import java.util.function.Predicate;

public class Predicatedemo 
{
    public static void main(String[] args) 
    {
    	int age = 100;
	    Predicate<Integer> pr = a->(a>=18);
	    System.out.println(pr.test(age));
	}
}
