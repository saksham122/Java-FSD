package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Select
 */
@WebServlet("/Select")
public class Select extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
	           
			Connection con=DBConnection.getMyConnection();
		     PrintWriter out = response.getWriter();
			Statement  ps=con.createStatement();
			DBConnection.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ HelloDatabase","root","Prince@123");
			//Connection con=DBConnection.getMyConnection();
			 out.println("Connected database successfully...");  
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	

}