package com.pack.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StudentHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h2>hello from StudentHomeServlet !!!</h2>");

		HttpSession httpSession = request.getSession();
		out.print("Hello , " + httpSession.getAttribute("username")+"<hr>");

		out.print("<a href='/First-Web-App/login.html'>Login Page</a>");

	}

}

