package com;

import java.io.IOException;         // or use java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;      // or use javax.servlet.* along with annotation servlet
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Third")
public class Third extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String a = request.getParameter("t1");
		String b = request.getParameter("t2");
		//String c = request.getParameter("t3");
		String button = request.getParameter("b1");
			
		if(button.equals("add")) {
			int result =  Integer.parseInt(a) + Integer.parseInt(b);
			
			out.println("Result =" +result);
			
		}
		
		if(button.equals("sub")) {
			int result =  Integer.parseInt(a) - Integer.parseInt(b);
			out.println("Result =" +result);
		}
		
		if(button.equals("mul")) {
			int result =  Integer.parseInt(a) * Integer.parseInt(b);
			out.println("Result =" +result);
		}
		
		if(button.equals("div")) {
			int result =  Integer.parseInt(a) / Integer.parseInt(b);
			out.println("Result =" +result);
		}
			
	}
}
