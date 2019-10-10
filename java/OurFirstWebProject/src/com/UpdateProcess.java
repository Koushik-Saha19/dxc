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
import com.dxc.pms.dbcon.*;


public class UpdateProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateProcess() {
        super();
       
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductDAO productDAO = new ProductDAOImpl();
		
		int productId =  Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		int productOnHand = Integer.parseInt(request.getParameter("quantityOnHand")) ;
		int price = Integer.parseInt(request.getParameter("price"));
		
		Product productToUpdate = new Product(productId,productName,productOnHand,price);
		productDAO.updateProduct(productToUpdate);
		
		response.getWriter().println("<h1>Your product updated successfully</h1>");
		
	}

}
