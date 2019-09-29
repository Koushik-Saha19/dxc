package day3;

import java.util.Scanner;

public class day3_Assignment_1 {
	
	Scanner sc = new Scanner(System.in);
	
	String productName;
	int productId;
	int productPrice;
	int productQuantity;
	
	public void inputTakingFunction() {
		System.out.println("Please enter your productname");
		this.productName = sc.next();
		System.out.println("Please enter your productId");
		this.productId= sc.nextInt();
		if(this.productId<0) {
			System.out.println("HOW COULD U THINK ABOUT NEGATIVE ID\n...please enter the correct productId");
			this.productId = sc.nextInt();
		}
		System.out.println("Please enter your productprice");
		this.productPrice=sc.nextInt();
		if(this.productPrice<0) {
			System.out.println("HOW COULD U THINK ABOUT NEGATIVE PRICE\n...please enter the correct productPrice");
			this.productPrice = sc.nextInt();
		}
		System.out.println("Please enter your productQuantity");
		this.productQuantity=sc.nextInt();
		if(this.productQuantity<0) {
			System.out.println("HOW COULD U THINK ABOUT NEGATIVE QUANTITY\n...please enter the correct productQuantity");
			this.productQuantity = sc.nextInt();
		}
		System.out.println("\n");
	}
	
	
	

	@Override
	public String toString() {
		return "[productName=" + productName + ", productId=" + productId + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		day3_Assignment_1 d5[] = new day3_Assignment_1[5];
		for (int i = 0; i < d5.length; i++) {
			 d5[i] = new day3_Assignment_1();
		}
	
		for (int i = 0; i < d5.length; i++) {
			 d5[i].inputTakingFunction();
			 
		}
		for (int i = 0; i < d5.length; i++) {
			
			System.out.println(d5[i]);
			System.out.println("\n");
			 
		}
		
		
	}

}
