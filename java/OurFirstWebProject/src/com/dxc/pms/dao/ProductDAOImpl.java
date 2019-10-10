package com.dxc.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dxc.pms.dbcon.DBConnection;
import com.dxc.pms.model.Product;

public class ProductDAOImpl implements ProductDAO {

	Connection connection = DBConnection.getConnection();
	private static final String FETCH_PRODUCT_ALL = "select * from product";
	private static final String FETCH_PRODUCT_BY_ID = "select * from product where productId = ?";
	private static final String DELETE_PRODUCT_BY_ID = "DELETE FROM product WHERE productId = ?";
	private static final String PRODUCT_UPDATE_QUERY = "Update product set productName=?, productPrice=?, productOnHand=?,productId=?";

	public ProductDAOImpl() {

	}

	List<Product> allProducts = new ArrayList<Product>();

	@Override
	public Product getProduct(int productId) {
		Product product = new Product();
		try {
			PreparedStatement stat = connection.prepareStatement(FETCH_PRODUCT_BY_ID);
			stat.setInt(1, productId);
			ResultSet res = stat.executeQuery();
			res.next();
			product.setProductId(res.getInt(1));
			product.setProductName(res.getString(2));
			product.setPrice(res.getInt(3));
			product.setProductOnHand(res.getInt(4));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return product;
	}

	@Override
	public List<Product> getAllProducts() {

		List<Product> allProducts = new ArrayList<Product>();
		try {
			Statement stat = connection.createStatement();
			ResultSet res = stat.executeQuery(FETCH_PRODUCT_ALL);
			while (res.next()) {
				Product product = new Product();
				product.setProductId(res.getInt(1));
				product.setProductName(res.getString(2));
				product.setPrice(res.getInt(3));
				product.setProductOnHand(res.getInt(4));
				allProducts.add(product);// here add() is a built-in function...
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allProducts;
	}

	@Override
	public void addProduct(Product product) {

		// allProducts.add(product);
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into product values(?,?,?,?)");
			preparedStatement.setInt(1, product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setInt(3, product.getProductOnHand());
			preparedStatement.setInt(4, product.getPrice());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProduct(int productId) {

		try {
			PreparedStatement Statement = connection.prepareStatement("DELETE FROM product WHERE productId = ?");
			Statement.setInt(1, productId);
			Statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub

		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("Update product set productName=?, productPrice=?, productOnHand=? where productId=?");

			preparedStatement.setInt(3, product.getProductOnHand());
			preparedStatement.setInt(2, product.getPrice());
			preparedStatement.setInt(4, product.getProductId());
			preparedStatement.setString(1, product.getProductName());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean isProductExist(int productId) {
		// TODO Auto-generated method stub
		boolean productExists = false;
		// PreparedStatement preparedStatement;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(FETCH_PRODUCT_BY_ID);
			preparedStatement.setInt(1, productId);

			ResultSet res = preparedStatement.executeQuery();
			if (res.next()) {
				productExists = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return productExists;
	}

}
