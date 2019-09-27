package day3;

public class productDetails {

	
	private int productId;
	private String productName;
	private int quantityOnhand;
	private int price;
	
	
	
	
	public productDetails(int productId, String productName, int quantityOnhand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnhand = quantityOnhand;
		this.price = price;
	}




	@Override
	public String toString() {
		return "productDetails [productId=" + productId + ", productName=" + productName + ", quantityOnhand="
				+ quantityOnhand + ", price=" + price + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productDetails pD1 = new productDetails(1001,"Bottle",1000,190);
		System.out.println(pD1);
		
	}

}
