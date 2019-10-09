package com.dxc.pms.client;

import java.util.Scanner;

import com.dxc.pms.dao.ProductDAO;
import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.model.Product;

public class ProductApp {
	ProductDAO productDAO;
	int choice = 0;
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	Scanner scanner = new Scanner(System.in);

	public ProductApp() {

		this.productDAO = new ProductDAOImpl();// here object type is ProductDAO but it is referring to ProductDAOImpl
												// class...
	}

	public void launchProductApp() {
		while (true) {
			System.out.println("MENU");
			System.out.println("1. Add the products");
			System.out.println("2. Get All The products");
			System.out.println("3. Get product by id");
			System.out.println("4. Delete product by id");
			System.out.println("5. Update product by id");
			System.out.println("6. EXIT");

			System.out.println("Please enter your choice: (1-6)");

			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Product product = takeProductInput();
				if (!productDAO.isProductExist(product.getProductId())) {
					productDAO.addProduct(product);
				} else {
					System.out.println("Product already exist with product id : " + productId);
				}
				break;
			case 2:
				System.out.println(productDAO.getAllProducts());
				break;
			case 3:
				System.out.println("please enter product id to search");
				productId = scanner.nextInt();
				if (productDAO.isProductExist(productId)) {
					Product searchproduct = productDAO.getProduct(productId);
					System.out.println(searchproduct);
				} else {
					System.out.println("Product Id not found");
				}
				break;
			case 4:
				System.out.println("please enter product id to delete");
				productId = scanner.nextInt();

				if (productDAO.isProductExist(productId)) {
					productDAO.deleteProduct(productId);
					System.out.println("Product deleted successfully");
				} else {
					System.out.println("Product Id not found");
				}
				break;
			case 5:
				System.out.println("Welcome to update process");
				Product productToUpdate = takeProductInput();
				if (productDAO.isProductExist(productToUpdate.getProductId())) {
					productDAO.updateProduct(productToUpdate);
					System.out.println("Your product updated successfully");
				} else {
					System.out.println("Product Id not found");
				}
				break;
			case 6:
				System.out.println("Thanks for using my app");
				System.exit(0);
			default:
				System.out.println("R U drunk milk. Please enter (1-3)");
			}
		}
	}

	private Product takeProductInput() {

		System.out.println("Please enter prduct id");
		productId = scanner.nextInt();
		System.out.println("Please enter prduct Name");
		productName = scanner.next();
		System.out.println("Please enter prduct quantity on hand");
		quantityOnHand = scanner.nextInt();
		System.out.println("Please enter prduct price");
		price = scanner.nextInt();
		Product product = new Product(productId, productName, quantityOnHand, price);
		return product;
	}
}
