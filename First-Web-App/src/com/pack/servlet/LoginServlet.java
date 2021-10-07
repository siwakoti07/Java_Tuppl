package com.pack.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pack.service.LoginService;
import com.pack.service.LoginServiceImpl;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.print("<h2>hello from LoginServlet !!!</h2>");

		
		String un = request.getParameter("username");
		String up = request.getParameter("password");

		// instantiating the LoginSercviceImpl class & passing un & up
		LoginService loginService = new LoginServiceImpl();
		
		boolean isValidStudent = loginService.login(un, up);
		
		if (isValidStudent) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("username", un);

			RequestDispatcher rd = request.getRequestDispatcher("/stuHome");
			rd.forward(request, response);
		} else {
			out.println("<p style='color:red'>wrong credentials !!!</p>");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		
		out.print("Thats what you entered.<br>");
		out.print("Username  : " + un + "<br>");
		out.print("Password  : " + up + "<br>");


	}

}
