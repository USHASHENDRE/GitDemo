package org.jecm5.firstapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends GenericServlet {
	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException
	{
		String name=request.getParameter("nm");
		String place=request.getParameter("pl");
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor='yellow'>"+
		            "<h1>welcome"+ name+place+"<h1>"+
				     "</body></html>");
		out.flush();
		out.close();
		System.out.println("THIS IS THE NEW CODE WHICH IS ADDED EXTRA");
	}
}
//  //private static final long serialVersionUID = 1L;
//  /**
//     * Default constructor. 
//     */
//    public FirstServlet() {
//        // TODO Auto-generated constructor stub
//    }
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);  
//	}
//}
