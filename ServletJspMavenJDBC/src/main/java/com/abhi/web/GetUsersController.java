package com.abhi.web;

import java.io.IOException;

import com.abhi.web.dao.UsersDao;
import com.abhi.web.model.Users;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class GetUsersController
 */
public class GetUsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetUsersController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int userID = Integer.parseInt(request.getParameter("idusers"));
		
		UsersDao dao = new UsersDao();
		Users userObj = dao.getUsers(userID);
		
		// Sample of RequestDispatcher
//		request.setAttribute("myUser", userObj);
//		RequestDispatcher rd = request.getRequestDispatcher("ShowUsers.jsp");
//		rd.forward(request, response);
		
		//Sample of Session and Redirect
		HttpSession session = request.getSession();
		session.setAttribute("myUser", userObj);
		
		response.sendRedirect("ShowUsers.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
