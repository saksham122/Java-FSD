package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Drop
 */
@WebServlet("/Drop")
public class Drop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
	           
			Connection con=DBConnection.getMyConnection();
		     PrintWriter out = response.getWriter();
			Statement  ps=con.createStatement();
			
			 String sql = "DROP DATABASE HelloDatabase";
	         ps.executeUpdate(sql);
	       
			out.println("database Drop.....");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	

}