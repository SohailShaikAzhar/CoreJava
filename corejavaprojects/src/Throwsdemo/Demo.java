package Throwsdemo;

import java.io.IOException;

public class Demo 
{
    public static void main(String[] args) 
    {
    	Demoioexceptions d=new Demoioexceptions();
		try 
		{
			d.display();	
		}
	    catch(IOException e) 
	    {
		    System.out.println();
	    }
	}

}
}
