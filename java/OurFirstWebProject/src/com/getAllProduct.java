package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.pms.dao.ProductDAO;
import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.model.Product;

public class getAllProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public getAllProduct() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProductDAO productDAO = new ProductDAOImpl();


		for (int i = 0; i < productDAO.getAllProducts().size(); i++) {
			response.getWriter().println("<table border = '10'><th>ProductID</th><th>ProductName</th><th>Price</th><th>Quantity</th><tr><td>" +productDAO.getAllProducts().get(i).getProductId()+"</td><td>" +productDAO.getAllProducts().get(i).getProductName()+"</td><td>" +productDAO.getAllProducts().get(i).getPrice()+"</td><td>" +productDAO.getAllProducts().get(i).getProductOnHand()+"</td></tr></table>");
		}
	}

}
