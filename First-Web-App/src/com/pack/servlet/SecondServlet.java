package com.pack.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from doGet method !!!");

		PrintWriter out = resp.getWriter();
		out.print("from doGet method !!!");
		out.print("<h3>This is a secondServlet page.</h3>");
		out.print("<br><br><br><a href='/First-Web-App'>goto index page</a>");
	}
}

