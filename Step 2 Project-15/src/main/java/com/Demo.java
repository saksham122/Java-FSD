package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
	           
			Connection con=DBConnection.getMyConnection();
		     PrintWriter out = response.getWriter();
			Statement  ps=con.createStatement();
			String n  =request.getParameter("hi");
			String sql = "CREATE DATABASE HelloDatabase";
	         ps.executeUpdate(sql);
	       
			out.println("database Create.....");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	

}