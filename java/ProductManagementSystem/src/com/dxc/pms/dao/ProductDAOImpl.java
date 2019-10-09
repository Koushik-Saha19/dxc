package com.dxc.pms.dao;

import java.util.ArrayList;
import java.util.List;

import com.dxc.pms.model.Product;

public class ProductDAOImpl implements ProductDAO {
	
	public ProductDAOImpl() {
		
	}

	List<Product> allProducts = new ArrayList<Product>();
	@Override
	public Product getProduct(int productId) {
		Product product = allProducts.stream().filter(n->n.getProductId()== productId).findFirst().get();
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		return allProducts;
	}

	@Override
	public void addProduct(Product product) {

		allProducts.add(product);
	}

	@Override
	public Product deleteProduct(int productId) {
		
		allProducts.removeIf(g->g.getProductId()== productId);
		return null;
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub

		for(int i=0;i<allProducts.size();i++) {
			if(product.getProductId()== allProducts.get(i).getProductId()) {
				allProducts.set(i, product);
			}
			
		}
	}

}
