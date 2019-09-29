package day3;

import java.util.Scanner;

public class day3_Assignment_2 {

	Scanner sc = new Scanner(System.in);
	
	int productId;
	String productName;
	int productQuantity;
	int productPrice;
	
	public void displayFunction() {
		
		System.out.println("Please enter product id:");
		this.productId = sc.nextInt();
 first:  if(productId == 1) {
			System.out.println("productId = 1\nproductName = Realme3\nproductQuatity = 5\nproductPrice = 14k");
		}
		 if(productId == 2) {
			System.out.println("productId = 2\nproductName = Realme5\nproductQuatity = 3\nproductPrice = 15k");
		}
		 if(productId == 3) {
			System.out.println("productId = 3\nproductName = iphoneX\nproductQuatity = 1\nproductPrice = 70k");
		}
		 if(productId == 4) {
			System.out.println("productId = 4\nproductName = oneplus7\nproductQuatity = 4\nproductPrice = 35k");
		}
		if(productId == 5) {
			System.out.println("productId = 5\nproductName = ipadPro\nproductQuatity = 2\nproductPrice = 48k");
		}
		else {
			System.out.println("ProductId does not exist\n");
			
			
		}
		displayFunction();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		day3_Assignment_2 d6 = new day3_Assignment_2();
		d6.displayFunction();
	}

}
