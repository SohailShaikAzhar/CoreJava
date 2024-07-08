package com.tnsif.inheritance;

public class Childsuper extends Father
{
    String cycle = "orange";
    String car = "audi";
    void drinking()
    {
    	System.out.println("no");
    }
    void fathercar()
    {
    	System.out.println(super.car);
    }
    
    void fatherdrinking()
    {
    	super.drinking();
    }
    
    public static void main(String[] arg)
    {
    	Childsuper cld = new Childsuper();
    	System.out.println("Child's car "+ cld.car+ " \nfathers money " + cld.money + " \nchild's cycle color "+ cld.cycle);
    	System.out.println("Fathers car ");
    	cld.fathercar();
    	cld.drinking();
    	cld.fatherdrinking();
    }
}
