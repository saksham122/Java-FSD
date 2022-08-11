package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollno=Integer.parseInt(request.getParameter("txtrollno"));
		String name=request.getParameter("txtname");
		int marks=Integer.parseInt(request.getParameter("txtmarks"));
		PrintWriter out=response.getWriter();
		
		
		try {
			
				Connection con=DBConnection.getMyConnection();
		
				String str="Insert into studentdetails(rollno,name,marks) values(?,?,?)";
				
				PreparedStatement  ps=con.prepareStatement(str);
				ps.setInt(1,rollno );
				ps.setString(2, name);
				ps.setInt(3, marks);
				int ans =ps.executeUpdate();
				
				if(ans>0)
					out.println("Record inserted");
				else
					out.println("Record not inserted");
				con.close();
			
		
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}