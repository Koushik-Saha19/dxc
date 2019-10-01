package day5;



public class productDetails_equals_Hashcode {

	
	private int productId;
	private String productName;
	private int quantityOnhand;
	private int price;
	
	
	
	
	public productDetails_equals_Hashcode(int productId, String productName, int quantityOnhand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnhand = quantityOnhand;
		this.price = price;
	}

   


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + quantityOnhand;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		productDetails_equals_Hashcode other = (productDetails_equals_Hashcode) obj;
		if (price != other.price)
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (quantityOnhand != other.quantityOnhand)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "productDetails [productId=" + productId + ", productName=" + productName + ", quantityOnhand="
				+ quantityOnhand + ", price=" + price + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productDetails_equals_Hashcode pD1 = new productDetails_equals_Hashcode(1001,"Bottle",1000,190);
		
		productDetails_equals_Hashcode pD2 = new productDetails_equals_Hashcode(1001,"Bottle",1000,190);
		
		System.out.println(pD1.equals(pD2));
	}

}