package day3;

public class customerDataManipulation {

	int custId;
	String custName;
	String custAddress;
	int billAmount;

	public customerDataManipulation() {
		this.custId = 0;
		this.custName = "Not available";
		this.custAddress = "Not available";
		this.billAmount = 100;
	}

	public customerDataManipulation(int custId, String custName, String custAddress, int billAmount) {
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.billAmount = billAmount;

	}

	public void display() {
		System.out.println("Customer Id is: " + custId);
		System.out.println("Customer Name is: " + custName);
		System.out.println("Customer Address is: " + custAddress);
		System.out.println("Customer Billamount is: " + billAmount);
	}

	// This is a Accessor..
	public String getCustAddress() {
		return custAddress;
	}

	// This is a Accessor..
	public int getCustId() {
		return custId;
	}

	// This is a Accessor..
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}

	// This is a Mutator..
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	// This is a Mutator..
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customerDataManipulation cust1 = new customerDataManipulation(1, "Neha", "Delhi", 900);
		customerDataManipulation cust2 = new customerDataManipulation(2, "Rekha", "Delhi", 8900);
		customerDataManipulation cust3 = new customerDataManipulation();// here is every case customer() is a
																		// constructor
		customerDataManipulation cust4 = new customerDataManipulation(4, "Jaya", "Mumbai", 800);
		customerDataManipulation cust5 = new customerDataManipulation();

		cust1.setCustName("Ram");
		cust2.setBillAmount(598);
		cust4.setCustAddress("USA");
		
		cust1.display();
		cust2.display();
		cust3.display();
		cust4.display();
		cust5.display();
		
		cust1.getCustAddress();
		cust2.getCustId();
		cust3.getCustName();
		
		
		

	}

	@Override
	public String toString() {
		return "customerDataManipulation [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress
				+ ", billAmount=" + billAmount + "]";
	}

	// This is a Mutator..
	
}
