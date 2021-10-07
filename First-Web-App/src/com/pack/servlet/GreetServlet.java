package com.pack.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("doGet from <h3>GreetServlet</h3> interface !!!<br><br>");
		

		String pn = request.getParameter("personName");
		out.print("<h2>Good morning , " + pn+"</h2>");
		
		
		out.print("<br><br><br><a href='/First-Web-App'>goto index page</a>");

	}

}

