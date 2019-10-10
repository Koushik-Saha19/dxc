package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class welcome1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   int counter = 0;
    public welcome1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		counter++;
		response.getWriter().println("<h1>Welcome to DXC</h1>");
		response.getWriter().println("<h1>You are user number</h1>" + counter);
		response.getWriter().println("<h1><a href = 'product.html'>Add Product</a></h1>");
		response.getWriter().println("<h1><a href = 'delete.html'>Delete Product</a></h1>");
		response.getWriter().println("<h1><a href = 'update.html'>Update Product</a></h1>");
		response.getWriter().println("<h1><a href = 'getAllProduct'>Get All The Product</a></h1>");
		response.getWriter().println("<h1><a href = 'tc.html'>T&C</a></h1>");
	}

}
