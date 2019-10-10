package com.dxc.pms.client;

import java.util.Scanner;

import com.dxc.pms.dao.ProductDAO;
import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.model.Product;
import com.dxc.pms.client.Main;
import com.dxc.pms.dbcon.DBConnection;
public class Main {
	
	

	public static void main(String[] args) {
		
		
		
		ProductDAO productDAO = new ProductDAOImpl();//here object type is ProductDAO but it is referring to ProductDAOImpl class...

		
		ProductApp app = new ProductApp();
		app.launchProductApp();
		
	}

}
