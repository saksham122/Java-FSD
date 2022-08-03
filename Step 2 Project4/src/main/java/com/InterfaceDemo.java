package com;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/InterfaceDemo")
public class InterfaceDemo implements Servlet {
        
        ServletConfig config=null;
          public void init(ServletConfig config){
              this.config=config;
              System.out.println("Initialization complete");
           }

           public void service(ServletRequest req,ServletResponse res)
           throws IOException,ServletException{
               
        	   res.setContentType("text/html");
        	   
               PrintWriter out=res.getWriter();
               String UserName  = req.getParameter("Uname");
               out.println("welcome in service method "+ UserName);
          

           }
           public void destroy(){
               System.out.println("In destroy() method");
           }
           public ServletConfig getServletConfig(){
               return config;
           }
           public String getServletInfo(){
               return "This is a sample servlet info";
           }
}
