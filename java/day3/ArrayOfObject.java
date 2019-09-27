package day3;

public class ArrayOfObject {

	
	private int productId;
	private String productName;
	private int quantityOnhand;
	private int price;
	

	public ArrayOfObject(int productId, String productName, int quantityOnhand, int price)
	//say, it is constructor 1
	{
		
		this.productId = productId;
		this.productName = productName;
		this.quantityOnhand = quantityOnhand;
		this.price = price;
	}
	public ArrayOfObject() 
	//say, it is constructor 2
	{
		productName = "Not available";
	}





	public ArrayOfObject(String productName)
	//say, it is constructor 3
	{
		
		this.productName = "Product name not available";
	}


	public String getProductName() {
		return productName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayOfObject pd1 = new ArrayOfObject();//Here ArrayOfObject() is a constructor...and here it is constructor 2 has been called.
		System.out.println(pd1.getProductName());// so it gives output as "Not available"
		
		ArrayOfObject product[] = new ArrayOfObject[5];//here we are justing creating 5 object..but we are not initializing them..so memory is not allocated them till now..
		
		for (int i = 0; i < product.length; i++) {
			 product[i] = new ArrayOfObject();//Here we are initializing the objects...and now only memory is allocated to them.....
		}
		System.out.println(product[3].getProductName());//here in the above line in initializing we are using constructor 2..that is why output is "Not available"
		
	}





	

}
