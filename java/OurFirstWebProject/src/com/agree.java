package com;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class agree extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public agree() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		response.getWriter().println("<h1>Welcome to DXC</h1>");
		response.getWriter().println("<h1>You are agreed at :" + date + "</h1>");
		response.getWriter().println("<h1><a href = 'Home.html'>Home</a></h1>");
	}

}
