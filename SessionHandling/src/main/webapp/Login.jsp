<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
      String name  = request.getParameter("uname");
      String pass = request.getParameter("pass");
      session.setAttribute("uname",name);
      session.setAttribute("pass",pass);
      if(name.equals("tom") && pass.equals("jerry"))
      {
    	  out.println("welcome "+session.getAttribute("uname"));
    	
      }
      else
      {
    	  out.println("wrong user or password");
      }
%><br>
  <a href="Logout.jsp">Logout</a><br>
    	  <a href="Dashboard.jsp">Dashborad</a>
</body>
</html>