package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/InfoPage")
public class LoginFilter extends HttpFilter implements Filter {
  
    public LoginFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		

		String uname=request.getParameter("Uname");
		String pword=request.getParameter("Pass");
		PrintWriter out=response.getWriter();
		if(uname.equalsIgnoreCase("tom") && pword.equals("jerry")){
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
		
		else
			out.println("Invalid Username or Password");
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
