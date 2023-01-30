package com.sql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Firstconn {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja","root","12345");  
		//here sonoo is database name, root is username and password  
//		Statement stmt=(Statement) con.createStatement();  
		Statement stmt= con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee"); 
		while(rs.next())  
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
}  
}
