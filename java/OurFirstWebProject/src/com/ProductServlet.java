package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.pms.dao.ProductDAO;
import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.model.Product;


public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ProductServlet() {
        super();
        
    }

    
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int productId =  Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		int productOnHand = Integer.parseInt(request.getParameter("quantityOnHand")) ;
		int price = Integer.parseInt(request.getParameter("price"));
		response.getWriter().println("<h1><center>You entered product successfully</center></h1>");
		response.getWriter().println("<h2>Your entered product id:" + productId +"</h2>");
		response.getWriter().println("<h2>Your entered product name:" + productName +"</h2>");
		response.getWriter().println("<h2>Your entered product price:" + price +"</h2>");
		response.getWriter().println("<h2>Your entered product quantity:" + productOnHand +"</h2>");
		
		
		
		//To save the data in the SQL
		
		Product product = new Product(productId,productName,price,productOnHand);
		ProductDAO productDAO = new ProductDAOImpl();
		productDAO.addProduct(product);
	}

}
