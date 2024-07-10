package throwexample;

import java.util.Scanner;

public class Throwdemo 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rollno ");
        int rollno = sc.nextInt();
        
        if(rollno < 0)
        {
        	throw new ArithmeticException("Roll no can't be negativa ");
        }
        else
        {
        	System.out.println("Done");
        }
	}
}
