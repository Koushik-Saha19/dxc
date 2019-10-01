package day5;



public class Customer_1_Hashcode_Equals {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
	
	public Customer_1_Hashcode_Equals() {
		customerId = 10000;
		customerName = "Not Available";
		customerAddress = "Address Not Available";
		billAmount = 500;
	}

	
	public void displayCustomerInformation() {
		System.out.println("Customer Id :"+customerId);
		System.out.println("Customer Name :"+customerName);
		System.out.println("Customer Address :"+customerAddress);
		System.out.println("Customer Bill Amount :"+billAmount);
	}
	public Customer_1_Hashcode_Equals(int customerId, String customerName, String customerAddress, int billAmount) {
		//using 'this()' we are just calling the other constructor function in this constructor function...
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
	}

	public Customer_1_Hashcode_Equals(String customerName, int billAmount) {
		//using 'this()' we are just calling the other constructor function in this constructor function...
		this.customerName = customerName;
		this.billAmount = billAmount;
	}

	public Customer_1_Hashcode_Equals(String customerName, String customerAddress) {
		//using 'this()' we are just calling the other constructor function in this constructor function...
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer_1_Hashcode_Equals C1 = new Customer_1_Hashcode_Equals(100, "Joe", "PUNE", 300);
		
		Customer_1_Hashcode_Equals C2 = new Customer_1_Hashcode_Equals(100, "Joe", "PUNE", 300);
		
		System.out.println(C1.equals(C2));//Here we did not overridden the hashcode() and equals()...that is why we are getting false at output..although the parameter values are same in the two object...
	}

}
