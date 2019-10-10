package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.pms.dao.ProductDAO;
import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.client.ProductApp;


public class success extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public success() {
        super();
      
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int productId =  Integer.parseInt(request.getParameter("productId"));
		ProductDAO productDAO = new ProductDAOImpl();
//		productDAO.deleteProduct(productId);
		
		
		if (productDAO.isProductExist(productId)) {
			productDAO.deleteProduct(productId);
			response.getWriter().println("<h1>Your product deleted successfully</h1>");
		} else {
			response.getWriter().println("<h1>Product Id does not exist</h1>");
		}
		
	}

}
