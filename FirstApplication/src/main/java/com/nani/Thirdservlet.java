package com.nani;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Thirdservlet
 */
public class Thirdservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Thirdservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("this is Third Application");
	ServletConfig config=	getServletConfig();
	System.out.println("init-1 "+config.getInitParameter("bike"));
	System.out.println("init-2 "+config.getInitParameter("car"));
	writer.println("init-1 "+config.getInitParameter("bike"));
	writer.println(" ");
	writer.println("init-2 "+config.getInitParameter("car"));
	writer.println(" ");
	
	
	 ServletContext context= request.getServletContext();
		System.out.println("contx-1 "+ context.getInitParameter("username"));
		System.out.println("contx-2 "+ context.getInitParameter("password"));
		writer.println("contx-1 "+ context.getInitParameter("username"));
		writer.println(" ");
		writer.println("contx-2 "+ context.getInitParameter("password"));
		writer.println(" ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
