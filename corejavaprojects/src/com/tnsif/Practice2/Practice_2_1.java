package com.tnsif.Practice2;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Practice_2_1 
{
    public static void main(String[] args) throws IOException 
    {
	    String line;
	    int count = 0;
	    
	    FileReader fr = new FileReader("intro.txt");
	    BufferedReader br = new BufferedReader(fr);
	    
	    while((line = br.readLine())!=null)
	    {
	    	String words[] = line.split("");
	    	count = count + words.length;
	    }
	    System.out.println("Number of words present in the file: "+ count);
	    br.close();
	}
}
