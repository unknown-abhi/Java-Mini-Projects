package com.learn.jspServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DemoJSTL")
public class DemoJSTL extends HttpServlet {

	/**
	 * @author Abhishek
	 */
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("In Servlet");
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");

		PrintWriter pW = resp.getWriter();
		pW.println("Welcome :: " + name);

	}

}
