package com.nani;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginpage
 */
public class Loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginpage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		
response.setContentType("text/html");
PrintWriter writer =response.getWriter();
String s=request.getParameter("username");
String r=request.getParameter("password");
if(s.equalsIgnoreCase("raja") && r.equals("nani")) {
	writer.println("Login Suceessfull "+s);
	RequestDispatcher dispatcher =request.getRequestDispatcher("Servlet");
	dispatcher.forward(request, response);
			}else {
	writer.println("Login failed try again ");
	RequestDispatcher dispatcher =request.getRequestDispatcher("Servlet");
	dispatcher.include(request, response);
}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
