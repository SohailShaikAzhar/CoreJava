package com.tnsif.interfaceexample;

public class Warrior implements Weapon, Character
{

	@Override
	public void use() 
	{
		System.out.println("Welcome");
	}

	@Override
	public void attack() 
	{
		System.out.println("Attack.........!");
	}
    
}
