package com.tnsif.interfaceexample;

public class Nestedinterface implements Myinterface.Myinnerinterface
{

	public void print()
	{
		System.out.println("Inner interface");
	}

}
