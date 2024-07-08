package com.tnsif.inheritance;

public class Child extends Father
{
    String cycle = "orange";
    
    public static void main(String[] arg)
    {
    	Child cld = new Child();
    	System.out.println("fathers car"+ cld.car+ " \nfathers money" + cld.money + " \nchild's cycle color "+ cld.cycle);
    	cld.drinking();
    }
}
