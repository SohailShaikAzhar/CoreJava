package com.tnsif.jdbcprograms;

import java.sql.*;
import javax.sql.*; 
public class Jdbcselect {
	
	public static void main(String[] args) {
		
	// step2: load and register the driver
	
	// step 3:Establish connection
	
	try {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","sohail","root");
		
		// step 4: create statement
		
		Statement st=conn.createStatement();
		
		// step 5: execute quary
		
		String strselect="Select booktitle,price,qty from books";
		
		// process the result to display
		
		ResultSet rst=st.executeQuery(strselect);
		System.out.println("The records are");
		while(rst.next()) {
			String booktitle=rst.getString("booktitle");
			int price=rst.getInt("price");
			int qty=rst.getInt("qty");
			
			System.out.println(booktitle+" "+price+" "+qty);
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	}
}
