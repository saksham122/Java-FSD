package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String Uname = request.getParameter("Uname");
		 String pass = request.getParameter("pass");
		 PrintWriter out = response.getWriter();
		 if(Uname.equalsIgnoreCase("tom") && pass.equals("jerry")) 
		 {
			 Cookie cookie = new Cookie("Uname",Uname);
			 response.addCookie(cookie);
			 RequestDispatcher rs= request.getRequestDispatcher("DashboardServlet");
			 rs.forward(request,response);
		 }
		 else 
		 {
			 out.println("Invalid User or Password");
			 response.setContentType("text/html");
			 RequestDispatcher rs= request.getRequestDispatcher("index.html");
			 rs.include(request,response);
		 }
	}

}
