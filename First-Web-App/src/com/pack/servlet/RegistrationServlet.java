package com.pack.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter wr = response.getWriter();
		wr.print("doGet from <h3>RegistrationServlet</h3> interface !!!<br><br>");
		
		String x = request.getParameter("fname");
		String y = request.getParameter("lname");
		String s = request.getParameter("sex");
		String h = request.getParameter("hobbies");
		//wr.print("<h3>First name is , " + x+"</h3>");
		//wr.print("<h3>Last name is , " + y+"</h3>");
		wr.print("<h3>" + x +" "+ y+" is " + s + " and hobby is " + h + ".</h3>");
		
	}

}