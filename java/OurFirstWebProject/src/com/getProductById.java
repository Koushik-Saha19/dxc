package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.pms.dao.ProductDAO;
import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.model.Product;
import com.dxc.pms.client.ProductApp;

public class getProductById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public getProductById() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int productId =  Integer.parseInt(request.getParameter("productId"));
		ProductDAO productDAO = new ProductDAOImpl();

		
		if (productDAO.isProductExist(productId)) {
			Product searchproduct = productDAO.getProduct(productId);

			productId = searchproduct.getProductId();
			String productName = searchproduct.getProductName();
			int productOnHand = searchproduct.getProductOnHand();
			int productPrice = searchproduct.getPrice();
			
			response.getWriter().println("<h1>Your product details:</h1>");
			response.getWriter().println("<h1>product id:" +productId +"</h1>");
			response.getWriter().println("<h1>product name:" +productName +"</h1>");
			response.getWriter().println("<h1>product on hand:" +productOnHand+"</h1>");
			response.getWriter().println("<h1>product price:" + productPrice+"</h1>");
		} else {
			response.getWriter().println("<h1>Product Id does not exist</h1>");
		}
		
	}

}
