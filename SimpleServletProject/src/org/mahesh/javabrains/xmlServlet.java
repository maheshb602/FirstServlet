package org.mahesh.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class xmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML Servlet is called");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		out.println("Hello the Get is calling " + userName + " with " + userId);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML Servlet is called");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		out.println("Hello the Post is calling " + userName + " with " + userId);
	}

}
