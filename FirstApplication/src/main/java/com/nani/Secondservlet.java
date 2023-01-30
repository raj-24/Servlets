package com.nani;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class Secondservlet
 */
public class Secondservlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Secondservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("this is Second Application");
	ServletConfig config=	getServletConfig();
	System.out.println("init-1 "+config.getInitParameter("loan"));
	System.out.println("init-2 "+config.getInitParameter("intrest"));
	writer.println("init-1 "+config.getInitParameter("loan"));
	writer.println(" ");
	writer.println("init-2 "+config.getInitParameter("intrest"));
	writer.println(" ");
	
	 ServletContext context= request.getServletContext();
		System.out.println("contx-1 "+ context.getInitParameter("username"));
		System.out.println("contx-2 "+ context.getInitParameter("password"));
		writer.println("contx-1 "+ context.getInitParameter("username"));
		writer.println(" ");
		writer.println("contx-2 "+ context.getInitParameter("password"));
		writer.println(" ");
		}

}
