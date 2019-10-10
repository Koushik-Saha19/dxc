package com;

import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.pms.dao.ProductDAO;
import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.model.Product;
import com.dxc.pms.client.*;

public class UPDATE extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	Scanner scanner = new Scanner(System.in);
    public UPDATE() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		int productId =  Integer.parseInt(request.getParameter("productId"));
		 ProductDAO productDAO = new ProductDAOImpl();
		
		 if (productDAO.isProductExist(productId)) {
			 response.getWriter().println("<h1>Your product Id is valid</h1>");
		 
		 response.getWriter().println("<h1><a href='updatedData.html'>Proceed further</a></h1>"); 
		 }
		 else {
			 response.getWriter().println("<h1>Your product Id is not valid</h1>");
		 }
	}
}
