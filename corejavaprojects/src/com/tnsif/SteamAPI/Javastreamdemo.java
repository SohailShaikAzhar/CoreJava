package com.tnsif.SteamAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamdemo 
{
    public static void main(String[] args) 
    {
	    List<Product> pl = new ArrayList<Product>();
	    
	    pl.add(new Product (1, "APPLE", 400000));
	    pl.add(new Product (2, "LENOVO", 50000));
	    pl.add(new Product (3, "DELL", 40000));
	    
	    List<Float> pl2= pl.stream().filter(p->p.price>40000)
	    		.map(p->p.price)
	    		.collect(Collectors.toList());
	    //
	    System.out.println(pl2);
	    
	    Iterator<Float>  itr = pl2.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    //
      double totalprice= pl.stream()
       	.collect(Collectors.summingDouble(Product->Product.price));
        
      System.out.println(totalprice);
        //
	    Product p = pl.stream()
	    		.max((Product1, Product2)->Product1.price>Product2.price?1:-1).get();
	    System.out.println(p.price);
        
	}
}
