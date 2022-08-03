package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoPage
 */
@WebServlet("/InfoPage")
public class InfoPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out   = response.getWriter();
         response.setContentType("text/html");
         String Uname = request.getParameter("Uname");
         out.println("Welcome in InfoPge "+Uname+"</br>");
         out.println("Go To AccountDashBoard By Clicking The Link: "+"<a href=\"AccountDashboard\">Account Dashboard </a></br>");
         out.println("Go To AccountProfile By Clicking The Link: "+"<a href=\"AccountProfile\">Account Profile </a>");
        
	}

}
