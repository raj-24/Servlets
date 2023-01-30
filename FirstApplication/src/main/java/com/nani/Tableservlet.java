package com.nani;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleDriver;

/**
 * Servlet implementation class Tableservlet
 */
public class Tableservlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter writer =response.getWriter();
		String f=request.getParameter("firstname");
		String l=request.getParameter("lastname");
		String[] s=request.getParameterValues("street");
		StringBuffer buffer=new StringBuffer();
		for(String ss:s) {
			buffer.append(ss+",");
		
			}
		String buf=buffer.toString();
		writer.println("Data inserted half....<br/><br/>");	
			writer.println("Data start....<br/><br/>");	

				  System.out.println("hi");
				  System.out.println(f);
				  System.out.println(l);
				  System.out.println(buf);
	
						try {
								Class.forName(" com.mysql.cj.jdbc.Driver");
								Connection 	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raja","root","12345");
								Statement stmt= con.createStatement();
								PreparedStatement	preparedStatement  = ((Connection) stmt).prepareStatement("insert into employee values(?,?,?)");
							preparedStatement.setString(1,f);
							preparedStatement.setString(2,l);
							preparedStatement.setString(3,buf);
						
						int a= preparedStatement.executeUpdate();	
						System.out.println(a);
//							if(a==1) {
//								writer.println("Data inserted successfully....<br/><br/>");
//								writer.println("<a href='/Displayservlet'>all records</a>....");
//							
//							}
						}
						
	
	catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
	}
	}

	

